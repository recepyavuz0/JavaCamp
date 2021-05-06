package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckManager implements CustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer){
		KPSPublicSoapProxy mernis=new KPSPublicSoapProxy();
		try {
			boolean result=mernis.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getBirthYear());
			if (result) {
				return true;
			}
			return false;
		} catch (Exception e) {
			System.out.println("Servis çalýþmýyor");
			return false;
		}
		
	}

}

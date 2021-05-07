package adapter;

import abstracts.MemberCheckService;
import entities.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckManager implements MemberCheckService {

	@Override
	public boolean checkIfRealPerson(Member member) {
		
	try {
		KPSPublicSoapProxy mernis=new KPSPublicSoapProxy();
		boolean result = mernis.TCKimlikNoDogrula(Long.parseLong(member.getNationalityId()), member.getFirstName().toUpperCase(), member.getLastName().toUpperCase(),member.getBirthYear());
		if(result) {
			return true;
		}
		return false;
	}
	catch(Exception e){
		System.out.println("Mernis servisi Çalýþmýyor.");
		return false;
	}
	
	}

}

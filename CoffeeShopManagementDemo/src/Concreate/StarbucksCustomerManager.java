package Concreate;

import Abstract.*;
import Entities.*;


public class StarbucksCustomerManager implements CustomerService {
	
	private CustomerCheckService checkService;
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService=checkService;
	}
	public void save(Customer customer) {
		if (checkService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" isimli müþteri Starbucks firmasýna kayýt oldu.");
		}
		else {
		System.out.println("Girilen kullanýcý bilgisi doðrulanamýyor. Lütfen doðru bilgileri giriniz.");
		}
	}

	
	public void sell(Customer customer) {
		System.out.println(customer.getFirstName()+" isimli müþteriye kahve satýldý.");
		
		if(customer instanceof StarbucksCustomer) {
			((StarbucksCustomer)customer).earnStar();
			System.out.println(customer.getFirstName()+" +1 yýldýz kazandý.Mevcut Yýldýz : "+ ((StarbucksCustomer)customer).getNumberOfStar());
		}

	}
}

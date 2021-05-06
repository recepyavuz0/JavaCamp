package Concreate;
import Abstract.CustomerService;
import Entities.Customer;

public class NeroCustomerManager implements CustomerService{
	
	public void save(Customer customer) {
		System.out.println(customer.getFirstName()+" isimli müþteri Nero firmasýna kayýt oldu.");
	}

	public void sell(Customer customer) {
		System.out.println(customer.getFirstName()+" isimli müþteriye kahve satýldý.");
	}
}

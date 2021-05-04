package interfaces;

public class CustomerManager {

	
	
	private Logger[] loggers;
	
	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println(customer.getFirstName()+" Eklendi.");
		

		
		
		Utils.runLoggers(customer.getFirstName(),loggers);
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+" Silindi");
	
		
		Utils.runLoggers(customer.getFirstName(),loggers);
	}
	
}

package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer engin=new Customer(1,"Engin","Demiroð");
		Logger[] loggers= {new FileLogger(),new SmsLogger(),new DatabaseLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		customerManager.add(engin);
		System.out.println("--------------");
		customerManager.delete(engin);

	}

}

package UI;

import Adapters.*;
import Concreate.*;
import Entities.*;


public class Main {

	public static void main(String[] args) {
		Customer recep=new StarbucksCustomer(1, "Recep Cafer", "Yavuz", 1999, "19487596451");
		Customer ahmet=new StarbucksCustomer(2, "Ahmet", "Can", 1995, "19134932884");
		Customer can=new Customer(3, "Can", "Çelik", 1989, "19125678451");

		NeroCustomerManager neroCustomerManager=new NeroCustomerManager();
		neroCustomerManager.save(can);
		System.out.println("----------------------------------");
		neroCustomerManager.save(ahmet);
		System.out.println("----------------------------------");
		neroCustomerManager.sell(can);
		System.out.println("----------------------------------");
		
		
		StarbucksCustomerManager starbucksCustomerManager=new StarbucksCustomerManager(new MernisCheckManager());
		starbucksCustomerManager.save(recep);

		System.out.println("----------------------------------");
		starbucksCustomerManager.sell(recep);
		System.out.println("----------------------------------");
		starbucksCustomerManager.sell(recep);
		System.out.println("----------------------------------");
		starbucksCustomerManager.sell(recep);
		System.out.println("----------------------------------");

	}

}

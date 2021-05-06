package Entities;

public class StarbucksCustomer extends Customer {

	private int numberOfStar;
	public StarbucksCustomer(int id, String firstName, String lastName, int birthYear, String nationalityId) {
		super(id, firstName, lastName, birthYear, nationalityId);
		this.numberOfStar=0;
	}
	public int getNumberOfStar() {
		return numberOfStar;
	}
	public void earnStar() {
		this.numberOfStar++;
	}

}

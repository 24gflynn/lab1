public class Salaried extends Worker {
	private double salary;
	public Salaried(String fname, String lname, double salary) {
		super(fname, lname);
		
		this.salary = salary;
		
	}

	@Override
	public double income() {
		double income = salary;
		return income;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "\n" + "Annual Salary: " + salary);
	}
}

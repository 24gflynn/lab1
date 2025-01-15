public class Hourly extends Worker {
	private double wage;
	private int hours;
	public Hourly(String fname, String lname, int hours, double wage) {
		super(fname, lname);
	
		this.wage = wage;
		this.hours = hours;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double income() {
		double income = wage * hours;
		return income;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Name: " + getName() + " " + getLName() + "\n" + "Annual Hours: " + hours + "\n" + "Hourly Wage: " + wage);
	}
}

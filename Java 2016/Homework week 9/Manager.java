
public class Manager extends Employee {

	private int employeeUnderComand;
	
	public Manager(String name, String role, boolean parkingSpot, int yearsWorked, int employeeUnderComand) {
		super(name, role, parkingSpot, yearsWorked);
		this.employeeUnderComand = employeeUnderComand;
	}
	
	public String toString() {
		return "\n" + "Name: " + name + " - " + "Senior: " + calculateSeniority() + " - " + "Parking lot: "
				+ parkingSpot;
}

	public int getEmployeeUnderComand() {
		return employeeUnderComand;
	}

	public void setEmployeeUnderComand(int employeeUnderComand) {
		this.employeeUnderComand = employeeUnderComand;
	}
	public void getInfo() {
		System.out.println("[" + this.name + "]" + " - " + this.role);
}

}

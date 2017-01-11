
public class JuniorDeveloper extends Employee{
	private String studies;
	
	public JuniorDeveloper(String name, String role, boolean parkingSpot, int yearsWorked, String studies) {
		super(name, role, parkingSpot, yearsWorked);
		this.studies = studies;
	}

	public String getStudies() {
		return studies;
	}

	public void setStudies(String studies) {
		this.studies = studies;
	}
	
	public String toString() {
		return "\n" + "Name: " + name + " - " + "Senior: " + calculateSeniority() + " - " + "Parking lot: "
				+ parkingSpot;
}
	public void getInfo() {
		System.out.println("[" + this.name + "]" + " - " + this.role + " - " + this.yearsWorked);
}
}

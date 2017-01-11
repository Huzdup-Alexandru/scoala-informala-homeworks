import java.util.Comparator;

public class Employee {

	String name;
	String role;
	boolean parkingSpot;
	int yearsWorked;
	boolean seniority;
	
	public Employee (String name, String role, boolean parkingSpot, int yearsWorked) {
		this.name = name;
		this.role = role;
		this.parkingSpot = parkingSpot;
		this.yearsWorked = yearsWorked;
	}
	
	
	public static final Comparator<Employee> YEARS_WORKED = new Comparator<Employee>() {

		public int compare(Employee o1, Employee o2) {
			if (o2.getYearsWorked() == o1.getYearsWorked()) {
				return 0;
			} else if (o2.getYearsWorked() > o1.getYearsWorked()) {
				return 1;
			}
			return -1;
		}
};

	// Method to calculate if a employee is senior or not based on years worked.
	public boolean calculateSeniority() {
		if(yearsWorked >= 4) {
			seniority = true;
		} else {
			seniority = false;
		}
		return seniority;
		
	}
	
	public String toString(){
		return "Name " + name + " - " + "senior " + calculateSeniority() + " - " + "parking spot " + parkingSpot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(boolean parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	public int getYearsWorked() {
		return yearsWorked;
	}

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}
	public void getInfo() {
		System.out.println("[ " + this.name + " ]" + " - " + this.role + " - " + this.yearsWorked);
}
	
}













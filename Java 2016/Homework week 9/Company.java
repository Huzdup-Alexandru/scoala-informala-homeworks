import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Company {

	public List<Employee> companyList = new ArrayList<Employee>();
	List<Employee> parkingList = new ArrayList<Employee>();
	public List<JuniorDeveloper> junior = new ArrayList<JuniorDeveloper>();
	public List<Manager> manager = new ArrayList<Manager>();
	
	public Company() {
		
	
	}
	// Methods to add Employee, JuniorDevelopers and Managers to our company.
	
	public void setNewEmployee(String name, String role, boolean parkingSpot, int yearsWorked) {
		companyList.add(new Employee(name, role, parkingSpot, yearsWorked));
	}
	
	
	public void setNewJuniorDeveloper(String name, String role, boolean parkingSpot, int yearsWorked, String studies){
		companyList.add(new JuniorDeveloper(name, role, parkingSpot, yearsWorked, studies));
		junior.add(new JuniorDeveloper(name, role, parkingSpot, yearsWorked, studies));
	}
	
	
	public void setNewManager(String name, String role, boolean parkingSpot, int yearsWorked, int employeeUnderCommand) {
		companyList.add(new Manager(name, role, parkingSpot, yearsWorked, employeeUnderCommand));
		manager.add(new Manager(name, role, parkingSpot, yearsWorked, employeeUnderCommand));
	}
	// Method to bring out the employee who don't have a parking spot.
	public List<Employee> getEmployeeByParkingSpot (boolean parkingSpot) {
		if(companyList != null){
			for(Employee employee : companyList) {
				if(employee.parkingSpot == false) {
					parkingList.add(employee);
					
					
				}
			}
		}
		return parkingList;
	}
	//  Method to sort our employees from the Parking list after Seniority.
	public void sortList(List<Employee> selectedParkingSpots) {
		Collections.sort(parkingList, Employee.YEARS_WORKED);
}
}

import java.util.Collections;
/** This application shows our company employees, managers and junior developers 
 * and a sorted list with employees without a parking spot.
 * 
 * @author Huzdu
 * @since 1.09.2017
 */
public class Main {

	public static void main(String[] args) {
		Company company = new Company();
		
		company.setNewEmployee("John Smith", Role.BRING, false, 1);
		company.setNewEmployee("Grigore", Role.MECHANIC, false, 2);
		company.setNewJuniorDeveloper("Alexandru Mihai", Role.JUNIOR_DEVELOPER, false, 3, "UBB-Calculatoare");
		company.setNewJuniorDeveloper("Cosmin", Role.JUNIOR_DEVELOPER, true, 4, "Scoala-informala");
		company.setNewJuniorDeveloper("Vlad", Role.JUNIOR_DEVELOPER, false, 2 , "UBB");
		company.setNewManager("Alexandru Huzdup", Role.MANAGER, true, 6, 50);
		company.setNewManager("Romeo", Role.MANAGER, true, 5, 30);
		company.setNewEmployee("Mircea", Role.UNKNOWN, false, 1);
		
		//This will print the list with all Employees.
		
	System.out.println("This is the list of our employees" + "\n" + "[Name]   ROLE");
	for (Employee employee : company.companyList)
			employee.getInfo();
	
		//This will print the list with managers.
	
	System.out.println("\n" + "This is the list of our Managers" + "\n" + "[Name]   ROLE");
	for (Manager manager : company.manager)
			manager.getInfo();
	
		//This will print all junior developers.
	
	System.out.println("\n" + "This is the list of our Junior Developers" + "\n" + "[Name] ROLE");
	for (JuniorDeveloper juniordeveloper : company.junior)
			juniordeveloper.getInfo();
	
		// This will print a sorted list with employees which don't have a parking spot.
	
	System.out.println("\n" + "Employee wich don't have a parking spot : "
			+ company.getEmployeeByParkingSpot(true));
	System.out.println("Sorted List: ");

	Collections.sort(company.parkingList, Employee.YEARS_WORKED);
	company.sortList(company.parkingList);
	for (Employee employee : company.parkingList) {
		employee.getInfo();
}
	
}
}
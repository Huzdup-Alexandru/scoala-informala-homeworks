
public class Main {
	public static void main(String[] args) {
		String oldName = "I have ThrEe fourty FiVE six apples.";
		
		StringUtility string = new StringUtility();
		oldName = string.replaceNameOfNumbersWithDigits(oldName);
		System.out.println("\n" + oldName);
		oldName = string.replaceWhiteSpaces(oldName);
		System.out.println(oldName);
	}
}

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilityTest {

	@Test
	public void test1() {
		// given
		String string = new String("i have four apples.");
		StringUtility b = new StringUtility();
		// when
		String newString = b.replaceNameOfNumbersWithDigits(string);
		String newString2 = b.replaceWhiteSpaces(newString);
		// then
		String correctString = new String("ihave4apples.");
		Assert.assertEquals(correctString, newString2);
	}
	
	@Test
	public void test2() {
		// given
		String string = new String(" ONe TWO THREE fouRty");
		StringUtility b = new StringUtility();
		// when
		String newString = b.replaceNameOfNumbersWithDigits(string);
		String newString2 = b.replaceWhiteSpaces(newString);
		// then
		String correctString = new String("1234ty");
		Assert.assertEquals(correctString, newString2);
	}
    
	@Test
	public void test3() {
		// given
		String string = new String("i have nInE Oranges in my bag.");
		StringUtility b = new StringUtility();
		// when
		String newString = b.replaceNameOfNumbersWithDigits(string);
		String newString2 = b.replaceWhiteSpaces(newString);
		// then
		String correctString = new String("ihave9Orangesinmybag.");
		Assert.assertEquals(correctString, newString2);
	}

	@Test
	public void test4() {
		// given
		String string = new String("nineteen years ago       .");
		StringUtility b = new StringUtility();
		// when
		String newString = b.replaceNameOfNumbersWithDigits(string);
		String newString2 = b.replaceWhiteSpaces(newString);
		// then
		String correctString = new String("nineteenyearsago.");
		Assert.assertEquals(correctString, newString2);
	}
}

}

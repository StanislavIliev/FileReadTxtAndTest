package testing;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import main.ReadFile;

public class JunitTests {

	
	@Test
	public void assertTrue() {
		String path = "C:\\Users\\CEX\\Desktop\\junitTask.txt";
		String text = "";
		try {
			text = ReadFile.readFileToString(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String regexOption = "(?<![\\w\\d])Mars(?![\\w\\d])";
		Pattern pattern = Pattern.compile(regexOption);
		Matcher matcher = pattern.matcher(text);
		Assertions.assertTrue(matcher.find());
	}

	@Test 
	public void assertAmountofRows() {
		int rows=0;
		String path = "C:\\Users\\CEX\\Desktop\\junitTask.txt";
		
		try {
			rows = ReadFile.givenumberofRows(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Assertions.assertEquals(3,rows);
	}
	
	@Test
	public void chechIfException() {
	  Assertions.assertThrows(IOException.class, () -> new FileReader("C:\\Users\\CEX\\Desktop\\junTsk.txt"));

	}
}

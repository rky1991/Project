package TestNGExecution;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class AutomaticRunTestNG {
	
	@Test
	public void run() {
		TestNG test= new TestNG();
		List<String> list= new ArrayList<>();
		list.add("C:\\Users\\TYSS\\git\\Project\\Project\\test-output\\testng-failed.xml");
		test.setTestSuites(list);
		test.run();
	}
	@Test
	public void TC_007() {
		
		System.out.println("I am passed");
		
	}


}

package TestNGExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoFail {

@Test
public void fail_TC() {
	
	System.out.println("how are you ");
	Assert.fail();
}

@Test
public void fail_TC1() {
	
	System.out.println("Hello ");
	Assert.fail();
}


}

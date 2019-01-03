package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testLogin() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do;jsessionid=EA623F25A8EC3A1415105A235D1D21AC");
		
		
	}

}

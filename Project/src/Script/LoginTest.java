package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.ActiLoginPage;

public class LoginTest {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testLogin() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		ActiLoginPage lp= new ActiLoginPage(driver);
		lp.setUsetName("admin");
		lp.setPassword("manager");
		lp.clickLogin();
		//driver.quit();
		
		
		
		
	}

}

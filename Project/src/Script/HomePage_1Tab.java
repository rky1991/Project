package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POM.ActiLoginPage;
import POM.HomePage;

public class HomePage_1Tab {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeMethod 
		public void beforeMethod() {
		    driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@Test
	public void LoginTest() throws Exception {
		ActiLoginPage lp= new ActiLoginPage(driver);
		lp.setUsetName("admin");
		lp.setPassword("manager");
		Thread.sleep(500);
		lp.clickLogin();
		Thread.sleep(4000);
	}
	@Test
	public void tabTimeTrack() {
		HomePage hp= new HomePage(driver);
		String txt = hp.getTabText();
		System.out.println(txt);
	}

}

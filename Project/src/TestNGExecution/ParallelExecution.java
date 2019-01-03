package TestNGExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	WebDriver driver;
	String url="https://demo.actitime.com/login.do";
	@Parameters({"browsers"})
	// it will take care of browsers
	@BeforeTest()
	public void preCondition(String browser) {
		
		if(browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			//System.setProperty("webdriver.chrome.driver","./driver/geckodriver.exe");
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.chrome.driver","./driver/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	 
	@Test
	public void test1() throws Exception {
		driver.findElement(By.id("username")).sendKeys("admin");
		//Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		
	}


}

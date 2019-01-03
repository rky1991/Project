package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	@Test
	public void fireFox() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		//driver.quit();
	}
}

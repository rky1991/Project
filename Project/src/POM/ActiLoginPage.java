package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ActiLoginPage {
	// decleration
	@FindBy(id="username")
	private WebElement uN;
	@FindBy(name="pwd")
	private WebElement pW;
	@FindBy(xpath="//a[@id=\"loginButton\"]")
	private WebElement loginBtn;
	//initialization
	public ActiLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	// utilization
	public void setUsetName(String un) {
		uN.sendKeys(un);
	}
	public void setPassword(String pw) {
		pW.sendKeys(pw);
	}
	public void clickLogin() {
		loginBtn.click();
	}
	
	
	

}

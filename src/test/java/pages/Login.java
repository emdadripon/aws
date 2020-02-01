package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
	@FindBy(how = How.ID, using = "userid")
	public WebElement userid;
	
	@FindBy(how = How.NAME, using = "password")
	public WebElement password;
	
	
	@FindBy(how = How.NAME, using = "signonButton")
	public WebElement submitbtn;
	
	public void loginCredentials() {
		userid.sendKeys("emdadripon");
		password.sendKeys("$Ctg1025");
		submitbtn.click();
		
	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DoctorsAndLocations {
	
	@FindBy(how = How.XPATH, using = "//nav[@id='logged_out_topnav']/ul/li[3]/a")
	public WebElement docandlocbtn;
	
	
	
	public void clickOnDoctorsAndLocations() {
		docandlocbtn.click();
	}

}

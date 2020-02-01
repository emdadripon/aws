package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShopPlans {
	
	@FindBy(how = How.XPATH, using = "//a[@href='/washington/shop-plans']")
	public WebElement shopplansbtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='bannerImg_ddcf3610-65a0-4d1b-bddf-2760525da7a0']")
	public WebElement topImage;
	
	
	public void searchShopPlans() {
		shopplansbtn.click();
	}

}

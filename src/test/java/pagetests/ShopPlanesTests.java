package pagetests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.CommonApi;
import pages.ShopPlans;

public class ShopPlanesTests extends CommonApi {
	
	@Test
	public void HomeSearch() {
		ShopPlans shopplans = PageFactory.initElements(driver, ShopPlans.class);
		shopplans.searchShopPlans();
		
	}

}

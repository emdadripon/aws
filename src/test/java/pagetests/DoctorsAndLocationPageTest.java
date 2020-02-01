package pagetests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.CommonApi;
import pages.DoctorsAndLocations;

public class DoctorsAndLocationPageTest extends CommonApi{
     
	@Test
	public void searchDoctorsAndLocation() throws InterruptedException {
		
		DoctorsAndLocations doctorlocation = PageFactory.initElements(driver, DoctorsAndLocations.class);
		doctorlocation.clickOnDoctorsAndLocations();
		Thread.sleep(3000);
		//Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='regionH1 searchHeader']")).isDisplayed());
	}
	
	@Test
	public void searchDoctors() throws InterruptedException {
		searchDoctorsAndLocation();
		WebElement element = driver.findElement(By.xpath("//*[@id='doctorFacilityRadio']/li[1]/label"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(3000);
		element.click();
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.cssSelector("#customRegionSelect")));
		Thread.sleep(3000);
		select.selectByValue("GGA");
	}
}

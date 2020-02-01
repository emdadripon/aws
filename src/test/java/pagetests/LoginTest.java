package pagetests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.CommonApi;
import pages.Login;

public class LoginTest extends CommonApi{
	
    @Test(priority = 1, description = "Verify top Image")
    public void topImage() {
    	
    	WebElement ele = driver.findElement(By.xpath("//div[@id='heroimage_img']"));
    	System.out.println(ele.getText());
    	Assert.assertTrue(ele.isDisplayed());
    }
    
    @Test(priority = 2, description = "Verify top headline")
    public void hiroImageHeadLine() {
    	WebElement ele = driver.findElement(By.xpath("//div[@class='hero-image-headline']/h1"));
    	System.out.println("First Headline text: " + ele.getText());
    	Assert.assertTrue(ele.isDisplayed());
    }
    
    @Test(priority = 3)
    public void subHeading() {
    	WebElement ele = driver.findElement(By.xpath("//div[@class='sub-heading']/p"));
    	System.out.println("Sub Headline text: " + ele.getText());
    	Assert.assertTrue(ele.isDisplayed());
    	
    }
	
	@Test
	public void verifyImage() {
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='textimage_img']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		Assert.assertTrue(ele.isDisplayed());
	}
	
	@Test
	public void loginToApp() {
		Login login = PageFactory.initElements(driver, Login.class);
		login.loginCredentials();
	}
	
	@Test
	public void verifyText() {
	    WebElement ele = driver.findElement(By.xpath("//a[@class='button -inverted ']"));
	    String actual = ele.getText();
	    System.out.println("Text are: " + actual);
	    Assert.assertEquals(actual, "Learn more");
	}
	
	@Test
	public void findCareLink() {
		List<WebElement> images = driver.findElements(By.xpath("//ul[@id='get_care']/li/a"));
		int actual = images.size();
		System.out.println("Total images: " + actual);
		for(WebElement allImage: images) {
			System.out.println("Image size: " + allImage.getSize() + "Image Name: " + allImage.getAttribute("href"));
		Assert.assertEquals(actual, 4);
		}
		
	}
	
	@Test
	public void OurOrganigationLinks() {
		List<WebElement> images = driver.findElements(By.xpath("//ul[@id='our_org']/li/a"));
		int actual = images.size();
		System.out.println("Total images: " + actual);
		for(WebElement allImage: images) {
			System.out.println("Image size: " + allImage.getSize() + "Image Name: " + allImage.getAttribute("href"));
		Assert.assertEquals(actual, 8);
		}
	}
	
	@Test
	public void toolTip() {
		WebElement ele = driver.findElement(By.xpath("//a[@class='icon-twitter']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		String actual = ele.getText();
		System.out.println("ToolTip Text: " + actual);
		ele.click();
		Assert.assertEquals(actual, "twitter Icon");
	}
	
	@Test
	public void toolTipLink() {
		List<WebElement> links = driver.findElements(By.xpath("//ul[@class='social-icon-list horizontal-list']/li/a"));
		String actualIndex0 = links.get(0).getText();	
		System.out.println("First Tool Tip: " + actualIndex0);
		
		for(WebElement alllinks: links) {
			System.out.println("Tool Tip links name: " + alllinks.getText() + "ToolTip Links: " + alllinks.getAttribute("href"));
		}
	}

}

package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonApi {
	
	public WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "/Users/emdadripon/Documents/driver/geckodriver");
		FirefoxProfile geoDisabled = new FirefoxProfile();
		geoDisabled.setPreference("geo.enabled", false);
		geoDisabled.setPreference("geo.provider.use_corelocation", false);
		geoDisabled.setPreference("geo.prompt.testing", false);
		geoDisabled.setPreference("geo.prompt.testing.allow", false);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, geoDisabled);
		driver = new FirefoxDriver(capabilities);
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://healthy.kaiserpermanente.org/washington");
		driver.manage().window().maximize();
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}

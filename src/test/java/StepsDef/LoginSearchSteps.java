package StepsDef;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.checkerframework.checker.formatter.qual.InvalidFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;
import tests.BaseClass;

public class LoginSearchSteps extends BaseClass  {
	SearchPage pg;

	@Before
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities capabilities =new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","samsung SM-A910F");
		capabilities.setCapability("udid","17685585");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("automationName","Uiautomator2");
		capabilities.setCapability("plarformversion","8.0");
		
		capabilities.setCapability("appium:newCommandTimeout","60");
		capabilities.setCapability("chromeDriverExcutiable","C:\\Users\\RUSHI\\OneDrive\\Desktop\\TaskAutomation\\TaskAutomation\\drivers");
		
		URL url=URI.create("htts://127.0.0.1:4723/").toURL();
		driver =new AndroidDriver(url,capabilities);
		
		extents =new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.htmal");
		extents.attachReporter(spark);
	}
	@After
	public void teatDown() {
		driver.close();
		driver.quit();
		extents.flush();
		
	}
	
	
	@Given("I am on the reddit login page")
	public void i_am_on_the_reddit_login_page() {
		driver.get("https://www.reddit.com/");
		System.out.println("Log in - Reddit");
		
		driver.findElement(By.xpath("//h3[normalize-space()='Login']")).click();
		System.out.println("Login");
		}

	@When("I entered {string} and {string}")
	public void i_entered_and(String string, String string2) {
	  Object emailorusername=null;
	pg.enteremailOrUsername((String) emailorusername);
	  Object password = null;
	pg.enterPassword((String) password);
	}

	@And("I click on the {string}  button")
	public void i_click_on_the_button(String string) {
	  pg.clickonLoginButton();
	  
	  driver.findElement(By.xpath("//div[@class='pr-lg flex gap-xs items-center justify-start']"));
	  pg.isLogoDisplayed();
	 }

	@Then("See the Home Page")
	public void see_the_home_page() {
		 driver.findElement(By.cssSelector("input[placeholder='Search Reddit']"));
		 pg.isHomePageDisplayed();
		 }
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;



public class SearchPage {
 AndroidDriver driver;
	public SearchPage (AndroidDriver d) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy (name="q")
	WebElement searchBox ;	
	
	@FindBy (xpath="//*contains(text(),LogIn")
	WebElement Login ;	
	
	@FindBy(id="identifireId")
	private WebElement emailorUsenameField;
	
	@FindBy(name="password")
	private WebElement passwordField;
	
	@FindBy(id="Login")
	private WebElement loginButton ;
	
	public void enterSearchData(String searchdata) {
		searchBox.sendKeys(searchdata);
	}
	public void PressenterKeyOnSearchBox() {
		searchBox.sendKeys(Keys.RETURN);
	}
	
	
	public void enteremailOrUsername(String emailorusername) {
		WebElement enteremailOrUsernameFeild =null;
		enteremailOrUsernameFeild.sendKeys(emailorusername);
	}
	
	public void enterPassword(String password) {
		WebElement passwordFeild = null;
		passwordFeild.sendKeys(password);
	}
	public void clickonLoginButton() {
	
		loginButton.click(); 
	}
	
	public boolean isLogoDisplayed() {
		return true; }
		
	
	public boolean isLoginSuccessful() {
		return true;
		}
	
	public boolean isHomePageDisplayed() {
		WebElement homePageElement=driver.findElement(By.cssSelector("input[placeholder='Search Reddit']"));
		return homePageElement.isDisplayed();
	}
	public boolean isInvalidLoginUsernameorPasswordmessageDisplayed() {
		return isInvalidLoginUsernameorPasswordmessageDisplayed();
		
	}
	
	
}

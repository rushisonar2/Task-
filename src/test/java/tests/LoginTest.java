package tests;

import org.openqa.selenium.By;

import pages.SearchPage;

public class LoginTest extends BaseClass {

	
	SearchPage pg = new SearchPage(driver);
	
	public void test1() throws InterruptedException {
	driver.get("https://www.reddit.com/");
	
	pg.enterSearchData("Reddit Login");
	pg.PressenterKeyOnSearchBox();
	
	driver.findElement(By.xpath("//h3[normalize-space()='Log in - Reddit']")).click();
	System.out.println("Log in - Reddit");
	Thread.sleep(5000); }
	
	public void test2() {
		driver.findElement(By.xpath("//input[@class='emailorusename']"));
		
		Object emailOrusername = null;
		pg.enteremailOrUsername((String) emailOrusername);
        
		driver.findElement(By.xpath("//input[@class='password']"));
		String password = null;
		pg.enterPassword(password);
        
        driver.findElement(By.name("LoginButton")).click();
    
        
	}
}
	
	



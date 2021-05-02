package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Testcase.Loginpageobjects;

public class Updateprofile {
      @Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.net/login");
		Thread.sleep(3000);
		
		
		PageFactory.initElements(driver,Loginpageobjects.class);
		Loginpageobjects.username.sendKeys("user@phptravels.com");	
		Loginpageobjects.password.sendKeys("demouser");	
		Loginpageobjects.submit.click();
		
		Thread.sleep(5000);
		PageFactory.initElements(driver, Updateprofileobject.class);
		
		Updateprofileobject.myprofile.click();
		Updateprofileobject.phonenumber.sendKeys("1234567890");
		Updateprofileobject.city.sendKeys("Kings Landing");
		Updateprofileobject.submit1.click();
		
			
		
	}
	
}
		

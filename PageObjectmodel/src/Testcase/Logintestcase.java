package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Logintestcase {

	private static Loginpageobjects loginpageobjects;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://phptravels.net/login");
			
			PageFactory.initElements(driver,Loginpageobjects.class);
			
			Loginpageobjects.username.sendKeys("user@phptravels.com");
			Loginpageobjects.password.sendKeys("demouser");
			loginpageobjects.submit.click();
				
			
						
		}
		
		
	}



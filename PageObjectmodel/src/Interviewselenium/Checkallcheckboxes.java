package Interviewselenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkallcheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		  
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
//		WebElement image = driver.findElement(By.partialLinkText("Images"));
		
	java.util.List<WebElement> allboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	    for (WebElement webElement : allboxes) {
	    	
	    	webElement.click();
			
		}
		
		
	}
	
	

}

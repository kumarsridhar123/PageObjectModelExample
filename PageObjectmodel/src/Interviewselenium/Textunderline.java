package Interviewselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Textunderline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		  
		driver.get("http://www.google.com");
		
		WebElement image = driver.findElement(By.partialLinkText("Images"));
		
//		WebElement image= driver.findElement(By.xpath("/html/body/header/div[2]/div[3]/div[1]/div/div[2]/a"));
		
	String beforehovering=	image.getCssValue("text-decoration");
	
	System.out.println("before hovering " + beforehovering);
				
		Actions actions = new Actions(driver);
		
		actions.moveToElement(image);
		
		actions.perform();
		
		String afterhovering=	image.getCssValue("text-decoration");	
		
		System.out.println("after hovering " + afterhovering);
		
		
		

		
		
	}

}

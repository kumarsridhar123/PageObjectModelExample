package Interviewselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Waystosearchgoogle {
	
	static WebElement q;

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
//		driver.switchTo().activeElement().sendKeys("chennai\n");
		
		PageFactory.initElements(driver, Waystosearchgoogle.class);
		
		q.sendKeys("chennai");
		
//		WebElement searchbox = driver.findElement(By.name("q"));
		
//		searchbox.sendKeys("chennai"+Keys.ENTER);
		
//		searchbox.sendKeys("chennai \n");
//		searchbox.submit();
		
		/*
		 * Robot robot = new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * 
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */
		
		
		
		
		

	}

}

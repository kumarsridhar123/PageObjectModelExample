package Interviewselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

public class Refreshcommandexamaple {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
	//	driver.navigate().to("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("sri");
		
		
		
		//refresh command
		
//		driver.navigate().refresh();
		
		// get current url
		
//		driver.get(driver.getCurrentUrl());
		
		// javascript executor
		
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * 
		 * executor.executeAsyncScript("location.reload()"); //history.go(0)
		 */		
		/*
		 * Robot robot = new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_F5); robot.keyRelease(KeyEvent.VK_F5);
		 */
	}

}

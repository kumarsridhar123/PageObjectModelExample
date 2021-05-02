package Interviewselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

public class Scrollexample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
				 
		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://www.echoecho.com/htmlforms11.htm");
		
		driver.get("http://www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;   
		
//		executor.executeScript("document.getElementsByName('q')[0].value='duckling'","");
		
//		executor.executeScript("argument[0].value='sri'",searchbox);
		
		driver.switchTo().activeElement();
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		
		
		
		
				
				
		
		// scroll to some position		
		/*
		 * executor.executeScript("window.scroll(0,450)",""); Thread.sleep(3000);
		 * executor.executeScript("window.scroll(0,-450)","");
		 */
		
		// go to the bottom of the page
		
		/*
		 * executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		 * Thread.sleep(3000); executor.executeScript("window.scroll(0,0)","");
		 */
		
		// go to specific element
		
		/*WebElement link = driver.findElement(By.linkText("online tool"));
		
		executor.executeScript("arguments[0].scrollIntoView(true);",link);
		
		Robot robot= new Robot();
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_PAGE_UP);
					
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		

	}*/

	}
}

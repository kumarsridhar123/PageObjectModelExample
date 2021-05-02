package Interviewselenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearchurl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.sendKeys("12 angry men \n");
		
		Thread.sleep(5000);
		
		/*
		//  java.util.List<WebElement> totallinks = driver.findElements(By.xpath("//a"));
		 * 
		 * // this will print all urls in the page
		 * 
		 * for (WebElement links : totallinks) {
		 * 
		 * System.out.println(links.getAttribute("href"));
		 * 
		 * }
		 */
			
		// fetch main links
		
	   List<WebElement> mainlinks = driver.findElements(By.xpath("//*[@id=\"search\"]//following::h3//following::div/cite"));
	   
	   for (WebElement links : mainlinks) {
		
		   System.out.println(links.getText());
		   
	}
		
		
		 
		
	}

}

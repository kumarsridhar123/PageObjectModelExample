package Interviewselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Googlecollections {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.sendKeys("Game of Thrones");
		
		Thread.sleep(5000);
	
		java.util.List<WebElement> searchsuggestions = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));
		
	//	int position=0;
		
		for (WebElement webElement : searchsuggestions) {
			
			String text = webElement.getText();
								
			System.out.println(text);
			
			if (text.contains("cast")) {
				
				webElement.click();
				break;
			}
			
			/*
			 * position++;
			 * 
			 * if (position==3) {
			 * 
			 * webElement.click();
			 * 
			 * break;
			 * 
			 * }
			 */
			
		}
			
					
	}
		

	}



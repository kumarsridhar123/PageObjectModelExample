package Interviewselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximizewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions chromeoptions = new ChromeOptions();
		
		chromeoptions.addArguments("--start-maximized");
		 
		WebDriver driver = new ChromeDriver(chromeoptions);
		
	// 	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 driver.get("http://www.google.com");
		 
//		 driver.manage().window().maximize();
		 
			/*
			 * Dimension dimension = new Dimension(1366, 866);
			 * 
			 * driver.manage().window().setSize(dimension);
			 */
		 	 
		
		
		
	}

}

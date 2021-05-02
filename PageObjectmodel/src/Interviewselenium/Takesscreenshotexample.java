package Interviewselenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takesscreenshotexample {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		
		// take screen shot but we wont get it detail below there is another method
		/*
		 * TakesScreenshot screenshot=(TakesScreenshot) driver;
		 * 
		 * File sourcefile= screenshot.getScreenshotAs(OutputType.FILE);
		 * 
		 * File destinationfile = new
		 * File("C:\\Users\\USER\\Pictures\\Camera Roll\\sample.png");
		 * 
		 * FileHandler.copy(sourcefile, destinationfile);
		 */
				
		
	driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button")).click();
		
		
	// screen shot very clear
	
		Robot robot = new Robot();
		
	Dimension screensize=	Toolkit.getDefaultToolkit().getScreenSize();
		
	Rectangle rectangle = new Rectangle(screensize);
	 
	          BufferedImage source=  robot.createScreenCapture(rectangle);
	          
	          File destinationfile = new File("C:\\Users\\USER\\Pictures\\Camera Roll\\sample1.png");
	
	          ImageIO.write(source, "png", destinationfile);
	
	 
	}

	
	

	

}

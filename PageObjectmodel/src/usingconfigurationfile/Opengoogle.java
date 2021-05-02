package usingconfigurationfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opengoogle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		
		FileInputStream stream = new FileInputStream("config.properties");
		
		Properties properties = new Properties();
		
		properties.load(stream);
		
		String browser=  properties.getProperty("browser");
		              
               
      String driverlocation =  properties.getProperty("driverlocation");
      
      if (browser.equals("chrome")) {
    	  
    	  System.setProperty("webdriver.chrome.driver",driverlocation );
		
    	   driver = new ChromeDriver();		  
    			  
	} else if (browser.equals("firefox")) {
		
	   	  System.setProperty("webdriver.gecko.driver",driverlocation );
	   	  
	       driver = new FirefoxDriver();	
		
	}
		                          
				
		driver.get("http://www.google.com");
		
				

	}

}

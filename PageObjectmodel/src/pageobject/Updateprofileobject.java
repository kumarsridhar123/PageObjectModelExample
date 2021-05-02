package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Updateprofileobject{
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	public static WebElement myprofile;
	
	@FindBy(name="phone")
	public static WebElement phonenumber; 
	
	@FindBy(name="city")	
	public static WebElement city  ;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/form/div/div/div[7]/div/button")
	public static WebElement submit1;
	
	
}



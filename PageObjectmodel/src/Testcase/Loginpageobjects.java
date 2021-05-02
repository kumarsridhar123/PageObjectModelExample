package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpageobjects {
	
	@FindBy(how=How.NAME,using = "username")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath = "/html/body/div/div[1]/section/div/div[1]/div[2]/form/button")	
	public static WebElement submit;

	
	
	
}

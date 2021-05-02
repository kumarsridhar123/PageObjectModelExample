package Interviewselenium;

import org.testng.annotations.Test;

public class Timeouttestcase {

	 @Test(timeOut =2000)
	 
	public void parentspermission() throws InterruptedException  {
		 Thread.sleep(3000);
		  System.out.println("permission given");
	  }
	
	 @Test(dependsOnMethods  ="parentspermission",alwaysRun = true )
	public void lovemarriage()  {

		  System.out.println("marriage happened");
	  }
	 
	 
}

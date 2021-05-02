package Interviewselenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase {

	@Test(retryAnalyzer=Retrylistener.class)
	public void testcase1(){
		
		Assert.assertEquals(true, false);
		
	}
	@Test
	public void testcase2(){
		
		Assert.assertEquals(true, false);
		
	}
	
	
	
	
}

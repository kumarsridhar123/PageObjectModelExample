package Interviewselenium;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertverify {

	
	/*
	 * @Test public void asserttest() {
	 * 
	 * System.out.println("before assertion");
	 * 
	 * // Assert.assertEquals(true, false);
	 * 
	 * Assert.fail(); // hard assertion
	 * 
	 * System.out.println("after assertion");
	 * 
	 * 
	 * 
	 * }
	 */
	 
	
	@Test
	public void assertverify() {
		
		//soft assertion is verify as no verify command in selenium
		
		SoftAssert assert1 =new SoftAssert();
		
		System.out.println("before assertion");
		
		//	Assert.assertEquals(true, false); 
			
			assert1.fail();
			
		System.out.println("after assertion");
		
		
					
		
	}
	
	
}

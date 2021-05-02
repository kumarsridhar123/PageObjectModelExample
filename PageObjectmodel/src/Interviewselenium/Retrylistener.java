package Interviewselenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrylistener implements IRetryAnalyzer {
	
    int failedcount=0;
    int limit=4;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(failedcount<limit) {
			failedcount++;
			return true;
			
		}
		
		return false;
	}

}

package listener_demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	public void onStart(ITestResult result) {
		//execute only once
	    System.out.println("test cases execution start once ");
	  }
	public void onTestStart(ITestResult result) {
		//execute multiple time 
	    System.out.println("test cases start.... ");
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("test cases passed.. ");
	  }
	public void onTestFailure(ITestResult result) {
		System.out.println("test cases failed.... ");
	  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("test cases skipped.... ");
	  }
	public void onFinish(ITestContext context) {
		System.out.println("test cases finished.. ");
	  }
}

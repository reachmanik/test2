package Projpack;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult result) {
		
		// TODO Auto-generated method stub
		BaseClass obj = new BaseClass();
		try {
			obj.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}

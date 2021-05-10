package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import commonFunctions.CommonFunctions;
import pageObjects.DashboardPageObjects;
import pageObjects.LoginPageObjects;

public class TestPendingLeaveRequest extends CommonFunctions{
	
	String actualMessage=null;
	static Logger logger=Logger.getLogger(TestPendingLeaveRequest.class);
	
	public void login(){
		
		logger.info("Logging in to the application");
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.userName.sendKeys(properties.getProperty("username"));
		LoginPageObjects.password.sendKeys(properties.getProperty("password"));
		LoginPageObjects.submitButton.click();
	}
	
	
	
	
	
	
	public void getPendingLeaveRequests(){
		
		
		PageFactory.initElements(driver,DashboardPageObjects.class );
		actualMessage=DashboardPageObjects.pendingLeaveRequests.getText();
	}
	
	
	
	
	
	
	@Test
	public void verifyPendingLeaveRequests()
	{
		login();
		logger.info("Getting the pending leave request details");
		getPendingLeaveRequests();
		logger.info("Verification");
		Assert.assertEquals(actualMessage, "No Records are Available");
		logger.info("End of Test pending leave request test case");
		
		
	}

}

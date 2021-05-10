package testCases;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import commonFunctions.CommonFunctions;
import pageObjects.UserRolePageObjects;

public class TestUserRole extends CommonFunctions{
	
	public void moveToUsersPage(){
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(UserRolePageObjects.adminLink);
		actions.moveToElement(UserRolePageObjects.userManagmentLink);
		actions.moveToElement(UserRolePageObjects.usersLink);
		actions.click().build().perform();
	}
	
	
	public void selectUserRole(){
		
		Select selectRole = new Select(UserRolePageObjects.userRole);
		selectRole.selectByIndex(1);
	}
	
	public void selectStatus(){
		
		Select selectStatus = new Select(UserRolePageObjects.userStatus);
		selectStatus.selectByIndex(1);
	}
	
	public void searchButton(){
		
		UserRolePageObjects.searchButton.click();
	}
	
	
	@Test
	public void checkUserRole(){
		
		PageFactory.initElements(driver, UserRolePageObjects.class);
		moveToUsersPage();  
		selectUserRole();
		selectStatus();
		searchButton();
		
		String actualRole = UserRolePageObjects.userRoleValue.getText();
		String actualStatus = UserRolePageObjects.userStatusValue.getText();
		
		Assert.assertEquals(actualRole, "Admin");
		Assert.assertEquals(actualStatus, "Enabled");
		
	}
	

}

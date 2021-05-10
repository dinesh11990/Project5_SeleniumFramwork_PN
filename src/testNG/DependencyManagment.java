package testNG;

import org.testng.annotations.Test;

public class DependencyManagment {

	@Test(enabled=true)
	public void highSchool()
	{
		System.out.println("High School");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary()
	{
		System.out.println("High School");
	}
	@Test(dependsOnMethods="higherSecondary")
	public void engineering()
	{
		System.out.println("High School");
	}
}

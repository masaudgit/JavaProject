package testNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Rediff {
	
	WebDriver driver; //This is global driver object; works throughout within all blocks.
	@BeforeClass (description="Launch") //@Test removed and @BeforeClass added because priority is only for @Test. And, we do not want
	//this method to be treated as a test case by swapping @Test with @BeforeClass.
	//description and priority put the code in proper order as we want it
	public void openRediff()
	{
		//here, we just launching an app, not writing any business logic to test something.
		//so the below code will be executed before TestNG enters into the class.
		System.out.println("Launch Rediff");
		driver = new EdgeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
	}
	//The above method will execute first
	//The below method we do not want to be executed so we disabled it by the command enabled=false
	@Test(description="Login-Hard Assert",priority=2,enabled=false)
	public void loginRediff1()
	{
		System.out.println("Login Rediff");
		String title=driver.getTitle();
		System.out.println("title="+title);
		Assert.assertEquals(title, "Rediffmail");
		System.out.println("Assert Executed...");
		driver.findElement(By.id("login1")).sendKeys("jack");
		driver.findElement(By.id("password")).sendKeys("jack123");
		driver.findElement(By.id("remember")).click();
		//how to add Assert?
	}
	@Test(description="Login-Soft Assert",priority=2)
	public void loginRediff()
	{
		//Now, in soft assert, we create an Object for this Soft Assert class.
		SoftAssert assertion=new SoftAssert();
		System.out.println("Login Rediff");
		String title=driver.getTitle();
		System.out.println("title="+title);
		Assert.assertEquals(title, "Rediffmail2"); //let's make it fail by adding 2 to Rediffmail2
		System.out.println("Assert Executed...");
		driver.findElement(By.id("login1")).sendKeys("jack");
		driver.findElement(By.id("password")).sendKeys("jack123");
		driver.findElement(By.id("remember")).click();
		assertion.assertAll();
		//assertion.assertAll(); //This is only for Soft Assert
		//Only in soft Assert, it is mandatory to use - assertAll(); in SoftAssert ONLY such as ..> assertion.assertAll(); at the end to get proper output.
		
	}
	@AfterClass(description="Logout")
	public void closeRediff()
	{
		System.out.println("Close Rediff");
		driver.quit();
	}
	//I cannot run this block of coded because there is no Main Method, no "run java application" option will be available.
	//So, we add @Test annotation then hover over it and add by clicking on "TestNG Library" then hover again and add by clicking
	//on "import Test(org.testing.annotaions).
	//Hard Assert will not execute further steps is assert returns fail.
	//Soft Assert will execute further steps even if assert returns fail.

}

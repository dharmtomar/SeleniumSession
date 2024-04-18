package testNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {

	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS-- DB Connection");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT-- Create new user");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-- launching browser");
	}
	@BeforeMethod
	public void login() {
		System.out.println("BM-- user login");
	}
	@Test(priority = 3)
	public void titleTest() {
		System.out.println("get Title test");
	}
	@Test(priority = 2,invocationCount = 10)
	public void getURLTest() {
		System.out.println("get current url test");
	}
	@Test(priority = 1)
	public void verifyImageTest() {
		System.out.println("image verify test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM-- logged out successfully");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-- close the browser");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("AT-- delete user ");
	}
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS-- Close the DB connection");
	}
}

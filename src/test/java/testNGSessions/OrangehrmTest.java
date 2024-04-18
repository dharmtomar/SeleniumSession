package testNGSessions;

import org.testng.annotations.Test;

import baseLayer.BaseTest;


public class OrangehrmTest extends BaseTest {

	@Test(invocationCount = 5)
	public void openOrangehrm() {
		String title=driver.getTitle();
		System.out.println(title);
	}
}

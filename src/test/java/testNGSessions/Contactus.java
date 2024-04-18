package testNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Contactus {
	static WebDriver driver;

	public static void main(String[] args) {

	}

	@DataProvider(name = "validEmailTest")
	public Object[][] validEmail() {
		return new Object[][] { { "john@gmail.com" }, { "john@amazon.co.in" }, { "vk@flipkart.in" }, { "dsingh@gmail" },
				{ "john.mail.com" }, { "123@123.comm" } };
	}

	@Test(dataProvider = "validEmailTest")
	public void contactUs(String emailid) {
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		String contact_us_title = "WebDriver | Contact Us";
		String submit_success_text = "Thank You for your Message!";
		String imvalidEmail_text = "Error: Invalid email address";

		// locators
		By firstName = By.name("first_name");
		By lastName = By.name("last_name");
		By email = By.name("email");
		By comments = By.name("message");
		By reset = By.xpath("//input[@type='reset']");
		By submit = By.xpath("//input[@type='submit']");
		By after_submit = By.xpath("//body");

		Assert.assertEquals(verifyTitle(), contact_us_title);
		doSendKeys(firstName, "john");
		doSendKeys(lastName, "pol");
		// passing email-id through data-provider
		doSendKeys(email, emailid);
		doSendKeys(comments, "thanks for contacting us");

//		doResetForm(reset);
//		if (getTextFieldText(firstName) == "" && getTextFieldText(lastName) == "" && getTextFieldText(email) == ""
//				&& getTextFieldText(comments) == "") {
//			System.out.println("Contact US form is reset successfully");
//		}

		doSubmitForm(submit);

		String submit_text = getElement(after_submit).getText();
		if (submit_text.equals(submit_success_text)) {
			System.out.println("form submitted successfully");
		} else if (submit_text.equals(imvalidEmail_text)) {
			throw new MyException("You have entered invalid emailid- please enter valid one");
		} else {
			throw new MyException("Please check your input data properly");
		}
	}

	public static String verifyTitle() {
		return driver.getTitle();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doResetForm(By locator) {
		doClick(locator);
	}

	public static void doSubmitForm(By locator) {
		doClick(locator);
	}

	public static String isTextPresent(By locator) {
		return getElement(locator).getText();
	}

	public static String getTextFieldText(By locator) {
		return getElement(locator).getAttribute("value");
	}

}

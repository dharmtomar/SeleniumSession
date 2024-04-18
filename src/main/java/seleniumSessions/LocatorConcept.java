package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(driver.getTitle());
		//1-every time we are hitting the server when we are using driver  
//		driver.findElement(By.id("input-firstname")).sendKeys("dharm");
//		driver.findElement(By.id("input-lastname")).sendKeys("tomar");
//		driver.findElement(By.id("input-email")).sendKeys("tomar@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
//		driver.findElement(By.id("input-password")).sendKeys("tomar@123");
//		driver.findElement(By.id("input-confirm")).sendKeys("tomar@123");
		
		//2 we have created the webelement and doing action on required elements only
//		WebElement fname= driver.findElement(By.id("input-firstname"));
//		WebElement lname=driver.findElement(By.id("input-lastname"));
//		WebElement email=driver.findElement(By.id("input-email"));
//		WebElement telephone=driver.findElement(By.id("input-telephone"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		WebElement cpassword=driver.findElement(By.id("input-confirm"));
//		
//		fname.sendKeys("dharm");
//		lname.sendKeys("tomar");
//		email.sendKeys("tomar@gmail.com");
//		telephone.sendKeys("1234567890");
//		password.sendKeys("tomar@123");
//		cpassword.sendKeys("tomar@123");
		
		//3- By locator
//		By fn= By.id("input-firstname");
//		By ln= By.id("input-lastname");
//		By em= By.id("input-email");
//		By tel= By.id("input-telephone");
//		By pass= By.id("input-password");
//		By cpass= By.id("input-confirm");
//		
//		WebElement fname= driver.findElement(fn);
//		WebElement lname=driver.findElement(ln);
//		WebElement email=driver.findElement(em);
//		WebElement telephone=driver.findElement(tel);
//		WebElement password=driver.findElement(pass);
//		WebElement cpassword=driver.findElement(cpass);
//		
//		fname.sendKeys("dharm");
//		lname.sendKeys("tomar");
//		email.sendKeys("tomar@gmail.com");
//		telephone.sendKeys("1234567890");
//		password.sendKeys("tomar@123");
//		cpassword.sendKeys("tomar@123");
		
		//4-By locator with some utility
//		By fn= By.id("input-firstname");
//		By ln= By.id("input-lastname");
//		By em= By.id("input-email");
//		By tel= By.id("input-telephone");
//		By pass= By.id("input-password");
//		By cpass= By.id("input-confirm");
//		
//		WebElement fname= getElement(fn);
//		WebElement lname=getElement(ln);
//		WebElement email=getElement(em);
//		WebElement telephone=getElement(tel);
//		WebElement password=getElement(pass);
//		WebElement cpassword=getElement(cpass);
//		
//		fname.sendKeys("dharm");
//		lname.sendKeys("tomar");
//		email.sendKeys("tomar@gmail.com");
//		telephone.sendKeys("1234567890");
//		password.sendKeys("tomar@123");
//		cpassword.sendKeys("tomar@123");
		
		//5- By locator with element utils and action utils
//		By fn= By.id("input-firstname");
//		By ln= By.id("input-lastname");
//		By em= By.id("input-email");
//		By tel= By.id("input-telephone");
//		By pass= By.id("input-password");
//		By cpass= By.id("input-confirm");
//		
//		doSendKeys(fn, "dharm");
//		doSendKeys(ln, "tomar");
//		doSendKeys(em, "dharm@gmail.com");
//		doSendKeys(tel, "1234567890");
//		doSendKeys(pass, "dharm");
//		doSendKeys(cpass, "dharm");
		
		//6- By locator and create a common util class for elements
//		By fn= By.id("input-firstname");
//		By ln= By.id("input-lastname");
//		By em= By.id("input-email");
//		By tel= By.id("input-telephone");
//		By pass= By.id("input-password");
//		By cpass= By.id("input-confirm");
//		
//		ElementUtils eutils=new ElementUtils(driver);
//		eutils.doSendKeys(fn, "dharm");
//		eutils.doSendKeys(ln, "tomar");
//		eutils.doSendKeys(em, "dharm@gmail.com");
//		eutils.doSendKeys(tel, "1234567890");
//		eutils.doSendKeys(pass, "dharm");
//		eutils.doSendKeys(cpass, "dharm");
		
//		String locator
		String fname_id="input-firstname";
		String lname_id="input-lastname";
		String email_id="input-email";
		String telephone_id="input-telephone";
		String pass_id="input-password";
		String cpass_id="input-confirm";
		
//		String subscribe_name="newsletter";
//		String cpass_name="agree";
//		String continue_xpath="//*[@id=\"content\"]/form/div/div/input[2]";
		By subscribe=By.name("newsletter");
		By agree=By.name("agree");
		By continu=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By successmsg=By.tagName("h1");
		
		ElementUtils eu=new ElementUtils(driver);
		eu.doSendKeys("id", fname_id, "dhatm");
		eu.doSendKeys("id", lname_id, "automation");
		eu.doSendKeys("id",email_id , StringUtils.getEmail());
		eu.doSendKeys("id",telephone_id , "1234567890");
		eu.doSendKeys("id", pass_id, "test@123");
		eu.doSendKeys("id", cpass_id, "test@123");
				
		eu.doClick(subscribe);
		eu.doClick(agree);
		eu.doClick(continu);
		//String msg=eu.getElementText(successmsg);
		//System.out.println("success msg: "+msg);
		
		String title=eu.getTitle();
		if(title.equals("Your Account Has Been Created!")) {
			System.out.println("user reg- pass");
		}
		else System.out.println("user reg- fail");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	
	

}

package seleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

	private WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locater) {
		return driver.findElement(locater);
	}

	public WebElement getElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public List<WebElement> getElements(By locater) {

		return driver.findElements(locater);
	}

	public WebElement getElement(String locaterType, String locatorValue) {
		return driver.findElement(getBy(locaterType, locatorValue));
	}

	public void doSendKeys(By locater, String locatorvalue) {
		getElement(locater).sendKeys(locatorvalue);
	}

	public void doSendKeys(By locator, String locatorvalue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(locatorvalue);
	}

	public void doSendKeys(String locaterType, String locatorValue, String value) {
		getElement(locaterType, locatorValue).sendKeys(value);
	}

	public By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType.toLowerCase().trim()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "className":
			locator = By.className(locatorValue);
			break;
		case "tagName":
			locator = By.tagName(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "cssSelector":
			locator = By.cssSelector(locatorValue);
			break;
		case "linkText":
			locator = By.linkText(locatorValue);
			break;
		case "partialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;
		default:
			break;
		}
		return locator;
	}

	public void doClick(By locator) {
		driver.findElement(locator).click();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getElementText(By locator) {
		return driver.findElement(locator).getText();
	}

	public String doGetAttribute(By locator, String attributeValue) {
		return getElement(locator).getAttribute(attributeValue);
	}

	public void doSearch(By searchLocator, By searchOptions, String searchKey, String value)
			throws InterruptedException {
		doSendKeys(searchLocator, searchKey);
		Thread.sleep(2000);
		List<WebElement> suggestionList = getElements(searchLocator);
		for (WebElement e : suggestionList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}

	// ***************wait utils***********
	
	public void clickWhenReady(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	public WebElement waitforpresenceOfElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public List<WebElement> waitForpresenceOfElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	public List<WebElement> waitForVisibilityOfElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public WebElement wairforVisibilityOfElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public Alert waitForJSAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public void acceptAlert(int timeout) {
		waitForJSAlert(timeout).accept();
	}

	public String getTextAlert(int timeout) {
		return waitForJSAlert(timeout).getText();
	}

	public void dismissAlert(int timeout) {
		waitForJSAlert(timeout).dismiss();
	}

	public void sendKeysToAlert(int timeout) {
		waitForJSAlert(timeout).sendKeys("hello alert");
	}

	public String waitForTitleContains(String titleFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("title not found within- " + timeout);
		}
		return null;
	}

	public String waitForTitleToBe(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("title not found within- " + timeout);
		}
		return null;
	}

	public String waitForURLContains(String urlFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("url not found within- " + timeout);
		}
		return null;
	}

	public String waitForURLToBe(String urlfull, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.urlToBe(urlfull))) {
				return driver.getCurrentUrl();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("url not found within- " + timeout);
		}
		return null;
	}
	public Boolean waitForWindow(int numberOfWindowToBe,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfWindowToBe));
		
	}
	
	public WebElement retryingElement(By locator, int timeout) {
		WebElement element = null;
		int attempt = 0;
		while(attempt<timeout) {
			try {
				element = driver.findElement(locator);
				System.out.println("element found in attempt- " + attempt);
				break;
			} catch (Exception e) {
				System.out.println("element not found in attempt- " + attempt);
				TimeUtil.Default_Short_Time();
				
			}
			attempt++;
		}
		if(element==null) {
			System.out.println("element not found...tried for "+timeout+" times"+" with the interval of "+500+" Miliseconds");
			throw new BrowserException("No such element");
		}
		return element;
	}
	
	public WebElement retryingElement(By locator, int timeout,int poolingtime) {
		WebElement element = null;
		int attempt = 0;
		while(attempt<timeout) {
			try {
				element = driver.findElement(locator);
				System.out.println("element found in attempt- " + attempt);
				break;
			} catch (Exception e) {
				System.out.println("element not found in attempt- " + attempt);
				TimeUtil.Default_Time();
				
			}
			attempt++;
		}
		if(element==null) {
			System.out.println("element not found...tried for "+timeout+" times"+" with the interval of "+poolingtime+" Seconds");
			throw new BrowserException("No such element");
		}
		return element;
	}

}

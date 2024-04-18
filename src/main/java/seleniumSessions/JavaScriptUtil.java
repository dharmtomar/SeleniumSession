package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	private WebDriver driver;
	private JavascriptExecutor js;

	public JavaScriptUtil(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
	}

	public String getTitleByJS() {

		return js.executeScript("return document.title").toString();
	}

	public String getURLByJS() {
		return js.executeScript("return document.URL").toString();
	}

	public void scrollDown() {

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

	public void scrollUp() {

		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	}
	public void scrollHalfPage() {

		js.executeScript("window.scrollTo(0,document.body.scrollHeight/2)");
		
	}
	public void scrollToPxl(String height) {
		js.executeScript("window.scrollTo(0,'"+height+"')");
	}

	public void scrollToElement(WebElement element) {

		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	
	public void goBackByJS() {
		js.executeScript("history.go(-1)");
	}
	public void goForwardByJS() {
		js.executeScript("history.go(1)");
	}
	public void pageRefreshByJS() {
		js.executeScript("history.go(0)");
	}
	public void generateAlert(String msg) {
		js.executeScript("alert('"+msg+"')");
	}
	public void generateConfirmationPopup(String msg) {
		js.executeScript("alert('"+msg+"')");
	}
	public String getPageInnerText() {
		return js.executeScript("return document.documentElement.innerText").toString();
	}
	public void clickElementByJS(WebElement element) {
		js.executeScript("argument[0].click()",element);
	}
	
	public void sendKeysByJS(String id,String value){
		js.executeScript("document.getElementById('"+id+"').value='"+value+"'");
		
	}
	public void zoomChromeEdgeSafari(String zoompercentage) {
	String zoom=	"document.body.style.zoom = '"+zoompercentage+"%'";
	js.executeScript(zoom);
	}
	public void drowBorder(WebElement element) {
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	public void changeColor(String color,WebElement element) {
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
	}
	public void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundColor");//red
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element);// green
			changeColor(bgcolor, element);// red
		}
	}
}

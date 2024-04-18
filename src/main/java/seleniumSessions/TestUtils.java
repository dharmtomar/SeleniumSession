package seleniumSessions;

public class TestUtils {

	public static void main(String[] args) {

		String browser="chrome";
		BrowserUtils bu=new BrowserUtils();
		bu.launchBrowser(browser);
		//bu.openURL("http://www.gmail.com");
		bu.openURL("http://www.flipkart.com");
		String title=bu.gettitle();
		if(title.contains("Online Shopping Site")) {
			System.out.println("title--pass");
		}
		else {
			System.out.println("title--fail");
		}
		String url=bu.getcurrentURL();
		if(url.contains("flipkart.com")) {
			System.out.println("url--pass");	
		}
		else {
			System.out.println("url--fail");
		}
		
		//bu.closeBrowser();
	}

}

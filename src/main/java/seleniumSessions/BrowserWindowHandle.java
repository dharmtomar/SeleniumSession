package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
//		String parentwindowid= driver.getWindowHandle();
//		System.out.println("parent window is : "+parentwindowid);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
//		//driver.switchTo().window(null)
//		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
//		
//		System.out.println(driver.getCurrentUrl());
//		//driver.switchTo().newWindow(WindowType.WINDOW);
//		
//		Set<String> handles= driver.getWindowHandles();
//		Iterator<String> it= handles.iterator();
//		
//		while(it.hasNext()) {
//			String childwindow= it.next();
//			driver.switchTo().window(childwindow);
//			System.out.println("child window is : "+childwindow);
//			System.out.println("url is : "+driver.getCurrentUrl());
//			if(!childwindow.equals(parentwindowid)) {
//			driver.close();
//			}
//		}
		
		
		String parentwindowid= driver.getWindowHandle();
		System.out.println("parent window is : "+parentwindowid);
		Thread.sleep(3000);
		
		Set<String> handles= driver.getWindowHandles();
//		Iterator<String> it= handles.iterator();
		
		
	}
	//public void handlewindow() {
	//	while(it.hasNext()) {
//			String childwindow= it.next();
//			driver.switchTo().window(childwindow);
//			System.out.println("child window is : "+childwindow);
//			System.out.println("url is : "+driver.getCurrentUrl());
//			if(!childwindow.equals(parentwindowid)) {
//			driver.close();
//			}
//		}
	//}

}

package org.mass.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//test base class for all the required methods
public class BaseClass {
	
				
		public static WebDriver driver;
		 static Actions a;
		static JavascriptExecutor js=(JavascriptExecutor) driver;
		public static void browserConfig() {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat\\eclipse-workspace\\newmav\\driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			}


		public static void openUrl(String url) {
			driver.get(url);	
		}

		public static void maximizeWindow() {
			driver.manage().window().maximize();
		}
		public static void type(WebElement element,String data) {
			element.sendKeys(data);	
		}
		public static void click(WebElement element) {
			element.click();
			}
		public String getText(WebElement element) {
			
		 String text = element.getText();
		 return text;
		}

		public static void navigateTo(String URL) {
			driver.navigate().to(URL);
		}

		public static void backPage() {
			driver.navigate().back();;
		}

		public static void forwordpage() {
			driver.navigate().forward();
		}

		public static void refresh() {
			driver.navigate().refresh();
		}

		public static void getAttributevalue(WebElement ele) {
			ele.getAttribute("value");
		
		}
		public static void simpleAlert() {
			Alert al=driver.switchTo().alert();
			al.accept();
		}

		public static void moveToElement(WebElement src) {
			a=new Actions(driver);
		a.moveToElement(src).perform();
		}

		public static void dragAndDrop( WebElement source, WebElement target) {
			a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
		}

		public static void rightClick(WebElement target) {
			a=new Actions(driver);
		a.contextClick(target).perform();
		} 

		public static void doubleClick(WebElement target) {
			a=new Actions(driver);
		a.doubleClick(target).perform();
		}

		public static void scrollUp(WebElement arg1) {
			
		js.executeScript("argument[0].scrollIntoView(false)", arg1);
		}

		public static void scrollDown(WebElement arg1) {
			
		js.executeScript("argument[0].scrollIntoView(true)", arg1);
		}

}

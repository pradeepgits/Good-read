package com.Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	 public static WebDriver driver;
		
		public  static WebDriver browserlaunch(String name) {
			

			if (name.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+"\\driver\\\\chromedriver.exe");
				
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
			}
		 else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
							System.getProperty("user.dir")+"\\driver\\chromedriver.exee");
					
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				
			}
			return driver;
		}
		
		
		public static void launchUrl(String url) {
			driver.get(url);

		}
		
		public static void inputValues(WebElement element, String name) {
			element.sendKeys(name);

		}
		
		public static void ClickOnElement(WebElement element) {
			element.click();

		}
		
	
	
}

package com.udemy_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Udemy.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//udemy//feature",
				 glue=   "com.udemy.stepdefinition",
				 plugin= {"html:Reports/Report"}
		         )

public class test_Runner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		
		driver = Base_Class.browserlaunch("chrome");	
	}
	
	//@AfterClass
	//public static void tear_Down() {
	//
		// driver.quit();
	//}
	
	
	
}

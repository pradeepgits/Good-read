package com.udemy.stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Udemy.Base_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_Definition extends Base_Class {

	@Given("^user Launch The GoodRead Application$")
	public void user_Launch_The_GoodRead_Application() throws Throwable {
	   launchUrl("https://www.goodreads.com");
	}

	@When("^user Follows The Sign In Tab$")
	public void user_Follows_The_Sign_In_Tab() throws Throwable {
		WebElement sign_In = driver.findElement(By.xpath("//a[@href='/user/sign_in']"));
		ClickOnElement(sign_In);
	}

	@When("^user Click The Sign In Using Email Tab$")
	public void user_Click_The_Sign_In_Using_Email_Tab() throws Throwable {
		WebElement sign_In2 = driver.findElement(By.xpath("//button[@class='gr-button gr-button--dark gr-button--auth authPortalConnectButton authPortalSignInButton']"));
	    ClickOnElement(sign_In2);
	}

	@When("^user Enters The Email Address With \"([^\"]*)\"$")
	public void user_Enters_The_Email_Address_With(String arg1) throws Throwable {
		WebElement user_Name = driver.findElement(By.id("ap_email"));
		inputValues(user_Name, "pradeep.cpk7015@gmail.com");
	}

	@When("^user Enters The Password With \"([^\"]*)\"$")
	public void user_Enters_The_Password_With(String arg1) throws Throwable {
		WebElement password = driver.findElement(By.id("ap_password"));
		inputValues(password, "Good@read");
	}

	@Then("^Click The Sign In Tab$")
	public void user_Clicks_The_Sign_In_Tab() throws Throwable {
		WebElement sign_In_Button = driver.findElement(By.className("a-button-input"));
		ClickOnElement(sign_In_Button);
	}
	

	@When("^user Search the Book name$")
	public void user_Search_the_Book_name() throws Throwable {
		WebElement search_Box = driver.findElement(By.xpath("//input[@class='searchBox__input searchBox__input--navbar']"));
		inputValues(search_Box, "wuthering height");
	}

	@When("^user Hit The Search button$")
	public void user_Hit_The_Search_button() throws Throwable {
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		ClickOnElement(submit);
	}

	@When("^user Select The Want To Read Tab$")
	public void user_Select_The_Want_To_Read_Tab() throws Throwable {
		WebElement want_To_Read = driver.findElement(By.xpath("//button[@class='wtrToRead']"));
		ClickOnElement(want_To_Read);
	}

	@Then("^go To the My Books$")
	public void go_To_the_My_Books() throws Throwable {
		Thread.sleep(2000);
		WebElement my_Books = driver.findElement(By.xpath("//li[@class='siteHeader__topLevelItem']"));
		ClickOnElement(my_Books);
	}

	@When("^user Remove The Book Name From MyBooks$")
	public void user_Remove_The_Book_Name_From_MyBooks() throws Throwable {
		WebElement remove = driver.findElement(By.xpath("//a[@class='actionLinkLite smallText deleteLink']"));
	    ClickOnElement(remove);
	}
	
	@When("^user Acknowledge The Remove Alert$")
	public void user_Acknowledge_The_Remove_Alert() throws Throwable {
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
	}

	@When("^user Click The Profile Tab$")
	public void user_Click_The_Profile_Tab() throws Throwable {
		WebElement settings = driver.findElement(By.xpath("//a[@class='dropdown__trigger dropdown__trigger--profileMenu dropdown__trigger--personalNav']"));
		ClickOnElement(settings);
	}
	
	
	@Then("^user LogOut from The Application$")
	public void user_LogOut_from_The_Application() throws Throwable {
		WebElement log_Out = driver.findElement(By.xpath("//a[@href='/user/sign_out?ref=nav_profile_signout']"));
		ClickOnElement(log_Out);
	}




	
	
	
	
	
}

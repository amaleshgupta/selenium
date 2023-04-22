package org.stepdefinition;

import org.allinone.Baseclass;
import org.allinone.fbloginpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin extends Baseclass{
	fbloginpojo f;
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchbrowser();
		windowmaximize();
	   
	}

	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
		launchurl("https://www.facebook.com/login.php/");
	}

	@When("To pass valid username to the email field")
	public void to_pass_valid_username_to_the_email_field() {
		f= new fbloginpojo();
		passtext("amaleshmsc@gmail.com", f.getemail());
		
		
	    
	}

	@When("To pass valid password too the password field")
	public void to_pass_valid_password_too_the_password_field() {
		f = new fbloginpojo();
		passtext("9600683826", f.getpassword());
	    
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new fbloginpojo();
		clickbtn(f.loginbtn());
	    }

	@When("To check wether  navigate to homepage or not")
	public void to_check_wether_navigate_to_homepage_or_not() {
		System.out.println("to check your crendentials");
	    }

	@Then("TO close the browser")
	public void to_close_the_browser() {
		closeentirebrowser();
	    
	}



}

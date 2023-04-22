package org.stepdefinition;

import org.allinone.Baseclass;
import org.allinone.fbloginpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sampledryrun extends Baseclass{
	fbloginpojo f;
	@Given("user has to lauch the browser and maximize the window")
	public void user_has_to_lauch_the_browser_and_maximize_the_window() {
		launchbrowser();
		windowmaximize();
	   
	}

	@When("user has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
		launchurl("https://www.facebook.com/login.php/");
	  
	}

	@When("USER HAS TO PAss the data{string} to the email field")
	public void user_HAS_TO_PAss_the_data_to_the_email_field(String e) {
		f = new fbloginpojo();
		passtext(e, f.getemail());
	    
	}

	@When("user has to pass the data{string} to the password field")
	public void user_has_to_pass_the_data_to_the_password_field(String pass) {
		f= new fbloginpojo();
		passtext(pass, f.getpassword());
	   
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
		f = new fbloginpojo();
		clickbtn(f.loginbtn());
	    
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeentirebrowser();
	}



}

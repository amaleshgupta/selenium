package org.stepdefinition;

import org.allinone.Baseclass;
import org.allinone.signinpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbregistration extends Baseclass {
	
	signinpojo s;
	@Given("TO LAUNCH THE BROWSER AND MAXIMIZE THE WINDOW")
	public void to_LAUNCH_THE_BROWSER_AND_MAXIMIZE_THE_WINDOW() {
		launchbrowser();
		windowmaximize();
	   
	}

	@When("TO LAUNCH THE URL")
	public void to_LAUNCH_THE_URL() {
		launchurl("https://www.facebook.com/login/");
	    
	}

	@When("TO CLICK THE CRETE NEW ACCOUNT BUTTON")
	public void to_CLICK_THE_CRETE_NEW_ACCOUNT_BUTTON() {
		s= new signinpojo();
		s.clickbtn(s.getCreatenewaccount());
	   
	}

	@When("TO PASS THE FIRSTNAME IN THE FIRSTNAME TEXTBOX")
	public void to_PASS_THE_FIRSTNAME_IN_THE_FIRSTNAME_TEXTBOX() throws InterruptedException {
		Thread.sleep(3000);
		s= new signinpojo();
		passtext("amalesh",s.getFirstnametxtbox());
		
	    
	}

	@When("TO PASS THE SECONDNAME IN THE SECONDNAME TEXTBOX")
	public void to_PASS_THE_SECONDNAME_IN_THE_SECONDNAME_TEXTBOX() {
		s= new signinpojo();
		passtext("gupta", s.getSecondnametxtbox());
	    
	}

	@When("TO PASS THE EMAIL OR MOBILLENUMBER IN THE EMAILTEXTBOX")
	public void to_PASS_THE_EMAIL_OR_MOBILLENUMBER_IN_THE_EMAILTEXTBOX() {
		s= new signinpojo();
		passtext("amaleshmsc@gmail.com", s.getEmailormobilenumbertxtbox());
	    
	}

	@When("TO  PASS THE PASSWORD IN THE PASSWORD TEXTBOX")
	public void to_PASS_THE_PASSWORD_IN_THE_PASSWORD_TEXTBOX() {
	    s= new signinpojo();
	    passtext("9600683826", null);
	}

	@Then("CLOSE THE BROWSER")
	public void close_THE_BROWSER() {
		//closeentirebrowser();
	    
	}



}

package org.allinone;

import org.allinone.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class fbloginpojo extends Baseclass {

	

	public fbloginpojo() {
	
	PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(xpath = "//input[@name='pass']")

	private WebElement password;

	@FindBy(id = "loginbutton")
	private WebElement loginbtn;

	public WebElement getemail() {
		return email;

	}

	public WebElement getpassword() {
		return password;
	}

	public WebElement loginbtn() {
		return loginbtn;
	}

	

}

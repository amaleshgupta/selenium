package org.allinone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpojo extends Baseclass{
	
	public signinpojo() {
		PageFactory.initElements(driver, this);
		
	}

	
	
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createnewaccount;
	
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstnametxtbox;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement secondnametxtbox;

	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement emailormobilenumbertxtbox;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement password;

	public WebElement getCreatenewaccount() {
		return createnewaccount;
	}

	public WebElement getFirstnametxtbox() {
		return firstnametxtbox;
	}

	public WebElement getSecondnametxtbox() {
		return secondnametxtbox;
	}

	public WebElement getEmailormobilenumbertxtbox() {
		return emailormobilenumbertxtbox;
	}

	public WebElement getPassword() {
		return password;
	}
	
}

package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.baseclass.BaseClass;

public class HomePage1 extends BaseClass {

	public static WebDriver driver;

	public HomePage1(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement name; 

	@FindBy(id = "password")
	private WebElement pwsd;

	@FindBy(id = "login")
	private WebElement loginbutton;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPwsd() {
		return pwsd;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}

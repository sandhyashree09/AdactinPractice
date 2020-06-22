package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.baseclass.BaseClass;

public class BookingPage extends BaseClass {
	
	public static WebDriver driver;

	public BookingPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement fname;
	
	@FindBy(id = "last_name")
	private WebElement lname;
	
	@FindBy(id = "address")
	private WebElement billaddress;
	
	@FindBy(id = "cc_num")
	private WebElement creditcardno;

	@FindBy(id = "cc_type")
	private WebElement cardtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement ccvno;
	
	@FindBy(id = "book_now")
	private WebElement confirmbooking;
	
	@FindBy(id = "my_itinerary")
	private WebElement itinerary;
	
	@FindBy(id = "logout")
	private WebElement hlogout;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getConfirmbooking() {
		return confirmbooking;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getHlogout() {
		return hlogout;
	}
	
}

package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.baseclass.BaseClass;

public class HBSearchHotelPage2 extends BaseClass {

	public static WebDriver driver;
	
	public HBSearchHotelPage2(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
}
	@FindBy(id = "location")
	private WebElement hlocation;
	
	@FindBy(id = "hotels")
	private WebElement hname;
	
	@FindBy(id = "room_type")
	private WebElement rtype;
	
	@FindBy(id = "room_nos")
	private WebElement noofrooms;
	
	@FindBy(id = "datepick_in")
	private WebElement checkin;
	
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	
	@FindBy(id = "adult_room")
	private WebElement noofadults;
	
	@FindBy(id = "child_room")
	private WebElement noofkids;
	
	@FindBy(id ="Submit")
	private WebElement search;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getHlocation() {
		return hlocation;
	}

	public WebElement getHname() {
		return hname;
	}

	public WebElement getRtype() {
		return rtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getNoofadults() {
		return noofadults;
	}

	public WebElement getNoofkids() {
		return noofkids;
	}

	public WebElement getSearch() {
		return search;
	}
	

}

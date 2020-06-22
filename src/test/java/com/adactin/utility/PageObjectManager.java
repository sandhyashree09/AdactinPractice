package com.adactin.utility;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookingPage;
import com.adactin.pom.HBSearchHotelPage2;
import com.adactin.pom.HConfirmationPage3;
import com.adactin.pom.HomePage1;

public class PageObjectManager {
	
	public static WebDriver driver;

	//pojo class
	private BookingPage Bp;
	private HBSearchHotelPage2 Hbshp;
	private HConfirmationPage3 Hcp;
	private HomePage1 Hp;
	
	
	//constructor
	
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
	}
	public BookingPage getBp() {
		Bp = new BookingPage(driver);
		return Bp;
	}
	public HBSearchHotelPage2 getHbshp() {
		Hbshp = new HBSearchHotelPage2(driver);
		return Hbshp;
	}
	public HConfirmationPage3 getHcp() {
		Hcp = new HConfirmationPage3(driver);
		return Hcp;
	}
	public HomePage1 getHp() {
		Hp = new HomePage1(driver);
		return Hp;
	}
	
}

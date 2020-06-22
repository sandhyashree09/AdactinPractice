package com.adactin.runner;

import org.junit.Test;

import com.adactin.pom.BookingPage;
import com.adactin.pom.HBSearchHotelPage2;
import com.adactin.pom.HConfirmationPage3;
import com.adactin.pom.HomePage1;
import com.automation.baseclass.BaseClass;

public class TestScript extends BaseClass {

	@Test
	public void adactinTest() {

		driver = browserLaunch("chrome");
		getUrl("http://adactinhotelapp.com/");
		
		HomePage1 hp = new HomePage1(driver);
		sendKeysText(hp.getName(), "PavithraN");
		sendKeysText(hp.getPwsd(), "Pavi@2426");
		clickElement(hp.getLoginbutton());
		
		HBSearchHotelPage2 sh = new HBSearchHotelPage2(driver);
		dropDownSelect(sh.getHlocation(), "value", "London");
		dropDownSelect(sh.getHname(), "value", "Hotel Sunshine");
		dropDownSelect(sh.getRtype(), "value", "Deluxe");
		dropDownSelect(sh.getNoofrooms(), "value", "1");
		sendKeysText(sh.getCheckin(), "22/05/2020");
		sendKeysText(sh.getCheckout(), "24/05/2020");
		dropDownSelect(sh.getNoofadults(), "value", "2");
		dropDownSelect(sh.getNoofkids(), "value", "1");
		clickElement(sh.getSearch());
		
		HConfirmationPage3 cp = new HConfirmationPage3(driver);
		clickElement(cp.getSelect());
		clickElement(cp.getHcontinue());
		
		BookingPage bp = new BookingPage(driver);
		sendKeysText(bp.getFname(), "Sandhya");
		sendKeysText(bp.getLname(), "Hari");
		sendKeysText(bp.getBilladdress(), "Chennai");
		sendKeysText(bp.getCreditcardno(), "1234567890123456");
		dropDownSelect(bp.getCardtype(), "value", "AMEX");
		dropDownSelect(bp.getExpirymonth(), "value", "4");
		dropDownSelect(bp.getExpiryyear(), "value", "2022");
		sendKeysText(bp.getCcvno(), "345");
		clickElement(bp.getConfirmbooking());
		
		clickElement(bp.getItinerary());
		clickElement(bp.getHlogout());
	
		browserClose("close");
		
		
	}
	}

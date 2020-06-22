package com.adactin.stepdefinition;
 
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.adactin.pom.BookingPage;
import com.adactin.pom.HBSearchHotelPage2;
import com.adactin.pom.HConfirmationPage3;
import com.adactin.pom.HomePage1;
import com.adactin.runner.Runner;
import com.adactin.utility.ConfigurationReader;
import com.adactin.utility.FileReaderManager;
import com.adactin.utility.PageObjectManager;
import com.automation.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	public static WebDriver driver=Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		//driver = browserLaunch("chrome");
	//	ConfigurationReader con = new ConfigurationReader();
		//getUrl("http://adactinhotelapp.com/");
		String url = FileReaderManager.getFRMInstance().getCRInstance().getUrl();
		getUrl(url);
	}

	@When("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
		//HomePage1 hp = new HomePage1(driver);
		sendKeysText(pom.getHp().getName(), "PavithraN");
	}
	

	@When("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		//HomePage1 hp = new HomePage1(driver);
		sendKeysText(pom.getHp().getPwsd(), "Pavi@2426");
	}

	@When("^User enter in the login button$")
	public void user_enter_in_the_login_button() throws Throwable {
		HomePage1 hp = new HomePage1(driver);
		clickElement(pom.getHp().getLoginbutton());
		//Assert.assertEquals(false, true);
	}

	@Then("^It lands to the homepage successfully$")
	public void it_lands_to_the_homepage_successfully() throws Throwable {
		System.out.println("Successfully lands homepage");
    
}
	@Given("^User launch the hotel booking search page$")
	public void user_launch_to_hotel_booking_search_page() throws Throwable {
		System.out.println("Hotel booking search page launched successfully");
	}

	@When("^User navigated to select location of the hotel$")
	public void user_navigated_to_select_location_of_the_hotel() throws Throwable {
		//HBSearchHotelPage2 sh = new HBSearchHotelPage2(driver);
		dropDownSelect(pom.getHbshp().getHlocation(), "value", "London");
	}

	@When("^User selects hotel name$")
	public void user_selects_hotel_name() throws Throwable {
		//HBSearchHotelPage2 sh = new HBSearchHotelPage2(driver);
		dropDownSelect(pom.getHbshp().getHname(), "value", "Hotel Sunshine");
	}
	
	@When("^User selects the roomtype$")
	public void user_selects_the_roomtype() throws Throwable {
		//HBSearchHotelPage2 sh = new HBSearchHotelPage2(driver);
		dropDownSelect(pom.getHbshp().getRtype(), "value", "Deluxe");
	}

	@When("^User selects number of rooms required$")
	public void user_selects_number_of_rooms_required() throws Throwable {
		//HBSearchHotelPage2 sh = new HBSearchHotelPage2(driver);
		dropDownSelect(pom.getHbshp().getNoofrooms(), "value", "1");
	}

	@When("^User enters checkin date$")
	public void user_enters_checkin_date() throws Throwable {
		//HBSearchHotelPage2 sh = new HBSearchHotelPage2(driver);
		sendKeysText(pom.getHbshp().getCheckin(), "22/05/2020");
	}

	@When("^User enters checkout date$")
	public void user_enters_checkout_date() throws Throwable {
		HBSearchHotelPage2 sh = new HBSearchHotelPage2(driver);
		sendKeysText(pom.getHbshp().getCheckout(), "24/05/2020");
	}

	@When("^User selects number of adults per room$")
	public void user_selects_number_of_adults_per_room() throws Throwable {
		HBSearchHotelPage2 sh = new HBSearchHotelPage2(driver);
		dropDownSelect(pom.getHbshp().getNoofadults(), "value", "2");
	}

	@When("^User selects number of child per room$")
	public void user_selects_number_of_child_per_room() throws Throwable {
	//	HBSearchHotelPage2 sh = new HBSearchHotelPage2(driver);
		dropDownSelect(pom.getHbshp().getNoofkids(), "value", "1");
	}

	@When("^User enter search button$")
	public void user_enter_search_button() throws Throwable {
	//	HBSearchHotelPage2 sh = new HBSearchHotelPage2(driver);
		clickElement(pom.getHbshp().getSearch());
	}

	@Then("^It navigates to confirmation page successfully$")
	public void it_navigates_to_confirmation_page_successfully() throws Throwable {
		System.out.println("Confirmation page has been processed successfully");
	}

	@Given("^User launch hotel confirmation page$")
	public void user_launch_hotel_confirmation_page() throws Throwable {
	//	HConfirmationPage3 cp = new HConfirmationPage3(driver);
		System.out.println("Confirmation page launched");
	}

	@When("^User enter select button$")
	public void user_enter_select_button() throws Throwable {
		//HConfirmationPage3 cp = new HConfirmationPage3(driver);
		clickElement(pom.getHcp().getSelect());
	}

	@When("^User enter in the continue button$")
	public void user_enter_continue_button() throws Throwable {
	//	HConfirmationPage3 cp = new HConfirmationPage3(driver);
		clickElement(pom.getHcp().getHcontinue());
	}
	@Given("^User gets launched to booking page$")
	public void user_gets_launched_to_booking_page() throws Throwable {
		System.out.println("Booking page got launched");
	}

	@When("^User enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		sendKeysText(pom.getBp().getFname(), "Sandhya");
	}

	@When("^User enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		sendKeysText(pom.getBp().getLname(), "Hari");
	}

	@When("^User enter the billing address$")
	public void user_enter_the_billing_address() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		sendKeysText(pom.getBp().getBilladdress(), "Chennai");
	}

	@When("^User enter the creditcard number$")
	public void user_enter_the_creditcard_number() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		sendKeysText(pom.getBp().getCreditcardno(), "1234567890123456");
	}

	@When("^User enter the creditcard type$")
	public void user_enter_the_creditcard_type() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		dropDownSelect(pom.getBp().getCardtype(), "value", "AMEX");
	}

	@When("^User enter the expiry month$")
	public void user_enter_the_expiry_month() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		dropDownSelect(pom.getBp().getExpirymonth(), "value", "4");
	}

	@When("^User enter the expiry year$")
	public void user_enter_the_expiry_year() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		dropDownSelect(pom.getBp().getExpiryyear(), "value", "2022");
	}

	@When("^User enter the ccv number$")
	public void user_enter_the_ccv_number() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		sendKeysText(pom.getBp().getCcvno(), "345");
	}

	@When("^User enter the confirm booking$")
	public void user_enter_the_confirm_booking() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		clickElement(pom.getBp().getConfirmbooking());
	}

	@When("^User click on Itinerary$")
	public void user_click_on_Itinerary() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		clickElement(pom.getBp().getItinerary());
	}

	@When("^User click on logout$")
	public void user_click_on_logout() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		clickElement(pom.getBp().getHlogout());
	}

	@Then("^User close the browser$")
	public void user_close_the_browser() throws Throwable {
	//	BookingPage bp = new BookingPage(driver);
		browserClose("close");
	}



}
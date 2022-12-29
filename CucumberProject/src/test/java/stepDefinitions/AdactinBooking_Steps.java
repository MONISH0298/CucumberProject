package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import CucumberProject.Base1;
import CucumberProject.POM1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdactinBooking_Steps extends Base1  {
	
	// Login scenario	
	@Given("user goes to the Login page")
	public void user_goes_to_the_login_page() {
		BrowserLaunch("chrome");
		Url("https://adactinhotelapp.com/");
		maximize();
		ImplicityWaits(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, POM1.class);
	}
	@When("user enter the Username as {string}")
	public void user_enter_the_username_as(String string) {
		InputValue(POM1.username, "dinesh0017");
		
	}
	@When("Enter the password as {string}")
	public void enter_the_password_as(String string) {
		InputValue(POM1.password, "9080132507");
	}
	@When("user clicks the loginbtn")
	public void user_clicks_the_loginbtn() {
	  click(POM1.login);
	}
	@Then("user navigated to the home page")
	public  void user_navigated_to_the_home_page() {
	    System.out.println("Login Successful");
	}
	
	//Hotel Search scenario
	@When("user Selects the location and hotels")
	public void user_selects_the_location_and_hotels() {
	  select1(POM1.location).selectByIndex(1);
	  select1(POM1.hotels).selectByIndex(2);
	}
	@When("user Selects the roomType and noOfRooms")
	public void user_selects_the_room_type_and_no_of_rooms() {
	   select1(POM1.roomtype).selectByIndex(4);
	   select1(POM1.roomNos).selectByIndex(2);
	   
	}
	@When("user enter the checkIn and CheckOut dates")
	public void user_enter_the_check_in_and_check_out_dates() {
	   Clear(POM1.datein);
	   POM1.datein.sendKeys("24/12/2022");
	   Clear(POM1.dateout);
	   POM1.dateout.sendKeys("26/12/2022");
	}
	@When("User selects adultsPerRoom and childernsPerRoom")
	public void user_selects_adults_per_room_and_childerns_per_room() {
		select1(POM1.adultroom).selectByIndex(2);
		select1(POM1.childroom).selectByIndex(0);
	    
	}
	@When("user clicks the searchBtn")
	public void user_clicks_the_search_btn() {
		POM1.submit.click();
	   
	}
	@Then("User navigated to Hotel confirmation Page")
	public void user_navigated_to_hotel_confirmation_page() {
		System.out.println("Navigated to confirmation page");
	}
	
	//Select hotel scenario
	
	@When("user clicks radioBtn")
	public void user_clicks_radio_btn() {
		POM1.radioButton.click();
	   
	}
	@When("user the continueBtn")
	public void user_the_continue_btn() {
	  POM1.continue1.click();
	}
	@Then("user navigated to Hotel Booking")
	public void user_navigated_to_hotel_booking() {
		System.out.println("Hotel selected");
	}

	//Booking scenario

	@When("user enter the firstName,lastName and billingAddress")
	public void user_enter_the_first_name_last_name_and_billing_address() {
		POM1.firstname.sendKeys("MONISHKUMAR");
		POM1.lastname.sendKeys("R A");
		POM1.address.sendKeys("No:1,Amman illam,8th st,Rajendra nagar,Gingee");
	}
	@When("User enter the creditCard number")
	public void user_enter_the_credit_card_number() {
		POM1.creditCardNumber.sendKeys("1234567899876543");
	    
	}
	@When("user selects creditCard Type")
	public void user_selects_credit_card_type() {
	  select1(POM1.creditCardType).selectByIndex(2);
	}
	@When("user selects expirydate and expiryYear")
	public void user_selects_expirydate_and_expiry_year() {
	    select1(POM1.ccExpiryMonth).selectByIndex(8);
	    select1(POM1.ccExpiryYear).selectByIndex(12);
	}
	@When("user enter the CVV number")
	public void user_enter_the_cvv_number() {
	    POM1.CCV.sendKeys("123");
	}
	@When("user clicks the BooknowBtn")
	public void user_clicks_the_booknow_btn() throws InterruptedException {
	    POM1.bookNow.click();
	    Thread.sleep(5000);
	}
	@Then("User Booked the hotel successfully")
	public void user_booked_the_hotel_successfully() {
	    System.out.println("Booked!******Enjoy your Holidays********");
	}
	
	@Then("user scroll down and takes the screenshot of booking status")
	public void user_scroll_down_and_takes_the_screenshot_of_booking_status() throws IOException, InterruptedException {
	  scrollDown();
	  screenShot();
	}
		
}	
	
	
	




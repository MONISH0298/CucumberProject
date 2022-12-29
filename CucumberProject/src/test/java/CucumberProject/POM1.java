package CucumberProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM1 {
	@FindBy (id="username")
	public static WebElement username;
	@FindBy (id="password")
	public static WebElement password;
	@FindBy (id="login")
	public static WebElement login;
	@FindBy (id="location")
	public static WebElement location;
	@FindBy (id="hotels")
	public static WebElement hotels;
	@FindBy(id="room_type")
	public static WebElement roomtype;
	@FindBy (id="room_nos")
	public static WebElement roomNos;
	@FindBy (id="datepick_in")
	public static WebElement datein;
	@FindBy (id="datepick_out")
	public static WebElement dateout;
	@FindBy (id="adult_room")
	public static WebElement adultroom;
	@FindBy (id="child_room")
	public static WebElement childroom;
	@FindBy(id="Submit")
	public static WebElement submit;
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input[1]")
	public static WebElement radioButton;
	@FindBy (name = "continue")
	public static WebElement continue1;
	@FindBy(id="first_name")
	public static WebElement firstname;
	@FindBy(id="last_name")
	public static WebElement lastname;
	@FindBy (id="address")
	public static WebElement address;
	@FindBy(id="cc_num")
	public static WebElement creditCardNumber;
	@FindBy(id="cc_type")
	public static WebElement creditCardType;
	@FindBy(id="cc_exp_month")
	public static WebElement ccExpiryMonth;
	@FindBy(id="cc_exp_year")
	public static WebElement ccExpiryYear;
	@FindBy(id="cc_cvv")
	public static WebElement CCV;
	@FindBy(id="book_now")
	public static WebElement bookNow;

}

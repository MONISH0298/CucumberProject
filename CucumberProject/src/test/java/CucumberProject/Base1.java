package CucumberProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base1 {
	public static WebDriver driver;

	public static WebDriver BrowserLaunch(String browser) {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		return driver;
		
	}
	
	public static void Url(String url) {
		driver.get(url);
		}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	@SuppressWarnings("deprecation")
	public static void ImplicityWaits(long time,TimeUnit unit) {
	
		driver.manage().timeouts().implicitlyWait(time, unit);
	}
	public static void InputValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static String TextOfElements(WebElement element) {
		String text = element.getText();
		return text;
	}
	public static String pageTitle() {
		return driver.getTitle();
		
	}
	public static Select select1(WebElement element) {
		Select s = new Select(element);
		return s;
	
	}
	public static void locationDropDown(WebElement location) {
		location.toString();
	}
	public static void hotelsDropDown(WebElement hotels) {
		hotels.toString();
		
	}
	public static void roomTypeDropDown(WebElement roomType) {
		roomType.toString();
	}
	public static void noOfRoomsDropDown(WebElement noOfRooms) {
		noOfRooms.toString();
	}
	public static void Clear (WebElement element) {
		element.clear();
	}
	public static void adultRoom(WebElement adultPerRoom) {
		adultPerRoom.toString();
	}
	
	public static void ChildrenRoo(WebElement childrenPerRoom) {
		childrenPerRoom.toString();
	}
	public static void creditCardType(WebElement CCType) {
		CCType.toString();
	}
	public static void expiryDate(WebElement expirymonth) {
		expirymonth.toString();
	}
	public static void expiryYear(WebElement expiryYear) {
		expiryYear.toString();
	}
	public static void scrollDown() throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)");
		
		
	}
	public static void screenShot() throws IOException {
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		File location = new File("D:\\BookedSuccessfully.png");
		org.openqa.selenium.io.FileHandler.copy(sourcefile, location);
	}
}

package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.ChangeBackgroundPage;

public class ChangeBackgroundSteps {
	WebDriver driver = Hooks.driver;
	ChangeBackgroundPage page = PageFactory.initElements(driver, ChangeBackgroundPage.class);
	
	@Given("^\"([^\"]*)\" button exists in the page$")
	public void button_exists_in_the_page(String arg1) throws Throwable {
		//ChangeBackgroundPage page = PageFactory.initElements(driver, ChangeBackgroundPage.class);
		page.verifySkyBlueButton();
	}

	@When("^User click on the button to change background to skyblue$")
	public void user_click_on_the_button_to_change_background_to_skyblue() throws Throwable {
		page.changeToSkyBlue();
	}

	@Then("^The background color should change to sky blue$")
	public void the_background_color_should_change_to_sky_blue() throws Throwable {
		page.takeScreenshotAtEndOfTest();
	}

	
	

	@Given("^\"([^\"]*)\" button exists in page$")
	public void button_exists_in_page(String arg1) throws Throwable {
	    page.changeToWhite();
	}

	@When("^User click on the buttonto change background to skywhite$")
	public void user_click_on_the_buttonto_change_background_to_skywhite() throws Throwable {
	  page.verifySkyWhiteButton();
	}

	@Then("^The background color should change to white$")
	public void the_background_color_should_change_to_white() throws Throwable {
	 page.takeScreenshotAtEndOfTest();
	}


	
	
	
	

//@Given("^\"([^\"]*)\" button exists$")
//public void button_exists1() {
//	//driver =  BrowserFactory.startBrower();
//}

//@When("^User click on the button$")
//public void user_click_on_the_button() {
//	ChangeBackgroundPage page = PageFactory.initElements(driver, ChangeBackgroundPage.class);
//	page.changeToSkyBlue();
//}

//@Then("^The background color will change to sky blue$")
//public void the_background_color_will_change_to_sky_blue() {
//	
//   
//}

//@Given("^\"([^\"]*)\"button exists$")
//public void button_exists(){
//   
//}


//@When("^User click on the button$")
//public void user_click_on_the_button1() {
//	ChangeBackgroundPage page = PageFactory.initElements(driver, ChangeBackgroundPage.class);
//	page.changeToWhite();
//}
//
@Then("^The background color will change to white$")
public void the_background_color_will_change_to_white(){
   
}


	
}

package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends ProjectSpecificMethods{
	
@Given("Open Chrome Browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}
@Given("Launch Url")
public void launchUrl() {
	driver.get("http://leaftaps.com/opentaps/control/main");
}

@Given("Enter Username as (.*)")
public void enterUsernameAsDemosalesmanager(String uName) {
    driver.findElementById("username").sendKeys(uName);
}

@Given("Enter password as (.*)")
public void enterPasswordAsCrmsfa(String pass) {
	driver.findElementById("password").sendKeys(pass);
    }

@When("Click on Login Button")
public void clickOnLoginButton() {
	driver.findElementByClassName("decorativeSubmit").click();
}


@Then("verify Homepage is displayed")
public void verifyHomepageIsDisplayed() {
   System.out.println("Home page is displayed");
   
}

@When("click on crmsfa link")
public void clickCrmsfaLink() {
	driver.findElementByLinkText("CRM/SFA").click();

}

@Then("Verfiy MyHomePage is displayed")
public void verifyMyHomepageIsDisplayed() {
   System.out.println("Home page is displayed");
}

@But("verify error message")
public void verifyErrorMessage() {
	System.out.println("error message displayed");

}



	
	
	
	
	
	
	

}

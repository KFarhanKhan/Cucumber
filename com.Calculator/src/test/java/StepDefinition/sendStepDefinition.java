package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PadgeObjects.login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sendStepDefinition {
	WebDriver driver;
	@Given("user should be on the login page")
	public void user_should_be_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farhan\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.calculator.net/gas-mileage-calculator.html");
	}

	@When("user should clear the number and send send the new one")
	public void user_should_clear_the_number_and_send_send_the_new_one() throws InterruptedException {
		login input = new login(driver);
		input.gaz.clear();
		input.gaz.sendKeys("808090");
		Thread.sleep(3000);
	}

	@Then("user should see the new number")
	public void user_should_see_the_new_number() {
		driver.close();
		driver.quit();
	}



}

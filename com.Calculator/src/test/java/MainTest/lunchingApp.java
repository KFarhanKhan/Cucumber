package MainTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PadgeObjects.login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class lunchingApp {
	
	WebDriver driver;
	
	
	@BeforeTest
	
	public void setUp() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farhan\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.calculator.net/gas-mileage-calculator.html");
	}
	
	@Test
	public void testing() throws InterruptedException {
		
		login input = new login(driver);
		input.gaz.clear();
		input.gaz.sendKeys("808090");
		Thread.sleep(3000);
	}
	

	@AfterTest
	public void closeUp() {
		driver.close();
		driver.quit();
	}
}
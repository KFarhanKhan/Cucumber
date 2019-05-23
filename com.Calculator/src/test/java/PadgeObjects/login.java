package PadgeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="uscodreading")
	public WebElement gaz;
}
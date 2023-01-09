package pageobjectmodel_example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory_Examples {
	@FindBy(how=How.LINK_TEXT,using="Log in")
	public static WebElement login;
	
	
	@FindBy(id="Email")
	public static WebElement username;
	
	@FindBy(id = "Password")
	public static WebElement password;
	
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	public static WebElement submitbtn;

}

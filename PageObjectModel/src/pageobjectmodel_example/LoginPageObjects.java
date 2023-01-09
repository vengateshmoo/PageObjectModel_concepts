package pageobjectmodel_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	
	//User name,Password,Submit btn
	
	public static WebElement login(WebDriver driver) {
		return driver.findElement(By.linkText("Log in"));
	}
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("Email"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("Password"));
	}
	
	public static WebElement submitbtn(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
	}
}

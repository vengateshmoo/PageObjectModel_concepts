package pageobjectmodel_example;

import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriver {
	public static void main(String[] args) {




		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		LoginPageObjects.login(driver).click();
		LoginPageObjects.username(driver).sendKeys("ervengatesh1@gmail.com");
		LoginPageObjects.password(driver).sendKeys("Moorthi@1001");
		LoginPageObjects.submitbtn(driver).click();
		driver.quit();
		


	}
}
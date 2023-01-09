package pageobjectmodel_example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class PageFactory_WebDriver {

	
		@Test
		public void loginpage() {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		PageFactory.initElements(driver, PageFactory_Examples.class);
		PageFactory_Examples.login.click();
		PageFactory_Examples.username.sendKeys("ervengatesh1@gmail.com");
		PageFactory_Examples.password.sendKeys("moorthi@1001");
		PageFactory_Examples.submitbtn.click();
		driver.quit(); 
	}
	}


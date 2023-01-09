package pagefactorywithoutAnnotations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutFindByAnnotations {

	//only for interview purpose ,without using @FindBy Annotations directly use id (or) name is used.

	public static WebElement username;

	public static WebElement password;


	@Test
	public void login() {

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		PageFactory.initElements(driver, WithoutFindByAnnotations.class);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
	}



}

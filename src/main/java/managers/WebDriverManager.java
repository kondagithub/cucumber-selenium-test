package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

	private WebDriver driver;
	
	public WebDriverManager() {
		
	}
	
	public WebDriver getWebDriver() {
		if(driver == null) {
			createWebDriver();
		}
		return driver;
	}
	
	private void createWebDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/java/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
}

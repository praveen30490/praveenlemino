package addtariff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public static WebDriver driver;
	  static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\sudhar\\Cucumber\\driver\\chromedriver2.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
		return driver;
	}
	public static void  loadurl(String url) {
		driver.get(url);
		
	}
	public static void type(WebElement  element,String name) {
		element.sendKeys(name);
	}
	public static void  clicks(WebElement element) {
		element.click();
	}
	}

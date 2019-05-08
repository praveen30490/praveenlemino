import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class cucumberbase {
	static WebDriver driver;

	@Given("The user is in add customer id generated")
	public void the_user_is_in_add_customer_id_generated() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\sudhar\\Cucumber\\driver\\chromedriver2.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");

	}

	@When("The user is in add customer")
	public void the_user_is_in_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	/*
	 * @When("I complete action") public void i_complete_action() {
	 * driver.findElement(By.xpath("//label[text()='Done']")).click();
	 * driver.findElement(By.id("fname")).sendKeys("praveen");
	 * driver.findElement(By.id("lname")).sendKeys("sri");
	 * driver.findElement(By.id("email")).sendKeys("praveenlemino@gmail.com");
	 * driver.findElement(By.xpath("(//textarea[@id='message'])")).sendKeys("nill");
	 * driver.findElement(By.id("telephoneno")).sendKeys("9597967840");
	 * driver.findElement(By.name("submit")).click();
	 * 
	 * }
	 * 
	 * @When("I complete actions") public void i_complete_actions(DataTable
	 * dataTable) { List<String> list = dataTable.asList();
	 * driver.findElement(By.xpath("//label[text()='Done']")).click();
	 * driver.findElement(By.id("fname")).sendKeys(list.get(0));
	 * driver.findElement(By.id("lname")).sendKeys(list.get(1));
	 * driver.findElement(By.id("email")).sendKeys(list.get(2));
	 * driver.findElement(By.xpath("(//textarea[@id='message'])")).sendKeys(list.get
	 * (3)); driver.findElement(By.id("telephoneno")).sendKeys(list.get(4));
	 * driver.findElement(By.name("submit")).click();
	 * 
	 * }
	 * 
	 * @When("I complete actionss") public void i_complete_actionss(DataTable
	 * dataTable) { List<List<String>> list = dataTable.asLists(String.class);
	 * driver.findElement(By.xpath("//label[text()='Done']")).click();
	 * driver.findElement(By.id("fname")).sendKeys(list.get(0).get(0));
	 * driver.findElement(By.id("lname")).sendKeys(list.get(1).get(1));
	 * driver.findElement(By.id("email")).sendKeys(list.get(1).get(2));
	 * driver.findElement(By.xpath("(//textarea[@id='message'])")).sendKeys(list.get
	 * (1).get(3));
	 * driver.findElement(By.id("telephoneno")).sendKeys(list.get(0).get(4));
	 * driver.findElement(By.name("submit")).click(); }
	 
 nv 	@When("I complete actionsss")
	public void i_complete_actionsss(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(map.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(map.get("lname"));
		driver.findElement(By.id("email")).sendKeys(map.get("gmail"));
		driver.findElement(By.xpath("(//textarea[@id='message'])")).sendKeys(map.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(map.get("mobile number"));
		driver.findElement(By.name("submit")).click();

	}*/
	@When("I complete actionssss")
	public void i_complete_actionssss(DataTable dataTable) {
		List<Map<String, String>> asmap = dataTable.asMaps();
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(asmap.get(0).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(asmap.get(0).get("lname"));
		driver.findElement(By.id("email")).sendKeys(asmap.get(2).get("gmail"));
		driver.findElement(By.xpath("(//textarea[@id='message'])")).sendKeys(asmap.get(2).get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(asmap.get(2).get("mobile number"));
		driver.findElement(By.name("submit")).click();

	    
	   
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		Assert.assertTrue(driver.getCurrentUrl().contains("access"));
	}

}

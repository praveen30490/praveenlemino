
package addtariff;

import org.openqa.selenium.WebDriver;
import org.tester.LogAddtariff;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addtariff extends Base {
	 static LogAddtariff page;
	
	@Given("I want to  launch the launch browser")
	public void i_want_to_launch_the_launch_browser() {
	    
	}

//	@When("click on the add tariff plan")
//	public void click_on_the_add_tariff_plan(Integer int1) {
//		WebDriver driver=getDriver();
//		loadurl("http://demo.guru99.com/telecom/addtariffplans.php");
//		 page=new LogAddtariff ();
//		
//		type(page.txtusemonthrendal(),"12");
//		type(page.localmin(),"1");
//		type(page.intermin(),"11");
//		type(page. smspack(),"12");
//		type(page. minutescharges(),"12");
//		type(page.intercharges(),"12");
//		type(page.smscharges(),"12");
//		clicks(page.submit());
//		
//		
//	 
//	}
	@When("click on the add tariff plan{int}")
	public void click_on_the_add_tariff_plan(Integer int1) {WebDriver driver=getDriver();
		loadurl("http://demo.guru99.com/telecom/addtariffplans.php");
		page = new LogAddtariff();

		type(page.txtusemonthrendal(), "12");
		type(page.localmin(), "1");
		type(page.intermin(), "11");
		type(page.smspack(), "12");
		type(page.minutescharges(), "12");
		type(page.intercharges(), "12");
		type(page.smscharges(), "12");
		clicks(page.submit());
	}
	@When("Mentions the add tariff details")
	public void mentions_the_add_tariff_details() {
		clicks(page.homebutton());
		
	   
	}

	@Then("I validate the customer output")
	public void i_validate_the_customer_output() {

	}



}

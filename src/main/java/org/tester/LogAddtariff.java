package org.tester;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import addtariff.Base;

public class LogAddtariff extends Base {
	public LogAddtariff() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="rental1")
	private WebElement txtusemonthrendal;
	@FindBy(id="local_minutes")
	private WebElement localmin;
	@FindBy(id="inter_minutes")
	private WebElement intermin;
	@FindBy(id="sms_pack")
	private WebElement smspack;
	@FindBy(id="minutes_charges")
	private WebElement minutescharges;
	@FindBy(id="inter_charges")
	private WebElement intercharges;
	@FindBy(id="sms_charges")
	private WebElement smscharges;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	@FindBy(xpath="//a[@class='button']")
	private WebElement homebutton;

	public WebElement txtusemonthrendal(){
		return txtusemonthrendal;
	}
	public WebElement  localmin(){
		return  localmin;
	}
	public WebElement intermin(){
		return intermin;
	}
	public WebElement smspack(){
		return smspack;
	}
	public WebElement minutescharges(){
		return minutescharges;}
	public WebElement intercharges(){
		return intercharges;}
	public WebElement smscharges(){
		return smscharges;}
	public WebElement submit (){
		return submit;}
	public WebElement homebutton() {
		return homebutton;
	}
	
	

	
	
	
	
	
	
	
	
	
		
	
	

}

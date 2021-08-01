package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage1 {

	
	//initilisation
	
	@FindBy(xpath="//input[@id='userid']") private WebElement uid;
	
	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	
	//decleration
	
	public kiteloginpage1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	//usage
	
	public void inputkiteloginpage1uid(String username) 
	{
		uid.sendKeys(username);
	}
	
	public void inputkiteloginpage1pwd(String password) 
	{
		pwd.sendKeys(password);
	}
	public void clickkiteloginpagelogin()
	{
		login.click();
	}
	
}

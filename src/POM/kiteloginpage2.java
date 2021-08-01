package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage2 {

	
	//initilisation
	
		@FindBy(xpath="//input[@type='password']") private WebElement pin;
		
	
		@FindBy(xpath="//button[@type='submit']") private WebElement cont;
		
		
		//decleration
		
		public kiteloginpage2(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
		}
		
		
		//usage
		
		public void inputkiteloginpage2pin (String upin)
		{
			pin.sendKeys(upin);
		}

		public void clickkiteloginpage2cont()
		{
			cont.click();
		}
		
		
		
	
	
	
}

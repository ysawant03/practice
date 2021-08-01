package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehome {

	
	@FindBy(xpath="//span[@class='user-id']") private WebElement actid;
	
	public kitehome(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyuser(String expuser)
	{
		
		String actuser = actid.getText();
		
		if (actuser.equals(expuser))
		{
		System.out.println("pass");
		}
	
		else
		{
			System.out.println("fail");
		}
	
	}
}
package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testclass {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		FileInputStream file = new FileInputStream("C:\\Users\\Yash Sawant\\Desktop\\practice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("JF");
		
		
		kiteloginpage1 login1 = new kiteloginpage1(driver);
		String username = sh.getRow(1).getCell(1).getStringCellValue();
		login1.inputkiteloginpage1uid(username);
		
		String password = sh.getRow(1).getCell(2).getStringCellValue();
		login1.inputkiteloginpage1pwd(password);
		
		login1.clickkiteloginpagelogin();
		
		kiteloginpage2 login2= new kiteloginpage2(driver);
		String upin = sh.getRow(1).getCell(3).getStringCellValue();
		login2.inputkiteloginpage2pin(upin);
		
		login2.clickkiteloginpage2cont();
		
		kitehome home =new kitehome(driver);
		String expuser = sh.getRow(1).getCell(1).getStringCellValue();
		home.verifyuser(expuser);
		
		
		
		
}		
}

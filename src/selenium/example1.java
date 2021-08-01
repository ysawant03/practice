package selenium;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class example1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(3000);
		
		WebElement src =driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		
		Select s=new Select(src);
		
		s.selectByVisibleText("Beauty");
		
		List<WebElement> all=s.getOptions();
		
		ArrayList<Object> ar=new ArrayList<Object>();
		for(WebElement W:all) {
		ar.add(W.getText())	;
		}
			
		
		TreeSet<Object> t = new TreeSet<Object>(ar);
		

	Iterator<Object> di=t.descendingIterator();
	while(di.hasNext()) {
		System.out.println(di.next());
	}
	
			
		
		
		
		
		
		
		
		//input[@type='submit']
		
		
		
		
		
		
		
		
	}
	
	
	
	
}

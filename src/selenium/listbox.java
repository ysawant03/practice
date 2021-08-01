package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.amazon.in");
			Thread.sleep(3000);
	
			WebElement list=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			
			Select s = new Select(list);
	
			s.selectByVisibleText("Computers & Accessories");
			
			List<WebElement> alloption = s.getOptions();
			ArrayList<Object> al = new ArrayList<Object>();
			for(WebElement w:alloption) {
				
				al.add(w.getText());
			}
				
				
			TreeSet<Object> t =new TreeSet<Object>(al);
			
			Iterator<Object> it=t.descendingIterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	
		
			
			
			
}
}
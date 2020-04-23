import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		//selecting value from dropdown wihout using select class it is by using bootstrap 
		
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		
		List<WebElement> webElements=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		
		System.out.println(webElements.size());
		
		for(int i=0;i< webElements.size();i++){
			System.out.println(webElements.get(i).getText());
			if(webElements.get(i).getText().contains("London, United Kingdom")) {
				webElements.get(i).click();
				break;
			}
		}
		
	
	}
	
}

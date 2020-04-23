import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//By using tag and ID
		
		WebElement element=driver.findElement(By.cssSelector("input#email"));
		System.out.println(element.getAttribute("name"));
		
		
		// By using tag and Class
		
		driver.get("https://www.makemytrip.com/");

		WebElement element1=driver.findElement(By.cssSelector("div.headerOuter"));
		System.out.println(element1.isDisplayed());
		
		// By using tag and attribute 
		
		driver.findElement(By.cssSelector("li[data-cy=\"roundTrip\"]")).click();
		
		//By using  tag, class, and attribute
		driver.findElement(By.cssSelector("input.fsw_inputField[id=\"fromCity\"]")).click();
		
		
		//driver.findElement(By.cssSelector("font:contains[\"Super Offers\"]")).isDisplayed();
		
	}
}

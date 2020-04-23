import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//System.out.println("facebook");
		
		driver.navigate().to("https://www.amazon.in/");
		//System.out.println("Amazon");
		
		driver.navigate().back();
		//System.out.println("facebook");
	
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		driver.navigate().refresh();
		
		
		
	}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunctionality {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//*[@class='fswTabs latoBlack greyText']//descendant::li[2]")).click();

		driver.findElement(By.xpath("//*[@class='makeFlex font12']//descendant::li[1]")).click();
		Thread.sleep(3000);

		driver.quit();
		
	}
	
}

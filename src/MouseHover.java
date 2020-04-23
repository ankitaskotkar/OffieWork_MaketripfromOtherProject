import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/newtours/";

		System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	// 		driver.get("http://demo.guru99.com/test/facebook.html");
		
		//basic code of move to Element and hovering on an element 
	   
/*
                driver.get(baseUrl);           
                WebElement link_Home = driver.findElement(By.linkText("Home"));
                WebElement td_Home = driver
                        .findElement(By
                        .xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));    
                 
                Actions builder = new Actions(driver);
                Action mouseOverHome = builder
                        .moveToElement(link_Home)
                        .build();
                 
                String bgColor = td_Home.getCssValue("background-color");
                System.out.println("Before hover: " + bgColor);        
                mouseOverHome.perform();        
                bgColor = td_Home.getCssValue("background-color");
                System.out.println("After hover: " + bgColor);
                */
                
                // Doing Mouse actions on Make my trip website
                
                driver.navigate().to("https://www.makemytrip.com/");
                
                //Mousehover functionality
                /*  WebElement target=driver.findElement(By.xpath("//li[@data-cy=\"menu_More\"]"));
                  
                  Action actionObject = builder.moveToElement(target).build();
                  actionObject.perform();
                  */
                  

                Actions builder= new Actions(driver);
           
                WebElement target1=driver.findElement(By.xpath("//span[contains(text(),'From')]"));
                
                //WebElement target2= driver.findElement(By.xpath("//input[@type=\"text\" and @placeholder=\"From\"]"));
                String text="Mumbai, India";
                Action actionobject1= builder.moveToElement(target1).click().sendKeys(text).build();
                
                actionobject1.perform();
                List<WebElement> webElements=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
        		
                for(int i=0;i< webElements.size();i++){
        			System.out.println(webElements.get(i).getText());
        			if(webElements.get(i).getText().contains(text)) {
        				System.out.println("matched");
        				webElements.get(i).click();
        				break;
        			}
        			System.out.println("didnt matched");
        		}
            
                
                //driver.close();

	}

}

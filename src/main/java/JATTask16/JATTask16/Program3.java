package JATTask16.JATTask16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriverManager.chromedriver().setup();
		
       
       // Initialize FirefoxDriver with options
       WebDriver driver = new ChromeDriver();

       try {
           // Navigate to www.google.com
           driver.get("https://www.wikipedia.org");

           driver.manage().window().maximize();
           
           WebElement searchInput = driver.findElement(By.name("search"));
           searchInput.sendKeys("Artificial Intelligence");
           searchInput.submit();
           
           Thread.sleep(3000);
   		
   			WebElement lnkHistory = driver.findElement(By.linkText("History"));
   			lnkHistory.click();
   			
   			Thread.sleep(2000);
           
   			
   		 // Print the page title
            System.out.println("Page Title: " + driver.getTitle());
                     
           
           }
           catch (Exception e) {
      			// TODO Auto-generated catch block
      			e.printStackTrace();
           }
       finally {
           // Close the browser
           driver.quit();
       }		
       }

}

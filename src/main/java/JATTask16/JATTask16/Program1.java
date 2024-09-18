package JATTask16.JATTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import java.lang.Thread;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriverManager.firefoxdriver().setup();
		
       
       // Initialize FirefoxDriver with options
       WebDriver driver = new FirefoxDriver();

       try {
           // Navigate to www.google.com
           driver.get("https://www.google.com");

           
           // Maximize the window
           driver.manage().window().maximize();
           
           // Print the URL of the current page
           String currentUrl = driver.getCurrentUrl();
           System.out.println("Current URL: " + currentUrl);

           // Reload the page
           driver.navigate().refresh();

           // Optionally, wait for a while to see the reloaded page before closing
           try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 2 seconds wait (import java.lang.Thread)

       } finally {
           // Close the browser
           driver.quit();
       }		

	}

}

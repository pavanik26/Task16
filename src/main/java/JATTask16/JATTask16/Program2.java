package JATTask16.JATTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriverManager.chromedriver().setup();
		
       
       // Initialize FirefoxDriver with options
       WebDriver driver = new ChromeDriver();

       try {
           // Navigate to www.google.com
           driver.get("https://www.demoblaze.com");

           
           // Maximize the window
           driver.manage().window().maximize();
           
           try {
   			Thread.sleep(2000);
   		
           
           // Print the URL of the current page
           String title = driver.getTitle();
                     
           if (title.equals("STORE"))
           {
        	   System.out.println("page landed on correct website");
           }
           
           else {
        	   System.out.println("page not landed on correct website");
           }
           }
           catch (InterruptedException e) {
      			// TODO Auto-generated catch block
      			e.printStackTrace();
           }
       }finally {
           // Close the browser
           driver.quit();
       }		
       }
	}
	

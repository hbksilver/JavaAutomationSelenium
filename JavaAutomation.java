package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
  
public class JavaAutomation {
        
     public static void main(String[] args) {
                
    	 System.setProperty("webdriver.fireFox.driver","C:\\Users\\hahme\\eclipse-workspace\\SeleniumJavaAutomation\\geckodriver.exe\"");
         //creating web driver instance
    	 WebDriver driver;
         driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver.get("https://www.google.com/");
         
         //retrieve the web page title
         String PageTiltle = driver.getTitle();
         System.out.println("Page Title :"+PageTiltle);
         
         //maximize window
         driver.manage().window().maximize();
         
         //close the browser window or use driver.quite();
         driver.close();
     }
}

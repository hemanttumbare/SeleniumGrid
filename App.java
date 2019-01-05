package com.hemant.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
     /*   DesiredCapabilities cap  =new DesiredCapabilities();
        cap.setPlatform(Platform.WINDOWS);
        cap.setBrowserName("chrome");
        
        WebDriver driver = new RemoteWebDriver(new URL("http://13.127.220.196:4444/wd/hub"), cap);
        
        driver.manage().window().maximize();
        driver.get("https://www.techbeamers.com/selenium-grid-webdriver-code-example-java/");
        
     ////////////////////////////   
        DesiredCapabilities cap1  =new DesiredCapabilities();
        cap1.setPlatform(Platform.WINDOWS);
        cap1.setBrowserName("firefox");
        
        WebDriver driver1 = new RemoteWebDriver(new URL("http://13.127.220.196:4444/wd/hub"), cap1);
        
        driver1.manage().window().maximize();
        driver1.get("https://www.techbeamers.com/selenium-grid-webdriver-code-example-java/");*/
        
     ///////////////////////////////
        
        DesiredCapabilities cap2  =new DesiredCapabilities();
        cap2.setPlatform(Platform.WINDOWS);
        cap2.setBrowserName("internetexplorer");
        System.out.println(cap2.toString());
        WebDriver driver2 = new RemoteWebDriver(new URL("http://13.127.220.196:4444/wd/hub"), cap2);
        
        driver2.manage().window().maximize();
        driver2.get("https://www.techbeamers.com/selenium-grid-webdriver-code-example-java/");
    }
}

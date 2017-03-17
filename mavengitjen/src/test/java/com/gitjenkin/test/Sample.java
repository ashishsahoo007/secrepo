package com.gitjenkin.test;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
//import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public  void sample() throws MalformedURLException, InterruptedException
	{
         RemoteWebDriver driver;
	     DesiredCapabilities capabilities =new DesiredCapabilities();
		 capabilities.setCapability("automationName", "Appium");
		 capabilities.setCapability("platformName", "Android");
	     capabilities.setCapability(CapabilityType.VERSION, "6.0");
	     capabilities.setCapability("deviceName", "S4");
	     // capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	     capabilities.setCapability("appPackage", "com.flipkart.android");
		 capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		
//jfdjgffasf
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// 1. VERIFY WHETHER HOME PAGE IS LOADED
		//driver.findElement(By.id("com.flipkart.android:id/btn_skip")).click();
		if(driver.findElement(By.name("Home"))!= null)
        {
		System.out.println("Element HOME is Present and it means page is loaded ");
		}else{
		System.out.println("Element is Absent");
		}
  // 2.  CLICK ON MENU BUTTON 
		driver.findElement(By.className("android.widget.ImageButton")).click();
  // 3. VERIFY CATEGORIES PRESENT
		Thread.sleep(20000);
		if(driver.findElement(By.name("Electronics"))!= null)
        {
		System.out.println("Electronics element is present ");
		}else{
		System.out.println("Element is Absent");
		}
		Thread.sleep(5000);
		if(driver.findElement(By.name("Fashion"))!= null)
        {
		System.out.println("Fashion element is present ");
		}else{
		System.out.println("Element is Absent");
		}
		Thread.sleep(5000);
		if(driver.findElement(By.name("Home and Furniture"))!= null)
        {
		System.out.println("Home and Furniture element is present ");
		}else{
		System.out.println("Element is Absent");
		}
		Thread.sleep(5000);
		if(driver.findElement(By.name("TVs & Appliances"))!= null)
        {
		System.out.println("TVs & Appliances element is present ");
		}else{
		System.out.println("Element is Absent");
		}
		Thread.sleep(5000);
		if(driver.findElement(By.name("Books & More"))!= null)
        {
		System.out.println("Books & More element is present ");
		}else{
		System.out.println("Element is Absent");
		}

		
         
       
        
	}
         
}        
         
         
         
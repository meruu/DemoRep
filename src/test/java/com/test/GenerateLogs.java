package com.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GenerateLogs {
	
	WebDriver driver;
	Logger log=Logger.getLogger(GenerateLogs.class);
	
	@BeforeMethod
	public void setup()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\nithya\\Desktop\\eclipse\\java\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		log.info("Launchingggggggggggggggg");
		log.warn("warningggg");
		log.fatal("fatalllllll");
		log.debug("debuggggg");
	driver.get("https://www.google.com/");	
	}
	
	@Test
	public void googletitletest() throws InterruptedException
	{ 
		String title=driver.getTitle();
		System.out.println(title);
	//Thread.sleep(18000);
		
	//	System.out.println("calling main test method");
		Assert.assertEquals(title,"Googl","title is not matched");}
		
		@Test
		public void googlelogo()
		{   
			boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
			Assert.assertTrue(true);
			
		}

	
	@AfterMethod
	public void quit()
	{  
		
	driver.close();
		
		//System.out.println("after method calling");
	}

}

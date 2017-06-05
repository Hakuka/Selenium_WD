package com.google;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class GoogleTests {
	
	public static void wczyt(){
		System.setProperty("webdriver.firefox.bin", "D:\\FireFox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
	}
	
	public static String IsItGoogle(String SiteTitle) throws InterruptedException{
		wczyt();
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);	
		
		driver.get("http://google.com/");
		Thread.sleep(2000);
		
		SiteTitle = driver.getTitle();
		
		driver.close();
		return SiteTitle;
	}
		
	public static String RekSofSys(String Szukane) throws InterruptedException{
		wczyt();
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);		
		
		driver.get("http://softsystem.pl");
		Thread.sleep(2000);
		
		//MAGIC WITH HOVER LOL
		WebElement ele = driver.findElement(By.linkText("KARIERA"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		
		driver.findElement(By.xpath("//*[@id='dropmenu3']/a[2]")).click();
		
		/*
		// not working - probably wrong import
		List<WebElement> myElements = driver.findElements(By.xpath("//*[@id='main']/ul"));
		for(WebElement e : myElements) {
		  System.out.println(e.getText());
		}
		*/
		
		Thread.sleep(2000);
		driver.close();
		return Szukane;
	}
}

package poetrade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AnyCToEx {

	public static String CTE(String[] args) throws InterruptedException {
		
		String league;
		
		//path
		System.setProperty("webdriver.firefox.bin", "D:\\FireFox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
		
		//ff
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		driver.get("http://currency.poe.trade/");
		
		//open + select - god why? 
		driver.findElement(By.xpath("//*[@id='search']/div[1]/div/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id='search']/div[1]/div/div[2]/div/div/ul/li[1]")).click();
		
		//ex + c
		driver.findElement(By.xpath("//*[@id='cat-want-0']/div/div[6]")).click();
		driver.findElement(By.xpath("//*[@id='cat-have-0']/div/div[4]")).click();
		
		
		
		//search
		driver.findElement(By.cssSelector("input[type='submit'][value='Search!']")).click();
		
		//w8 for reload page - need find better idea about it
		Thread.sleep(2000);
		
		//liga do zwrotu
		league = driver.getTitle();
		//ratio
		System.out.println("Best ratio: ex " + driver.findElement(By.cssSelector("div[class='displayoffer-middle']")).getText() + " c");
		
		//close
		driver.close();
		
		return league;
	}
}

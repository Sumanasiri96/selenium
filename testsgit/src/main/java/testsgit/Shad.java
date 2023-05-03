package testsgit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Shad {
	public static void main(String[] args) {

		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/shadow");

		//shadow root open
		WebElement shadowHost = driver.findElement(By.id("open-shadow"));
		
		SearchContext sh = shadowHost.getShadowRoot();
		//SearchContext shadowRoot = shadowHost.getShadowRoot();
		//SearchContext shadowRoot= shadowHost.getShadowRoot();
		sh.findElement(By.cssSelector("#fname")).sendKeys("Mahadhevan");

		
		
		
		
		
		
		
		//shadow root closed lastnamer
		driver.findElement(By.xpath("//div[@class='field']//my-web-component")).click();
		Actions act = new Actions(driver);
		act.sendKeys("Narththanan").perform();

		
		
		//shadow root two

		driver.findElement(By.xpath("//div[@id='close-shadow']")).click();

		act.sendKeys("abc").perform();

	}

}
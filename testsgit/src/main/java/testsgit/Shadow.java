package testsgit;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;


public class Shadow {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/shadow");
//		open
		WebElement shadowHost= driver.findElement(By.xpath("//*[@id=\"open-shadow\"]"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		shadowRoot.findElement(By.cssSelector("#fname")).sendKeys("mhs");
		
//		closed
		
		driver.findElement(By.xpath("//div[@class = 'field'] //my-web-component")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("harshi").perform();
		
//		mail
		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("madushasumanasiri96@gmail.com").perform();
		
		

	}

}

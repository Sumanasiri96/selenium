package testsgit;

import java.awt.Window;
import java.awt.event.WindowStateListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winxows {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		 driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[3]/app-menu/div/footer/a")).click();
		 driver.get("https://letcode.in/test");
//		 go to home page
		WebElement home = driver.findElement(By.xpath("//*[@id=\"home\"]"));
		home.click();
		 
//		multile windows
		WebElement multipleWindow = driver.findElement(By.id("multi"));
		multipleWindow.click();
		


	}

}

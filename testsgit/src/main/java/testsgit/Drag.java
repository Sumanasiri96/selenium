package testsgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		 driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[1]/app-menu/div/footer/a")).click();
		 WebElement draggable = driver.findElement(By.xpath("//*[@id=\"sample-box\"]"));
		 Actions action = new Actions(driver);
		 action.clickAndHold(draggable).moveByOffset(100, 100).release().build().perform();

	}

}

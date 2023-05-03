package testsgit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sort {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[3]/app-menu/div/footer/a")).click();
		 List<WebElement> listitem = driver.findElements(By.xpath("//div[@id=\"sample-box1\"]"));
		Actions action = new Actions(driver);
		action.clickAndHold(listitem.get(0)).moveToElement(listitem.get(6)).moveByOffset(0, 6).release().build().perform();
		Thread.sleep(2000);
		action.clickAndHold(listitem.get(1)).moveToElement(listitem.get(5)).moveByOffset(1, 5).release().build().perform();
		Thread.sleep(2000);
		action.clickAndHold(listitem.get(4)).moveToElement(listitem.get(2)).moveByOffset(4, 2).release().build().perform();
		// TODO Auto-generated method stub

	}

}

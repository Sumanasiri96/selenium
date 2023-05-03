package testsgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[5]/div/div/div/div[1]/app-menu/div/footer/a")).click();
		 WebElement slide= driver.findElement(By.id("generate"));
		 Actions action = new Actions(driver);
		 action.dragAndDropBy(slide, 20, 26).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-root/app-word-generator/section[1]/div/div/div[1]/div/div/div[1]/div[1]/button")).click();
		 

	}

}

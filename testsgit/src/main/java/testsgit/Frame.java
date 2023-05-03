package testsgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		 driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[1]/app-menu/div/footer/a")).click();
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input")).sendKeys("madhu");
		 driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input")).sendKeys("harshi");
		 driver.switchTo().frame(1);
		 driver.findElement(By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input")).sendKeys("madusha@gmail");
		 //driver.switchTo().defaultContent();
		// TODO Auto-generated method stub

	}

}

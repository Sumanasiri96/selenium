package testsgit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aleart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
      driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();
      WebElement Aleartn =driver.findElement(By.id("accept"));
      Aleartn.click();
//      simple aleart
      Alert aleart0 = driver.switchTo().alert();
      aleart0.accept();
//      confirm aleart
      WebElement Aleart1 =driver.findElement(By.id("confirm"));
      Aleart1.click();
      Alert aleart2 = driver.switchTo().alert();
      aleart2.dismiss();
    aleart2.accept();
//    prompt aleart
      WebElement Aleart3 = driver.findElement(By.id("prompt"));
      Aleart3.click();
      Alert aleart1 =driver.switchTo().alert();
      aleart1.getText();
      aleart1.sendKeys("madhu");
      aleart1.accept();
//      sweet aleart
      WebElement sweet = driver.findElement(By.id("modern"));
      sweet.click();
      
	}

}

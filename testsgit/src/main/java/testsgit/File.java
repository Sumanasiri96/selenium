package testsgit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		
//		upload
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[6]/div/div/div/div[3]/app-menu/div/footer/a")).click();
		WebElement upload = driver.findElement(By.xpath("/html/body/app-root/app-filemanagement/section[1]/div/div/div[1]/div/div[1]/div/div/label/span"));
		upload.sendKeys("C:\\Users\\Admin\\Pictures");
//		excell
		WebElement excell =driver.findElement(By.xpath("/html/body/app-root/app-filemanagement/section[1]/div/div/div[1]/div/div[2]/div/label/button[1]"));
		excell.click();
		
//		pdf file
		WebElement pdf = driver.findElement(By.id("pdf"));
		pdf.click();
		
//		file
		WebElement file = driver.findElement(By.xpath("/html/body/app-root/app-filemanagement/section[1]/div/div/div[1]/div/div[2]/div/label/button[3]"));
		file.click();
		

	}

}

package testsgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snake {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		
//		start
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[6]/div/div/div/div[5]/app-menu/div/footer/a")).click();
		WebElement start=driver.findElement(By.xpath("/html/body/app-root/app-snake-game/section/div/div[20]"));
		start.click();
		
//		classic
		WebElement classic = driver.findElement(By.xpath("/html/body/app-root/app-snake-game/section/div/div[21]/div[1]"));
		classic.click();
		
//		nowall
		WebElement wall = driver.findElement(By.xpath("/html/body/app-root/app-snake-game/section/div/div[21]/div[2]"));
		wall.click();
		
//		obj
		WebElement obj = driver.findElement(By.xpath("/html/body/app-root/app-snake-game/section/div/div[21]/div[3]"));
		obj.click();

	}

}

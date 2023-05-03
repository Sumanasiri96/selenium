package testsgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[5]/div/div/div/div[4]/app-menu/div/footer/a")).click();
		WebElement cbutton =driver.findElement(By.xpath("//*[@id=\"datetimePicker9b8efb37-8c4d-420a-a4d8-08235348cba2\"]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[23]/button"));
		cbutton.click();
		// TODO Auto-generated method stub

	}

}

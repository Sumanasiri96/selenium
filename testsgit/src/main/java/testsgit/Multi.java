package testsgit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;

public class Multi {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[4]/app-menu/div/footer/a")).click();
	List<WebElement> listitem	 =driver.findElements(By.xpath("//div[@id = 'selectable']"));
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL).click(listitem.get(0)).click(listitem.get(2)).click(listitem.get(5)).build().perform();
		// TODO Auto-generated method stub

	}

}

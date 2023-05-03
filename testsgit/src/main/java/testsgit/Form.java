package testsgit;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyAdapter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[6]/div/div/div/div[2]/app-menu/div/footer/a")).click();
		driver.findElement(By.id("firstname")).sendKeys("madu",Keys.TAB);
		driver.findElement(By.id("lasttname")).sendKeys("harshi",Keys.ENTER);
		driver.findElement(By.id("email")).sendKeys("harshipieries96@gmail.com", Keys.ENTER);
		WebElement dropdown =driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[2]/div[2]/div/div/div/select"));
		Select select1 = new Select(dropdown);
        select1.selectByIndex(1);
        driver.findElement(By.id("Phno")).sendKeys("0711696533",Keys.ENTER);
        driver.findElement(By.id("Addl1")).sendKeys("sghhs",Keys.TAB);
        driver.findElement(By.id("Addl2")).sendKeys("mnnmnn",Keys.ENTER);
        driver.findElement(By.id("state")).sendKeys("state",Keys.TAB);
        driver.findElement(By.id("postalcode")).sendKeys("70000", Keys.TAB);
        WebElement dropdown2=driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[5]/div[2]/div/div/div/select"));
       Select select2 = new Select(dropdown2);
       select2.selectByIndex(2);
       driver.findElement(By.id("female")).click();
       driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[7]/div/label/input")).click();
       driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[8]/div/input")).click();

	}

}

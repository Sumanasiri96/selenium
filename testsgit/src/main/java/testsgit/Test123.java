package testsgit;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test123 {

	public static void main(String[] args, WebElement locationButton) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
        driver.get("https://letcode.in/test");
       driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();
       driver.get("https://letcode.in/buttons");
        WebElement position =driver.findElement(By.id("position"));
        int xValue = position.getLocation().getX();
        System.out.println("x value is" + xValue);
        int yValue = position.getLocation().getY();
        System.out.println("y value is " + yValue);
        driver.get("https://letcode.in/buttons");
        WebElement colourButton = driver.findElement(By.id("color"));
        String colour = colourButton.getCssValue("background-color");
        System.out./println("colour is" + colour);  
        WebElement size = driver.findElement(By.id("property"));
        int width = size.getSize().getWidth();
        int heigh = size.getSize().getWidth();
        System.out.println("width is " + width);
        System.out.println("heigh is " + heigh );                                                                                                     
         driver.findElement(By.className("card-footer-item")).click(); 
         driver.findElement(By.id("fullName")).sendKeys("d.m.m.m.h.sumanasiri");
         driver.findElement(By.id("join")).
         webElement locationButton = driver.findElement(By.id("position"));
  Point location = locationButton.getLocation();
  System.out.println(location);
       boolean dissable = driver.findElement(By.id("isDisabled")).isEnabled(); 
       System.out.println(dissable);
       WebElement action = driver.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2"));
       new Actions(driver).clickAndHold(action).build().perform();
         driver.findElement(By.className("card-footer-item")).click(); 
         driver.findElement(By.id("fullName")).sendKeys("d.m.m.m.h.sumanasiri");
         driver.findElement(By.id("join")).sendKeys("person");

	}

}

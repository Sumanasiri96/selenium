package testsgit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		// TODO Auto-generated method stub
	
      driver.findElement(By.className("card-footer-item")).click(); 
      driver.findElement(By.id("fullName")).sendKeys("d.m.m.m.h.sumanasiri");
      driver.findElement(By.id("join")).sendKeys("person" ,Keys.TAB);
      driver.findElement(By.id("getMe")).clear();
      String name = driver.findElement(By.id("getMe")).getAttribute("value");
      System.out.println(name);
     Boolean a = driver.findElement(By.id("noEdit")).isEnabled();
     System.out.println(a);
     driver.findElement(By.id("dontwrite")).sendKeys("mmmmmmm");
      String read = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
      System.out.println(read);
	}

}

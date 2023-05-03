package testsgit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Element {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
	    driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[4]/app-menu/div/footer/a")).click();
       driver.findElement(By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/form/div/p[1]/input")).sendKeys("git" , Keys.ENTER) ; 
   List<WebElement> link= driver.findElements(By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/div/app-gitrepos/div/div/ol/li[5]/a"));
   for(WebElement links : link) {
	   System.out.println(links.getText());
   }
   
	}

}

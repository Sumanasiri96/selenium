package testsgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ratio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
//		 select any one
		        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[2]/app-menu/div/footer/a")).click();
		        driver.findElement(By.id("yes")).click();
		        driver.findElement(By.id("no")).click(); 
//		        comform 
		        driver.findElement(By.xpath("//*[@id=\"one\"]")).click();
		        WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"one\"]"));
		        WebElement check = driver.findElement(By.xpath("//*[@id=\"two\"]"));
		        boolean un = unchecked.isSelected();
		        boolean ch = check.isSelected();
		        if (un) {
					System.out.println(un);
				}
		        else {
		        	System.out.println(ch);
					
				}
		        boolean uncheck = driver.findElement(By.xpath("//*[@id=\"one\"]")).isSelected();
		        boolean checked = driver.findElement(By.xpath("//*[@id=\"two\"]")).isSelected();
		        System.out.println(uncheck);
		        System.out.println(checked);
		        
		        boolean disable =driver.findElement(By.id("maybe")).isEnabled();
                 System.out.println(disable);
                 
                 boolean remember= driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input")).isSelected();
                 System.out.println(remember);
                 
                 
                 driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input")).click();
	}

}

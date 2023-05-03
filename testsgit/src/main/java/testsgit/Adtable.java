package testsgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adtable {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[5]/div/div/div/div[3]/app-menu/div/footer/a")).click();
//  	driver.findElement(By.xpath("//*[@id=\"advancedtable_filter\"]/label/input")).sendKeys("abedine");
//		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"advancedtable_length\"]/label/select"));
//		Select select1 = new Select(dropdown);
//		select1.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"advancedtable_paginate\"]/span/a[3]")).click();

	}

}

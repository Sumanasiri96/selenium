package testsgit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
	    
        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a")).click();
        driver.get("https://letcode.in/dropdowns");
        WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"fruits\"]"));
        Select select1 = new Select(dropDown);
        select1.selectByIndex(1);
        select1.selectByVisibleText("Mango");
        select1.selectByValue("2");
         List<WebElement> dropDownoption = select1.getOptions();
         int optioncount = dropDownoption.size();
         System.out.println(optioncount);
        WebElement dropDown1 = driver.findElement(By.id("superheros"));
        Select select2 = new Select(dropDown1);
      select2.selectByIndex(1);
        select2.selectByVisibleText("Thor");
        select2.selectByValue("2");
        select2.selectByIndex(1);
        select2.selectByIndex(0);
        select2.selectByIndex(2);
        WebElement dropDown3 = driver.findElement(By.id("lang"));
      Select select3 = new Select(dropDown3);
      select3.selectByIndex(1);
      select3.getFirstSelectedOption();
      select3.selectByVisibleText("java");
      WebElement dropDown2 = driver.findElement(By.xpath("//*[@id=\"country\"]"));
      Select select4 = new Select(dropDown2);
      select4.selectByVisibleText("Peru");
      select4.selectByIndex(0);
      
//      drop down 2
      WebElement heros = driver.findElement(By.id("superheros"));
      Select myheroes = new Select(heros);
      boolean mul = myheroes.isMultiple();
      
      if(myheroes.isMultiple()){
      	myheroes.selectByIndex(0);
      	myheroes.selectByValue("bt");
      
      
      }
      System.out.println(mul);
      
      myheroes.selectByIndex(0);
      myheroes.selectByValue("c");
      List<WebElement> allheroes = myheroes .getAllSelectedOptions();
	}

}

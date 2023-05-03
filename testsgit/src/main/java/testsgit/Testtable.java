=package testsgit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testtable {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[5]/div/div/div/div[2]/app-menu/div/footer/a")).click();
		WebElement table1=driver.findElement(By.id("shopping"));
		List<WebElement> allrow=table1.findElements(By.cssSelector("tbody tr"));
		int row = allrow.size();
//		System.out.println(row);
		WebElement r1 = allrow.get(0);
		System.out.println(r1.getText());
		int sum=0;
		for(int i=0;i<row ;i++) {
			List<WebElement> allcolum = allrow.get(i).findElements(By.tagName("td"));
			WebElement colum = allcolum.get(1);
			String prices = colum.getText();
			int intprices = Integer.parseInt(prices);
//			System.out.println(intprices);
		sum= sum+intprices;
			
			
		}
		System.out.println(sum);
		List<WebElement> foot = table1.findElements(By.cssSelector("tfoot td"));
		WebElement p = foot.get(1);
		String total = p.getText();
		int inttotal = Integer.parseInt(total);
		if(inttotal==sum) {
			System.out.println("correct");
		}
		else {
			System.out.println("wrong");
		}
		
//		table2
		WebElement table2 = driver.findElement(By.id("simpletable"));
		List<WebElement> scl = table2.findElements(By.cssSelector("tbody tr"));
		int size2 = scl.size();
		for(int i=0; i<size2;i++) {
			List<WebElement> sclco = scl.get(i).findElements(By.tagName("td"));
			WebElement co =sclco.get(1);
//			String present = co.getText();
//			int intpresent = Integer.parseInt(present);
			
			if(co.getText().equals("Raj")) {
				sclco.get(3).findElement(By.tagName("input")).click();
				break;
			}
		}
//table3
//		WebElement table3= driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table"));
//		List<WebElement> desert=table3.findElements("")
	}

}

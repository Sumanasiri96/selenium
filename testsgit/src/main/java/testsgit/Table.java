package testsgit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[5]/div/div/div/div[2]/app-menu/div/footer/a")).click();

		
		WebElement table1= driver.findElement(By.id("shopping"));
		List<WebElement> Allrows= table1.findElements(By.cssSelector("tbody tr"));
		int row=Allrows.size();
//		System.out.println(row);
		WebElement r1=Allrows.get(3);
//		System.out.println(r.getText());
		int sum=0;
		for(int i=0;i<row;i++) {
			List<WebElement> Allcolumns= Allrows.get(i).findElements(By.tagName("td"));
			WebElement col= Allcolumns.get(1);
			String prices=col.getText();
			int intPrice=Integer.parseInt(prices);
			//System.out.println(prices) ;
			sum=sum+intPrice;

		}
		//System.out.println(sum) ;
		List<WebElement> foot= table1.findElements(By.cssSelector("tfoot td"));
		WebElement p=foot.get(1);
		String total=p.getText();
		int intToatal=Integer.parseInt(total);
		
		if(intToatal==sum) {
			System.out.println("correct");
		}
		else {
			System.out.println("wrong");
		}
		
//		table2
		WebElement table2 = driver.findElement(By.id("simpletable"));
		List<WebElement> school = table2.findElements(By.cssSelector("tbody tr"));
		int sc= school.size();
		System.out.println(sc);
//		for(WebElement r:table2row ) {
			
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		columcount
//		List<WebElement> colum=driver.findElements(By.tagName("th"));
//		int columcount = colum.size();
//		System.out.println(columcount);
		
//		raw count
//		List<WebElement> raw =driver.findElements(By.tagName("tr"));
//		int rawcount = raw.size();
//		System.out.println("raw count is " + rawcount);
		
		
		// TODO Auto-generated method stub

	}

}

package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		List<WebElement> rowsnum=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		List<WebElement> columnsnum=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td"));
		
		int row=rowsnum.size();
		int column=columnsnum.size();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				String value=driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(value+"==>> ");
			}
			System.out.println();
		}
		
	}

}

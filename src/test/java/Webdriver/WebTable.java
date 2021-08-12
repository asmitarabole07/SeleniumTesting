package Webdriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr"));
		System.out.println(rows.size());
		
		List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr[1]/td"));
		System.out.println(columns.size());
		
		
		for(int i=1;i<=rows.size();i++)
		{
			for(int j=1;j<=columns.size();j++)
			{
				String element="//*[@id=\"myTable\"]/tr["+i+"]/td["+j+"]";
				System.out.print(driver.findElement(By.xpath(element)).getText());
			}
			System.out.println();
		}

	}

}

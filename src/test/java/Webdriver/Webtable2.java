package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
		System.out.println(columns.size());
		
		for(int i=1;i<=rows.size();i++)
		{
			for(int j=1;j<=columns.size();j++)
			{
				System.out.print("-->"+driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println();
		}

	}

}

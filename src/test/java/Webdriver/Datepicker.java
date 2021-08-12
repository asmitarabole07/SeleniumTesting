package Webdriver;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.http.nio.entity.DigestingEntityConsumer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Calendar cal=Calendar.getInstance();
		
		int currentday=cal.get(Calendar.DAY_OF_MONTH);
		int currentmonth=cal.get(Calendar.MONTH)+1;
		int currentyear=cal.get(Calendar.YEAR);
		
		int day =29;
		int month=1;
		int year=2021;
		
		int clicknum;
		
		
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='from']")).click();
		
		//WebElement next=driver.findElement(By.xpath("//a[@title='Next']"));
		//WebElement back=driver.findElement(By.xpath("//a[@title='Prev']"));
		
		if (month>currentmonth) 
		{
			clicknum=month-currentmonth;
			for(int i=0;i<clicknum;i++)
			{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
				//Thread.sleep(2000);
			}
		}
		else {
			clicknum=currentmonth-month;
			for(int i=0;i<clicknum;i++)
			{
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
			}
		}
		
		driver.findElement(By.linkText(String.valueOf(day))).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"from\"]")).click();
		String value=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(value);
		
		
		while (!value.equals("2018"))
		{
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			value=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
	}

}

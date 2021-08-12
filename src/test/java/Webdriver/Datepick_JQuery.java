package Webdriver;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepick_JQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal=Calendar.getInstance();
		
		int currentday=cal.get(Calendar.DAY_OF_MONTH);
		int currentmonth=cal.get(Calendar.MONTH)+1;
		int currentyear=cal.get(Calendar.YEAR);
		
		int day =29;
		int month=5;
		int year=2015;
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='from']")).click();
		
		//WebElement next=driver.findElement(By.xpath("//a[@title='Next']"));
		//WebElement back=driver.findElement(By.xpath("//a[@title='Prev']"));
		
		//driver.findElement(By.xpath("//*[@id=\"from\"]")).click();
		String value=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(value);
		
		
		if(year<currentyear)
		{
			while (!value.equals(String.valueOf(year)))
			{
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
				value=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			}
		}
		else {
			while (!value.equals(String.valueOf(year)))
			{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
				value=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			}
		}
		
		WebElement mon=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select"));
		Select select=new Select(mon);
		select.selectByIndex(month-1);
		driver.findElement(By.linkText(String.valueOf(day))).click();
	}

}

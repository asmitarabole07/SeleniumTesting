package Webdriver;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker_Bootstrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		int currentday = cal.get(Calendar.DAY_OF_MONTH);
		int currentmonth = cal.get(Calendar.MONTH) + 1;
		int currentyear = cal.get(Calendar.YEAR);

		int day = 29;
		int month = 5;
		int year = 2015;

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");

		driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).click();
		driver.findElement(By.xpath("//th[normalize-space()='July 2021']")).click();
		driver.findElement(By.xpath("//th[normalize-space()='2021']")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-years']//th[@class='prev'][normalize-space()='«']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2015']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='May']")).click();
		driver.findElement(By.xpath("//td[@class='day'][normalize-space()='29']")).click();
		
	}

}

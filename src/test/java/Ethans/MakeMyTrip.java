package Ethans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Make My Trip");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
		
		driver.findElement(By.xpath("//span[text()='makemytrip.com']")).click();
		
		Thread.sleep(3000);
		
		try {
			driver.findElement(By.xpath("//div[@class='login__card makeFlex hrtlCenter cursorPointer appendBottom10']")).click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		}
		
		//driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		
		
		//driver.findElement(By.xpath("//div[@class='login__card makeFlex hrtlCenter cursorPointer appendBottom10']")).click();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("7744077097");
		
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		driver.findElement(By.xpath("//a[text()='or Login via Password']")).click();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@007");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//li[text()='OneWay']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']//p[text()='Bengaluru, India']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Kolkata");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']//p[text()='Kolkata, India']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@aria-label='Wed Sep 01 2021']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		
		
		WebElement more=driver.findElement(By.xpath("//li[@data-cy='menu_More']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(more).perform();
		
		System.out.println("Page Title : "+driver.getTitle());
		System.out.println("Current page URL : "+driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.quit();
	}

}

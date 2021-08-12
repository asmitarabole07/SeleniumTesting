package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][normalize-space()='Alerts & Modals']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[normalize-space()='Javascript Alerts']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(1000);
		
		System.out.println("Checking Alert 1....");
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][normalize-space()='Click me!']")).click();
		Thread.sleep(1000);
		
		System.out.println("Checking Alert 2....");
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']")).click();
		
		Thread.sleep(1000);
		System.out.println("Checking Alert 3....");
		driver.switchTo().alert().sendKeys("Asmit");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][normalize-space()='Input Forms']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[normalize-space()='Checkbox Demo']")).click();
		Thread.sleep(1000);
		
		System.out.println("Checking Checkbox....");
		driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Option 3']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='check1']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][normalize-space()='Input Forms']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[normalize-space()='Select Dropdown List']")).click();
		Thread.sleep(1000);
		
		System.out.println("Checking Dropdown select....");
		WebElement listElement=driver.findElement(By.xpath("//select[@id='select-demo']"));
		
		Select select=new Select(listElement);
		select.selectByValue("Wednesday");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][normalize-space()='Input Forms']")).click();
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[normalize-space()='Radio Buttons Demo']")).click();
		
		System.out.println("Checking Radio Button....");
		driver.findElement(By.xpath("//div[@class='panel-body']//div//label[@class='radio-inline'][normalize-space()='Male']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='15 to 50']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Get values']")).click();
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][normalize-space()='Input Forms']")).click();
		driver.findElement(By.xpath("driver.findElement(By.xpath(\"//div[@class='row']//div[1]//div[1]//div[2]//span[1]//span[1]//span[1]//span[2]\"))")).click();
		
		
		
		
		
		System.out.println("Done");
	}

}

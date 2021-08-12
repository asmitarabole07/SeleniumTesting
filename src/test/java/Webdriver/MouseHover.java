package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("way2automation");
		driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//h3[normalize-space()='Way2Automation']")).click();
		
		WebElement menu=driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='Practice site 1']")).click();
		
		
		
	}

}

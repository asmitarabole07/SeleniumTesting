package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//a[@id='redBus Bus Hire']")).click();
		
		WebElement frame1=driver.findElement(By.xpath("/html/body/noscript[1]/text()"));
		driver.switchTo().frame(frame1);
		
		//WebElement
		
		
		driver.findElement(By.xpath("//div[text()='Outstation']")).click();
	}

}

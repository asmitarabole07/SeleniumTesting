package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Changing_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.findElement(By.xpath("//*[@id=\"pollform\"]/table/tbody/tr[2]/td/input[1]")).click();
		
		String n=driver.findElement(By.xpath("//*[@id=\"mathq2\"]")).getText();
//		System.out.println(n);
//		System.out.println(n.length());
		
		String a=n.substring(0, 1);
		String b=n.substring(4, 5);
		
//		System.out.println(a+"  "+b);
		int a1=Integer.parseInt(a);
		int b1=Integer.parseInt(b);
		
		
		int result=a1+b1;
		String value=String.valueOf(result);
		
		driver.findElement(By.xpath("//*[@id=\"mathuserans2\"]")).sendKeys(value);
		driver.findElement(By.xpath("//*[@id=\"pollform\"]/table/tbody/tr[4]/td/div")).click();
		
		
		
	}

}

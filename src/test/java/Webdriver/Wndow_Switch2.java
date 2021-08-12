package Webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wndow_Switch2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentMain_popupTest\"]")).click();
		
		Set<String> ID=driver.getWindowHandles();
		
		Iterator<String> iterate =ID.iterator();
		
		String perent=iterate.next();
		
		String child=iterate.next();
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Asmit");
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(perent);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentMain_btnBack\"]")).click();
		
		System.out.println("perent : "+perent);
		System.out.println("child : "+child);
		
		
		

	}

}

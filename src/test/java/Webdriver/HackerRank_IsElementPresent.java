package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HackerRank_IsElementPresent {
	static WebDriver driver;
	
	public static boolean isElement(String locator) {
		try {
			driver.findElement(By.xpath(locator));
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.hackerrank.com");
		driver.findElement(By.xpath("//*[@id=\"menu-item-2887\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"post-175\"]/div/div/div[1]/div/div/div[2]/div[2]/div/div[4]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-1\"]")).sendKeys("asmitarabole08@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-2\"]")).sendKeys("Asmit.Arabole07");
		driver.findElement(By.xpath("//*[@id=\"tab-1-content-1\"]/div[1]/form/div[4]/button/div/span")).click();
		
		System.out.println(isElement("//*[@id=\"content\"]/div/div/div/div/div[4]/div/div[1]/div[2]/a[1]"));
		
	}

}

package Webdriver;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_Implicit_Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 5);
		
		//Fluent wait
//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(20))
//				.pollingEvery(Duration.ofSeconds(5))
//				.withMessage("TimeOut")
//				.ignoring(NoSuchElementException.class);
//		
		
		driver.get("https://www.hackerrank.com/");
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-2887\"]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"post-175\"]/div/div/div[1]/div/div/div[2]/div[2]/div/div[4]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-1\"]")).sendKeys("asmitarabole08@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-2\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"tab-1-content-1\"]/div[1]/form/div[4]/button")).click();
		
		//Explicit wait
		System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab-1-content-1\"]/div[1]/div/span"))).getText());
		
		
		
		
		
		
	}

}

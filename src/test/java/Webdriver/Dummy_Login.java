package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.prepbytes.com/practice-courses/100-product-based-companies-interview-questions-solved?gclid=Cj0KCQjwktKFBhCkARIsAJeDT0jIqa3-DqqESpFqZU5Q50mt7wHDgCBBTlo6-jI2jIGqIlLV3QKwqBsaArL_EALw_wcB");
//		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/nav/div[1]/div/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/input")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/input")).sendKeys("abc@mail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[3]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[4]/div/input")).sendKeys("123");
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/form/div[2]/div/div/select"));
		Select select=new Select(year);
		select.selectByValue("2017");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/form/div[3]/div/input")).sendKeys("SBGI");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/form/button")).click();
	}

}

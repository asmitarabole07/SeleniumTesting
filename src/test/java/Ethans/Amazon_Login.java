package Ethans;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement signIn=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		signIn.click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8007893623");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Asmit.Arabole07");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoes");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).click().build().perform();
		
		driver.findElement(By.xpath("//a[text()='Next']")).click();
		
		
		//driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		
		
		

	}

}

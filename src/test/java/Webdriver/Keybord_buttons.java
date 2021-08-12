package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keybord_buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("asmitarabole07");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"initialView\"]/div[2]")).click();
		
//		Actions actions=new Actions(driver);
//		
//		driver.findElement(By.xpath("//*[@id=\"initialView\"]/div[2]")).click();
//		actions.sendKeys(Keys.chord(Keys.CONTROL,"a")).build().perform();
//		actions.sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
//		
//		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
//		actions.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		
		//actions.sendKeys(Keys.ENTER).perform();

	}

}

package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));//driver.findElement(By.xpath("//img[@title='Support the JS Foundation']")).click();
		driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		
		
		Actions actions=new Actions(driver);
		
		
		actions.dragAndDrop(drag, drop).perform();

	}

}

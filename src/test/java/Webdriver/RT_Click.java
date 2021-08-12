package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RT_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		
		WebElement image=driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
		
		Actions actions=new Actions(driver);
		
		actions.contextClick(image).perform(); //to  Right-Click
		
		WebElement menu=driver.findElement(By.xpath("//*[@id=\"dm2m1i1tdT\"]"));
		
		menu.click();
		
		driver.findElement(By.xpath("//*[@id=\"dm2m2i1tdT\"]")).click();
		driver.findElement(By.xpath("//td[@id='dm2m3i1tdT']")).click();
		

	}

}

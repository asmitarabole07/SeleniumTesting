package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//		
//		WebElement home=driver.findElement(By.xpath("//div[@class='xtXmba'][normalize-space()='Home']"));
//		
//		Actions actions=new Actions(driver);
//		actions.moveToElement(home).perform();
//		
//		driver.findElement(By.xpath("//a[normalize-space()='Bedroom room']")).click();
//		
//		WebElement drag=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[2]/div[3]/div[1]"));
//		int width=drag.getSize().width/2;
//		actions.dragAndDropBy(drag, width/2, 0).perform();
		
		driver.get("http://www.simpleimageresizer.com/");
		
		WebElement slide=driver.findElement(By.xpath("//div[@id='percent-slider']"));
		Actions action=new Actions(driver);
		int size=slide.getSize().width;
		action.dragAndDropBy(slide, size/3, 0).perform();

	}

}

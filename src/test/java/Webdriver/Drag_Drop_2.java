package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		
//		WebElement block=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='st-preview-body']")));
//		
//		driver.switchTo().frame(block);
//		WebElement drag=driver.findElement(By.xpath("//*[@id=\"treeTarget\"]/ul/li[1]"));
//		WebElement drop=driver.findElement(By.xpath("//*[@id=\"treeSource\"]/ul"));
//		
//		Actions actions=new Actions(driver);
//		
//		actions.dragAndDrop(drag, drop).perform();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		WebElement newblock=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(newblock);
		
		WebElement dragElement=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(dragElement, 250, 125).perform();

	}

}

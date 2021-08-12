package Ethans;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_switch_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://uitestpractice.com/Students/Switchto");
		
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iterate=windows.iterator();
		
		System.out.println("Current windows count : "+windows.size());
		
		String parentID=iterate.next();
		String childID=iterate.next();
		
		driver.switchTo().window(childID);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='Button']")).click();
		
		windows=driver.getWindowHandles();
		iterate=windows.iterator();
		
		System.out.println("Current window counts : "+windows.size());
		
		parentID=iterate.next();
		childID=iterate.next();
		String subchild=iterate.next();
		
		driver.switchTo().window(subchild);
		
		System.out.println("Window ID -1 "+parentID);
		System.out.println("Window ID -1 "+childID);
		System.out.println("Window ID -1 "+subchild);
		
		WebElement sliderElement=driver.findElement(By.xpath("//div[@class='ui-handle-helper-parent']"));
		int size=sliderElement.getSize().width;
		WebElement moveElement=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		
		System.out.println("Size : "+size);
		actions.moveToElement(moveElement).perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(moveElement, size/2,0).perform();
		
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(childID).close();
		Thread.sleep(1000);
		driver.switchTo().window(parentID).close();
		
	
	}

}

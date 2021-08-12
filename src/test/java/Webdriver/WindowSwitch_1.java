package Webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitch_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webbrowsertools.com/popup-blocker/");
		
		//Window-1
		driver.findElement(By.xpath("//*[@id=\"euconsent\"]/div[2]/button")).click();
		
		//Drawing border
		WebElement click=driver.findElement(By.xpath("//*[@id=\"popup\"]/tbody[3]/tr[5]/td[1]/a"));
		drawBorder(click, driver);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"popup\"]/tbody[3]/tr[5]/td[1]/a")).click();
		
		Set<String> idSet=driver.getWindowHandles();
		Iterator<String> iterate = idSet.iterator();
		
		String parent=iterate.next();
		String child=iterate.next();
		
		//Window-2
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//*[@id=\"popup\"]/tbody[3]/tr[1]/td[1]/a")).click();
		
		//Window-3
		idSet=driver.getWindowHandles();
		iterate = idSet.iterator();
		parent=iterate.next();
		child=iterate.next();
		String subchild=iterate.next();
		driver.switchTo().window(subchild);
		driver.findElement(By.xpath("/html/body/div/p[2]/a")).click();
		
		//back to Window-2
		driver.close();
		driver.switchTo().window(child);
		
		
		driver.findElement(By.xpath("//*[@id=\"popup\"]/tbody[3]/tr[1]/td[1]/a")).click();
		
		System.out.println("Parent window ID : "+parent);
		System.out.println("Child window ID : "+child);
		System.out.println("Sub-child window ID : "+subchild);
		
	
		
	}
	 public static void drawBorder(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].style.border='3px solid red'", element);
	    }
}

package Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][normalize-space()='Input Forms']")).click();
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[normalize-space()='JQuery Select dropdown']")).click();
		
		driver.findElement(By.xpath("//body/div[@class='container-fluid text-center']/div[@class='row']/div[@class='col-md-6 text-left']/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]")).click();
		
		List<WebElement>list=driver.findElements(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().contains("India"))
			{
				list.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Select state(s)']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[4]/ul/li[3]/a")).click();
		
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"slider1\"]/div/input"));
		int size=drag.getSize().width;
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(drag, size/3, 0).perform();
		
		actions.dragAndDropBy(driver.findElement(By.xpath("//div[@class='range range-primary']//input[@name='range']")), size/3, 0).perform();
		actions.dragAndDropBy(driver.findElement(By.xpath("//input[@value='30']")), size/3, 0).perform();
		actions.dragAndDropBy(driver.findElement(By.xpath("//div[@class='range range-info']//input[@name='range']")), size/3, 0).perform();
		actions.dragAndDropBy(driver.findElement(By.xpath("//div[@class='range range-warning']//input[@name='range']")), size/3, 0).perform();
		actions.dragAndDropBy(driver.findElement(By.xpath("//div[@class='range range-danger']//input[@name='range']")), size/3, 0).perform();
		
		
		
		
	}

}

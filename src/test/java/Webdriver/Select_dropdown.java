package Webdriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prepbytes.com/practice-courses/100-product-based-companies-interview-questions-solved?gclid=Cj0KCQjwktKFBhCkARIsAJeDT0jIqa3-DqqESpFqZU5Q50mt7wHDgCBBTlo6-jI2jIGqIlLV3QKwqBsaArL_EALw_wcB");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[9]/div/div/form/div[1]/div[1]/div/input")).sendKeys("Asmit Arabole");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[9]/div/div/form/div[1]/div[2]/div/input")).sendKeys("asmitarabole08@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[9]/div/div/form/div[1]/div[3]/div/input")).sendKeys("8007893623");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[9]/div/div/form/div[1]/div[4]/div/input")).sendKeys("Asmit.Arabole07");
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[9]/div/div/form/div[2]/div/div/select"));
		Select select=new Select(year);
		select.selectByValue("2017");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[9]/div/div/form/div[3]/div/input")).sendKeys("SBGI");
		
		
		List<WebElement> values=driver.findElements(By.tagName("option"));
		System.out.println(values.size());
		
	for(int i=0;i<values.size();i++)
	{
		System.out.print((i+1)+"*"+values.get(i).getText()+",");
	}
	
		System.out.println("---Links---");
	
		WebElement block=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]"));
	
		List<WebElement> links=block.findElements(By.tagName("a"));
		System.out.println("Links : "+links.size());
		
		for(WebElement link:links)
		{
			System.out.println(link.getText()+"--->"+link.getAttribute("href"));
		}
		
	
		
		
		
		
		
		
		
		

	}

}

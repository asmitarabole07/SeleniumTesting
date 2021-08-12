package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		WebElement block=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form"));
				List<WebElement> list=block.findElements(By.name("color"));
				
				for(WebElement element:list)
				{
					element.click();
					//System.out.println(element);
				}
	}

}

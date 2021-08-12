package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/search?itinerary=BLR-CCU-01/09/2021&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
	
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		
		WebElement slider=driver.findElement(By.xpath("//div[@class='rc-slider-step']"));
		int size=slider.getSize().width;
		
		Actions action=new Actions(driver);
		
		action.dragAndDropBy(slider, size/2, 0).perform();
		
		System.out.println(size);
		
	
	
	}

}

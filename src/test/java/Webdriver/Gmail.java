package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//	WebElement username=driver.findElement(By.name("identifier"));
//	username.sendKeys("asmitarabole07");
//	
//	WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
//	nextbtn.click();
	
	driver.findElement(By.name("identifier")).sendKeys("asmitarabole07");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

	
	
	
	
	
	

	
	
		
}
}

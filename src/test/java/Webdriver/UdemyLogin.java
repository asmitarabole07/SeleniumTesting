package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UdemyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/join/login-popup/?next=/home/my-courses/learning/");
		
		driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div[1]/div[3]/span/div/div[2]/a")).click();
		
		

	}

}

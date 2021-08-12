package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/tutorial/java/data/characters.html");
		
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		
		driver.close();

	}

}

package Webdriver;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot_By_Ashot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement block=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		
		
		ru.yandex.qatools.ashot.Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);

		ImageIO.write(screenshot.getImage(), "jpg", new File(".\\Screenshot\\ashot.jpg"));
	}

}

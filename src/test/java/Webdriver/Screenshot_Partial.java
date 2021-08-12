package Webdriver;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_Partial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.hackerrank.com");
		
		
		WebElement logo=driver.findElement(By.xpath("//footer[@class='fl-row fl-row-full-width fl-row-bg-none fl-node-5e8618d595620 hr__site-footer']//p[1]"));
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullImage=ImageIO.read(screenshotFile);
		
		org.openqa.selenium.Point point=logo.getLocation();
		
		int width=logo.getSize().getWidth();
		int height=logo.getSize().getHeight();
		
		BufferedImage logoScreenshot=fullImage.getSubimage(point.getX(), point.getY(), width, height);
		ImageIO.write(logoScreenshot, "jpg", screenshotFile);
		
		File screenshotlocation=new File(".\\Screenshot\\logo.jpg");
		FileUtils.copyFile(screenshotFile, screenshotlocation);
		
		
		

	}

}

package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		String name=driver.findElement(By.xpath("//td[normalize-space()='Emily John']")).getText();
		driver.findElement(By.xpath("//input[@id='task-table-filter']")).click();
		driver.findElement(By.xpath("//input[@id='task-table-filter']")).sendKeys(name);

		driver.findElement(By.xpath("//button[normalize-space()='Filter']")).click();
		String num=driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[1]")).getText();
		driver.findElement(By.xpath("//input[@placeholder='#']")).sendKeys(num);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][normalize-space()='Others']")).click();
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[normalize-space()='Dynamic Data Loading']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Get New User']")).click();
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][normalize-space()='Alerts & Modals']")).click();
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[normalize-space()='Progress Bar Modal']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][normalize-space()='Alerts & Modals']")).click();
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[normalize-space()='Bootstrap Alerts']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Normal success message']")).click();
		driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']//button[@type='button'][normalize-space()='×']")).click();
		
		
		
	}

}

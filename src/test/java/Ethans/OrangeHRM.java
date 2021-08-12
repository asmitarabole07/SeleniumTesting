package Ethans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys("12345");
		
		WebElement status=driver.findElement(By.xpath("//select[@id='empsearch_employee_status']"));
		Select select=new Select(status);
		select.selectByVisibleText("Full-Time Permanent");
		
		WebElement include=driver.findElement(By.xpath("//select[@id='empsearch_termination']"));
		select=new Select(include);
		select.selectByValue("2");
		
		driver.findElement(By.xpath("//input[@id='empsearch_supervisor_name']")).sendKeys("XYZ");
		
		WebElement title=driver.findElement(By.xpath("//select[@id='empsearch_job_title']"));
		select=new Select(title);
		select.selectByVisibleText("QA Engineer");
		
		WebElement unit=driver.findElement(By.xpath("//select[@id='empsearch_sub_unit']"));
		select=new Select(unit);
		select.selectByValue("3");
		
		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_2']")).click();
		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_3']")).click();
		
		Actions actions=new Actions(driver);
		WebElement statusID_0208=driver.findElement(By.xpath("//tr[9]//td[6]"));
		actions.moveToElement(statusID_0208).perform();
		Thread.sleep(2000);
		
		WebElement titleID_0217=driver.findElement(By.xpath("//tr[14]//td[5]"));
		actions.moveToElement(titleID_0217).perform();
		Thread.sleep(2000);
		
		WebElement unitID_0221=driver.findElement(By.xpath("//tr[19]//td[7]"));
		actions.moveToElement(unitID_0221).perform();
		
		////td//a[text()='0042']//parent::td//parent::tr//preceding-sibling::td[text()='Quality Assurance']

		
	
	}

}

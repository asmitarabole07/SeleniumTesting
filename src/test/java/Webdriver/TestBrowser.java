package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Firefox
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Desktop\\asmit\\Softwares\\Browser drivers\\geckodriver.exe");
//		FirefoxDriver driver=new FirefoxDriver();
//		driver.get("https://www.udemy.com/home/my-courses/learning/");

		// Chrome
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\asmit\\Softwares\\Browser drivers\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.youtube.com/watch?v=ifYvT2atarE");
//		
		// IE
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\Desktop\\asmit\\Softwares\\Browser drivers\\IEDriverServer.exe");
//		InternetExplorerDriver driver=new InternetExplorerDriver();
//		driver.get("https://www.youtube.com/user/naveenanimation20");

		// Edge
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Administrator\\Desktop\\asmit\\Softwares\\Browser drivers\\msedgedriver.exe");
//		EdgeDriver driver=new EdgeDriver();
//		driver.get("https://www.youtube.com/watch?v=ifYvT2atarE");

//		System.setProperty("webdriver.opera.driver",
//				"C:\\Users\\Administrator\\Desktop\\asmit\\Softwares\\Browser drivers\\operadriver.exe");
//		OperaDriver driver = new OperaDriver();
//		driver.get("https://www.youtube.com/watch?v=ifYvT2atarE");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=ifYvT2atarE");
		
		String a="aaa";
		String b="aaa";
		
		a.equals(b)
		

	}

}

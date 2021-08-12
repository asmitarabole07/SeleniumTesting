package Webdriver;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Disable_Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		disableImageChrome(options);
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		
}
	
	
	public static void disableImageChrome(ChromeOptions options)
	{
		HashMap<String, Object> images=new HashMap<String, Object>();
		images.put("images", 2);
		HashMap<String, Object> pref=new HashMap<String, Object>();
		pref.put("profile.default_content_settings_values", images);
		options.setExperimentalOption("pref", pref);
	}
	
}
package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	static String webSite ="https://techfios.com/billing/?ng=contacts/add/";

	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get(webSite);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

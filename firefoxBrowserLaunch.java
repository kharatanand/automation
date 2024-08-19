package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefoxBrowserLaunch {
 static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\khara\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		
		
		
	}

}

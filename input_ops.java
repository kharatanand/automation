package Basic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class input_ops {
	static WebDriver driver;
	static void chrome() throws InterruptedException
	{	    
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 Thread.sleep(2000);
		 driver.close();
	}
	static void edge() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 driver.get("https://www.instagram.com");
		 Thread.sleep(2000);
		 driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		
		/*Scanner website = new Scanner (System.in);
		System.out.println("Enter URL");
		String url = website.nextLine();
		System.out.println("URL is: " + url);*/
		
		Scanner browser = new Scanner(System.in);
	    String name1= "chrome";
	    System.out.println("Enter Browser name"); 
	    String browserName = browser.nextLine();      
	    System.out.println("Browser name is: " + browserName);
	    if (browserName.equalsIgnoreCase(name1))
	    {
	    	input_ops.chrome();
	    }
	    else
	    {
	    	input_ops.edge();
	    }
	    
	}
}

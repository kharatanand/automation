package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowserlaunch {
static	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\khara\\chromedriver.exe" );
	 driver = new ChromeDriver();
driver.get("https://www.google.com");
String url=driver.getCurrentUrl();

driver.navigate().back();
driver.navigate().forward();
driver.manage().window().maximize();
driver.navigate().refresh();
System.out.println(driver.getTitle());

System.out.println(url);
Thread.sleep(8000);
driver.close();
/*To login AWS
WebElement user = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]"));
user.sendKeys("ks@vinsol.com");
WebElement awspass = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]"));
awspass.sendKeys("Abcd@1234");
WebElement sign_in = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/input[3]"));
sign_in.click();
Thread.sleep(3000);
//To login Auth0
WebElement email = driver.findElement(By.xpath("//input[@inputmode='email']"));
email.sendKeys("anand.kharat@snackmagic.com");
WebElement pwd = driver.findElement(By.xpath("//input[@id='1-password']"));
pwd.sendKeys("Anand@2023");
WebElement login = driver.findElement(By.xpath("//button[@id='1-submit']"));
login.click();
Thread.sleep(3000);*/
	}

}

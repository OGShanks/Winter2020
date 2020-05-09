package brower2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchchrome2 {
	
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver() ;
	
	driver.manage().window().maximize();
	
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	
	driver.findElement(By.id("password")).sendKeys("abc123");
	
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(5000);
	
	driver.close();
	
	}
}

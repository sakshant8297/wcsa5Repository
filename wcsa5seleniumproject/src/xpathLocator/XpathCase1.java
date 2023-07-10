package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("sakshant8297@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}



	

}

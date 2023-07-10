package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("qwertyuio");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type*='submit']")).click();
		

	}

}

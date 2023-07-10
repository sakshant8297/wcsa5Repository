package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/accounts/login/");
		 driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("asdfgh");
		 driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("zxcvbnm");
		// Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}

}

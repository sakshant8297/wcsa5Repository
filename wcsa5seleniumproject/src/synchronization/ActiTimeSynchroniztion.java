package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeSynchroniztion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-jbsn4rj/login.do");
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("mannager");
		driver.findElement(By.xpath("//a[contains(@id,'loginButton')]")).click();

	}

}

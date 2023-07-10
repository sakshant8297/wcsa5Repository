package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DpendentXpathFlipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		 driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("hp laptop");
		 driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		 
		// Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Brand']")).click();
		 
		 

	}

}

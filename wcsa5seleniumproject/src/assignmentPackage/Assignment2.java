package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Sakshant/Desktop/wcsa5/WebElement/Samplelogin.html");
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("n2")).sendKeys("manager");

	}

}

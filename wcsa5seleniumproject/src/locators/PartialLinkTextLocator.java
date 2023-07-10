package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("file:///C:/Users/Sakshant/Desktop/wcsa5/WebElement/WebLinkElement.html");
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("FLIPKART")).click();
		 
		 

	}

}

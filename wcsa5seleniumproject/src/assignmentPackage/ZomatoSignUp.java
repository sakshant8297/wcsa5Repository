package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		
		//To click on Sign Up Link
		
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("asdfghkk");
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("zxcvbnm");

	}

}

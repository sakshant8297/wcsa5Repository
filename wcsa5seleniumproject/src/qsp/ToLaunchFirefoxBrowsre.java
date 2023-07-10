package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class ToLaunchFirefoxBrowsre {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		//Upcast into Webdriver(I)
		WebDriver driver =new FirefoxDriver();

		// Provide the delay of 2 sec
		Thread.sleep(2000);

		//To close Browser
		driver.close();

	}

}

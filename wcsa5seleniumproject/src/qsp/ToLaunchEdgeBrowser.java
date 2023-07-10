package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.close();

	}

}

package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		//Reletive Path of Driver Executable File
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Upcast into Webdriver(I)
		WebDriver driver =new ChromeDriver();//Launch Chromre Browser

		//Maxize the Browser
		driver.manage().window().maximize();

		//Provide the delay of 2 sec
		Thread.sleep(2000);

		//To close Browser
		driver.close();

	}

}

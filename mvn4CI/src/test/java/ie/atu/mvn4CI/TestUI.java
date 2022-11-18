package ie.atu.mvn4CI;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUI

{
	@Test
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		ChromeOptions ChromeOptions = new ChromeOptions();
		ChromeOptions.addArguments("--headless","--no-sandbox");
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.manage().window().fullscreen();
		driver.get("https://www.atu.ie/");
		System.out.println("Test done");
//		driver.quit();
		
	}

}

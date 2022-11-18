package ie.atu.mvn4CI;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUI

{
	@Test
	public void openBrowser()
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.atu.ie/");
		System.out.println("Test done123");
		driver.quit();
		
	}
	

}

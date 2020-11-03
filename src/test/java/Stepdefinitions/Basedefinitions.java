package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basedefinitions {
	public static WebDriver driver;
	
	public void lauchApp()
	{
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
				driver.get("http://localhost:100");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}

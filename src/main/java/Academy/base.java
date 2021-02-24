package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver; 
	// make it global so you do not have to declare more than once 
public WebDriver initializeDriver() throws IOException {
	//here we trying to execute test which ever browser we envoke 
	//chrome
	
	
	//firefox
	//IE
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("/Users/adhikaridhurba/Documents/Smart Tech/E2EProject/src/main/java/Academy/data.properties");
	
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	
	browserName.equals("chrome"); {
		System.setProperty("webdriver.chrome.driver", "/Users/adhikaridhurba/Documents/Smart Tech/NewProject/Drivers/chromedriver");
		 driver = new ChromeDriver();
	}/*
	if (browserName.equals("FireFox")); {
		driver = new FirefoxDriver();
	}
	 if (browserName.equals("IE"));{
		driver = new InternetExplorerDriver();
	}*/
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}

}

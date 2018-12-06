package com.crm.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	 public static WebDriver driver;
	 public static Properties prop;
	
	public TestBase()  {
		try {
			prop= new Properties();
			FileInputStream fs= new FileInputStream("C:\\Users\\vivek.tiwari\\git\\MavenDemotest"
					+"\\MavenDemotest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(fs);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("browser"));
	}

}

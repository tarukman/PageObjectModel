package com.flipkart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	static WebDriver driver;
	Properties prop;

	public TestBase(){
	try {
			FileInputStream ip = new FileInputStream("/Flipkart/src/main/java/com/flipkart/qa/configuration/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initialization()
	{
		String browsername=prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "/Flipkart/Drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
	}
}

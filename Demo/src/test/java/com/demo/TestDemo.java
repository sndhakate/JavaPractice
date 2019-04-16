package com.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setEnv() {
		
		driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void userTest() {
		System.out.println("I am in Test");
	}

}

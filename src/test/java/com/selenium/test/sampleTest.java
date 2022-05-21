package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTest {
	WebDriver driver;
	@Test
	public void method1() throws InterruptedException {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.quit();
	}
}

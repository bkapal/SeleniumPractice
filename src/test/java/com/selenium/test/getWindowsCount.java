package com.selenium.test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class getWindowsCount {
	WebDriver driver;
	@Test
	public void m1() {
	
	System.out.println(driver.getWindowHandles().size());
	}
}

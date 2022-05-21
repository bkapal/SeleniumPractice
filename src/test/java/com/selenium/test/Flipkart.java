package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String args[]) throws InterruptedException {
		//ChormeDriver initialization
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/travel/flights");
		driver.findElement(By.xpath("//*[@class=\"_1_3w1N\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.quit();
	}
}

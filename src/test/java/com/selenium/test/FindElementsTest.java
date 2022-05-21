package com.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

abstract public class FindElementsTest {
	WebDriver driver;
	@BeforeMethod(alwaysRun = true)
	public void method1()
	{
		//System.setProperty("webdriver.chrome.driver","");
		driver = new ChromeDriver();
		ChromeDriver d = new ChromeDriver();
		
		System.out.println("Before Method");
		System.out.println("===========");
	}
	
	@Test(groups= {"output"})
	public void testMultiElement() throws InterruptedException {	
	//WebDriver driver = new ChromeDriver();
	driver.get("www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@class=\"gLFyf gsfi\"]")).click();
	System.out.println("OUTPUT1");
	Thread.sleep(2000);
	
	
	
	List<WebElement> recentSearch = driver.findElements(By.xpath("//*[@class=\"erkvQe\"]/li"));
	for(WebElement e:recentSearch) {
		System.out.println(e.getText());
		System.out.println(e.getText().trim().equalsIgnoreCase("oppo f19 pro 5g specifications")?"Yes":"No");
	}
}
	@Test(groups= {"run"})
	public void verifyFeelinglucky() {
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]")).click();
	String str = "Google Doodles";
	Assert.assertEquals(driver.getTitle(), str);		
	}
	
	@Test(groups= {"run"})
	public void gotoOthersites() {
	driver.get("https://www.javatpoint.com/");
	driver.findElement(By.xpath("//a[text()='Selenium']")).click();
	}
	
	@Test(groups= {"output"})
	public void clickKalyaJewl() throws InterruptedException {	
	//WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	//driver.findElements(.)
	driver.findElement(By.xpath("//*[@class=\"gLFyf gsfi\"]")).click();
	Thread.sleep(2000);
	System.out.println("OUTPUT2");
	List<WebElement> recentSearch = driver.findElements(By.xpath("//*[@class=\"erkvQe\"]/li"));
	for(WebElement e:recentSearch) {		
		System.out.println(e.getText().trim().equalsIgnoreCase("kalyan jewellers ipo")?"Yes":"No");		
		}
	
	}
	
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		System.out.println("=====Browser Closed======");
		driver.quit();
	}
}

class test{
	FindElementsTest f;
	
}

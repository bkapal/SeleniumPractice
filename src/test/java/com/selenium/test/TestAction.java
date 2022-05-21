package com.selenium.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAction {

	
	public static void verifyLink(String url) throws Exception
	{
		URL link = new URL(url);
		HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		 if(httpConn.getResponseCode()!= 200) 
		 {
			 System.out.println("Broken Link");
		 }
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//a")).getAttribute("innerHTML"));
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 System.out.println(links.size());
		 for(WebElement e:links)
		 {
			 String url = e.getAttribute("href");
			 System.out.println(url);
			 verifyLink(url);
		 }
		 
		 
	driver.quit();	
		
	}

}

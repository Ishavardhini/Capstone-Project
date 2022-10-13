package com.capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AadharRegister {
	static WebDriver webdriver = null;

	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\jars\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");
		
	}
	
	@Test
	public void TestHome() {
		webdriver.get("http://localhost:4200/home");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/a[2]")).click();
		webdriver.get("http://localhost:4200/register");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("name")).sendKeys("Jayanthi");
		webdriver.findElement(By.id("dob")).sendKeys("1970-11-12");
		webdriver.findElement(By.id("emailid")).sendKeys("jaya@gmail.com");
		webdriver.findElement(By.id("address")).sendKeys("Ettines road,Ooty,Tamil Nadu");
		webdriver.findElement(By.id("mobileno")).sendKeys("9086786798");
		webdriver.findElement(By.id("gender")).sendKeys("Female");
		webdriver.findElement(By.xpath("//*[@id=\"register\"]")).click();
	}



}

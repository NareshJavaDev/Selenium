package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk");

		//implicit wiat
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.findElement(By.className("close-cookie-warning")).click();
		driver.findElement(By.linkText("LOADER")).click();

		driver.findElement(By.xpath("/html//button[@id='loaderBtn']")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}

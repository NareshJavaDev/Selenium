package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk");
		driver.manage().window().maximize();
		driver.findElement(By.className("close-cookie-warning")).click();
		driver.findElement(By.linkText("LOADER")).click();

		// explicit wait- if the wait time is set lesser than actual it will through
		// time out exception

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//button[@id='loaderBtn']")));

		driver.findElement(By.xpath("/html//button[@id='loaderBtn']")).click();
		Thread.sleep(2000);

	
		
		driver.quit();
	}

}

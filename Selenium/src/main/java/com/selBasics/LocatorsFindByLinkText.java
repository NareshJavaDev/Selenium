package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsFindByLinkText {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		//if the select element value is unidentified then use that link name
		driver.findElement(By.linkText("ACTIONS")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("close-cookie-warning")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("TABLES")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow;')", element);
	}

}

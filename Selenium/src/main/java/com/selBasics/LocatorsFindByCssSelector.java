package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsFindByCssSelector {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/buttons.html");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement userId = driver.findElement(By.id("btn_one"));
		highlight(driver, userId);
		Thread.sleep(3000);
		
		//if use css selector then for id use # before id value and . before class value
		WebElement cssSelector = driver.findElement(By.cssSelector("#btn_two"));
		highlight(driver, cssSelector);
		Thread.sleep(3000);
		
		//we can also write like with type of action
		driver.findElement(By.cssSelector("button#btn_three")).click();
		Thread.sleep(3000);
		driver.quit();
	}

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow;')", element);
	}

}

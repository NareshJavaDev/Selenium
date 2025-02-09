package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsFindByName {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/contactForm.html");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement userId = driver.findElement(By.name("first_name"));
		highlight(driver, userId);
		Thread.sleep(3000);
		
		//to send any values to that input use send keys function
		 driver.findElement(By.name("last_name")).sendKeys("naresh");
		Thread.sleep(3000);
		WebElement message = driver.findElement(By.name("message"));
		highlight(driver, message);

		Thread.sleep(3000);
		driver.quit();

	}

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow;')", element);
	}

}

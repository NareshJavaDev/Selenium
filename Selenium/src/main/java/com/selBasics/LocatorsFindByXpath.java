package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsFindByXpath {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/buttons.html");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement userId = driver.findElement(By.xpath("//button[@id='btn_one']"));
		highlight(driver, userId);
		Thread.sleep(3000);
		
		//you can directly copy from dom document by identifying the element and click on 
		 driver.findElement(By.xpath("//*[@id=\"btn_two\"]")).click();
	

		Thread.sleep(3000);
		driver.quit();

	}

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow;')", element);
	}

}

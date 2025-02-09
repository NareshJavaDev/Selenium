package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenElements {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/hiddenElements.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(2)"));
		if (ele.isDisplayed()) {
			System.out.println("not hidden");
		} else {
			System.out.println("hidden");
		}
		Thread.sleep(2000);

		System.out.println("cnkjn---"
				+ driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(3)")).isDisplayed());

		driver.quit();

	}

}

package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Assertions {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		String drivercds = driver.getTitle();

		// this need junit library
		Assert.assertEquals("Homepage", drivercds);

		// if the expected output is not matched with actuall output it will throw an
		// error

		driver.quit();

	}

}

package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/buttons.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement check2 = driver.findElement(By.id("btn_four"));
		if (check2.isEnabled()) {
			check2.click();
			System.out.println("rgtg----" + check2.isEnabled());
			Thread.sleep(2000);
		} else {
			System.out.println("qfeqfqw----" + check2.isEnabled());
			Thread.sleep(2000);
		}

		WebElement check = driver.findElement(By.id("btn_one"));
		if (check.isEnabled()) {
			System.out.println("nkc----" + check.isEnabled());
			check.click();
			Thread.sleep(5000);

		} else {
			check.click();
			System.out.println("ewqfqewfeq----" + check.isEnabled());
			Thread.sleep(2000);
		}

		Thread.sleep(1000);

		driver.quit();

	}

}

package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMenu {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/dropdown.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		Select dropdown = new Select(driver.findElement(By.id("cars")));

		dropdown.selectByIndex(1);
		Thread.sleep(5000);

		dropdown.selectByValue("honda");
		Thread.sleep(2000);

		dropdown.selectByVisibleText("Volkswagen");
		Thread.sleep(2000);


		driver.quit();

	}

}

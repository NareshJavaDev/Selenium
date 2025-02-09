package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxSelection {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/dropdown.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement check2 = driver.findElement(By.xpath("//div[@id='main']/div[@class='inner']//label[.=' Blue']"));
		if (check2.isSelected()) {
			check2.click();
			Thread.sleep(2000);
		} else {
			check2.click();
			Thread.sleep(2000);
		}

		WebElement check = driver.findElement(By.xpath("//div[@id='main']/div[@class='inner']//label[.=' Red']"));
		if (check.isSelected()) {
			check.click();
			Thread.sleep(5000);

		} else {
			check.click();
			Thread.sleep(2000);
		}

		WebElement check3 = driver
				.findElement(By.xpath("//div[@id='main']/div[@class='inner']/div[1]//label[.='Two']"));
		if (check3.isSelected()) {
			check3.click();
			Thread.sleep(2000);

		} else {
			check3.click();
			Thread.sleep(2000);
		}

		Thread.sleep(1000);

		driver.quit();

	}

}

package com.advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/tables.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		String name = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/table/tbody/tr[1]/td[1]"))
				.getText();

		System.out.println("adnvjhdsb---" + name);
		driver.quit();

	}

}

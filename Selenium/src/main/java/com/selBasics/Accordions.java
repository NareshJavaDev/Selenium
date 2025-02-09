package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Accordions {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/accordion.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.className("accordion-header")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("accordion-header")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[5]")).click();
//		driver.findElement(By.xpath("//div[@id='main']/div[@class='inner']//div[@class='accordion']/div[5]")).click();
		Thread.sleep(2000);
		
		
		driver.quit();

		
	}
	

}

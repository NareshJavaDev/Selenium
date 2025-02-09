package com.advancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/tooltip/");

		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));

		WebElement st = driver.findElement(By.xpath("//*[@id=\"age\"]"));

		
		a.scrollByAmount(0, 500).perform();
		System.out.println("anndklv--"+st.getAttribute("title"));
		
		Thread.sleep(3000);
		
		
		
		Thread.sleep(3000);

		driver.quit();

	}

}

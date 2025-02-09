package com.advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordion {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.way2automation.com/way2auto_jquery/accordion.php#load_box");

		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"example-1-tab-1\"]/div/iframe")));

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}

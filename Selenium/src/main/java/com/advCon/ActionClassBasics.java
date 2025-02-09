package com.advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassBasics {

	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.way2automation.com/way2auto_jquery/automation-practice-site.html");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div/div[1]/ul/li[2]/a/figure/img")))
				.build().perform();

		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div/div[1]/ul/li[3]/a/figure/img")))
				.click().build().perform();
		
		
//		a.doubleClick();
//		a.contextClick()//right click

	}

}

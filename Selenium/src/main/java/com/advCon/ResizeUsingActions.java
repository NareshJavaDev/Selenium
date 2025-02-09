package com.advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeUsingActions {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.way2automation.com/way2auto_jquery/resizable.php#load_box");

		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"example-1-tab-1\"]/div/iframe")));

		WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

		Actions a = new Actions(driver);
		Thread.sleep(3000);

		// one way to resize
		a.clickAndHold(element).moveByOffset(30, 40).release().perform();
		Thread.sleep(2000);

		//resizing inside
		a.dragAndDropBy(element, -10, -20).build().perform();
		Thread.sleep(3000);

	}

}

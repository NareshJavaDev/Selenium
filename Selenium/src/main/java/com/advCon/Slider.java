package com.advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/#colorpicker");

		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));

		WebElement st = driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
//		WebElement end=driver.findElement(By.xpath("//*[@id=\"red\"]/span"));

		a.dragAndDropBy(st, -80, 90).build().perform();
		// *[@id="red"]/span

		Thread.sleep(3000);

		driver.quit();

	}

}

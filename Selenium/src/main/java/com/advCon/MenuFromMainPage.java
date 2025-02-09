package com.advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuFromMainPage {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.way2automation.com/way2auto_jquery/draggable.php#load_box");

		driver.manage().window().maximize();

		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"toggleNav\"]/li[3]/a"))).build().perform();
		

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"toggleNav\"]/li[3]/ul/li[4]/a")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}

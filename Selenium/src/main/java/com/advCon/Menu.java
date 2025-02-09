package com.advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Menu {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.way2automation.com/way2auto_jquery/menu.php#load_box");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[2]/a"))).click()
				.build().perform();

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"example-1-tab-2\"]/div/iframe")));
		String name = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/ul/li[2]")).getText();
		System.out.println("snvsd---" + name);

		Thread.sleep(3000);
		driver.quit();

	}

}

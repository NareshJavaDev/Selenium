package com.advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[2]/a"))).click()
				.build().perform();

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"example-1-tab-2\"]/div/iframe")));

		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.switchTo().alert().sendKeys(" ");
		driver.switchTo().alert().sendKeys("naresh yadav");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.quit();

	}

}

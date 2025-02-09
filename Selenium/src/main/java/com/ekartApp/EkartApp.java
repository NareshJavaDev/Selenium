package com.ekart;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EkartApp {

	public static void main(String args[]) throws InterruptedException, IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/logout");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]")).click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.scrollByAmount(0, 200).perform();

		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("naresh996463@gmail.com");

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("target/screenshot.png");
		// Copy the screenshot to the destination
		Files.copy(screenshot.toPath(), destination.toPath());
		System.out.println("bvbcsdjbv---------" + destination.getAbsolutePath());

		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Naresh@123");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a"))).click().build()
				.perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a"))).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a"))).click().build()
				.perform();
		Thread.sleep(2000);
		a.scrollByAmount(0, 80).perform();

		a.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[1]/span")))
				.click().build().perform();
		Thread.sleep(2000);
		a.scrollByAmount(0, 50).perform();

		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"product\"]/div[1]/div/span/button"))).click().build()
				.perform();

		a.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/tbody/tr[4]/td[7]"))).click()
				.build().perform();

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"input-quantity\"]"))).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("2");

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"button-cart\"]"))).click().build().perform();

		Thread.sleep(2000);

		a.scrollByAmount(0, 500).perform();

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"cart-total\"]"))).click().build().perform();
		Thread.sleep(2000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"))).click().build()
				.perform();

		a.scrollByAmount(0, 70).perform();

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a"))).click().build().perform();

		driver.quit();

	}

}

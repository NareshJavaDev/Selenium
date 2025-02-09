package com.advancedConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompletUsingMouse {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.way2automation.com/way2auto_jquery/autocomplete.php#load_box");

		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"example-1-tab-1\"]/div/iframe")));

		WebElement first = driver.findElement(By.xpath("//*[@id=\"tags\"]"));

		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(first).click().sendKeys("A").build().perform();
		Thread.sleep(3000);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//li[contains(text(), 'Asp')]"))));

		a.moveToElement(driver.findElement(By.xpath("//li[contains(text(), 'Asp')]"))).click().build().perform();
		driver.quit();
	}

}

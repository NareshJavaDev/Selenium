package com.advancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.automationtesting.co.uk/fileupload.html");

		driver.manage().window().maximize();

		WebElement st = driver.findElement(By.xpath("//*[@id=\"fileToUpload\"]"));

		Actions a = new Actions(driver);
//		a.moveToElement(st).click().build().perform();
		st.sendKeys("C:\\Users\\2134298\\Downloads\\log4j-core-2.24.1.jar");

		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/form/input[2]")).click();
		
		Thread.sleep(3000);

		driver.quit();

	}

}

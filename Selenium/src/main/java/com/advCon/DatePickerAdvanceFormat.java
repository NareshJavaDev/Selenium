package com.advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePickerAdvanceFormat {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.automationtesting.co.uk/datepicker.html");

		driver.manage().window().maximize();

	
		WebElement el=driver.findElement(By.xpath("//*[@id=\"basicDate\"]"));
		el.click();
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/span[20]")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/span[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rangeDate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/span[12]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/span[12]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"timePicker\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/span[2]")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}

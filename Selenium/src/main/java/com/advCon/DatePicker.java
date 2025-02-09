package com.advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.way2automation.com/way2auto_jquery/datepicker.php#load_box");

		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"example-1-tab-1\"]/div/iframe")));

		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		WebElement el=driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));

		a.moveToElement(el).click().build().perform();
//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a"))).click().build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"))).click().build().perform();
	
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[7]/a")).click();
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}

package com.advancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");

		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));

		List<WebElement> st = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));

		
//		st.click();
		Thread.sleep(3000);
		
		a.keyDown(Keys.CONTROL).click(st.get(1)).click(st.get(4)).click(st.get(6)).build().perform();
		
		
		Thread.sleep(3000);

		driver.quit();

	}

}

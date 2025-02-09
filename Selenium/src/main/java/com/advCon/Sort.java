package com.advancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sort {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/sortable/");

		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));

		List<WebElement> st = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		a.scrollByAmount(0, 200).perform();
		Thread.sleep(3000);
		System.out.println("scbsdbc---"+st.size());
		int z;
		for (int i = 0; i < st.size(); i++) {
			z =( (st.size()-1)-i);
			System.out.println("scmkan---"+z);
			a.clickAndHold(st.get(z)).moveToElement(st.get(0)).release().build().perform();
			Thread.sleep(3000);
		}

		Thread.sleep(3000);

		driver.quit();

	}

}

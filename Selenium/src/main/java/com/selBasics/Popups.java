package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popups {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/popups.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Trigger Pop-up']")).click();
		Thread.sleep(2000);

		// getting the window handle id of the main window
		String mainWindow = driver.getWindowHandle();

		// using a set to store all the open window handle id's
		Set<String> windows = driver.getWindowHandles();

		// creating an iterator object to parse through each value in the set
		Iterator<String> iterate = windows.iterator();

		// while loop checks to see if there is a next value in the set
		while (iterate.hasNext()) {

			String child = iterate.next();
			if (!mainWindow.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);
				Thread.sleep(3000);
				driver.close();

			}

		}

		// if more than onw window is opened or closed you must switched to main window
		// to do other operation on main other it won't access the main window

		// brings focus back to the main window
		driver.switchTo().window(mainWindow);
		driver.findElement(By.xpath("//button[text()='Trigger Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();

	}

}

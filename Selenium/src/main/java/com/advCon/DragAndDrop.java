package com.advancedConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class DragAndDrop {

	public static void main(String args[]) throws InterruptedException {

		// scenario like open main page and click on the drop and it moves to another
		// window and in that will do the drag and drop action

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.way2automation.com/way2auto_jquery/automation-practice-site.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div/div[1]/ul/li[2]/a/figure/img")).click();

		String mainWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> iterate = windows.iterator();

		while (iterate.hasNext()) {

			String child = iterate.next();
			if (!mainWindow.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);
				Actions a = new Actions(driver);
				System.out.println("dbsdbvs");
				Thread.sleep(6000);

				driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"example-1-tab-1\"]/div/iframe")));

				WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));

				WebElement dest = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
				Thread.sleep(3000);

				a.dragAndDrop(source, dest).build().perform();
				Thread.sleep(3000);

			}
		}

		driver.switchTo().window(mainWindow);
		driver.close();
		driver.quit();

	}

}

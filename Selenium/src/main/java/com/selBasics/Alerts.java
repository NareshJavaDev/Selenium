//package com.selenium;
//
//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Alerts {
//
//	public static void main(String args[]) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.automationtesting.co.uk/popups.html");
//
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//div[@id='main']/div[@class='inner']//button[.='Trigger Alert']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		 
//		//use below method for cancel
////		driver.switchTo().alert().dismiss();
//		
//		
//		
//
//		driver.quit();
//
//	}
//
//}

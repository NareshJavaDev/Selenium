package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendingData {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/contactForm.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.name("first_name")).sendKeys("Naresh");
		Thread.sleep(1000);
		driver.findElement(By.name("last_name")).sendKeys("Nagula");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("form#contact_form > input[name='email']")).sendKeys("naresh11@gmail.com");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//form[@id='contact_form']/textarea[@name='message']")).sendKeys("new user created");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='form_buttons']/input[@value='SUBMIT']")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow;')", element);
	}

}

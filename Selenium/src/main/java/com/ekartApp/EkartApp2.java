package com.ekart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EkartApp2 {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://teststore.automationtesting.co.uk/index.php");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"))).click().build()
				.perform();
		Thread.sleep(2000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"field-email\"]"))).click().build().perform();

		driver.findElement(By.xpath("//*[@id=\"field-email\"]")).sendKeys("naresh996463@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"field-password\"]")).sendKeys("Naresh@123");
		driver.findElement(By.xpath("//*[@id=\"submit-login\"]")).click();

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"category-6\"]/a"))).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"category-8\"]/a"))).click().build().perform();
		Thread.sleep(2000);
		a.scrollByAmount(0, 200).perform();
		a.moveToElement(driver
				.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div[1]/article/div/div[1]/a/picture/img")))
				.click().build().perform();
		Thread.sleep(2000);
		a.scrollByAmount(0, 80).perform();

		a.moveToElement(driver
				.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i")))
				.click().build().perform();
		Thread.sleep(2000);

		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")))
				.click().build().perform();
		Thread.sleep(3000);

		a.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")))
				.click().build().perform();

		Thread.sleep(2000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"_desktop_cart\"]/div/div/a/span[1]"))).click().build()
				.perform();

		a.scrollByAmount(0, 100).perform();

		a.moveToElement(driver
				.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[3]/div/a/i")))
				.click().build().perform();

		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[1]"))).click().build()
				.perform();

		driver.quit();

	}

}

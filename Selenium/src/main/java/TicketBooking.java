import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TicketBooking {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/index.php");

		String title = driver.getTitle();
		if (title.equals("Welcome to the Simple Travel Agency!")) {
			System.out.println("Title is displayed correctly: " + title);
		} else {
			System.out.println("Title mismatch: " + title);
		}

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement destinationLink = driver.findElement(By.linkText("destination of the week! The Beach!"));
		destinationLink.click();

		Thread.sleep(2000);

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("vacation")) {
			System.out.println("URL contains 'vacation'.");
		} else {
			System.out.println("URL does not contain 'vacation'.");
		}
		Actions actions = new Actions(driver);

		actions.sendKeys(Keys.BACK_SPACE).perform();

		driver.navigate().back();

		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));

		dropdown.selectByValue("Mexico City");

		Select dropdown2 = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		dropdown2.selectByValue("London");

		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

//		Thread.sleep(5000);

		List<WebElement> prices = driver.findElements(By.xpath("//tr/td[6]"));
		double lowestPrice = Double.MAX_VALUE;
		WebElement lowestPriceFlight = null;

		for (WebElement priceElement : prices) {
			double price = Double.parseDouble(priceElement.getText().replace("$", ""));
			if (price < lowestPrice) {
				lowestPrice = price;
				lowestPriceFlight = priceElement.findElement(By.xpath("./../td/input[@type='submit']"));
			}
		}

		if (lowestPriceFlight != null) {
			lowestPriceFlight.click();
		} else {
			System.out.println("No flights found.");
			return;
		}

		WebElement totalCostElement = driver.findElement(By.xpath("/html/body/div[2]/p[5]"));
		String totalCost1 = totalCostElement.getText().trim();

		String totalCost = totalCost1.replace("Total Cost: ", "").trim();
		if (totalCost.matches("\\d+\\.\\d{2}")) {
			System.out.println("Total Cost displayed correctly: " + totalCost);
		} else {
			System.out.println("Total Cost format is incorrect: " + totalCost);
		}

		// Click 'Purchase Flight'
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		// Verify navigation to Purchase Confirmation page and get the ID
		WebElement confirmationId = driver.findElement(By.xpath("//td[text()='Id']/following-sibling::td"));
		System.out.println("Purchase Confirmation ID: " + confirmationId.getText());

	}

}

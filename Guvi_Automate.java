package task_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvi_Automate {

	public static void main(String[] args) {

		// Initialize the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Maximize the browser window
		driver.manage().window().maximize();

		// navigate to Guvi website
		driver.get("https://www.guvi.in/register");

		// All possible locators
		// By id
		driver.findElement(By.id("name")).sendKeys("Jack");
		// By className
		driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		// By tagName
		driver.findElement(By.tagName("input")).sendKeys("1234567890");
		// By cssSelector
		driver.findElement(By.cssSelector("input[id='mobileNumber']")).sendKeys("0987654321");
		// By xpath
		driver.findElement(By.xpath("//input[@class='form-control password-err']")).sendKeys("Password@123");

		// close the browser
		driver.quit();
	}

}

package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class5 {

	WebDriver driver = new ChromeDriver();
	Actions a = new Actions(driver);
	
	@BeforeTest
	@Test
	void contactUs() throws InterruptedException {
			driver.get("https://www.tranktechnologies.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement contact = driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='Contact us']"));
			contact.click();
			Thread.sleep(1000);
		}
	
	@AfterTest
	void close() {
		driver.quit();
	}
}

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

public class Class6 {

	WebDriver driver = new ChromeDriver();
	Actions a = new Actions(driver);
	
	@BeforeTest
	@Test
	void portfolio() throws InterruptedException {
			driver.get("https://www.tranktechnologies.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement pf = driver.findElement(By.xpath("//a[normalize-space()='Portfolio']"));
			pf.click();
			Thread.sleep(1000);
		}
	
	@AfterTest
	void close() {
		driver.quit();
	}
}

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

public class Class2 {

	WebDriver driver = new ChromeDriver();
	Actions a = new Actions(driver);
	
	@BeforeTest
	@Test
	void navigate() {
			driver.get("https://www.tranktechnologies.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test
	void technologies() throws InterruptedException {
		WebElement tech = driver.findElement(By.xpath("/html/body/header/div[2]/ul/li[2]/a"));
		tech.click();
		WebElement eCom = driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(eCom).perform();
		//Thread.sleep(2000);
		WebElement magDev = driver.findElement(By.xpath("//a[@href=\"https://www.tranktechnologies.com/magento-development\"]"));
		a.moveToElement(magDev).click().perform();
	}
	@Test
	void mobileApp() throws InterruptedException {
		WebElement tech = driver.findElement(By.xpath("/html/body/header/div[2]/ul/li[2]/a"));
		tech.click();
		WebElement mApp = driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		a.moveToElement(mApp).perform();
		//Thread.sleep(2000);
		WebElement reactN = driver.findElement(By.xpath("//a[contains(text(),'React Native Mobile')]"));
		a.moveToElement(reactN).click().perform();
	}
	@Test
	void art_Int() throws InterruptedException {
		WebElement tech = driver.findElement(By.xpath("/html/body/header/div[2]/ul/li[2]/a"));
		tech.click();
		WebElement ai = driver.findElement(By.xpath("//strong[normalize-space()='Artificial Intelligence']"));
		a.moveToElement(ai).click().perform();
	}
		
	@AfterTest
	void close() {
		driver.quit();
	}
}

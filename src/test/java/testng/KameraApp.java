package testng;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KameraApp {

	WebDriver driver=new ChromeDriver();
	Actions actions = new Actions(driver);
	
	@Test(priority = 1)
	void url () throws InterruptedException {
		driver.get("https://www.kamera-express.nl/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@cs-consent=\"all\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	void creatacc() {
	WebElement regis = driver.findElement(By.xpath("//div[@class='header-content-bottom']//button[@class='user-button sf-button--text no-underline sf-button']"));
	actions.moveToElement(regis).perform();
	
	WebElement createacc = driver.findElement(By.xpath("//div[@class='header-content-bottom']//div[@class='register-cta-container']//a"));
	createacc.click();
	driver.findElement(By.xpath("//input[@value='1']")).click();
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Manvi");
	driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Sarwaiya");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manvi14545245345@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("m@123456");
	driver.findElement(By.xpath("//input[@name='confirm_password']")).sendKeys("m@123456");
	driver.findElement(By.xpath("//input[@name='newsletter']")).click();
	driver.findElement(By.xpath("//input[@name='recommendations_commerce']")).click();
	driver.findElement(By.xpath("//input[@id='register']")).click();
}
	
	@Test(priority = 3)
	void product() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[1]/div/a/img")).click();
		driver.findElement(By.xpath("//div[@class='product-card-image-container']//img[@alt='canon-eos-r7_1.webp']")).click();
		driver.findElement(By.xpath("//button[@data-dd-action-name=\"add-to-cart\"]")).click();
		
		Thread.sleep(2000);
	}
	
	@AfterTest
	void close () {
		driver.quit();
	}
	
}
	


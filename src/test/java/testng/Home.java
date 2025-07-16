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

public class Home {

	WebDriver driver = new ChromeDriver();
	Actions a = new Actions(driver);
	
	@BeforeTest
	@Test
	void home() throws InterruptedException {
			driver.get("https://www.tranktechnologies.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
//	@Test		
//	void indNum() throws InterruptedException {
//		driver.findElement(By.xpath("//div[@class='cm-page-center']//li[1]//a[1]")).click();//India Number
//		Thread.sleep(4000);
//	}
//	@Test
//	void header() {
//		driver.findElement(By.xpath("//img[@alt='Trank Technologies']")).click();
//	}
	@Test
	void quoto() {
		driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys("Monika");
		driver.findElement(By.xpath("//input[@id='email_career']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@placeholder='Your Company']")).sendKeys("abc");
		driver.findElement(By.xpath("//select[@name='service']")).sendKeys("Web Development");
		driver.findElement(By.xpath("//input[@placeholder='Your Phone']")).sendKeys("7858963214");
		driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("Test");
		driver.findElement(By.id("recaptcha-anchor")).click();
		
	}
	
	
	
//	@AfterTest
//	void close() {
//		driver.quit();
//	}
}

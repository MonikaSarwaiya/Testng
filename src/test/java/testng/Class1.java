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

public class Class1 {
	WebDriver driver = new ChromeDriver();
	Actions a = new Actions(driver);
	
	@BeforeTest
	@Test
	void vertical() throws InterruptedException {
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement verticle = driver.findElement(By.xpath("/html/body/header/div[2]/ul/li[1]/a"));
		verticle.click();
		WebElement trad = driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
		a.moveToElement(trad).perform();
		Thread.sleep(2000); 
		WebElement stocks = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Stock Trading']"));
		a.moveToElement(stocks).perform();
		a.moveToElement(stocks).click().perform();
	}
	@Test
	void retail() throws InterruptedException {
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement vertical = driver.findElement(By.xpath("/html/body/header/div[2]/ul/li[1]/a"));
		vertical.click();
		WebElement retail = driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		a.moveToElement(retail).perform();
		Thread.sleep(2000); 
		WebElement eCom = driver.findElement(By.xpath("//div[@id='retailEcommerce']//li[1]//a[1]"));
		a.moveToElement(eCom).perform();
		a.moveToElement(eCom).click().perform();
	}
	@Test
	void healthCare() throws InterruptedException {
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement vertical = driver.findElement(By.xpath("/html/body/header/div[2]/ul/li[1]/a"));
		vertical.click();
		WebElement health = driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		a.moveToElement(health).perform();
		Thread.sleep(2000); 
		WebElement diet = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[contains(text(),'Diet &')]"));
		a.moveToElement(diet).perform();
		a.moveToElement(diet).click().perform();
	}
	@Test
	void finTech() throws InterruptedException {
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement vertical = driver.findElement(By.xpath("/html/body/header/div[2]/ul/li[1]/a"));
		vertical.click();
		WebElement finTech = driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		a.moveToElement(finTech).perform();
		Thread.sleep(2000); 
		WebElement softDev = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[contains(text(),'Pos Software')]"));
		a.moveToElement(softDev).perform();
		a.moveToElement(softDev).click().perform();
	}
	@Test
	void customApp() throws InterruptedException {
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement vertical = driver.findElement(By.xpath("/html/body/header/div[2]/ul/li[1]/a"));
		vertical.click();
		WebElement cApp = driver.findElement(By.xpath("//strong[normalize-space()='Custom App']"));
		a.moveToElement(cApp).perform();
		Thread.sleep(2000); 
		WebElement travel = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Travel']"));
		a.moveToElement(travel).perform();
		a.moveToElement(travel).click().perform();
	}
	
	@AfterTest
	void close() {
		driver.quit();
	}
	
}

package Salesdesk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swagorder {

	static WebDriver driver;
	
	
	@Test(priority=1)
	public static void login() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	
	}
	
	@Test(priority=2)
	public static void addToCart() throws InterruptedException {
		
	driver.findElement(By.xpath("//a[@id=\"item_4_title_link\"]/div")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]/a")).click();
	
	}
	@Test(priority=3)
	public static void checkout() throws InterruptedException {
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("first-name")).sendKeys("vinay");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("varma");
		driver.findElement(By.id("postal-code")).sendKeys("50016");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//button[@data-test=\"finish\"]")).click();
		
		}
	
	@Test(priority=4)
	public static void teardown() {
		driver.quit();
	}
	
}

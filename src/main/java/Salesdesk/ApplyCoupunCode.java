package Salesdesk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplyCoupunCode {

	
static WebDriver driver;
	
	
	
	@Test(priority=1)
	public static void addBookToCart() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("http://practice.automationtesting.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"site-logo\"]/a/img")).click();
	Thread.sleep(2000);
	JavascriptExecutor jsx = (JavascriptExecutor)driver;
	jsx.executeScript("window.scrollBy(0,450)", "");
	driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();
    
	}
	@Test(priority=2)
	public static void viewBasketDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='View Basket']")).click();
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();	
	}
	
	@Test(priority=3)
	public static void cCode() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//input[@name=\"coupon_code\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Apply Coupon\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
		
	}
	
	
	
	@Test(priority=4)
	public static void skippedMethod() {
	
		throw new SkipException("Skipping this exception");
	}
	
	@Test(priority=5)
	public static void exitSite() {
	
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package testing.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("Webdriver.chrome.driver","D:\\TRB\\Selenium_Interv_Pract\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement trchy = driver.findElement(By.xpath("(//span[@class='red_text'])[13]"));
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",trchy);
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(3000);
		
		
		
		
		
}
}
package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","D:\\TRB\\Selenium_Interv_Pract\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("yes");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
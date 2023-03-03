package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\TRB\\Selenium_Interv_Pract\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement date= driver.findElement(By.name("birthday_day"));
		Select s=new Select(date);
		s.selectByIndex(27);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("5");
		
		WebElement year= driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1990");
		
		
		
	}

}

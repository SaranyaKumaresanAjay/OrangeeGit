package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Browser_Launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "D:\\TRB\\Selenium_Interv_Pract\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
		signin.click();
		
		WebElement phno = driver.findElement(By.name("email"));

		phno.sendKeys("9159250693");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("ABCDEFG");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Applephone");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		

		

	}

}

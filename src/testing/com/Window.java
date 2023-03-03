package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

public class Window {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "D:\\TRB\\Selenium_Interv_Pract\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();//=------------------Best sellers page
		WebElement best = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		Actions ac = new Actions(driver);
		ac.contextClick(best).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);//--------------------signin page

		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		Actions ac1 = new Actions(driver);
		ac1.contextClick(signin).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);//------------------------customer service page

		WebElement custserv = driver.findElement(By.linkText("Customer Service"));

		Actions ac2 = new Actions(driver);
		ac2.contextClick(custserv).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(6000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		System.out.println("main "+parent);
		String title = driver.switchTo().window(parent).getTitle();
		System.out.println("Parent title : "+title);
		
		//-------WINDOWHANDLES
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>();
		String title2 = driver.switchTo().window(a.get(0)).getTitle();
		System.out.println("0 window.Title  :"+title2);
		
//		String title3 = driver.switchTo().window(a.get(1)).getTitle();
//		System.out.println("1 window.Title  :"+title3);
//		
//		
		
		
		
		

	}
}


















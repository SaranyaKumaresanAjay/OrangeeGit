package testing.com;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fraameeee {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "D:\\TRB\\Selenium_Interv_Pract\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");     //By Name
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textbox.sendKeys("Saranya,glad to see you");
       driver.switchTo().defaultContent();
//		
//		Thread.sleep(3000);
//		WebElement iframeiframe = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
//		iframeiframe.click();
//		WebElement outerframe = driver.findElement(By.xpath("(//iframe[contains(@style,'float: left')])[2]"));
//		driver.switchTo().frame(outerframe);      //By WebElement
//		
//	    Thread.sleep(3000);
//	    WebElement innerframe = driver.findElement(By.xpath("(//iframe[contains(@style,'float: left;he')])[1]"));
//	    driver.switchTo().frame(innerframe);
//	    Thread.sleep(3000);
//	 
//	    WebElement textbox1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		textbox1.sendKeys("bye,see you again");
//		
//		driver.switchTo().defaultContent();
//		WebElement finalclick = driver.findElement(By.xpath("//a[@class='analystic']"));
//		finalclick.click();
		
		
				
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//driver.manage().window().maximize();
//WebElement login = driver.findElement(By.xpath("//frame[@name='login_page']"));
//
//driver.switchTo().frame(login);
//WebElement uname = driver.findElement(By.name("fldLoginUserId"));
//uname.sendKeys("saranya");

}
}
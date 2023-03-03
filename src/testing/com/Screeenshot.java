	package testing.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screeenshot {
public static void main(String[] args) throws IOException {
System.setProperty("Webdriver.chrome.driver","D:\\TRB\\Selenium_Interv_Pract\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/doodles");

driver.manage().window().maximize();
TakesScreenshot ts=(TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\TRB\\Selenium_Interv_Pract\\Screenshot\\ defect.png");
FileUtils.copyFile(source,dest);


}
}

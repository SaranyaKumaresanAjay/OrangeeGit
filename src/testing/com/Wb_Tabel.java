package testing.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Wb_Tabel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\TRB\\Selenium2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		System.err.println(">>>>>>>>>>>>>>All Data>>>>>>>>>>>>>");

		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement data : alldata) {
			System.out.println(data.getText());

		}
		System.out.println("<<<<<<<<<<<<<<<particular row..>>>>>>>>>>>");
		List<WebElement> onerow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for (WebElement data1 : onerow) {
			System.out.println(data1.getText());
		}

		System.out.println("<<<<<<<<<<<<<<<<<perdata>>>>>>>>>>>>>>>");
		List<WebElement> onedata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]"));

		for (WebElement data2 : onedata) {
			System.out.println(data2.getText());
		}

	}
}



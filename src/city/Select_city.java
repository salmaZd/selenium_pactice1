package city;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_city {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		String citty = "Amman";
		
		driver.get("http://www.booking.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ss']")).sendKeys(citty);
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();

	}

}

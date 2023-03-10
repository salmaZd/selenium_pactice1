import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking_signup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		String myEmail = "alzubaidisalma6@gmail.com";
		String myPass = "Rayan13579";
		driver.get("http://www.booking.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='bui-button bui-button--secondary js-header-login-link']//span[@class='bui-button__text'][normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(myEmail);
		driver.findElement(By.xpath("//span[normalize-space()='Continue with email']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("new_password")).sendKeys(myPass);
		driver.findElement(By.name("confirmed_password")).sendKeys(myPass);
		driver.findElement(By.xpath("//span[@class='yfCvx60qsR50VNBG15jF']")).click();

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_LoginToFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
//		driver.findElement(By.linkText("Forgot account?")).click();
//		driver.findElement(By.id("identify_email")).sendKeys("denizlierdem@gmail.com");
//		driver.findElement(By.id("did_submit")).click();
		//driver.quit();
		
		driver.findElement(By.id("email")).sendKeys("abc@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("u_0_2")).click();
		

	}

}

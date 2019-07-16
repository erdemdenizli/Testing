import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10_LoginByCss {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
	WebDriver driver1 = new ChromeDriver();
	
	driver1.get("https://www.facebook.com/");
	driver1.findElement(By.cssSelector("#email")).sendKeys("erdem");

	
}

}

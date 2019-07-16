import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _29_ActionClass2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		
		a.keyDown(Keys.SHIFT).sendKeys("erdem").doubleClick().build().perform();
		
		//a.keyDown(Keys.SHIFT).sendKeys("12345").build().perform();//will send !@#$%
		//(new Actions(driver)).keyDown(Keys.SHIFT).sendKeys("ERDEM").build().perform();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ERDEM");
		
	}

}

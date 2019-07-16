import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _16_AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		WebElement from = driver.findElement(By.id(("fromCity")));
		from.sendKeys("MUM");
		Thread.sleep(2000);
		
		WebElement from2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		from2.sendKeys(Keys.ARROW_DOWN);
		from2.sendKeys(Keys.ENTER);
		
		
		
		//WebElement destination = driver.findElement(By.id(("toCity")));
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
	}

}

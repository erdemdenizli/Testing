import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _21_CalendarUI {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		WebElement from = driver.findElement(By.id(("ctl00_mainContent_ddl_originStation1_CTXT")));
		from.sendKeys("MUM");
		Thread.sleep(2000);
		
//		WebElement from2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
//		from2.sendKeys(Keys.ARROW_DOWN);
//		from2.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.id(("ctl00_mainContent_ddl_destinationStation1_CTXT")));
		//WebElement destination2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		
//		destination2.sendKeys(Keys.ARROW_DOWN);
//		destination2.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
	}

}

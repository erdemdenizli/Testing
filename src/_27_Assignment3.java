import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _27_Assignment3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//*[@id=\"content\"]/a[2]")).click();
		
		WebDriverWait d = new WebDriverWait(driver, 10);
		
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"results\"]")));
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"results\"]")).getText());
	
	}

}

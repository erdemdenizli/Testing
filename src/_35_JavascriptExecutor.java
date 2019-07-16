import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _35_JavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//String script = (String) js.executeScript("return document.getElementById(\"fromPlaceName\").value;");
		
		for(;;) {
			String script = (String) js.executeScript("return document.getElementById(\"fromPlaceName\").value;");
			if(script.equals("BENGALURU DARSHINI")) {
				break;
			}
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			System.out.println(js.executeScript("return document.getElementById(\"fromPlaceName\").value;"));
		}
		
		
		
		
		
	}

}

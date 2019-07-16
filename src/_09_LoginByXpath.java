import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _09_LoginByXpath {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		
		System.setProperty("webdriver.gecko.driver", "/Users/erdemdenizli/documents/Selenium/drivers/geckodriver");
		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("https://www.facebook.com/");
		driver2.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
	}

}

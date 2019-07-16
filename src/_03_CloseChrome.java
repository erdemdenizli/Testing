import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class _03_CloseChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=EzKImzjwGyM");
		System.out.println(driver.getTitle());
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.youtube.com/watch?v=EzKImzjwGyM")) {
			WebDriver driver2 = new ChromeDriver();
			driver2.get("https://projecteuler.net/archives");
			System.out.println(driver2.getTitle());
		}
		driver.close();
	}

}

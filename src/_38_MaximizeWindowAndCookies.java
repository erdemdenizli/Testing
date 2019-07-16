import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class _38_MaximizeWindowAndCookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("erdem");
		
		driver.get("http://google.com");

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _14_StaticDropDowns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.kayak.com/");
		Select s1 = new Select(driver.findElement(By.className("Common-Widgets-Select-StyleJamSelect ")));
		s1.deselectByIndex(2);
		//throws exception because tagname is "div" not "select", Select works with select tagname only
		
	}

}

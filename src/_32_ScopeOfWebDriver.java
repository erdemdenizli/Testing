import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _32_ScopeOfWebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement column = footer.findElement(By.tagName("ul"));
		
		System.out.println(column.findElements(By.tagName("a")).size());
		
		System.out.println(driver.getTitle());
		
		for(int i=0; i<column.findElements(By.tagName("a")).size(); i++) {
			
			String clickLink = Keys.chord(Keys.COMMAND, Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
			Thread.sleep(4000);
			
		}
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}

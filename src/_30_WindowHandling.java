import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _30_WindowHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		
		driver.findElement(By.xpath("//a[@class='h-c-footer__link']")).click();
		
		System.out.println(driver.getTitle());
		
		Set<String> ids = driver.getWindowHandles();
		
		Iterator<String> it = ids.iterator();
		
		String parentid = it.next();
		String childid = it.next();
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}

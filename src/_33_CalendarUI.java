import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _33_CalendarUI {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		//Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) {
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
		}
		
		
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		//driver.findElement(By.xpath("//div[@class='sumome-react-svg-image-container']/svg")).click();
		
		for(int i=0; i<dates.size(); i++) {
			if(dates.get(i).getText().equalsIgnoreCase("23")) {
				dates.get(i).click();
				break;
			}
		}
	}

}

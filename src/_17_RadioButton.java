import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _17_RadioButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.echoecho.com/htmlforms10.htm");

		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(list.size());
		
		System.out.println("***************");
		
		List<WebElement> list2 = driver.findElements(By.xpath("//input[@name='group1']"));
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i).getAttribute("value"));
		}
		
		System.out.println("***************");
		
		List<WebElement> list3 = driver.findElements(By.xpath("//td[@class='table5']//input[@type='radio']"));
		
		for(int i=0; i<list3.size(); i++) {
			System.out.println(list3.get(i).getAttribute("value"));
		}
		
		System.out.println("***************");
		
		List<WebElement> list4 = driver.findElements(By.xpath("//td[@class='table5']//input[@type='radio']"));
		
		for(int i=0; i<list3.size(); i++) {
			if(list3.get(i).getAttribute("value").equalsIgnoreCase("Water")) list3.get(i).click();
		}
		
		driver.quit();

	}

}

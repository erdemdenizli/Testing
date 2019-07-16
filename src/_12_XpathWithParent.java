import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _12_XpathWithParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.google.com/");
		//driver1.findElement(By.xpath("//div[@id='searchform']/form/div[2]/div[1]/div[1]/div[1]/div[1]/input")).sendKeys("erdem");
		//driver1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("erdem");
		driver1.findElement(By.xpath("//input[@name='q']")).sendKeys("erdem");

	}

}

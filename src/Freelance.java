import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Freelance {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qa2.vytrack.com/user/login");
		
		WebElement userName= driver.findElement(By.id("prependedInput"));
        WebElement password= driver.findElement(By.id("prependedInput2"));
        WebElement loginButton= driver.findElement(By.id("_submit"));

        userName.sendKeys("user7");
        password.sendKeys("UserUser123");
        loginButton.submit();
        
        Thread.sleep(6000);
        
        WebElement dropdown=driver.findElement(By.cssSelector("[class='dropdown user-menu-dropdown'] a"));
        WebElement logout= driver.findElement(By.xpath("//a[@class='no-hash']"));
        
        dropdown.click();
        logout.click();
        
        //waitMethod(2);

        
      
		
		

	}

}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _36_TableGrids {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/erdemdenizli/documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20250/ind-vs-aus-match-14-icc-cricket-world-cup-2019");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		System.out.println(rowCount);
		
		List<WebElement> thirdCol = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		
		System.out.println(thirdCol.size());
		
		int sum = 0;
		
		for(int i=0; i<thirdCol.size()-2; i++) {
			System.out.println(thirdCol.get(i).getText());
			sum += Integer.parseInt(thirdCol.get(i).getText());
		}
		
		WebElement extrasRow = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).get(rowCount-3);
		String extrasColumn = extrasRow.findElement(By.cssSelector("div:nth-child(2)")).getText();
		
		sum += Integer.parseInt(extrasColumn);
		
		System.out.println(sum);
		
		//WebElement totalRow = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).get(rowCount-2);
		//String totalColumn = totalRow.findElement(By.cssSelector("div:nth-child(2)")).getText();
		String totalColumn = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		
		if(sum == Integer.parseInt(totalColumn)) System.out.println("true");
		
	}

}

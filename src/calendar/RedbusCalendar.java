package calendar;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusCalendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
		Thread.sleep(3000);
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
		int date_node = dates.size();
		for(int i=0;i<date_node;i++){
			String date = dates.get(i).getText();
			if(date.equalsIgnoreCase("30")){
				dates.get(i).click();
				break;
			}
		}
		driver.quit();
	}

}

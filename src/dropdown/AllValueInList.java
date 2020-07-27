package dropdown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AllValueInList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\sanju_Programs\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//drop-down using List
//		List<WebElement> allDay = driver.findElements(By.id("day"));
//		System.out.println("Size of List : "+allDay.size());
//		
//		for(int i=0;i<allDay.size();i++){
//			String Day = allDay.get(i).getText();
//			System.out.println(Day);
//			if(Day.equals("28")){
//				allDay.get(i).click();
//				Thread.sleep(5000);
//				break;
//			
//			}
//		}
		
		WebElement day = driver.findElement(By.id("day"));
		//creating object for select class
		Select ss = new Select(day);
		List<WebElement> allDay = ss.getOptions();
		System.out.println(" All Day : "+allDay.size());
		for(int i =0;i<allDay.size();i++){
		String txt = allDay.get(i).getText();
		System.out.println(txt);
		if(txt.equals("28")){
			allDay.get(i).click();
			System.out.println("Day 28 clicked");
		}
		}
		driver.quit();
	}

}

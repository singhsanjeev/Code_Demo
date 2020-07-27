package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//drop-down using select class
		WebElement day = driver.findElement(By.id("day"));
		//creating object for select class
		Select ss = new Select(day);
		//select by index
		ss.selectByIndex(2);
		Thread.sleep(2000);
		//select by value
		ss.selectByValue("4");
		System.out.println("value of attribute : "+day.getAttribute("value"));
		Thread.sleep(2000);
		ss.selectByVisibleText("Day");
		Thread.sleep(2000);
		ss.selectByVisibleText("4");
		Thread.sleep(2000);
		driver.quit();
		
	}

}

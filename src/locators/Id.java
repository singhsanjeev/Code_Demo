package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//=========ID============
		WebElement Uname = driver.findElement(By.id("email"));
		Uname.sendKeys("sanjeev");
		//=========class name======
		driver.findElement(By.name("pass")).sendKeys("sa9ju");
		driver.findElement(By.id("loginbutton")).click();
		driver.quit();

	}

}

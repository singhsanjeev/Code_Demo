package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//=====Link Text
		//driver.findElement(By.linkText("Data Policy")).click();
		//=====Partial Link Text
				driver.findElement(By.partialLinkText("Data")).click();
		Thread.sleep(3000);
		//driver.close(); //closes the parent window
		driver.quit();//closes all the open window

	}

}

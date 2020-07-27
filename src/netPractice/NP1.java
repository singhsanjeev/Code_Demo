package netPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NP1 {

	public static void main(String[] args) {
		//==========Launching the chrome browser===============//
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Fetching the URL
		driver.get("https://www.facebook.com");
		
		//==================Launching the Firefox ====================//
//		System.setProperty("webdriver.gecko.driver", "D:\\sanju_Programs\\drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		//Fetching the URL
//		driver.get("https://www.google.com");
		driver.quit();

	}

}

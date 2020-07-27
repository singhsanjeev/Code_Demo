package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//navigate().to()
		driver.navigate().to("https://www.google.com");
		System.out.println("navigate().to() success");
		driver.findElement(By.linkText("Images")).click();
		//navigate().back()
		driver.navigate().back();
		System.out.println("navigate().back() success");
		//navigate().forward()
		driver.navigate().forward();
		System.out.println("navigate().forward() success");
		//navigate().refresh()
		driver.navigate().refresh();
		System.out.println("navigate().refresh() success");
		driver.quit();

	}

}

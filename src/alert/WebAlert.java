package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
		String alertMesg = driver.switchTo().alert().getText();
		System.out.println(alertMesg);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.id("fromPlaceName")).click();
		Thread.sleep(3000);
	}

}

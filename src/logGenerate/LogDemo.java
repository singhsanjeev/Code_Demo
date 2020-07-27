package logGenerate;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {

	public static void main(String[] args) throws InterruptedException {
		//setting logger 
		Logger logger = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		logger.info("Opened KSRTC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
		logger.info("Search button clicked");
		String alertMesg = driver.switchTo().alert().getText();
		System.out.println(alertMesg);
		driver.switchTo().alert().accept();
		logger.info("alert accepted");
		Thread.sleep(3000);
		driver.findElement(By.id("fromPlaceName")).click();
		Thread.sleep(3000);

	}

}

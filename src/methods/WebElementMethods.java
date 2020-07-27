package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\sanju_Programs\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//Clear Method
		driver.findElement(By.cssSelector("input#email")).sendKeys("abababa");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='email']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//isEnabled Method
		boolean checkStatus = driver.findElement(By.xpath("//label[contains(text(),'Female')]/../input")).isEnabled();
		System.out.println("Button is enabled : "+checkStatus);
		//isSelected
		driver.findElement(By.xpath("//label[contains(text(),'Female')]/../input")).click();
		boolean checkSelected = driver.findElement(By.xpath("//label[contains(text(),'Female')]/../input")).isSelected();
		System.out.println("Button is selected : "+checkSelected);
		//isDisplayed Method
		boolean checkDisplayed = driver.findElement(By.name("websubmit")).isDisplayed();
		System.out.println("Signup button is displayed : "+checkDisplayed);
		
		driver.quit();
		
		
	}

}

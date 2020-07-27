package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.linkText("Terms"));
		Actions a = new Actions(driver);
		//=========Using MoveToElement============
		//a.moveToElement(e).click().build().perform();;
		Thread.sleep(2000);
		
		
		//=========Using moveByOffset(this can be used only when element is visible in frame)=============
		int x = e.getLocation().getX();
		int y = e.getLocation().getY();
		System.out.println("X Cord : "+x +" Y cord : "+y);
		a.moveByOffset(x,y).build().perform();
		Thread.sleep(2000);
		driver.quit();
		

	}

}

package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("7353308196");
		WebElement pass = driver.findElement(By.name("password"));
		//Ctrl + A + C --> Ctrl + V
		act.click(uname)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.click(pass)
		.keyDown(Keys.CONTROL)
		.sendKeys("v")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Show')]")).click();
		Thread.sleep(3000);
		System.out.println("Performed keyboard button press");
		driver.close();
	}

}

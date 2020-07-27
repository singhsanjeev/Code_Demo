package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement we = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we);
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement des = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, des).build().perform();
		System.out.println("Performed drag and drop");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();
		driver.close();

	}

}

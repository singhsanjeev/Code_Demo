package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	 static WebDriver driver = null;
	 
	 public void login() throws InterruptedException{
		 driver.findElement(By.name("username")).sendKeys("7353308195");
		 Thread.sleep(1000);
		 driver.findElement(By.name("password")).sendKeys("15Sanjeev@22");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[contains(text(),'Log In')]")).click();
		 Thread.sleep(2000);
	 }
	 public void homePage() throws InterruptedException{
		 //JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(5000);
	  driver.findElement(By.className("Fifk5")).click();
//	  Thread.sleep(2000);
//	  WebElement button = driver.findElement(By.xpath("//img[@alt='Instagram']"));
//	  js.executeScript("arguments[0].click();", button);
	  Thread.sleep(2000);
	  WebElement btm = driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
	  boolean a1 = btm.isDisplayed();
	  boolean b = true;
	  int c = Boolean.compare(a1, b);
	  if(c == 0){
		btm.click();  
	  }
	  Thread.sleep(2000);
	  WebElement e = driver.findElement(By.xpath("//article[1]/div[2]/div[1]/div[1]/div[2]"));
	  Actions a = new Actions(driver);
	  a.moveToElement(e).doubleClick().build().perform();
	  //a.doubleClick(e).build().perform();
	  Thread.sleep(5000);
	  System.out.println("Liked the image");
	 }
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		DoubleClick dc = new DoubleClick();
		dc.login();
		dc.homePage();
		driver.close();
		

	}

}

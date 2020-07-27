package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//get() Method
		driver.get("https://www.facebook.com/");
		//get current URL Method
		System.out.println("Current URL : "+driver.getCurrentUrl());
		//get Title Method
		System.out.println("Fetching the title : "+driver.getTitle());
		//get Text Method
		String text = driver.findElement(By.xpath("//label[contains(text(),'Email or phone')]")).getText();
		System.out.println("Text fetched : "+text);
		//get TagName Method
		String tagname = driver.findElement(By.xpath("//label[contains(text(),'Email or phone')]")).getTagName();
		System.out.println("Tagname = "+tagname);
		//get CSS Method
		String cssvalue1 = driver.findElement(By.xpath("//label[contains(text(),'Email or phone')]")).getCssValue("font-size");
		System.out.println(" CSS Value = "+cssvalue1);
		String cssvalue2 = driver.findElement(By.xpath("//label[contains(text(),'Email or phone')]")).getCssValue("color");
		System.out.println(" CSS Value = "+cssvalue2);
		//get Attribute Method
		WebElement Attribute = driver.findElement(By.name("firstname"));
		String attributevalue = Attribute.getAttribute("name");
		System.out.println(" Attribute value : "+attributevalue);
		//Submit Method
		driver.findElement(By.name("websubmit")).submit();
		System.out.println("Checked Submit Method");
		//get PageSource Method
		String str = driver.getPageSource();
		System.out.println("Page Source : "+str);
		//Quit Method
		driver.quit();
		

	}

}

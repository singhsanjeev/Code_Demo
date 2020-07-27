package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSecondApproach {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sanju_Programs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trivago.in/");
		Thread.sleep(3000);
		//Selecting date
		String dateToSelect = "22-july-2020";
		String dateArr[] = dateToSelect.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		System.out.println("Day : "+day + " "+ "Month : "+month +" "+ "Year : "+year);
		//Entering into action
		driver.findElement(By.xpath("//span[@class='icon-ic dealform-button__icon']")).click();
		Thread.sleep(5000);
		//table[@class='cal-month']//tbody/tr[5]/td[5]
		String beforeXpath = "//table[@class='cal-month']//tbody/tr[";
		String afterXpath = "]/td[";
		//selecting date from calendar
		for(int i=1;i<=6;i++){
			for(int j=1;j<=7;j++){
				String matchDate = driver.findElement(By.xpath(beforeXpath+i+afterXpath+j+"]")).getText();
				if(matchDate.equalsIgnoreCase(day)){
					driver.findElement(By.xpath(beforeXpath+i+afterXpath+j+"]")).click();
					break;
				}
			}
		}
		Thread.sleep(5000);
		driver.quit();
		
	}

}

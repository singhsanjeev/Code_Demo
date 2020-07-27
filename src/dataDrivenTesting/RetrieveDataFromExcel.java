package dataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RetrieveDataFromExcel {
	static WebDriver driver = null;
	
	public void getExcelData() throws BiffException, IOException
	{
		Workbook wb = Workbook.getWorkbook(new File("D:\\sanju_Programs\\Book1.xls"));
		Sheet sh = wb.getSheet(0);
		for(int row = 1; row < sh.getRows(); row++)
		{
			for(int col = 1; col < sh.getRows(); col++){
				String username = sh.getCell(col,row).getContents();
				System.out.println(username);
				String password = sh.getCell(col,row).getContents();
				System.out.println(password);
			}
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\sanju_Programs\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

}

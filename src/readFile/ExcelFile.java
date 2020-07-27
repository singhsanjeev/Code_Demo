package readFile;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFile {

	public static void main(String[] args) throws BiffException, IOException {
		//Goto Workbook --> Sheet --> Row & Table
		Workbook wb = Workbook.getWorkbook(new File("D:\\sanju_Programs\\Book1.xls"));
		//Sheet sh = wb.getSheet(0);
		Sheet sh1 = wb.getSheet("abc");
		for(int i = 0 ; i < sh1.getRows() ; i++)
		{
			System.out.println("User name : "+sh1.getCell(0,i).getContents());
			System.out.println("password : "+sh1.getCell(1,i).getContents());
		}

	}

}

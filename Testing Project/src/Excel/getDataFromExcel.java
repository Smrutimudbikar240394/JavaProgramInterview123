package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getDataFromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData.xlsx");
		
		//Workbook book=WorkbookFactory.create(file);
		//Sheet sh=book.getSheet("Sheet2");
		//Row rw=sh.getRow(0);
		//Cell c=rw.getCell(1);
		
		//String value=c.getStringCellValue();
		//System.out.println(value);
		
		
		String value2 = WorkbookFactory.create(file).getSheet("Sheet2").getRow(5).getCell(0).getStringCellValue();
		System.out.println(value2);
		
		
		
	}

}

package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getBooleanData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
		boolean value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		
		System.out.println(value);
		
		
		
	}

}

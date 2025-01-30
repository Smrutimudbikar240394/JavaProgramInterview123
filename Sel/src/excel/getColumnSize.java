package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getColumnSize 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
		int columnsize=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(columnsize);
	}

}

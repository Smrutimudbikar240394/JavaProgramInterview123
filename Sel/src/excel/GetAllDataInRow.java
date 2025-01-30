package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataInRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
		Sheet s1=WorkbookFactory.create(file).getSheet("Sheet1");
		int colsize=s1.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=colsize;i++)
		{
			String value=s1.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		
	}

}

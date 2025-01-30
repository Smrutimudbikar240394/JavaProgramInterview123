package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataInSheet 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
		Sheet s1=WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastrowsize=s1.getLastRowNum();
		
		for(int i=0;i<=lastrowsize;i++)
		{
			int lastcolsize=s1.getRow(i).getLastCellNum();
			
			for(int j=0;j<=lastcolsize;j++)
			{
				String value=s1.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
		
}
}

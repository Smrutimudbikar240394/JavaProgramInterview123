package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllColumnData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
		Sheet s1=WorkbookFactory.create(file).getSheet("Sheet1");
		
		int sizerow=s1.getLastRowNum();
		for(int i=0;i<=sizerow;i++)
		{
			String value=s1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		
		
	}

}

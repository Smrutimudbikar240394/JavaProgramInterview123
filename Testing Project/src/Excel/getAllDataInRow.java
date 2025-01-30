package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInRow 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
	
		int colsize=sh.getRow(0).getLastCellNum()-1;
		System.out.println(colsize);
		
		
		for(int i=0;i<=colsize;i++)
		{
			String value=sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
	}
}

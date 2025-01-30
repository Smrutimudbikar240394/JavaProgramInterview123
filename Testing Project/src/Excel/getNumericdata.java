package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericdata 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData.xlsx");
		
		double numericvalue=WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(1).getNumericCellValue();
		
		System.out.println(numericvalue);
	}

}

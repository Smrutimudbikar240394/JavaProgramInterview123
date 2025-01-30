package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getIntegerData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
		double value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(value);
	}

}

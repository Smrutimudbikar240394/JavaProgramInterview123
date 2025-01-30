package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getRowSizeInSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData.xlsx");
		int rowSize=WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum()+1;
		
		System.out.println(rowSize);
		
	}

}

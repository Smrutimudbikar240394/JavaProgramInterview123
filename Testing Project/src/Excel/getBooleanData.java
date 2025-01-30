package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getBooleanData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData.xlsx");
		
		Boolean bvalue=WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getCell(1).getBooleanCellValue();
		System.out.println(bvalue);
		
	}

}

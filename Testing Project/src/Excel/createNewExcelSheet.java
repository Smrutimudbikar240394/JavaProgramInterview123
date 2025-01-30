package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class createNewExcelSheet 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData.xlsx");
		
		Workbook book=WorkbookFactory.create(file);
	
		Sheet sh=book.getSheet("Sheet2");
		
		Row row = sh.createRow(0);
		row.createCell(4).setCellValue("Data");

		FileOutputStream fileOut = new FileOutputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData1.xlsx");
		book.write(fileOut);
		fileOut.close();
		
	}


}

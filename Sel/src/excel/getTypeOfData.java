package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getTypeOfData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	

	FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
	Sheet s1=WorkbookFactory.create(file).getSheet("Sheet1");
	
	CellType celltype1 = s1.getRow(1).getCell(0).getCellType();
	System.out.println(celltype1);
	
}
	
}

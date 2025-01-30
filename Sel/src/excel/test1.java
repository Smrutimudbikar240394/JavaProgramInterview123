package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		Cell cell1=sh.getRow(0).getCell(0);
		int rowSize=sh.getLastRowNum()-sh.getFirstRowNum()+1;
		System.out.println("rowsie="+rowSize);
		int colsize=sh.getRow(0).getLastCellNum();
		System.out.println("Column size="+colsize);
		
		CellType type=cell1.getCellType();
		
		if(type==CellType.STRING)
		{
			System.out.println(cell1.getRichStringCellValue());
			
		}
		else if(type==CellType.NUMERIC)
		{
			System.out.println(cell1.getNumericCellValue());
		}
		else if(type==CellType.BOOLEAN)
		{
			System.out.println(cell1.getBooleanCellValue());
		}
			
		
	}

}

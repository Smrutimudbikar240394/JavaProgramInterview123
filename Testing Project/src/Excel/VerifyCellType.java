package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyCellType 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
	
		CellType ct=sh.getRow(0).getCell(1).getCellType();
		
		if(ct==CellType.STRING)
		{
			String value=sh.getRow(0).getCell(1).getStringCellValue();
			System.out.println(value);
		}
		else if(ct==CellType.NUMERIC)
		{
			double value=sh.getRow(0).getCell(1).getNumericCellValue();
			System.out.println(value);
		}
		else if(ct==CellType.BOOLEAN)
		{
			boolean value=sh.getRow(0).getCell(1).getBooleanCellValue();
			System.out.println(value);
		}
		
	}	

}

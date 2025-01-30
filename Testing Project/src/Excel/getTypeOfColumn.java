package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.CellType;




public class getTypeOfColumn 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		
	
		Cell s1=sh.getRow(0).getCell(0);
		CellType type=s1.getCellType();
		System.out.println(type);
		
		CellType ct=sh.getRow(0).getCell(1).getCellType();
		System.out.println(ct);
		
		
		
		
	}
	

}

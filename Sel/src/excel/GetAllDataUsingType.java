package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataUsingType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		int rowsize=sh.getLastRowNum();
		
		//row
		for(int i=0;i<=rowsize;i++)
		{
			int colsize=sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=colsize;j++)
			{
			  Cell c1=sh.getRow(i).getCell(j);
			  CellType type=c1.getCellType();
			  if(type==CellType.STRING)
				{
					System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
				}
				
				else if(type==CellType.NUMERIC)
				{
					System.out.println(sh.getRow(i).getCell(j).getNumericCellValue());
				}
				else if(type==CellType.BOOLEAN)
				{
					System.out.println(sh.getRow(i).getCell(j).getBooleanCellValue());
				}
			}
		}
		
	}

}

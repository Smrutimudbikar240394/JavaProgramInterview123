package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellBase;
import org.apache.poi.ss.usermodel.CellRange;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class VerifygetAllDataInSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastRowIndex=sh.getLastRowNum();
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			int lastcolIndex=sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0;j<=lastcolIndex;j++)
			{
				Cell c=sh.getRow(i).getCell(j);
				CellType ct=c.getCellType();
				
				if(ct==CellType.STRING)
				{
					System.out.println(c.getStringCellValue()+" ");
				}
				else if(ct==CellType.NUMERIC)
				{
					
					System.out.println(c.getNumericCellValue());
				}
				else if(ct==CellType.BOOLEAN)
				{
					System.out.println(c.getBooleanCellValue());
				}
				
				
			}
		}
	
		
	}	

}

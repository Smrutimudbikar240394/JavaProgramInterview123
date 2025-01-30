package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FindSpecificValue 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\excelSheet\\saucedemoData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		int lastRowIndex=sh.getLastRowNum();
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			int lastColIndex=sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0;j<=lastColIndex;j++)
			{
				String value=sh.getRow(i).getCell(j).getStringCellValue();
				//System.out.print(value+" ");
				if(value.equals("standard_user"))
				{
					System.out.println("found value:                     "+value);
				}
			}
			System.out.println();
		}
	
	}
	

}

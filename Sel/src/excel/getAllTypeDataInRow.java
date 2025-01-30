package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class getAllTypeDataInRow {
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException
		{
			FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
			Sheet s1=WorkbookFactory.create(file).getSheet("Sheet1");
			int colsize=s1.getRow(0).getLastCellNum()-1;
			
			for(int i=0;i<=colsize;i++)
			{
				//String value=s1.getRow(0).getCell(i).getStringCellValue();
				//System.out.println(value);
			CellType type = s1.getRow(0).getCell(i).getCellType();
			if(type==CellType.STRING)
			{
				System.out.println(s1.getRow(0).getCell(i).getStringCellValue());
			}
			
			else if(type==CellType.NUMERIC)
			{
				System.out.println(s1.getRow(0).getCell(i).getNumericCellValue());
			}
			else if(type==CellType.BOOLEAN)
			{
				System.out.println(s1.getRow(0).getCell(i).getBooleanCellValue());
			}
			
		}

	}


}

package Libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//excel
	public static String getTD(int rowIndex,int colIndex) throws Exception
	{
		FileInputStream file=new FileInputStream("");
		Sheet sh=WorkbookFactory.create(file).getSheet("");
		String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
		return value;
		
	}
	
	//screenshot
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("");
		FileHandler.copy(src,dest);
	}
	
	//property file Data
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("");
		
		Properties p=new Properties();
		p.load(file);
		String value=p.getProperty(key);
		
		
		return value;
	}
	

}

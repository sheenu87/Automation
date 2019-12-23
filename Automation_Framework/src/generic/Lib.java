package generic;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib implements IAutoConstant{

static public String getConfig(String CONFIG_FILE,String key) throws Exception 
	{
		String value="";
		Properties prop=new Properties();	
		FileInputStream f=new FileInputStream(CONFIG_FILE);
		prop.load(f);
		value=prop.getProperty(key);
		return value;
		
	}	

static public String getCellValue(String EXCEL_FILE,String SheetName, int row, int col) throws Exception, InvalidFormatException, IOException
{
	String val="";	
	Workbook wb=WorkbookFactory.create(new FileInputStream(EXCEL_FILE));
	val=wb.getSheet(SheetName).getRow(row).getCell(col).toString();
	return val;
}

}

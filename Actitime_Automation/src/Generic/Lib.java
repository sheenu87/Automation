package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Lib implements IAutoConstant{

	public static String propValue(String CONFIG_PATH,String key) throws Exception
	{
		String val="";
		FileInputStream file;
		file = new FileInputStream(CONFIG_PATH);		
		Properties prop=new Properties();
		prop.load(file);
		val=prop.getProperty(key);
		
		return val;
	}
}

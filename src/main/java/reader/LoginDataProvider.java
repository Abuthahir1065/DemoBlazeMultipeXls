package reader;

import java.io.IOException;

import org.testng.annotations.DataProvider;



import constant.Constant;

public class LoginDataProvider {

  @DataProvider(name="Login")
   public static Object[][] getData() throws IOException
   {
		XlsReader xls=new XlsReader(Constant.LOGIN_DATA_PATH);
		Object[][] data=xls.readExcelData("LoginSheet");
		return data;
		
   }
}

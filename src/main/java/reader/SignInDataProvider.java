package reader;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import constant.Constant;

public class SignInDataProvider {
	

	  @DataProvider(name="SignIn")
	   public static Object[][] getData() throws IOException
	   {
			XlsReader xls=new XlsReader(Constant.SIGNIN_DATA_PATH);
			Object[][] data=xls.readExcelData("SignInSheet");
			return data;
			
	   }
	}



package DataDrivenFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcellDataProvider {
	@Test(dataProvider="mytestdata")
	public void testData(String username,String password)
	{
		System.out.println(username+"     "+password);
	}
	

	@DataProvider(name="mytestdata")
	public Object[][] getData()
	{
		String pa = System.getProperty("user.dir");
		Object [][] data=readData(pa + "/Excel/data.xlsx" ,"sheet1");
		return data;
	}
	
public Object[][] readData(String excelpath,String sheetname)
{

	utils ut=new utils(excelpath, sheetname);
	
int  rowcount=ut.getRowCount();
int  column_count=ut.getcolumnCount();


Object[][] data=new Object[rowcount][column_count];

for (int i = 0; i < rowcount; i++) {
	
	for (int j = 0; j < column_count; j++) {
	
	data[i][j]=ut.getCellvalue(i, j);
	}
    

}
return data;
}
}
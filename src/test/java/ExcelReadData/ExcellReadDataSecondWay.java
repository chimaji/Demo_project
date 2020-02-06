package ExcelReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReadDataSecondWay {

	public static void main(String[] args) throws Exception {
		File source =new File("E:\\java_program\\sanidhyademo\\Excel\\data.xlsx");
		FileInputStream fis=new FileInputStream(source);
		XSSFWorkbook book =new XSSFWorkbook(fis);
		 XSSFSheet sheet=book.getSheetAt(0);
         int rowcount =sheet.getLastRowNum();	
         System.out.println("total no of rows="+rowcount+1);
         for(int i=0;i<rowcount;i++)
         {
     String rowdata=sheet.getRow(i).getCell(1).getStringCellValue();
         System.out.println(rowdata);
         }
		 
		 
		 
		
	}

}

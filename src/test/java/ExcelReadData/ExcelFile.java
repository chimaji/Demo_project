package ExcelReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {

	public static void main(String[] args) throws Exception {
		
		File src=new File("E:\\java_program\\sanidhyademo\\Excel\\data.xlsx");
	
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet =wb.getSheetAt(0);
		String sheet1 =sheet.getRow(1).getCell(1).getStringCellValue();
		String sheet2 =sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(sheet1);

		System.out.println(sheet2);
        wb.close();
	
	}

}

package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo112 {
	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public Demo112(String excelpath, String sheetname) {
		try {
			String path = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getrowcount() {
		return sheet.getPhysicalNumberOfRows();
	}

	public int getcoloumncount() {
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}

	public String getcelldatavalue(int rownum, int coloumnnum) {
		return sheet.getRow(rownum).getCell(coloumnnum).getStringCellValue();
	}
}

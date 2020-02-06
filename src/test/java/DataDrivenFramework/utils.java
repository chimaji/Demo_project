package DataDrivenFramework;

//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public utils(String excelpath, String sheetname) {
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getcolumnCount() {

		return sheet.getRow(0).getPhysicalNumberOfCells();
	}
	
	public int getRowCount() {

		return sheet.getPhysicalNumberOfRows();
	}

	public String getCellvalue(int rownum, int cellnum) {
		return sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
	}
}
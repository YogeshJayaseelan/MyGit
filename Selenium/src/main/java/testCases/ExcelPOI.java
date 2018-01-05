package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPOI {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File excel = new File("E:\\Workspace\\Selenium\\Data\\CreateLead.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell=row.getCell(0);
//		System.out.println(cell);
		int rowCount = sheet.getLastRowNum();
		int columnCount =sheet.getRow(0).getLastCellNum();
		for(int i=1; i<=rowCount;i++){
			XSSFRow row1= sheet.getRow(i);
			for(int j=0;j<columnCount;j++){
//				int cellcount = sheet.getRow(0).getLastCellNum();
			XSSFCell cell1=row1.getCell(j)	;
			String cellvalue=cell1.getStringCellValue();
			System.out.println(cellvalue);
			
			
		}
		

	}

	}	}

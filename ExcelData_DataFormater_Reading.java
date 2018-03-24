package westpac_pac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData_DataFormater_Reading {
  @Test
  public void f() throws IOException {
	  
	  
	  DataFormatter df = new DataFormatter();
	  FileInputStream fs = new FileInputStream("Excel_sheet/Book1.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fs);
	  XSSFSheet s = wb.getSheet("Sheet1");
//	  XSSFSheet s = wb.getSheetAt(0); // always start with 0
	  XSSFCell r = s.getRow(3).getCell(8);            //row n column mergred
	  String k = df.formatCellValue(r);
	  System.out.println("value is "+k);
	  wb.close();
	  fs.close();
	  
	  
//	  or
	  
	  DataFormatter df = new DataFormatter();
	  FileInputStream fs = new FileInputStream("Excel_sheet/Book1.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fs);
	  XSSFSheet s = wb.getSheet("Sheet1");
	  XSSFRow r = s.getRow(1);
	  String k = df.formatCellValue(r.getCell(8));        // row n column splited
	  System.out.println("value is "+k);
	  wb.close();
	  fs.close();
	  
  }
}

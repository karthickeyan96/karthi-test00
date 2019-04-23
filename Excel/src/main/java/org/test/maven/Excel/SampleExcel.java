package org.test.maven.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {
public static void main(String[] args) throws IOException {
	File lc=new File("C:\\Users\\Karthik\\Documents\\Book1.xlsx");
	FileInputStream stream=new FileInputStream(lc);
	Workbook wc=new XSSFWorkbook(stream);
	Sheet sheet = wc.getSheet("SOURCE");
	
	Row row = sheet.getRow(2);
	System.out.println(2);
	Cell cell = row.getCell(1);
	System.out.println(cell);	
	
}

}

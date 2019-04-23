package org.test.maven.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample2 {
	
	public static void main(String[] args) throws IOException {
		File lc=new File("C:\\Users\\Karthik\\Documents\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(lc);
		Workbook wc=new XSSFWorkbook(stream);
		Sheet S = wc.getSheet("SOURCE");
		for (int i = 0; i < S.getPhysicalNumberOfRows(); i++) {
			Row r = S.getRow(i);
			int count = r.getPhysicalNumberOfCells();
			System.out.println(count);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				//1=text 0-number
				int type = c.getCellType();
				if (type==1) {
					String name = c.getStringCellValue();
					System.out.println(name);
					if (type==0) {
						double d = c.getNumericCellValue();
						//d-l
						long l=(long)d;
						//l-s
						String name1 = String.valueOf(i);
						System.out.println(name1);
						System.out.println(l);
						
						
					}
					
				}
				
				
			}
				
			}
			
			
		}
			
		}

		
	

	



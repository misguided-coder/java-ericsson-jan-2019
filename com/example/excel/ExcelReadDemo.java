package com.example.excel;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadDemo {

	
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:/files/cars.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		System.out.println("Sheet Count : "+workbook.getNumberOfSheets());
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		System.out.println("Sheet Name : "+sheet.getSheetName());
		
		Iterator<Row> rowIterator = sheet.rowIterator();
		
		while(rowIterator.hasNext()) {
			Row currentRow = rowIterator.next();
			
			Iterator<Cell> cellIterator = currentRow.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				
				switch(cell.getCellTypeEnum()) {
				case STRING :
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				}
				
			}
			System.out.println();
		}
		
		
		
		workbook.close();
		fis.close();
		
		System.out.println("Done!!!!!");
		
	}
	
	
}

package com.example.excel;

import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {

	static Set<City> cities = new HashSet<>();
	
	public static void main(String[] args) throws Exception {
		
		cities.add(new City("Delhi",2300000));
		cities.add(new City("Pune",800000));
		cities.add(new City("Mumbai",99990000));
		cities.add(new City("Chennai",8300000));
			
		//createWorkbook();
		fillWorkbook();
		
		System.out.println("Done!!!!!");
		
	}
	
	
	private static void fillWorkbook() throws Exception {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("city_details");
		
		XSSFRow headerRow = sheet.createRow(0);
		
		XSSFCell cell0 = headerRow.createCell(0);
		cell0.setCellValue("CITY");
		
		XSSFCell cell1 = headerRow.createCell(1);
		cell1.setCellValue("POPULATION");
		
		int rowIndex = 1;
		
		for(City city : cities) {
			
			XSSFRow row = sheet.createRow(rowIndex);
			rowIndex++;
			
			cell0 = row.createCell(0);
			cell0.setCellValue(city.getTitle());
			
			cell1 = row.createCell(1);
			cell1.setCellValue(city.getPopulation());
		}
				
		FileOutputStream fos = new FileOutputStream("C:/files/cities.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
	}

	private static void createWorkbook() throws Exception {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("city_details");
		
		FileOutputStream fos = new FileOutputStream("C:/files/cities.xlsx");
		
		workbook.write(fos);
		
		workbook.close();
		
		fos.close();
	}
}

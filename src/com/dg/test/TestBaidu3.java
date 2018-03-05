package com.dg.test;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	

	

public class TestBaidu3 {

	public static void main(String[] args) throws Exception {

		 InputStream inp = new FileInputStream("f:\\宝安.xlsx");
		    //InputStream inp = new FileInputStream("workbook.xlsx");

		    Workbook wb = WorkbookFactory.create(inp);
		    Sheet sheet = wb.getSheetAt(0);
		    for(int i=1;i<498;i++){
		    	  
			    Row row = sheet.getRow(i); 
			    if(row == null){
			    	continue;
			    }
			    Cell cell = row.getCell(0);
			    if (cell == null)
			        cell = row.createCell(0);
			    cell.setCellType(CellType.STRING);
			    String name = cell.getStringCellValue();
			    System.out.println("-------------------"+name+i);
			    
			    cell = row.getCell(1);
			    if (cell == null)
			        cell = row.createCell(1);
			    cell.setCellType(CellType.STRING);
			    String tel = cell.getStringCellValue();
			    System.out.println("-------------------"+tel+i);
			    
			    cell = row.getCell(2);
			    if (cell == null)
			        cell = row.createCell(2);
			    cell.setCellType(CellType.STRING);
			    String lianjie = cell.getStringCellValue();
			    System.out.println("-------------------"+lianjie+i);
			    System.out.println(name+tel+lianjie);
		    }
		    
//		    Row row = sheet.getRow(1); 
//		    Cell cell = row.getCell(0);
//		    if (cell == null)
//		        cell = row.createCell(3);
//		    
//		    cell.setCellType(CellType.STRING);
//		    
//		   // System.out.println("----------"+cell.getNumericCellValue());
//		    System.out.println("----------"+cell.getCellType());
//		    System.out.println("----------"+cell.getStringCellValue());
		    
		    
		    
//		    
//		    cell.setCellValue("a test");
//
//		    // Write the output to a file
//		    FileOutputStream fileOut = new FileOutputStream("workbook.xls");
//		    wb.write(fileOut);
//		    fileOut.close();
		                    	
		
		
	}

}

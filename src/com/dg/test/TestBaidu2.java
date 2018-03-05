package com.dg.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.netease.dagger.BrowserEmulator;

public class TestBaidu2 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		String googleUrl = "https://www.baidu.com/";
//		String lgoin = "//input[@name='txtLogin']";
//		String lgoinpwd = "//input[@name='txtPwd']";
		
//		String searchBtn = "//input[@name='btnLogin']";
		String searchBtn1 = "//input[@class='bg s_btn']";
		
		
		BrowserEmulator be = new BrowserEmulator();
		be.open(googleUrl);
		
		
//		be.type(lgoin, "dxwdggroup");
//		be.type(lgoinpwd, "666888");	
		 
		
		be.pause(500);
		
		
		String text = "刘钰山";
		be.type("//input[@name='wd']", text ); ////<textarea name="txtContent1" id="txtContent1"
		
		be.click(searchBtn1); //<input type="submit" name="btnSend1" value="发 送" onclick="waitDiv();" id="btnSend1" class="sendsms_button">
		
//		be.open("http://web.duanxinwang.cc/sms/sendsms.aspx");
		
//		InputStream inp = new FileInputStream("f:\\南山.xlsx");
//	    //InputStream inp = new FileInputStream("workbook.xlsx");
//
//	    Workbook wb = WorkbookFactory.create(inp);
//	    Sheet sheet = wb.getSheetAt(0);
//	    
//	    for(int i=1;i<50;i++){
//	    	
//		    Row row = sheet.getRow(i); 
//		    if(row == null){
//		    	continue;
//		    }
//		    Cell cell = row.getCell(0);
//		    if (cell == null)
//		        cell = row.createCell(0);
//		    cell.setCellType(CellType.STRING);
//		    String name = cell.getStringCellValue();
//		    System.out.println("-------------------"+name+i);
//		    
//		    cell = row.getCell(1);
//		    if (cell == null)
//		        cell = row.createCell(1);
//		    cell.setCellType(CellType.STRING);
//		    String tel = cell.getStringCellValue();
//		    System.out.println("-------------------"+tel+i);
//		    
//		    cell = row.getCell(2);
//		    if (cell == null)
//		        cell = row.createCell(2);
//		    cell.setCellType(CellType.STRING);
//		    String lianjie = cell.getStringCellValue();
//		    System.out.println("-------------------"+lianjie+i);
//		    System.out.println(name+tel+lianjie);
//		    
//		    if(tel!=null && tel.length()==11 && name!=null && lianjie!=null){
//			    be.type("//textarea[@name='txtMobile1']", tel);/// <textarea name="txtMobile1" id="txtMobile1"
//				
//				String text = "亲爱的@,您收到一个结识1000+中国高端企业家和社会公知的机会：点击  "+ lianjie + " 参加，退订TD";
//				text = text.replace("@", name);
//				be.type("//textarea[@name='txtContent1']", text ); ////<textarea name="txtContent1" id="txtContent1"
//				
//				be.click("//input[@name='btnSend1']"); //<input type="submit" name="btnSend1" value="发 送" onclick="waitDiv();" id="btnSend1" class="sendsms_button">
//				
//		    }
//	
//		    
//	    }
		
		//be.click("//a[@id='li_websend']"); //id="li_websend"
		
		
		
		//be.expectTextExistOrNot(true, "https://github.com/", 5000);
		be.quit();
		
	}

}

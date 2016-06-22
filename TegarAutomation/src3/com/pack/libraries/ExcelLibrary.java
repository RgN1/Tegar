package com.pack.libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
public int rowcount()
{
	int u;
	FileInputStream inputStream = null;
	try {
		inputStream = new FileInputStream("data/Gieom.xlsx");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Workbook wb = null;
	try {
		wb = WorkbookFactory.create(inputStream);
	} catch (EncryptedDocumentException | InvalidFormatException
			| IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 u=wb.getSheet("Sheet1").getLastRowNum();
	
	
	return u;

}

	public String  getdat(String shnm,int s1,int s2)
	{
		String valu=null;
		
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("data/Gieom.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Workbook wb=WorkbookFactory.create(inputStream);
			valu=wb.getSheet(shnm).getRow(s1).getCell(s2).getStringCellValue();
		//	int s4=Integer.parseInt(Double.toString(s),8);
			
			//Double double1=new Double(Double.parseDouble("ad"));
			System.out.println(valu);
			
			//System.out.println(Integer.parseInt(s));
			//System.out.println(s4);
			
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
		return valu;
		
	}
public void SetExelData(String s,int row,int cell,String data) {
	
	
	
	String valu=null;
	
	FileInputStream inputStream = null;
	try {
		inputStream = new FileInputStream("data/Gieom.xlsx");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Workbook wb=WorkbookFactory.create(inputStream);
	
	org.apache.poi.ss.usermodel.Sheet y=	 wb.getSheet("Sheet1");
		
		Row r=y.getRow(row);
		Cell c=r.createCell(cell);
		c.setCellValue(data);
		
		
		//	int s4=Integer.parseInt(Double.toString(s),8);
		
		//Double double1=new Double(Double.parseDouble("ad"));
			
		//System.out.println(Integer.parseInt(s));
		//System.out.println(s4);
		
	
		
			FileOutputStream fos=new FileOutputStream("data\\Gieom.xlsx");
	wb.write(fos);	
	
	
	} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
	}
	
	
	
	
}

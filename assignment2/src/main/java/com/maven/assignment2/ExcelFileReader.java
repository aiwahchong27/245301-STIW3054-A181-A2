package com.maven.assignment2;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class ExcelFileReader  {
	public static List<ChessListInfo> findAll(){
	
	final String chessResult = "C:\\Users\\user\\Documents\\chessResultsList.xls";
	
	try {
		
		List<ChessListInfo> info= new ArrayList<ChessListInfo>();
		HSSFWorkbook wbook = new HSSFWorkbook ( new FileInputStream(chessResult));
		Sheet sheet = wbook.getSheetAt(0);
		
		Iterator<Sheet> sheetIterator = wbook.sheetIterator();
        while (sheetIterator.hasNext()) {
            sheet = sheetIterator.next();
            
        }
        
    
        Iterator<Row> rowIterator = sheet.rowIterator();
        String no="",name="",fieldID="",fed ="",rtg="",club="";
        while (rowIterator.hasNext()) {
        	Row row = rowIterator.next();
          
                Cell c1 = row.getCell(0);
                Cell c2 = row.getCell(2);
                Cell c3 = row.getCell(3);
                Cell c4 = row.getCell(4);
                Cell c5 = row.getCell(5);
                Cell c6 = row.getCell(6);
               
                no= String.valueOf(c1);
                name= String.valueOf(c2);
                fieldID= String.valueOf(c3);
                fed= String.valueOf(c4);
                rtg= String.valueOf(c5);
                club= String.valueOf(c6);
                
                info.add(new ChessListInfo (no,name,fieldID,fed,rtg,club));
               
                
            }
        
        	wbook.close();
        	
            return info;
       
	}catch (IOException e) {
		e.printStackTrace();
	}
	return null;
	}	
}
		
		
			

			
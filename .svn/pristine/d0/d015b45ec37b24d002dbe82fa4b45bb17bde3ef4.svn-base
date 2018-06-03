package modules;



import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.util.*;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class Excelwrite {
	
	  private static final String FILE_NAME = "PatientandUMRN.xlsx";
	  
	  //public static int rownum=0;
	public static void write( String Name, String UMRN, int index ) throws IOException, InvalidFormatException{

	  
/*
	   

	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("Patient details");
	        Object[][] datatypes = {
	                {Name, UMRN}
	               
	        };

	        //int rowNumm = rownum;
	        System.out.println("Creating excel");

	        for (Object[] datatype : datatypes) {
	            Row row = sheet.createRow(Rownum);
	            int colNum = 0;
	            for (Object field : datatype) {
	                Cell cell = row.createCell(colNum++);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	        }

	        try {
	            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
	            workbook.write(outputStream);
	            
	    
	            
	            workbook.close();
	            
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Done");
	    }
	    
	    
	    */
		String xlspath =  "PatientandUMRN.xlsx";
		InputStream inp = new FileInputStream(xlspath);
        Workbook wb = WorkbookFactory.create(inp);
        Sheet sheet = wb.getSheetAt(0);
        
        Row row = sheet.getRow(index);
        //log.info(row.getSheet().getSheetName())
        CreationHelper createHelper = wb.getCreationHelper();
            Cell cell = row.getCell(1);
            //log.info(cell.getColumnIndex())
            //cell.setCellType(1);
            cell.setCellValue(createHelper.createRichTextString((UMRN)));
              
            
              
             cell = row.getCell(2);

           
             
             cell.setCellValue(createHelper.createRichTextString((Name)));
             
             
            

        FileOutputStream fileOut = new FileOutputStream(xlspath);
        wb.write(fileOut);
        fileOut.close();
	
}
	
}

package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Files {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Files\\src\\excel\\newexcel.xlsx");
		
		Workbook w=new XSSFWorkbook();
	Sheet cs = w.createSheet("new");
	
	Row cr = cs.createRow(4);
	
	Cell CC = cr.createCell(2);
	CC.setCellValue("pazhani");
	
	FileOutputStream stream=new FileOutputStream(f);
	w.write(stream);
//		 
//		Sheet st = w.getSheet("Sheet1");
//		Row r = st.getRow(2);
//		Cell c = r.getCell(1);
//		
//		String scv = c.getStringCellValue();
//		
//		c.setCellValue("mandi");
//		
//		FileOutputStream stream1=new FileOutputStream(f);
//		w.write(stream1);
//		
			
//		for (int i = 0; i < st.getPhysicalNumberOfRows(); i++) {
//		
//			Row row = st.getRow(i);
//			
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//			
//				Cell cell = row.getCell(j);
//		
//			CellType type = cell.getCellType();
//			
//			switch (type) {
//			case STRING:
//				String scv = cell.getStringCellValue();
//				System.out.println(scv);
//				break;
//			case NUMERIC:
//			if (DateUtil.isCellDateFormatted(cell)) {
//               Date dcv = cell.getDateCellValue();
//				
//				SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yy");
//				String format = sdf.format(dcv);
//				System.out.println(format);	
//			}	
//			else {
//				double ncv = cell.getNumericCellValue();
//				
//				long ro = Math.round(ncv);
//				
//				String valueof = String.valueOf(ro);
//				System.out.println(valueof);
//				break;
				
//			}
//			default:
//				break;
//			}

			
//			}
//		}
		
	}
	
}

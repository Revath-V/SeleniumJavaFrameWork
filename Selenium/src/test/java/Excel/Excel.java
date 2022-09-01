package Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public Excel(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet= workbook.getSheet(sheetName);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int getRowCount() {
		int rowcount=0;
		try {
			
			 rowcount=sheet.getPhysicalNumberOfRows();
			//System.out.println("Number of Rows : "+rowcount);

		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
       return rowcount;
	}
	public int  getColCount() {
		int colcount=0;
		try {
			
			colcount=sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("Number of Rows : "+rowcount);

		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return colcount;

	}

	public  static String getCellDataString(int rowNum,int colNum)  {
		String celldata=null;
		try {
			
			 celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(celldata);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return celldata;	

	}
	
	public  static void getCellDataNumber(int rowNum,int colNum)  {
		try {
			
			double celldata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(celldata);
		} catch (Exception e) {
			e.printStackTrace();
		}		

	}

	
}

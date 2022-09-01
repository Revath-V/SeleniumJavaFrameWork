package Excel;

import org.junit.Test;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
    public Object[][] testData(String excelPath, String sheetName) {
    	Excel excel=new Excel(excelPath, sheetName);
    	int rowcount=excel.getRowCount();
    	int colcount=excel.getColCount();
    	System.out.println("RowCount : "+rowcount);
    	System.out.println("ColCount : "+colcount);
    	Object data[][]=new Object [rowcount-1][colcount];
    	for(int i=1;i<rowcount;i++) {
    		for(int j=0;j<colcount;j++) {
    			String celldata =excel.getCellDataString(i, j);
    			System.out.print(celldata+"  |  " );
    			data[i-1][j]=celldata;
    		}
    		System.out.println();
    	}
		return data;
    }
    
    /*  no need of main method when annotations are added
    public static void main(String[] args) {
    	String excelpath="C:\\Users\\revat\\eclipse-workspace\\Selenium\\Excel\\data.xlsx";
    	String sheetName="Sheet1";
		testData(excelpath,sheetName);
	}
	*/
    
    @Test
    public void test1(String Username,String Password)
    {
    	System.out.println(Username+" | "+Password);
    }
    
    
    @DataProvider(name="test1data")
    public Object[][] getdata() {
    	String excelpath="C:\\Users\\revat\\eclipse-workspace\\Selenium\\Excel\\data.xlsx";
    	String sheetName="Sheet1";
		Object data[][]=testData(excelpath,sheetName);
		return data;
    	
    }
}

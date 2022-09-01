package Excel;

public class Excellmain {
    
    public static void main(String[] args) {
    	Excel excel=new Excel("C:\\Users\\revat\\eclipse-workspace\\Selenium\\Excel\\data.xlsx","Sheet1");
    	excel.getRowCount();
    	excel.getCellDataString(0,0);
    	excel.getCellDataNumber(1,1);
	}
}

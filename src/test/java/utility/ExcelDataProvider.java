package utility;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelDataProvider {

    public XSSFWorkbook wb;

    public ExcelDataProvider(){

        File src = new File("./TestData/TestDataSheet.xlsx");

        try{
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
        }
        catch(Exception e){
            System.out.println("Error message is: "+e.getMessage());
        }
    }

    public String getEmail(String sheetName, int row, int col){
        return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
    }
    public String getPassword(String sheetName, int row, int col){
        return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
    }
}

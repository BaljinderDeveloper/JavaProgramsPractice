/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWriteExcel{
    public static void main(String[] args) throws FileNotFoundException {

    }
    public static String read(String SheetName, int rNum,int cNum) throws FileNotFoundException {
        String  location = "/Users/baljinder/Desktop/Sample.xlsx";
        FileInputStream fis = new FileInputStream(location);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet s = wb.getSheet(SheetName);
        Row r = s.getRow(rNum);
        Cell c = r.getCell(cNum);

        String data = c.getStringCellValue();
        return data;

    }
    public static void write(String SheetName, int rNum,int cNum, String data) throws FileNotFoundException {
        String  location = "/Users/baljinder/Desktop/Sample.xlsx";
        FileInputStream fis = new FileInputStream(location);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet s = wb.getSheet(SheetName);
        Row r = s.getRow(rNum);
        Cell c = r.getCell(cNum);
        c.setCellValue(data);

        FileOutputStream fos = new FileOutputStream(location);
        wb.write(fos);
    }
}*/

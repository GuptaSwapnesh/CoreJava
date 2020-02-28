package apache.poi;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class ReadExcel {

    public static final String FILE_NAME = "E:/IntelliJ WS/CoreJava/src/apache/poi/MyFirstExcel.xlsx";

    public static void main(String[] args) {

        try {
            // Reading the file from the given location using FileInputStream
            FileInputStream inputStream = new FileInputStream(new File(FILE_NAME));

            // XSSF is prefixed before the class name to indicate operations related to a Microsoft Excel 2007 file or later.
            // XSSFWorkbook class act as an Excel Workbook
            Workbook workbook = new XSSFWorkbook(inputStream);

            // Sheet act as an Excel Worksheet
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                // Row defines an Excel row
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {

                    // Cell defines an Excel cell addressed in reference to a row.
                    Cell currentCell = cellIterator.next();
                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.println(currentCell.getStringCellValue() + "--");
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.println(currentCell.getNumericCellValue() + "--");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

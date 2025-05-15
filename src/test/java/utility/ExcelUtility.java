package utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
@SuppressWarnings("deprecation")
public class ExcelUtility {
    private static Workbook workbook;
    private static Sheet sheet;
    private static String excelFilePath;

    public static void setExcelFile(String filePath, String sheetName) throws IOException {
        excelFilePath = filePath;
        FileInputStream fis = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
        fis.close();
    }

   
	public static String getCellData(int rowNum, int colNum) {
        Cell cell = sheet.getRow(rowNum).getCell(colNum);
        cell.setCellType(CellType.STRING); // Ensure type is string
        return cell.getStringCellValue();
    }

    public static void setCellData(String data, int rowNum, int colNum) throws IOException {
        Row row = sheet.getRow(rowNum);
        if (row == null) row = sheet.createRow(rowNum);
        Cell cell = row.getCell(colNum);
        if (cell == null) cell = row.createCell(colNum);
        cell.setCellValue(data);

        FileOutputStream fos = new FileOutputStream(excelFilePath);
        workbook.write(fos);
        fos.close();
    }

    public static int getRowCount() {
        return sheet.getLastRowNum() + 1;
    }

    public static int getColumnCount(int rowIndex) {
        return sheet.getRow(rowIndex).getLastCellNum();
    }
}

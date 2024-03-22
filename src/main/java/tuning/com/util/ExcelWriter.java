package tuning.com.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tuning.com.model.dto.ItemDto;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelWriter {

    public static void writeToExcel(List<ItemDto> items) throws IOException {
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Items");

        Row headerRow = sheet.createRow(0);
        String[] headers = {"Item ID", "Name", "Vendor", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Aug", "Sep", "Oct", "Nov", "Dec", "Total"};
        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
        }

        int rowNum = 1;
        for (ItemDto item : items) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(item.getItemId());
            row.createCell(1).setCellValue(item.getName());
            row.createCell(2).setCellValue(item.getVendor());
            row.createCell(3).setCellValue(item.getJan());
            row.createCell(4).setCellValue(item.getFeb());
            row.createCell(5).setCellValue(item.getMar());
            row.createCell(6).setCellValue(item.getApr());
            row.createCell(7).setCellValue(item.getMay());
            row.createCell(8).setCellValue(item.getJun());
            row.createCell(9).setCellValue(item.getAug());
            row.createCell(10).setCellValue(item.getSep());
            row.createCell(11).setCellValue(item.getOct());
            row.createCell(12).setCellValue(item.getNov());
            row.createCell(13).setCellValue(item.getDec());
            row.createCell(14).setCellValue(item.getTotal());
        }

        for (int i = 0; i < headers.length; i++) {
            sheet.autoSizeColumn(i);
        }

        String filePath = "/Users/jeongdaun/Desktop/project/output.xlsx";

        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
        }

        workbook.close();

        System.out.println("Excel file has been created at: " + filePath);
    }
}
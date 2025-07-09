package dataDriverTesting1;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_dataInExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\Testdata\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("data");
		XSSFRow row1 = sheet.createRow(0);
				row1.createCell(0).setCellValue("JAVA");
				row1.createCell(1).setCellValue(1234);
				row1.createCell(2).setCellValue("Automation");
		XSSFRow row2 = sheet.createRow(1);
				row2.createCell(0).setCellValue("Python");
				row2.createCell(1).setCellValue(4567);
				row2.createCell(2).setCellValue("Manual");
		XSSFRow row3 = sheet.createRow(2);
				row3.createCell(0).setCellValue("c++");
				row3.createCell(1).setCellValue(45);
				row3.createCell(2).setCellValue("Manual+ Automation");
				
		workbook.write(file);
		workbook.close();
		file.close();

	}

}

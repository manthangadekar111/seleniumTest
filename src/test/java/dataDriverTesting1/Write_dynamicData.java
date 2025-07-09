package dataDriverTesting1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_dynamicData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(
				System.getProperty("user.dir") + "\\Testdata\\myfile_dynamic.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("data");

		Scanner sc = new Scanner(System.in);

		int noOfRows = sc.nextInt();
		int noOfCols = sc.nextInt();

		for (int i = 0; i <= noOfRows; i++) {
			XSSFRow currentrom = sheet.createRow(i);
			for (int j = 0; j < noOfCols; j++) {
				XSSFCell cell = currentrom.createCell(j);
				cell.setCellValue(sc.next());
			}
		}

		workbook.write(file);
		workbook.close();
		file.close();
	}

}

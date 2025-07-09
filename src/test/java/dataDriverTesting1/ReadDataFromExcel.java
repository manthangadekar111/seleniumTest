package dataDriverTesting1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\Testdata\\Sheet1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		System.out.println("no of row" + totalrows);
		System.out.print("no of cells" + totalcells);

		for (int r = 0; r <= totalrows; r++) {
			XSSFRow currentrow = sheet.getRow(r);
			for (int c = 0; c < totalcells; c++) {
				XSSFCell cell = currentrow.getCell(c);
				System.out.println(cell.toString()+ "\t");
			}
			System.out.println();
		}

		workbook.close();
		file.close();

	}

}

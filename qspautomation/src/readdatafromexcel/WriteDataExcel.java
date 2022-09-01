package readdatafromexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("citytour");
		Row row = sh.getRow(4);
		
		Cell cell = row.createCell(4);//create a cell
		cell.setCellValue("automation");// send the data
		
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");// specify path of excel file
		wb.write(fos); // write the data
		
	}
}

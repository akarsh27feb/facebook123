package Extra;		//To fetch the data from a cell

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Workbook1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Specify path of excel
		FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
		
		//Open excel file
		Workbook wb=WorkbookFactory.create(fis);
		
		//Go to sheet
		Sheet sh=wb.getSheet("Test Case 1");
		
		//Go to Row
		Row r=sh.getRow(0);
		
		//Go to Cell
		Cell c=r.getCell(0);
		
		//Fetch the data from the cell
		String v=c.getStringCellValue();
		System.out.println(v);
	}
}

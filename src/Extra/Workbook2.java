package Extra;		//To fetch the data from a cell

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Workbook2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Test Case 1");
		Row r=sh.getRow(1);
		Cell c=r.getCell(0);
		String data=c.getStringCellValue();
		System.out.println(data);
	}
}


/*
Row count starts from 0
Row number starts from 0
Cell number starts from 0
Cell count starts from 1
*/
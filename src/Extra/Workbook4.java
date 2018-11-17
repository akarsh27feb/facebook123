package Extra;		//To count number of cells in a row

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Workbook4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Test Case 1");
		Row r=sh.getRow(0);
		short cell=r.getLastCellNum();
		System.out.println(cell);
	}
}

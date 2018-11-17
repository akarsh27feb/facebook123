package Extra;		//To count the number of rows in a sheet

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Workbook3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Test Case 1");
		int row = sh.getLastRowNum();
		System.out.println(row);		//row count starts from 0 and here we have 3 rows but output will be 3-1=2.
	}
}

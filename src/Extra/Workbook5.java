package Extra;		//To fetch the data from multiple rows and multiple cells

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Workbook5 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Test Case 1");
		int row=sh.getLastRowNum();
		for(int i=0; i<=row; i++)
		{
			Row r=sh.getRow(i);
			short cell=r.getLastCellNum();
			for(int j=0; j<cell; j++) 
			{
				Cell c=r.getCell(j);
				String data = c.toString();
				System.out.print(data+" ");
			}
			System.out.println();				
		}
	}
}

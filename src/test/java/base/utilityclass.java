package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utilityclass {
	public static String gettd(int rowindex,int colindex) throws Throwable {
		FileInputStream fis= new FileInputStream("C:\\Users\\ADMIN\\Documents\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
		String ex = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return ex;
	}

}

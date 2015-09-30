package poiExcel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class PoiReadExcel {
	
	public static int lastRowNum;
	public static int lastCellNum;
	public static String[][] str = new String[20][12];
	public static void main(String args[]) {
		//��Ҫ������excel�ļ�
		File file = new File("D:/e.xls");
		try {
			//����excel,��ȡ�ļ�����
			HSSFWorkbook workbook = new HSSFWorkbook(FileUtils.openInputStream(file));
			//��ȡ��һ��������
			//HSSFSheet sheet = workbook.getSheet("Sheet0");
			HSSFSheet sheet = workbook.getSheetAt(0);
			int firstRowNum=0;
			//��ȡ���һ��
			lastRowNum = sheet.getLastRowNum();
			for(int i = firstRowNum;i <= lastRowNum;i++)
			{
				HSSFRow row = sheet.getRow(i);
				//��ȡ��ǰ�����Ԫ���к�
				lastCellNum = row.getLastCellNum();
				for(int j = 0; j < lastCellNum;j++)
					str[i][j]="0";
				for(int j = 0; j < lastCellNum;j++)
				{
					if(row.getCell(j)!=null){
				          row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
				     }
					HSSFCell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					str[i][j]=value;
					System.out.print(value + "  ");
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

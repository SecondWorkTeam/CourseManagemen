package poiExcel;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class PoiNewExcel {
	
	public static void main(String[] args)
	{
		String[] title = {"id","name","sex"};
		//����������
		HSSFWorkbook workbook = new HSSFWorkbook();
		//����������
		HSSFSheet sheet = workbook.createSheet();
		//������һ��
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = null;
		//�����һ������
		for(int i = 0;i< title.length;i++)
		{
			cell = row.createCell(i);
			cell.setCellValue(title[i]);
		}
		//׷������
		for(int i=0;i <= 10;i++)
		{
			HSSFRow nextrow = sheet.createRow(i);
			HSSFCell cell2 = nextrow.createCell(0);
			cell2.setCellValue("a"+ i);
			cell2 = nextrow.createCell(1);
			cell2.setCellValue("user"+ i);
			cell2 = nextrow.createCell(2);
			cell2.setCellValue("��");
		}
	//����һ���ļ�
		File file = new File("e:/poi.xls");
		try {
			file.createNewFile();
			//��Excel����
			FileOutputStream stream = FileUtils.openOutputStream(file);
			workbook.write(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


package util;

import java.io.File;
import java.sql.*;

import jxl.Sheet;
import jxl.Workbook;

public class DBUpload {
	public void upLoadExcel(String filePath){
		try{
			Workbook rwb = Workbook.getWorkbook(new File(filePath));
			Sheet rs = rwb.getSheet(0);
			int clos = rs.getColumns();
			int rows = rs.getRows();
			for(int i = 3; i < rows; i++){
				for(int j = 0; j < clos; j++){
					String grade = rs.getCell(j++, i).getContents();
					String major = rs.getCell(j++, i).getContents();
					String people = rs.getCell(j++, i).getContents();
					String cname = rs.getCell(j++, i).getContents();
					cname = cname.substring(0, 1);
					String etype = rs.getCell(j++, i).getContents();
					etype.substring(0, 1);
					String credit = rs.getCell(j++, i).getContents();
					String chour = rs.getCell(j++, i).getContents();
					String otime = rs.getCell(j++, i).getContents();
					String ctime = rs.getCell(j++, i).getContents();
					String week = rs.getCell(j++, i).getContents();
					String teacher = rs.getCell(j++, i).getContents();
					String remark = rs.getCell(j++, i).getContents();
//					String sql = "insert into Major(grade,major,people,cname,etype,credit,chour"
//	+ ",otime,ctime,week,teacher,remark)values('"+grade+"','"+major+"','"+people+"','"+cname+"'"
//	+ ",'"+etype+"','"+credit+"','"+chour+"','"+otime+"','"+ctime+"','"+week+"','"+teacher+"','"+remark+"');";					
//					Connection conn = null;
//					Statement stmt = null;
//					conn = DBConnect.getConnection();
//					stmt = conn.createStatement();
//					stmt.executeUpdate(sql);
					System.out.println(cname+" "+etype);
				}
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String path = "E:/jisuanji 1.xls";
//		DBUpload upload = new DBUpload();
//		upload.upLoadExcel(path);
		System.out.println("success!");
	}
}




package util;

import java.util.List;
import java.sql.*;
import lesson.Course;
import util.JdbcCone;
import poiExcel.PoiReadExcel;
public class Input {
	private Connection dbConn;
	//private Statement st;
	//private ResultSet rs;
	private Statement stmt;
	private String sql;
	private String[][] str;
	private int lastRowNum;
	private int lastCellNum;
	public void Daoru()
	{
		str = PoiReadExcel.str;
		lastRowNum = PoiReadExcel.lastRowNum;
		lastCellNum = PoiReadExcel.lastCellNum;
		dbConn = JdbcCone.getConnection();
		try {
			//st = (Statement)dbConn.createStatement();
			for(int i=0;i<=lastRowNum;i++)
			{ 
				for(int j=0;j<12;j++)
				System.out.println(str[i][j]);
				sql = "Insert into KaiKe(grade,major,number,course,selectType,credit,studyTime,experimentTime,machineTime,orderWeek,teacher,remark) values('"+str[i][0]+"','"+str[i][1]+"','"+str[i][2]+"','"+str[i][3]+"','"+str[i][4]+"','"+str[i][5]+"','"+str[i][6]+"','"+str[i][7]+"','"+str[i][8]+"','"+str[i][9]+"','"+str[i][10]+"','"+str[i][11]+"')";
				//sql = "Insert into KaiKe(grade,major,number,course,selectType,credit,studyTime,experimentTime,machineTime,orderWeek,teacher,remark) values(0,0,0,1,1,1,2,2,2,3,3,3,3)";
				//sql = "select * from table";
				//rs = ((java.sql.Statement) st).executeQuery(sql);
				//PreparedStatement stmt = dbConn.prepareStatement(sql);
				//stmt.executeUpdate();
				
				stmt = dbConn.createStatement();
				stmt.executeUpdate(sql);
				System.out.println(sql);	
			}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Input in = new Input();
	}
}

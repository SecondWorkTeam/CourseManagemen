package util;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lesson.Course;
import util.JdbcCone;

public class Output {
	
	private Connection dbConn;
	private Statement st;
	private ResultSet rs;
	private String sql;
	private List list;
	private Course course;
	public List get()
	{
		list = new ArrayList();
		dbConn = JdbcCone.getConnection();
		try {
			st = (Statement)dbConn.createStatement();
			sql = "select * from KaiKe";
			System.out.println(sql);
			rs = ((java.sql.Statement) st).executeQuery(sql);
			while(rs.next())
			{
				//course = new Course();
				System.out.print(rs.getString("grade"));
				System.out.print(rs.getString("major"));
				System.out.print(rs.getString("number"));
				System.out.print(rs.getString("course"));
				System.out.print(rs.getString("selectType"));
				System.out.print(rs.getString("credit"));
				System.out.print(rs.getString("studyTime"));
				System.out.print(rs.getString("experimentTime"));
				System.out.print(rs.getString("machineTime"));
				System.out.print(rs.getString("orderWeek"));
				System.out.print(rs.getString("teacher"));
				System.out.print(rs.getString("remark"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {
		new Output();
	}
}

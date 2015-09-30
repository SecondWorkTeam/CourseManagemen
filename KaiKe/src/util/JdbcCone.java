package util;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcCone {
	private static String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=KaiKe";
	private static String user = "root";
	private static String password = "root";
	public static Connection conn;
	public static PreparedStatement ps;
	public static ResultSet rs;
	public static Statement st;
	
	public static Connection getConnection()
	{
		
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return conn;
	}
}

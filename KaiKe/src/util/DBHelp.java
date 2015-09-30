package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelp {

	public static void main(String[] args) {
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// SQL数据库引擎
		String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=pro";// 数据源注意IP地址和端口号，数据库名字！！！
		try
		{
			Class.forName(JDriver);// 加载数据库引擎
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try {
			String user = "root";//用户名和密码
			String password ="root";
			Connection con = DriverManager.getConnection(connectDB, user,password);
			Statement stmt = con.createStatement();// 创建SQL命令对象
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
			
			while (rs.next()) {
				System.out.println(rs.getString("id") + "\t"
						+ rs.getString("name"));
			}
			stmt.close();// 关闭命令对象连接
			con.close();// 关闭数据库连接
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	DBHelp db = new DBHelp();
}


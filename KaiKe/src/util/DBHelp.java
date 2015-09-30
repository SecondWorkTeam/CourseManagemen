package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelp {

	public static void main(String[] args) {
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// SQL���ݿ�����
		String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=pro";// ����Դע��IP��ַ�Ͷ˿ںţ����ݿ����֣�����
		try
		{
			Class.forName(JDriver);// �������ݿ�����
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try {
			String user = "root";//�û���������
			String password ="root";
			Connection con = DriverManager.getConnection(connectDB, user,password);
			Statement stmt = con.createStatement();// ����SQL�������
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
			
			while (rs.next()) {
				System.out.println(rs.getString("id") + "\t"
						+ rs.getString("name"));
			}
			stmt.close();// �ر������������
			con.close();// �ر����ݿ�����
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	DBHelp db = new DBHelp();
}


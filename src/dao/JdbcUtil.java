//package dao;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
////jdbc common 
//public class JdbcUtil {
//	
//	static {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("����Ŭ ����̹� �ε� ����");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} // catch end
//	}// static end
//	
//	public static Connection getConnection() { // static�� ����
//		Connection con = null;
//		try {
//			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.102:1521:xe", "kym", "0000");
////			con.setAutoCommit(false);// ���� Ŀ��.
//			// select, insert
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} // catch end
//		return con;
//	}// connect end
//	
//	public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
//		try {
//			if (rs != null)
//				rs.close();
//			if (pstmt != null)
//				pstmt.close();
//			if (con != null)
//				con.close();
//		} catch (SQLException e) {
//			System.out.println("CLOSE FAIL");
//			e.printStackTrace();
//		} // catch end
//	}
//	
//	public static void commit(Connection con) {
//		try {
//			con.commit();
//			System.out.println("commit ����");
//		} catch (SQLException e) {
//			System.out.println("commit ���� �߻�");
//			e.printStackTrace();
//		}
//	}
//	
//	public static void rollback(Connection con) {
//		try {
//			con.rollback();
//			System.out.println("rollback ����");
//		} catch (SQLException e) {
//			System.out.println("rollback ���� �߻�");
//			e.printStackTrace();
//		}
//	}
//}
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//jdbc common 
public class JdbcUtil {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ����̹� �ε� ����");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} // catch end
	}// static end

	public static Connection getConnection() { // static�� ����
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kym", "0000");
//			con.setAutoCommit(false);// ���� Ŀ��.
			// select, insert
		} catch (SQLException e) {
			e.printStackTrace();
		} // catch end
		return con;
	}// connect end

	public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			System.out.println("CLOSE FAIL");
			e.printStackTrace();
		} // catch end
	}

	public static void commit(Connection con) {
		try {
			con.commit();
			System.out.println("commit ����");
		} catch (SQLException e) {
			System.out.println("commit ���� �߻�");
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			con.rollback();
			System.out.println("rollback ����");
		} catch (SQLException e) {
			System.out.println("rollback ���� �߻�");
			e.printStackTrace();
		}
	}
}

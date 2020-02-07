import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/task1","Yukino.E","emo115tango"
			);

			System.out.println("データベースの接続に成功しました");

		}catch(SQLException e) {
			//DB接続やSQL処理の失敗時の処理
			System.out.println("データベースの接続に失敗しました");
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			//JDBCドライバが見つからない時の処理
			System.out.println("データベースの接続に失敗しました");
			e.printStackTrace();
		}finally {
			//データベースの切断
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					//DB接続時の処理
					e.printStackTrace();
				}
			}
		}

	}

}



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public UpdateEmployee() {
        super();

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/task1","Yukino.E","emo115tango"
			);
			System.out.println("データベースの接続に成功しました");
			request.setCharacterEncoding("UTF-8");
			String newName = request.getParameter("name");
			String setId = request.getParameter("id");
			String sql = " UPDATE  employee SET name = ? WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newName);
			ps.setInt(2, Integer.parseInt(setId));
			int result = 	ps.executeUpdate();
			System.out.println(ps);
			System.out.println(result + "件更新された");


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

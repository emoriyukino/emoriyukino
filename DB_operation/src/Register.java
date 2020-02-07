

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


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
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
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String birthday = request.getParameter("birthday");
			String age = request.getParameter("age");
			String sql = " INSERT INTO employee (id ,name ,birthday, age)VALUES(?, ?, ? ,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1 , Integer.parseInt(id));
			ps.setString(2, name);
			ps.setString(3, birthday);
			ps.setInt(4, Integer.parseInt(age));
			int result = ps.executeUpdate();
			System.out.println(result + "行が追加されました");
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

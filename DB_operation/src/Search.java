

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection con = null;
		response.setContentType("text/html ; charset = UTF-8 ");
		try {
			PrintWriter out = response.getWriter();
			request.setCharacterEncoding("UTF-8");
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1","Yukino.E","emo115tango");
			System.out.println("データベースの接続に成功しました");
			String keyword = request.getParameter("keyword");
			String sql = "select * from employee where name LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" +keyword +"%") ;
			System.out.println("SQL:" + ps.toString());
			ResultSet rs = ps.executeQuery();
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset = 'UTF-8'>");
			out.println("<title>課題３</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p>検索結果</p>");
			while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			Date birthday = rs.getDate("birthday");
			int age = rs.getInt("age");
			out.println("<p>ID:" + id  + "</p>");
			out.println("<p>名前:" + name + "</p>");
			out.println("<p>誕生日:" + birthday + "</p>");
			out.println("<p>年齢:" + age + "</p>");
			}
			out.println("<p>表示終了！</p>");
			out.println("</body>");
			out.println("</html>");

			rs.close();
			ps.close();

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

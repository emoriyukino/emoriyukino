package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Kadai3
 */
@WebServlet("/Kadai3")
public class Kadai3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kadai3() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//以下課題４追加部分
		Random r = new Random();
		String[]Result = {"大吉", "中吉", "小吉","末吉", "凶","大凶"};
		String Answer = Result[r.nextInt(6)];
		response.setContentType("text/html ; charset = UTF-8 ");
		PrintWriter out = response.getWriter();
		HtmlTemplate.header(out);
		//課題４で追加
		out.println("<p>↓占い結果↓</p>");
		out.println("<h1>" + Answer + "</h1>");
		HtmlTemplate.footer(out);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

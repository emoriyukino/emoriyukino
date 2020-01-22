package jp.co.la_tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 課題１
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String qtype = request.getParameter("qtype");
		String textarea = request.getParameter("textarea");

		if(gender.equals("0")) {
			gender = "男性";
		}else if (gender.equals("1")) {
			gender = "女性";

		}


		if(qtype.equals("product")) {
			qtype = "製品について";
		}else if(qtype.equals( "compliant")) {
			qtype = "不具合やクレーム";
		}else if (qtype.equals("support")) {
			qtype = "アフターサポート";

		}

		response.setContentType("text/html ; charset = UTF-8 ");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>お問い合わせ結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>以下の内容でお問い合わせをしました。回答をお待ちください。</p>");
		out.println("<p>名前:" + name  + "</p>");
		out.println("<p>性別:" + gender + "</p>" );
		out.println("<p>お問合せ種類:" + qtype + "</p>" );
		out.println("<p>お問合せ内容:" + textarea + "</p>");
		out.println("</body>");
		out.println("</html>");
	}


}

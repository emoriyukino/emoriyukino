package jp.co.la_tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountCookie
 */
@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset = UTF-8");
		final String countName = "counter" ;
		int counter = 0;
		Cookie cookie = null;
		//クッキーの取得
		Cookie[] cookies = request.getCookies();
		//クッキーの取得確認とできない場合で分ける
		String msg;
		if(cookies == null || (cookie = getCookie(cookies, countName)) == null) {
			counter = 1;
			msg = "初めて";
		}else {
			counter = Integer.parseInt(cookie.getValue());
			counter++;
			msg = counter + "回目";
		}

		cookie = new Cookie(countName,  Integer.toString(counter));
		cookie.setMaxAge(300);
		response.addCookie(cookie);

		 PrintWriter out = response.getWriter();
         out.println("<html>");
         out.println("<head>");
         out.println("<title>課題３</title>");
         out.println("</head>");
         out.println("<body>");
         out.println("<h1>訪問回数テスト（クッキー）</h1>");
         out.println("<p> " + msg + "の訪問です。</p>");
         out.println("<a href=" + request.getRequestURI() + ">画面を再訪問</a>");
         out.println("</body>");
         out.println("</html>");

         out.close();
	}


	private Cookie getCookie(Cookie[] cookies, String name) {
        for (int i = 0; i < cookies.length; i++){
            if (cookies[i].getName().equals(name)){
                return cookies[i];
            }
        }
        return null;
    }


}

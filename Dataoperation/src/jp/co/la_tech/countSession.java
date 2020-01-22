package jp.co.la_tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class countSession
 */
@WebServlet("/countSession")
public class countSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public countSession() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

    //課題４回答
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset = UTF-8");
		HttpSession Sessions = request.getSession();

		String msg;
		String countName = "counter";



		if(Sessions == null) {
			//Sessionを作る
			Sessions =  request.getSession();
			msg = "初めて";
			Sessions.setAttribute(countName ,"1");

		}else{
			String val = (String)Sessions.getAttribute(countName);
			int counter = Integer.parseInt(val);
			counter++;
			msg = counter + "回目";
			Sessions.setAttribute(countName,Integer.toString(counter) );
		}

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>課題３</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>訪問回数テスト（セッション）</h1>");
		out.println("<p> " + msg + "の訪問です。</p>");
		out.println("<a href=\"/Dataoperation/countSession\">画面を再訪問</a>");
		out.println("</body>");
		out.println("</html>");

		out.close();

		}
	}












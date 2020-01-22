package jp.co.colla_tech;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Kadai4
 */
@WebServlet("/Kadai4")
public class Kadai4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kadai4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		final String Result = "/WEB-INF/jsp/fortune_result.jsp";
		Date today = new Date();
		String[]luckArray = {"大吉", "中吉", "小吉","末吉","凶","大凶"};
		int index = (int)(Math.random() * 6);
		String fortune = luckArray[index];
		FortuneBean fortuneBean = new FortuneBean();
		fortuneBean.setToday(today);
		fortuneBean.setFortune(fortune);
		request.setAttribute("fortunebean",fortuneBean);
		request.getRequestDispatcher(Result).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

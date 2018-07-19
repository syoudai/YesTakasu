package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RirekidDao;
import model.TouhyouBean;

/**
 * Servlet implementation class Touhyou
 */
@WebServlet("/Touhyou")
public class Touhyou extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Touhyou() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String path="";

		String touhyou =request.getParameter("vote");
		//int pine  = Integer.parseInt(touhyou);
		System.out.println(touhyou);
		//カウント処理
		HttpSession session=request.getSession();
		TouhyouBean tddate=(TouhyouBean) session.getAttribute("tddate");
		int id=tddate.getTouhyouid();
		System.out.println("投票ID"+id);

		RirekidDao rirekidDao =new RirekidDao();

		if(touhyou.equals("A")) {
			rirekidDao.UpdateCountA(id);
			path="top.jsp";
			}else{
			rirekidDao.UpdateCountB(id);
			path="top.jsp";
		}

		request.getRequestDispatcher(path).forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);




	}

}

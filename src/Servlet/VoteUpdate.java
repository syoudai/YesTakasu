package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TouhyouDao;
import model.TouhyouBean;

/**
 * Servlet implementation class VoteUpdate
 */
@WebServlet("/VoteUpdate")
public class VoteUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoteUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession session = request.getSession();
		TouhyouBean list=(TouhyouBean)session.getAttribute("voteData");

		int touhyouid=list.getTouhyouid();

		String name =request.getParameter("name");
		String Data =request.getParameter("Data");
		String A =request.getParameter("A");
		String B =request.getParameter("B");



		TouhyouDao touhyouDao =new TouhyouDao();


	    touhyouDao.UpdateTouhyou(name,Data,A,B,touhyouid);
	    request.getRequestDispatcher("Upkakuninn.jsp").forward(request,response);
	}

}

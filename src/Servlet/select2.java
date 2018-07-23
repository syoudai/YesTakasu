package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TouhyouDao;
import model.TouhyouBean;

/**
 * Servlet implementation class select2
 */
@WebServlet("/select2")
public class select2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public select2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String path="kontentDisp.jsp";
		TouhyouBean touhyouBean=new TouhyouBean();
		 HttpSession session= request.getSession();
		 ArrayList<TouhyouBean> tdlist = (ArrayList<TouhyouBean>)session.getAttribute("tlist");

		 String id1 =request.getParameter("id");
			int id =Integer.parseInt(id1);

			TouhyouDao touhyouDao=new TouhyouDao();
			touhyouBean =touhyouDao.getTouhyoudata(id);
			System.out.println("Id"+id);

			System.out.println(touhyouBean.getTouhyouname());

			session.setAttribute("VoteNumbber",id);
			session.setAttribute("voteData",touhyouBean);


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

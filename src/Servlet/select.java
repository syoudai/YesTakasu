package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RirekidDao;
import dao.TouhyouDao;
import model.RirekiBean;
import model.TouhyouBean;

/**
 * Servlet implementation class select
 */
@WebServlet("/select")
public class select extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public select() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 HttpSession session= request.getSession();
		 ArrayList<TouhyouBean> tlist = (ArrayList<TouhyouBean>)session.getAttribute("tlist");
		 ArrayList<RirekiBean> votecount = (ArrayList<RirekiBean>)session.getAttribute("votecount");

		 String id1 =request.getParameter("id");

			int id =Integer.parseInt(id1);
			//TouhyouBean touhyouBean= tlist.get(id);
			//RirekiBean rirekiBean= votecount.get(id);

			TouhyouDao  touhyouDao=new TouhyouDao();
			RirekidDao rirekiDao =new RirekidDao();

			TouhyouBean touhyouBean =touhyouDao.getTouhyoudata(id);
			RirekiBean rirekiBean  =rirekiDao.getRirekidata(id);
			session.setAttribute("tddate",touhyouBean);
			session.setAttribute("tdcount",rirekiBean);

			request.getRequestDispatcher("syousai.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

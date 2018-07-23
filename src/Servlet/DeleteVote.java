package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RirekidDao;
import dao.TouhyouDao;


/**
 * Servlet implementation class DeleteVote
 */
@WebServlet("/DeleteVote")
public class DeleteVote extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteVote() {
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
		 System.out.println("受け取り1OK");
		 int id=(int) session.getAttribute("VoteNumbber");
		 System.out.println("受け取り2OK");



		TouhyouDao touhyouDao =new TouhyouDao();
		RirekidDao rirekiDao=new RirekidDao();

		 System.out.println("受け取り3OK");
		 	rirekiDao.DeleteRireki(id);
			touhyouDao.DeleteTouhyou(id);

			 System.out.println("受け取り4OK");
		request.getRequestDispatcher("deletekakuninn.jsp").forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

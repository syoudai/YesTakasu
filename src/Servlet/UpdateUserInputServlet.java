package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

/**
 * Servlet implementation class UpdateUserInputServlet
 */
@WebServlet("/UpdateUserInputServlet")
public class UpdateUserInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserInputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//セッションからログイン情報を取得
		String uid =request.getParameter("idnumber");
		int id =Integer.parseInt(uid);
		String userid1 =request.getParameter("Userid");
		String pass1 =request.getParameter("Pass");
		String mail1 =request.getParameter("Umail");



		UserDao userDao =new UserDao();


	    userDao.UpdateMember(userid1,pass1,mail1,id);
	    request.getRequestDispatcher("UpdateUserInputServlet.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

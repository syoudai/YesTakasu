package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
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

//Member registrationから値を受け取る
		String idnumber1=request.getParameter("idnumber");
		int idnumber =Integer.parseInt(idnumber1);
		String userid =request.getParameter("Userid");
		String pass =request.getParameter("Pass");
		String mail=request.getParameter("Umail");
		HttpSession session = request.getSession();
//受け取った値をセッションに格納する
		session.setAttribute("idnumber",idnumber );
		session.setAttribute("userid", userid);
		session.setAttribute("pass", pass);
		session.setAttribute("mail", mail);

		UserDao userDao =new UserDao();
	    userDao.InsertMember(idnumber,userid,pass,mail);

	  //画面遷移
	  		request.getRequestDispatcher("login.jsp").forward(request,response);
	  		System.out.println("error4");
	  	}


	  }

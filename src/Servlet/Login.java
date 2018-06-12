package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.DataBean;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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

		String path="";
//idとpasswordを取得
		String uid =request.getParameter("idnumber");
		int id =Integer.parseInt(uid);
		String pass =request.getParameter("Pass");
//セッションへ格納
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		session.setAttribute("pass",pass);
		System.out.println("受け取り1");
//Daoへ値を渡す
		UserDao userDao =new UserDao();
	    DataBean dataBean =new DataBean();

	    dataBean= userDao.getMember(id,pass);
//Daoから値を受け取る
	    System.out.println("受け取り2");

				if(dataBean !=null){
//デートが取れれば画面以降
					path="top.jsp";
							System.out.println("受け取り34");
							session.setAttribute("list",userDao.getMember(id,pass));
				}else {
//データがない場合login.jspへ戻る

					path="login.jsp";
					System.out.println("受け取り22");

				}
				request.getRequestDispatcher(path).forward(request,response);
	}
}





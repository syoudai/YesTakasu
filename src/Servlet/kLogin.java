package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.KUserDao;
import model.KUserBean;

/**
 * Servlet implementation class kLogin
 */
@WebServlet("/kLogin")
public class kLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public kLogin() {
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
		// TODO Auto-generated methoString path="";
		//idとpasswordを取得
		String path="";
				String id =request.getParameter("kid");
				int kid =Integer.parseInt(id);
				String kpass =request.getParameter("kpass");
		//セッションへ格納
				HttpSession session = request.getSession();
				session.setAttribute("kid", kid);
				session.setAttribute("kpass",kpass);
				System.out.println("受け取り1");
		//Daoへ値を渡す
				KUserDao kuserDao =new KUserDao();
			    KUserBean kuserBean =new KUserBean();

			    kuserBean= kuserDao.getKMember(kid,kpass);
		//Daoから値を受け取る
			    System.out.println("受け取り2");

						if(kuserBean !=null){
		//デートが取れれば画面以降
							path="kTop.jsp";
									System.out.println("受け取り34");
									session.setAttribute("klist",kuserDao.getKMember(kid,kpass));
						}else {
		//データがない場合login.jspへ戻る

							path="klogin.jsp";
							System.out.println("受け取り22");

						}
						request.getRequestDispatcher(path).forward(request,response);
		//doGet(request, response);

	}

}

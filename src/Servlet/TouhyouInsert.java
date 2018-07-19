package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RirekidDao;
import dao.TouhyouDao;
@MultipartConfig(location="/WebContent/img", maxFileSize=1048576)
/**
 * Servlet implementation class TouhyouInsert
 */
@WebServlet("/TouhyouInsert")

public class TouhyouInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TouhyouInsert() {
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



		String tname =request.getParameter("touhyouname");
		String tData =request.getParameter("touhyouData");
		String a =request.getParameter("A");
		String b =request.getParameter("B");

		System.out.println(System.getProperty("java.io.tmpdir"));

		//Part part = request.getPart("file");
        //String name = this.getFileName(part);



		TouhyouDao touhyouDao =new TouhyouDao();
		RirekidDao rirekiDao=new RirekidDao();

	        //part.write(getServletContext().getRealPath("/WEB-INF/img") + "/" + name);



	    Integer id=touhyouDao.InsertTouhyou(tname,tData,a,b);
	    rirekiDao.InsertRireki(id,tname);
	   // session.setAttribute("ttlist",touhyouDao.InsertTouhyou(tname,tData,a,b));
	   // session.setAttribute("trekilist",rirekiDao.InsertRireki(id,tname));
	    request.getRequestDispatcher("touhyouDisp.jsp").forward(request,response);


	    /*
	}
	private String getFileName(Part part) {
        String name = null;
        for (String dispotion : part.getHeader("Content-Disposition").split(";")) {
            if (dispotion.trim().startsWith("filename")) {
                name = dispotion.substring(dispotion.indexOf("=") + 1).replace("\"", "").trim();
                name = name.substring(name.lastIndexOf("\\") + 1);
                break;
            }
        }
        return name;
    }
    */
	}
}


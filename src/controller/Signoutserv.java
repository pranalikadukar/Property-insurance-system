package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/signoutserv")
public class Signoutserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Signoutserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("adminlogin.jsp");
		HttpSession session1 = request.getSession();
		session1.invalidate();
		 System.out.println("you are sucessfully logout!");
	}
}

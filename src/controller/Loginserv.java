package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.Userdao;

@WebServlet("/loginserv")
public class Loginserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Loginserv() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
         String name= request.getParameter("name");
         String psw = request.getParameter("upass");
         
         
         
         if(new Userdao().check(name, psw)){
        	 HttpSession session=request.getSession();
        	 session.setAttribute("name", name);
        	 session.setAttribute("upass", psw);
        	 response.sendRedirect("profile.jsp");
         }
         else
         {
        	 out.println("Invalid username & password");
        	 request.getRequestDispatcher("login.jsp").include(request, response);
         }
         
         
	}
	

}

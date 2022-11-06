package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/adminlogserv")
public class Adminlogserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Adminlogserv() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		doGet(request, response);
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
        String name= request.getParameter("name");
        String password = request.getParameter("Apass");
        
           if(password.equals("admin123")&& name.equals("admin")){  
        	   
        	   HttpSession session1 = request.getSession();
               out.print("You are successfully logged in!"); 
                response.sendRedirect("Dashboard.jsp");
           }
           else{
        	   out.println("Invalid username & password");
          	 request.getRequestDispatcher("adminlogin.jsp");
           }
           
        
	}

}

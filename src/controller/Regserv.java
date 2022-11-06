package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.Userdao;

@WebServlet("/Regserv")
public class Regserv extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 response.setContentType("text/html");
         PrintWriter out=response.getWriter();
         String name= request.getParameter("name");
         String mobile = request.getParameter("mobile");
         String Email = request.getParameter("email");
         String pass = request.getParameter("upass");
         String cpass= request.getParameter("cpass");
         String addr = request.getParameter("address");
        
        
		User u = new User(name,mobile,Email,pass,cpass,addr);
		u.setName(name);
		u.setMobile(mobile);
		u.setEmail(Email);
		u.setUpass(pass);
		u.setCpass(cpass);
		u.setAddr(addr);
	
		
		
		String msg= new Userdao().insertDetail(u);
		if(!msg.equals(null)){
			response.sendRedirect("login.jsp");
		}
		else{
			out.println("fill data properly");
			request.getRequestDispatcher("reg.jsp");
		}
         
	}

}

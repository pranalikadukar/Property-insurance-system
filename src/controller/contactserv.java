package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;
import model.Contactdao;



@WebServlet(name = "contactserv", urlPatterns = { "/contactserv" })
public class contactserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public contactserv() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String cname= request.getParameter("name");
        String pname = request.getParameter("pname");
        String Subject = request.getParameter("subject");
        String message = request.getParameter("message");
        String status= request.getParameter("status");
        
        Contact c = new Contact(cname, pname, Subject, message, status);
        c.setCname(cname);
        c.setPname(pname);
        c.setSubject(Subject);
        c.setMessage(message);
        c.setStatus(status);
        String msg= new Contactdao().insertDetail(c);
        if(!msg.equals(null)){
        	out.print("request sent");
			response.sendRedirect("status.jsp");
		}
        else{
        	out.print("plzz fill the data");
        	response.sendRedirect("contact.jsp");

        }
	}

}

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/contactserv")
public class Contactvalidation implements Filter {

    
    public Contactvalidation() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 String cname= request.getParameter("name");
	        String pname = request.getParameter("pname");
	        String Subject = request.getParameter("subject");
	        String message = request.getParameter("message");
	        RequestDispatcher dispatcher = request.getRequestDispatcher("Contact.jsp");
	         
	         if(cname.equals("")||pname.equals("")||Subject.equals("")||message.equals(""))
	         {
	        	 out.println("please fill the data");
	        	 dispatcher.include(request, response);
	         }
	         else
	         {
	        	 chain.doFilter(request, response);
	         }
		}
		
		
	

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

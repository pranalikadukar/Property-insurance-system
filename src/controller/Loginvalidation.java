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

@WebFilter("/loginserv")
public class Loginvalidation implements Filter {

    public Loginvalidation() {
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
         String name= request.getParameter("name");
         String psw = request.getParameter("upass");
         

         RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
         
         if(name.equals("")||psw.equals(""))
         {
        	 out.println("please enter username and password");
        	 dispatcher.include(request, response);
         }
         else
         {
        	 chain.doFilter(request, response);
         }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

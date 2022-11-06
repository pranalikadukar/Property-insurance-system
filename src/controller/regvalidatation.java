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

@WebFilter("/Regserv")
public class regvalidatation implements Filter {

    public regvalidatation() {}

	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 
        String name= request.getParameter("name");
        String mobile = request.getParameter("mobile");
        String Email = request.getParameter("email");
        String pass = request.getParameter("upass");
        String cpass= request.getParameter("cpass");
        String addr = request.getParameter("address"); 
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("reg.jsp");
        
        if(name.equals("")||mobile.equals("")||Email.equals("")||pass.equals("")||cpass.equals("")||addr.equals(""))
        {
       	 out.println("plz fill data");
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

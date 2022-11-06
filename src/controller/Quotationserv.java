package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Quotation;
import model.Quotationdao;

@WebServlet("/quotationserv")
public class Quotationserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Quotationserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubresponse.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		doGet(request, response);
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 String name=request.getParameter("cname");
		 String title = request.getParameter("title");
		 String pamount = request.getParameter("pamount");
		 String sum = request.getParameter("sum");
		 String interval = request.getParameter("interval");
		 String detail = request.getParameter("detail");
		  
		 Quotation q = new Quotation(name, title, pamount, sum, interval, detail);
		 q.setCname(name);
		 q.setTitle(title);
		 q.setPamount(pamount);
		 q.setSum(sum);
		 q.setPinterval(interval);
		 q.setDetail(detail);
		 
		 String msg= new Quotationdao().insertDetail(q);
	        if(!msg.equals(null)){
				response.sendRedirect("allquotation.jsp");
			}
	        else{
	       
	        	response.sendRedirect("quotation.jsp");

	        }
		 
	}

}

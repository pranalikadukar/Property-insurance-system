package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contactdao;
import model.Property;
import model.Propertydao;


@WebServlet("/propertyserv")
public class Propertyserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Propertyserv() {
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
       String pname= request.getParameter("pname");
       String cname= request.getParameter("cname");
       String contact = request.getParameter("contact");
       String email = request.getParameter("email");
       String address = request.getParameter("address");
       String area = request.getParameter("area");
       String fwidth= request.getParameter("front");
       String swidth= request.getParameter("side");
       String Rate = request.getParameter("Rate");
       String crate= request.getParameter("crate");
       String page = request.getParameter("age");
       String registered = request.getParameter("NA");
       String detail = request.getParameter("detail");
       
       
       Property p = new Property(pname, cname, contact, email, address, area, fwidth, swidth, Rate, crate, page, registered, detail);
       p.setPname(pname);
       p.setCname(cname);
       p.setEmail(email);
       p.setArea(area);
       p.setFwidth(fwidth);
       p.setSwidth(swidth);
       p.setRate(Rate);
       p.setCrate(crate);
       p.setPage(page);
       p.setRegi(registered);
       p.setContact(contact);
       p.setDetail(detail);
       p.setAddr(address);
       
       String msg= new Propertydao().insertDetail(p);
       if(!msg.equals(null)){
       	out.print("request sent");
			response.sendRedirect("allproperty.jsp");
		}
       else{
       	out.print("plzz fill the data");
       	response.sendRedirect("property.jsp");

       }
	}
       
       
       
	}



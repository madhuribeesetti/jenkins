package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.CustomerDetails;
import com.Service.BankService;

/**
 * Servlet implementation class CreateCustomer
 */
@WebServlet("/CreateCustomer")
public class CreateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		}
	
		
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		CustomerDetails cd=new CustomerDetails();
		int custid=Integer.parseInt(request.getParameter("custid"));
		String cname=request.getParameter("cname");
		String atype=request.getParameter("atype");
		float amount=Float.parseFloat(request.getParameter("amount"));
		String date=request.getParameter("date");
		
		System.out.println(custid);
		System.out.println(cname);
		
		cd.setCustid(custid);
		cd.setCname(cname);
		cd.setAtype(atype);
		cd.setAmount(amount);
		cd.setDate(date);
		BankService bs=new BankService();
		int status=bs.createCustomer(cd);
		
		if(status!=0){  
           
            request.getRequestDispatcher("success.html").forward(request, response);  
        }else if(status==0)
        {  
        	 request.getRequestDispatcher("failure.html").forward(request, response); 
        }  
        

	}
}
		
		
		
	



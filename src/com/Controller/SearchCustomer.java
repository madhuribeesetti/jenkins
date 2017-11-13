package com.Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.CustomerDetails;
import com.Service.BankService;


@WebServlet("/SearchCustomer")
public class SearchCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SearchCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String button=request.getParameter("button");
		System.out.println(button);
		if(button.equalsIgnoreCase("actionsearch")){
			
			int id=Integer.parseInt(request.getParameter("custid"));
			String date=request.getParameter("date");
			
			CustomerDetails user=new CustomerDetails();
			user.setCustid(id);
			user.setDate(date);
			System.out.println(id);
			System.out.println(date);
			
			BankService service=new BankService();
			try {
			ResultSet rs=service.searchCustomer(id, date);
			if(rs!=null){
				request.setAttribute("rs", rs);
			
				request.getRequestDispatcher("updateCustomer.jsp").forward(request,response);
			}
			else{
				request.setAttribute("message", "no values found");
				request.getRequestDispatcher("updateCustomer.jsp").forward(request,response);
			}
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		/*String button=request.getParameter("button");
		if(button.equalsIgnoreCase("search")){
			
		
		CustomerDetails cd=new CustomerDetails();
		BankService bs=new BankService();
		
		int custid=Integer.parseInt(request.getParameter("custid"));
		String date=request.getParameter("date");
		
		cd.setCustid(custid);
		cd.setDate(date);
		System.out.println(custid);
		System.out.println(date);
		
		int status=bs.searchCustomer(custid,date);
		
		if(status>0){  
           
            request.getRequestDispatcher("updateCusomer.jsp").forward(request, response);  
        }else
        {  
        	
        }  request.getRequestDispatcher("failure.html").forward(request, response);  
		
		
	}*/
	}
}

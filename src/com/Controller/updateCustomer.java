package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.CustomerDetails;
import com.Dao.BankDao;
import com.Service.BankService;

/**
 * Servlet implementation class updateCustomer
 */
@WebServlet("/updateCustomer")
public class updateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String button=request.getParameter("button");
		if(button.equalsIgnoreCase("update")){
			CustomerDetails cd=new CustomerDetails();
			int custid=Integer.parseInt(request.getParameter("custid"));
			
			float amount=Float.parseFloat(request.getParameter("amount"));
		
			
			System.out.println(custid);
			System.out.println(amount);
			cd.setCustid(custid);
			cd.setAmount(amount);
			System.out.println("values from bean "+cd.getCustid());
			System.out.println("values from bean"+cd.getAmount());
			BankDao dao=new BankDao();
			int status=0;
			status=dao.updateCustomer(cd);
			System.out.println("final status"+status);
			if(status!=0){  
		           
	            request.getRequestDispatcher("updatesuccess.html").forward(request, response);  
	        }
			
			else if(status==0){  
				request.getRequestDispatcher("updatefailure.html").forward(request, response); 
	        }  
	        
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		CustomerDetails cd=new CustomerDetails();
		int custid=Integer.parseInt(request.getParameter("custid"));
		
		float amount=Float.parseFloat(request.getParameter("amount"));
	
		
		System.out.println(custid);
		System.out.println(amount);
		cd.setCustid(custid);
		cd.setAmount(amount);
		System.out.println("calling service");
		BankService bs=new BankService();
		int status=0;
		
		try{
		status=bs.createCustomer(cd);
		System.out.println("final status:"+status);
		}
		catch (Exception e) {
		
		}
		if(status>0){  
           
            request.getRequestDispatcher("updatesuccess.html").forward(request, response);  
        }
		
		else{  
        	
        }  request.getRequestDispatcher("updatefailure.html").forward(request, response); 
        

	}		
}



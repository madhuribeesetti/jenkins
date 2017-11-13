package com.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Bean.CustomerDetails;
import com.Dao.BankDao;

public class BankService 
{
	BankDao dao=new BankDao();
	public int createCustomer(CustomerDetails cd) 
	{
		return dao.addCustomer(cd);	
	}

	

	public ResultSet searchCustomer(int id,String date) throws ClassNotFoundException, SQLException{
		ResultSet rs=null;
		try{
		BankDao dao=new BankDao();
		rs=dao.searchCustomer(id, date);
		}
		catch (ClassNotFoundException | SQLException e) {
		 e.printStackTrace();
		}
		
		return rs;
		
	}
	public int DeleteCustomer(int custid) {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(custid);
	}


	public int updateCustomer(CustomerDetails cd){
		int status=0;
		status=dao.updateCustomer(cd);
		return status;
		
	}
	

	
}

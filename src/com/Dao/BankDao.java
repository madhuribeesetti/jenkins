package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Bean.CustomerDetails;

public class BankDao 
{
	Connection con=null;  
	/* public static  Connection getConnection(){  
	        Connection con=null;  
	        try{  
	            Class.forName("com.mysql.jdbc.Driver");  
	            con=DriverManager.getConnection("jdbc:mysql://testaws1.ce1xnn9brlzu.ap-south-1.rds.amazonaws.com:3306/test",
	            		"testaws1","testaws1");
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  */
	
	
	
	 public  int addCustomer(CustomerDetails cd)
	 {  
	        int status=0;  
	        try{  
	           // Connection con=BankDao.getConnection();  
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://testaws1.ce1xnn9brlzu.ap-south-1.rds.amazonaws.com:3306/test",
	            		"testaws1","testaws1");
	            System.out.println(cd.getCustid());
	            System.out.println(cd.getCname());
	            System.out.println(cd.getDate());
	            System.out.println(cd.getAtype());
	            System.out.println(cd.getAmount());
	            
	           PreparedStatement ps=con.prepareStatement("insert into Amount1280 values(?,?,?,?,?)");  
	            ps.setInt(1,cd.getCustid());
	            ps.setString(2,cd.getCname());  
	            ps.setString(3,cd.getAtype());  
	            ps.setFloat(4,cd.getAmount());  
	            ps.setString(5,cd.getDate());  
	              
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	  }

	 public int deleteCustomer(int custid) 
		{
			  int status=0;  
		        try
		        {  
		        	 Class.forName("com.mysql.jdbc.Driver");
			         con=DriverManager.getConnection("jdbc:mysql://54.255.218.198:3306/test","root","naveen");
		            PreparedStatement ps=con.prepareStatement("delete from Amount1280 where custid=?");  
		            ps.setInt(1,custid);  
		            status=ps.executeUpdate();        
		            con.close();  
		        }
		        catch(Exception e){
		        	e.printStackTrace();
		        	}    
		        return status;  
		}
	 
	public int updateCustomer(CustomerDetails cd)
	{
		 int status=0;  
	        try{  
	        	System.out.println("inside update method");
	           
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://54.255.218.198:3306/test","root","naveen");
	            PreparedStatement ps=con.prepareStatement("update Amount1280 set amount=? where custid=?");  
	              ps.setFloat(1,cd.getAmount());  
	              ps.setInt(2, cd.getCustid());
	            status=ps.executeUpdate();  
	              System.out.println("status is "+ status);
	            con.close();  
	        }
	        catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	  
	}
public ResultSet searchCustomer(int id,String date) throws ClassNotFoundException, SQLException
{
	ResultSet rs = null;

	if(id!=0&&date!=null)
	{
		try
		{
		System.out.println("Inside searchLeave ");
		Connection con=null;
		PreparedStatement ps=null;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://54.255.218.198:3306/test","root","naveen");
		ps=con.prepareStatement("SELECT * FROM Amount1280 WHERE custid =? AND date =? ");
		ps.setInt(1, id);
		ps.setString(2, date);
		rs=ps.executeQuery();
		
		}			
		catch(SQLException e){
			e.printStackTrace();
				}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	return rs;
}
}
	
	

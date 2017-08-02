package sailorboatServer;  
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebService;  
  
@WebService(endpointInterface="sailorboatServer.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{  
	static ArrayList<String[]> marina = new ArrayList<String[]>();
	public String FetchfromDatabase(String input)
	{
		String result="";
		String a[]=input.split("!");
		String cols[]={"FIRST_NAME","LAST_NAME","BOAT_TYPE","LENGTH","YEAR_BUILT","MOTOR_TYPE","SLIPFEE_PAID","DOCK"};
		String cond="";
		for (int k=0;k<a.length;k++)
		{
			if (!(a[k].equals("empty")))
				cond+=cols[k]+"="+'"'+a[k]+'"'+" AND ";
		}
		cond+="1=1;";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://:3306/sailorboat","root","S3tupguy!!!");  
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM sailorboat WHERE "+cond);
			while (rs.next()) {
	            //String s = rs.getString("slipNo");
	            String Fname = rs.getString("FIRST_NAME");
	            String Lname = rs.getString("LAST_NAME");
	            String Type = rs.getString("BOAT_TYPE");
	            String Year = rs.getString("LENGTH");
	            String Length = rs.getString("YEAR_BUILT");
	            String Motor = rs.getString("MOTOR_TYPE");
	            String Paid = rs.getString("SLIPFEE_PAID");
	            String Dock = rs.getString("DOCK");
	            result+= Fname + " " + Lname + " " + Type + " " + Year + " " + Length + " " + Motor + " " + Paid+ " " + Dock+" !";
	        
	    }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return result;
		
	}
	public String helloWorld(String input) {	 
	 ArrayList<String[]> result = new ArrayList<String[]>();
	 String[] row1 = {"SUHAS","SURESH","CATALINA","20","2001","INBOARD","YES","A15"};
	 String[] row2 = {"JOHN","SMITH","CATALINA","25","2009","INBOARD","YES","A10"};
	 String[] row3 = {"MARK","TAYLOR","CATALINA","18","2005","OUTBOARD","NO","B10"};
	 String[] row4 = {"JAMES","TAYLOR","HUNTER","32","2010","INBOARD","NO","B32"};
	 String[] row5 = {"GEORGE","SMITH","HUNTER","15","2001","OUTBOARD","YES","B41"};
	 String[] row6 = {"SUHAS","SURESH","CATALINA","20","2001","OUTBOARD","NO","A25"};
	 marina.add(row1);
	 marina.add(row2);
	 marina.add(row3);
	 marina.add(row4);
	 marina.add(row5);
	 marina.add(row6);
	 String a[]=input.split("!");
	 String [] b= new String[8];
	 for(int i=0;i<a.length;i++)
     {
     	System.out.println("a="+a[i]);
     }
	 String resultant="";
	 for(int i=0;i<marina.size();i++)
	 {
		   String[] myString= new String[8]; 
		   myString=marina.get(i);
		   if ((myString[0].equals(NVL(a[0],myString[0]))) && (myString[1].equals(NVL(a[1],myString[1]))) && (myString[2].equals(NVL(a[2],myString[2]))) && (myString[3].equals(NVL(a[3],myString[3]))) && (myString[4].equals(NVL(a[4],myString[4]))) &&(myString[5].equals(NVL(a[5],myString[5]))) && (myString[6].equals(NVL(a[6],myString[6]))) && (myString[7].equals(NVL(a[7],myString[7]))))
	        	   {

	        		   result.add(myString);      		   
	        		   
	        	   }
	 }
	 for(int i=0;i<result.size();i++)
	 {
		   String[] resString= new String[8]; 
		   resString=result.get(i);
		   for(int j=0;j<resString.length;j++)
		   {	   
			  System.out.println("!!!"+resString[j]);
			  resultant=resultant.concat(resString[j]);
			  resultant=resultant.concat(" ");
		   }
		   resultant=resultant.concat("!");
	 }
	 if (resultant.equals(""))
		 return "No data found";
	 else
	 {
		 System.out.println("The resultant string is "+resultant); 
		 return resultant; 
	 }
}
	public String update(String input) {	
		String a[]=input.split("!");		
		String cols[]={"FIRST_NAME","LAST_NAME","BOAT_TYPE","LENGTH","YEAR_BUILT","MOTOR_TYPE","SLIPFEE_PAID","DOCK"};
		String cond="";
		for (int k=0;k<a.length-1;k++)
		{
			if (!(a[k].equals("empty")))
				cond+=cols[k]+"="+'"'+a[k]+'"';
			if (k<7)
				cond+=",";
		}
		cond+="WHERE Boat_id="+a[8];
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost/sailorboat","root","S3tupguy!!!");  
			//here sonoo is database name, root is username and password
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate("update sailorboat set "+cond);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "A row updated";
	}
	
	public String NVL(String a, String b) {
		System.out.println("Coming here to check if its empty\n"+a+" "+b);
		if (a.equals("empty"))
				return b;
		else
			return a;
		}
	public String insert(String input) {	
		String a[]=input.split("!");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost/sailorboat","root","S3tupguy!!!");  
			//here sonoo is database name, root is username and password
			
			Statement stmt=con.createStatement();
		    String sql = "INSERT INTO sailorboat " +
		                   "VALUES ("+25+",'"+a[0]+"',"+"'"+a[1]+"',"+"'"+a[2]+"',"+a[3]+","+a[4]
		    			   +","+"'"+a[5]+"',"+"'"+a[6]+"',"+"'"+a[7]+"')";
		    stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "A new row inserted";
	}
}

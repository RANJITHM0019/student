

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class connection{
	public static boolean registerStudent(String nam,String father,String pass,String gender,String depart,String phone,String add,String date,String email){  
		boolean status=false;  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","12345");  
		      
		PreparedStatement ps=con.prepareStatement("insert into `studentregister`(`name`,`father`,`pass`,`gender`,`depart`,`phone`,`add`,`date`,`email`)value(?,?,?,?,?,?,?,?,?)");  
		ps.setString(1,nam);  
		ps.setString(2,father);
		ps.setString(3,pass);
		ps.setString(4,gender);
		ps.setString(5,depart);  
		ps.setString(6,phone);
		ps.setString(7,add);
		ps.setString(8,date);
		ps.setString(9,email); 
		if(ps.executeUpdate()>0){
            status=true;
        }
		} catch (Exception e) {
		System.out.println(e);
	}
	return status;
		}
	
	
    public static boolean registerTeacher(String name,String father,String pass,String gender,String depart,String phone,String add,String date,String email){  
	boolean status=false;  
	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","12345");  
	      
	PreparedStatement ps=con.prepareStatement("insert into `teacherregister`(`name`,`father`,`pass`,`gender`,`depart`,`phone`,`add`,`date`,`email`)value(?,?,?,?,?,?,?,?,?)");  
	ps.setString(1,name);  
	ps.setString(2,father);
	ps.setString(3,pass);
	ps.setString(4,gender);
	ps.setString(5,depart);  
	ps.setString(6,phone);
	ps.setString(7,add);
	ps.setString(8,date);
	ps.setString(9,email);   
	if(ps.executeUpdate()>0){
        status=true;
    }
	} catch (Exception e) {
	System.out.println(e);
}
return status;
	}


      public static boolean Studentlogin(String name,String pass ){  
	boolean status=false;  
	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","12345");  
	      
	PreparedStatement ps=con.prepareStatement("select * from Studentregister where name=? and pass=?");  
	ps.setString(1,name);  
	ps.setString(2,pass);
	ResultSet rs=ps.executeQuery();  
	status=rs.next();  
	          
	}catch(Exception e){System.out.println(e);}  
	return status;  
	}

     public static boolean  teacherlogin (String name,String pass ){  
	boolean status=false;  
	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","12345");  
	      
	PreparedStatement ps=con.prepareStatement("select * from  teacherregister where name=? and pass=?");  
	ps.setString(1,name);  
	ps.setString(2,pass);
	ResultSet rs=ps.executeQuery();  
	status=rs.next();  
	          
	}catch(Exception e){System.out.println(e);}  
	return status;  
	}  
     public static boolean  delete(String name){  
    		boolean status=false;  
    		try{  
    		Class.forName("com.mysql.cj.jdbc.Driver");  
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","12345");  
    		      
    		PreparedStatement ps=con.prepareStatement("delete from `studentregister` where `name`=?");  
    		ps.setString(1,name);  
    		ResultSet rs=ps.executeQuery();  
    		status=rs.next();  
    		          
    		}catch(Exception e){System.out.println(e);}  
    		return status;  
    		}  
  
   
public static boolean update(String name,String father,String pass,String gender,String depart,String phone,String add,String date,String email){  
	boolean status=false;  
	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","12345");  
	      
	PreparedStatement ps=con.prepareStatement("update `studentregister`set`father`=?,`pass`=?,`gender`=?,`depart`=?,`phone`=?,`add`=?,`date`=?,`email`=? where `name`=?");  
	ps.setString(1,name);  
	ps.setString(2,father);
	ps.setString(3,pass);
	ps.setString(4,gender);
	ps.setString(5,depart);  
	ps.setString(6,phone);
	ps.setString(7,add);
	ps.setString(8,date);
	ps.setString(9,email);   
	if(ps.executeUpdate()>0){
       status=true;
   }
	} catch (Exception e) {
	System.out.println(e);
}
return status;
	}

public static boolean add(String name,String d,String p ){ 
	System.out.println(name+" "+d+" "+p);
boolean status=false;  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","12345");  
    
PreparedStatement ps=con.prepareStatement("insert into `present` (`name`, `date`,`present`) value(?,?,?)");  
ps.setString(1,name);  
ps.setString(2,d);
ps.setString(3,p);
if(ps.executeUpdate()>0){
    status=true;
    System.out.println(status);
}
}catch(Exception e){System.out.println(e);}  
return status;  
}
}
   
    


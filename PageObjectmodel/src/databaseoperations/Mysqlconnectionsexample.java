package databaseoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysqlconnectionsexample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	Class.forName("com.mysql.jdbc.Driver");
					
  	Connection connection =DriverManager.getConnection("jdbc:mysql://root@localhost/sri");
		
//		Connection connection =DriverManager.getConnection("http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=sri");
		
		Statement statement = connection.createStatement();
		
	ResultSet result=statement.executeQuery( "Select * FROM `month`");
	
	
	while (result.next()) {
		
		System.out.println("april:" + result.getString(1) +" income:"+result.getInt(2) +" expenses:"+result.getInt(3));
	}		
				
	
		
		
		

	}

}

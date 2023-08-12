//Let's create Dao class which contains JDBC code to connect with MySQL database. Add the following code to an EmployeeDao class:


package net.Toheeb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.Toheeb.model.User;


public class UserDao {
	// Required attribute for getting a connection with the database;
	private String dburl="jdbc:mysql://localhost:3306/facebook";
	private String dbuname="root";
	private String dbpassword="24Septembers$";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver) // Load the jdbc Driver
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
	// get a connection from the database
	public Connection getConnection()
	{
		Connection con = null;
		try {
			DriverManager.getConnection(dburl,dbuname,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public String insert(User user)
	{
		loadDriver (dbdriver);  // 
		Connection con = getConnection();
		String result = "data entered succesfully";
		String sql = "insert into facebook.facebookusers values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getFirst_name());
			ps.setString(2, user.getLast_name());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getContact());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
			
		}
		return result;
		
		
	}
}
//Program to define Service class for DML operation on student table
package com.tnsif.daytwentytwo.v1.usingpreparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentService {
	static PreparedStatement pst;
	static Connection con;
	
	static
	{
		con=DBUtil.getCn();
		if (con!=null)
			System.out.println("Connection ok");
	}
	
	public static int addStudent(int id, String name, String city) 
	{
		int n = 0;
		try {
			String sql="INSERT INTO student values (?,?,?)"; 
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, city);
			n = pst.executeUpdate();
		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return n;
	}
	public static int deleteStudentById(int id) 
	{
		int n=0;
		String sql;
		//sql="DELETE FROM student WHERE id ="+id;
		sql="DELETE FROM student WHERE id = ?";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);		
			n=pst.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	
	public static int updateStudent(int id, String city) 
	{
		int n=0;
		String sql;
		//sql="UPDATE student SET city='"+city+"' WHERE id="+id;
		sql="UPDATE student SET city = ? WHERE id = ?";
		try {
			pst=con.prepareStatement(sql);
		
		pst.setString(1, city);
		pst.setInt(2, id);
		n=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	
	public static void displayAllStudents() throws SQLException
	{
		String sql;
		sql="SELECT * FROM student";
		pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
	}
	
	public static void displayStudentsBasedOnCity(String city) throws SQLException
	{
		String sql;
		sql="SELECT * FROM student WHERE city=?";
		pst=con.prepareStatement(sql);
		pst.setString(1,city);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
	}
}

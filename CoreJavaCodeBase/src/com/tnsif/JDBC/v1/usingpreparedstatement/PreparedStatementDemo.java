//Program to demonstrate PreparedStatement 
package com.tnsif.daytwentytwo.v1.usingpreparedstatement;

import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		try {
			int id, n;
			String name,city;
			Scanner sc=new Scanner(System.in);
			StudentService.displayAllStudents();
			System.out.println("--------------------------");
			System.out.println("Enter City : ");
			city=sc.next();
			StudentService.displayStudentsBasedOnCity(city);
			System.out.println("--------------------------");
			
			System.out.println("Enter student id, name and city to insert....");
			id=sc.nextInt();
			name=sc.next();
			city=sc.next();
			n=StudentService.addStudent(id, name, city);
			System.out.println(n+" Record inserted successfully.....");
			
			System.out.println("------------------------------");
			System.out.println("Enter Id to be delete....");
			id=sc.nextInt();
			n=StudentService.deleteStudentById(id);
			System.out.println(n+" Record Deleted successfully.....");
			System.out.println("-------------------------------------------");
			
			System.out.println("Enter student id, new city ....");
			id=sc.nextInt();
			city=sc.next();
			n=StudentService.updateStudent(id, city);
			System.out.println(n+" Record Update successfully.....");
			System.out.println("-------------------------------------------");
			StudentService.displayAllStudents();
		} catch (SQLException e) {
			
			//e.printStackTrace();
			System.out.println("Error Occurred..."+e);
		}
		
	}

}

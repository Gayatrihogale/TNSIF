//Program to demonstrate Statement Interface
package com.tnsif.daytwentytwo.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.*;

public class Executor {

	public static void main(String[] args) {
		StatementInterfaceDemo.showEmp();
		System.out.println("----------------------------------------------");
		System.out.println(StatementInterfaceDemo.updateEmpName(5, "Neha"));
		StatementInterfaceDemo.updateEmpSalary(5, 65000);
		System.out.println("-------------After Updating Name and Salary------------");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.deleteEmp(5);
		StatementInterfaceDemo.deleteEmp(101);
		StatementInterfaceDemo.deleteEmp(102);
		System.out.println("-----------After Deleting --------------------");
		StatementInterfaceDemo.showEmp();

	}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.java;

/**
 *
 * @author alembershreesh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public static Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/user_registration";
		String user = "root";
		String password="adminalu";
//		System.out.println("Hello");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Error in sql query");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(conn!=null) {
			System.out.println("");
		}
		else {
			System.out.println("Connection in not establish");
		}
		return conn;
		
	}
}

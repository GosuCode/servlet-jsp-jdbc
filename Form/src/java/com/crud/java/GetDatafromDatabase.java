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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class GetDatafromDatabase {
    public static void Main(String[] args) throws SQLException {
			Connection con = DbConnect.getConnection();
			String query = "Select * from userdetail";
			Statement stmt = con.createStatement();
			List<UserData> list = new ArrayList<UserData>();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			
			String age = rs.getString("age");
			String address = rs.getString("address");
			
			 UserData userdata = new UserData();
	   
			}
			
		}
			
			
	public static void main(String[] args) throws SQLException {
		new GetDatafromDatabase();
	}
}

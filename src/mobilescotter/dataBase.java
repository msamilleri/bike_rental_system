/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobilescotter;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mustafasamil.ileri
 */
public class dataBase {
    
    private  String database_connection_string = "jdbc:postgresql://localhost:5432/postgres";

    private  String database_user_name = "postgres";

    private  String database_user_password = "1234";
    
    static Connection conn = null; 
    
    public Connection connect() {

      //  Connection conn = null;

        try {

            conn = DriverManager.getConnection(database_connection_string, database_user_name, database_user_password );

            System.out.println("You are successfully connected to the PostgreSQL database server.");

        } catch (SQLException e) 

        {

            System.out.println(e.getMessage());

        }



        return conn;

    }
    
  static ResultSet listele(String sorgu) {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sorgu);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
    
/*
    public static void main(String[] args) {
       
       dataBase conn=new dataBase();
       conn.connect();
    }*/
    
}

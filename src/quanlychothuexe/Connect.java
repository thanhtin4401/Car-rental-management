/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlychothuexe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author ThanhTin
 */
public class Connect {
    private int sno;
    private byte[] picture;
        public Connection getConnection(){ 
        Connection conn = null;
        try{
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              conn =(Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyChoThueXe;","sa","1");
              if(conn!=null){
                  System.out.println("Ket noi thanh cong");
              }
                }catch(Exception ex){
                    System.out.println(ex.toString());
                }
        return conn ;
        
}
         public byte[] getImage(){
        return picture;
        }
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymtemp;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shan Wijenayaka
 */
public class LoginFunc {
    private static String logName;
    public void setLogName(String lg){
        logName = lg;
    }
    public String getLogName(){
        return logName;
    }
    public boolean checkLogin(String name, String password,int flag){
        Connection conn = new DBConnection().connect();
        
        try{
            String sql;
            if(flag==0)
                sql = "select * from  cust where name = ? and pass =? ";
            else
                sql = "select * from  officer where name = ? and pass =? ";
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1,name);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
           
            
            
                if(rs.next()){
                    //LogIn.this.setVisible(false);
                    //JOptionPane.showMessageDialog(null, "welcome");
                    System.out.println("correct uname pword");
                    
                    
                   
                     
                    setLogName(name);
                    return true;
                    //System.out.println("logger value from login clz :"+log);
                    
                    
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Username or Password is incorrect");
                    System.out.println("incorrect uname pword"+name+" "+password);
                    return false;
                                        
                }
                
            
            
        } catch (SQLException ex) {
            System.out.println("sql exception in submit btn :"+ex);
           // Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(HeadlessException ez){
        System.out.println("Error :"+ez);
    }
        
        
    return false;
    }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymtemp;

/**
 *
 * @author ASUS
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author Shan Wijenayaka
 */
public class addTrainerfnc {
    
    
   
    
    Connection conn = new DBConnection().connect();
    void addToTrainerDetails(String memName,  String HallNo, String StartTime) {
    try {
        PreparedStatement ps;
        ps = conn.prepareStatement("insert into "
                + "trainers"+"(id,hall,stime) "
                + "values(?,?,?)");
        
        ps.setString(1, memName);
        ps.setString(2,HallNo);
        ps.setString(3, StartTime);
        
        
        
        
        JOptionPane.showMessageDialog(null, memName+"'s information succefully entered to the database");
        
        ps.executeUpdate();
    
    
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "error: "+ex);
    }
        
    }
}
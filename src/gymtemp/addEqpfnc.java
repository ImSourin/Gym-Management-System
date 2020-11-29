/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymtemp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class addEqpfnc {
     
    
    Connection conn = new DBConnection().connect();
    void addToEqpDetails(String eqp,  String HallNo) {
    try {
        PreparedStatement ps;
        ps = conn.prepareStatement("insert into "
                + "equipment"+"(eqid,hall) "
                + "values(?,?)");
        
        ps.setString(1, eqp);
        ps.setString(2,HallNo);
       
        
        JOptionPane.showMessageDialog(null, " information succefully entered to the database");
        
        ps.executeUpdate();
    
    
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "error: "+ex);
    }
        
    }
    
}

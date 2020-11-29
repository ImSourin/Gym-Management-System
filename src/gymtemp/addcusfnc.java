/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymtemp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class addcusfnc {
    Connection conn = new DBConnection().connect();
    boolean check(String name, String id,String plan, String Hall,String trainer)
    {
        try {
            String sql1 = "Select * from customers Where trainer = ? OR plan = ?";
            
                PreparedStatement ps;
                
                ps = conn.prepareStatement(sql1);
                
                ps.setString(1, trainer);
                ps.setString(2, plan);
                ResultSet rs = ps.executeQuery();
                int tcount=0,pcount=0;
                while(rs.next())
                {
                    String t =  rs.getString("trainer");
                    String p =  rs.getString("plan");
                    if(t.equals(trainer))
                        tcount++;
                    if(p.equals(plan))
                        pcount++;
                }
                if(tcount > 5 || pcount > 5){
                    return false;
                }
                return true;
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null, "error: "+ex);
        }
        return false;
    }
    void addToCustomerDetails(String name, String id,String plan, String Hall,String trainer) {
    try {
        PreparedStatement ps;
        if(!check(name,id,plan,Hall,trainer))
            throw new SQLException();
        ps = conn.prepareStatement("insert into "
                + "customers"+"(id,name,hall,plan,trainer) "
                + "values(?,?,?,?,?)");
        
        ps.setString(1, id);
        ps.setString(2,name);
        ps.setString(3,Hall);
        ps.setString(4,plan);
        ps.setString(5,trainer);
        
        
        
        
        JOptionPane.showMessageDialog(null, " information succefully entered to the database");
        
        ps.executeUpdate();
    
    
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Trainer Burdened ");
    }
        
    }

}

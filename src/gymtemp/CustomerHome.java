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
public class CustomerHome extends javax.swing.JFrame {
    String pname;
    /**
     * Creates new form CustomerHome
     */
    public CustomerHome(String s) {
        initComponents();
        pname = s;
        jButton2.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        hall = new javax.swing.JTextField();
        plan = new javax.swing.JTextField();
        trainer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        planlist = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        halllist = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        trainerlist = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Trainer");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 59, 33));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 182, 59, 33));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GymHall");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 233, 59, 33));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Plan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 284, 59, 33));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Trainer");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 335, 59, 33));

        name.setBackground(new java.awt.Color(102, 102, 102));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(null);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 108, -1));

        id.setBackground(new java.awt.Color(102, 102, 102));
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(null);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 188, 108, -1));

        hall.setBackground(new java.awt.Color(102, 102, 102));
        hall.setForeground(new java.awt.Color(255, 255, 255));
        hall.setBorder(null);
        hall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallActionPerformed(evt);
            }
        });
        jPanel1.add(hall, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 233, 108, 20));

        plan.setBackground(new java.awt.Color(102, 102, 102));
        plan.setForeground(new java.awt.Color(255, 255, 255));
        plan.setBorder(null);
        jPanel1.add(plan, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 290, 108, -1));

        trainer.setBackground(new java.awt.Color(102, 102, 102));
        trainer.setForeground(new java.awt.Color(255, 255, 255));
        trainer.setBorder(null);
        jPanel1.add(trainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 341, 108, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Go");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 90, 30));

        planlist.setColumns(20);
        planlist.setRows(5);
        planlist.setBorder(null);
        jScrollPane1.setViewportView(planlist);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 170, 120));

        halllist.setColumns(20);
        halllist.setRows(5);
        halllist.setBorder(null);
        jScrollPane2.setViewportView(halllist);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, 116));

        trainerlist.setColumns(20);
        trainerlist.setRows(5);
        trainerlist.setBorder(null);
        jScrollPane3.setViewportView(trainerlist);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, 116));

        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 299, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymtemp/images/icons8_Delete_50px.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 120, 21));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 120, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 120, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 120, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 120, 20));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add Details");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 280, 60));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Trainer List");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 150, 50));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Plan List");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 150, 40));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Hall List");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 150, 50));

        jButton7.setBackground(new java.awt.Color(153, 255, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymtemp/images/icons8_Undo_50px_1.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        setBounds(500, 200, 979, 578);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ResultSet rs1 = null, rs2 = null, rs3 = null;
        try{
            String sql1 = "Select * from trainers ";
            
            PreparedStatement ps;
            Connection conn = new DBConnection().connect();
            ps = conn.prepareStatement(sql1);

                
            rs1 = ps.executeQuery();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error: "+e);
        }
        try{
            String sql1 = "Select * from hall ";
            
            PreparedStatement ps;
            Connection conn = new DBConnection().connect();
            ps = conn.prepareStatement(sql1);

                
            rs2 = ps.executeQuery();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error: "+e);
        }
        try{
            String sql1 = "Select * from plan ";
            
            PreparedStatement ps;
            Connection conn = new DBConnection().connect();
            ps = conn.prepareStatement(sql1);

                
            rs3 = ps.executeQuery();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error: "+e);
        }   
        int flag = 0;
        try{
        while(rs1.next())
                {
                    if(rs1.getString("id").equals(trainer.getText())){
                        flag++;
                        break;
                    }
                }
        while(rs2.next())
                {
                    if(rs2.getString("hallid").equals(hall.getText())){
                        flag++;
                        break;
                    }
                }
        while(rs3.next())
                {
                    if(rs3.getString("pid").equals(plan.getText())){
                        flag++;
                        break;
                    }
                }
        if(flag == 3 && name.getText() != null && id.getText() != null){
            new addcusfnc().addToCustomerDetails(name.getText(),id.getText(),plan.getText(),hall.getText(),trainer.getText());
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        }catch(SQLException e){
            System.out.println("Failure");
            JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try {
            String sql1 = "Select * from trainers ";
                name.setEditable(false);
                name.setText(pname);
                PreparedStatement ps;
                Connection conn = new DBConnection().connect();
                ps = conn.prepareStatement(sql1);
                
                
                ResultSet rs = ps.executeQuery();
                trainerlist.setEditable(false);
                planlist.setEditable(false);
                halllist.setEditable(false);
                trainerlist.setText("id \t hall \t stime \n");
                while(rs.next())
                {
                    trainerlist.append(rs.getString("id")+"\t"+rs.getString("hall")+"\t"+rs.getString("stime")+"\n");
                }
                planlist.setText("planid \t equipmentid \t time \n");
                sql1 = "Select * from plan ";
            
                
                conn = new DBConnection().connect();
                ps = conn.prepareStatement(sql1);
               
                rs = ps.executeQuery();
                while(rs.next())
                {
                    planlist.append(rs.getString("pid")+"\t"+rs.getString("eqid")+"\t"+rs.getString("time")+"\n");
                }
                halllist.setText("hallid \t time \n");
                sql1 = "Select * from hall ";
            
                
                conn = new DBConnection().connect();
                ps = conn.prepareStatement(sql1);
                
                
                rs = ps.executeQuery();
                while(rs.next())
                {
                    halllist.append(rs.getString("hallid")+"\t"+rs.getString("time")+"\n");
                }
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null, "error: "+ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void hallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hallActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Login().setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerHome("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hall;
    private javax.swing.JTextArea halllist;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField name;
    private javax.swing.JTextField plan;
    private javax.swing.JTextArea planlist;
    private javax.swing.JTextField trainer;
    private javax.swing.JTextArea trainerlist;
    // End of variables declaration//GEN-END:variables
}

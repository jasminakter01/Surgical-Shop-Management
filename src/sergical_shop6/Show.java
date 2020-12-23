/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sergical_shop6;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

 
public class Show extends javax.swing.JFrame {

   Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    public Show() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Create New User Account");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel8);
        jLabel8.setBounds(550, 420, 270, 30);

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        desktopPane.add(password);
        password.setBounds(530, 300, 320, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Password");
        desktopPane.add(jLabel6);
        jLabel6.setBounds(530, 270, 320, 20);

        user.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });
        desktopPane.add(user);
        user.setBounds(530, 230, 320, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("User Name");
        desktopPane.add(jLabel5);
        jLabel5.setBounds(530, 200, 320, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(520, 120, 340, 60);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        desktopPane.add(jComboBox1);
        jComboBox1.setBounds(520, 50, 80, 30);

        jLabel7.setBackground(new java.awt.Color(61, 42, 127));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Login");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel7);
        jLabel7.setBounds(590, 350, 150, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bil.png"))); // NOI18N
        desktopPane.add(jLabel10);
        jLabel10.setBounds(40, 30, 460, 450);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(900, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(user.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "User Name Is Empty..");
            user.requestFocus();
        }else if(password.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Password Is Empty..");
            password.requestFocus();
        } else{
            if(jComboBox1.getSelectedIndex()==0)
            {
                try {
                    String s="SELECT  `username`, `password` FROM  `user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
                    contest();
                    st=ct.prepareCall(s);
                    rs=st.executeQuery(s);
                    if(rs.next()){
                        NewMDIApplication hp=new NewMDIApplication();
                        hp.setVisible(true);
                        dispose();

                    }else{
                        JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");

                    }   } catch (SQLException ex) {
                        Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }else{
                    try {
                        String s="SELECT  `username`, `password` FROM  `user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
                        contest();
                        st=ct.prepareCall(s);
                        rs=st.executeQuery(s);
                        if(rs.next()){
                            NewMDIApplication hp=new NewMDIApplication();
                            hp.setVisible(true);
                            dispose();

                        }else{
                            JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");

                        }   } catch (SQLException ex) {
                            Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                }

    }//GEN-LAST:event_jLabel7MouseClicked
public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/sergical_shop", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
        } }
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Create_User_Pass c=new Create_User_Pass();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(user.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "User Name Is Empty..");
                user.requestFocus();
            }else if(password.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Password Is Empty..");
                password.requestFocus();
            } else{
                if(jComboBox1.getSelectedIndex()==0)
                {
                    try {
                        String s="SELECT  `username`, `password` FROM `pharmacy_management`.`user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
                        contest();
                        st=ct.prepareCall(s);
                        rs=st.executeQuery(s);
                        if(rs.next()){
                            NewMDIApplication hp=new NewMDIApplication();
                            hp.setVisible(true);
                            dispose();

                        }else{
                            JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");

                        }   } catch (SQLException ex) {
                            Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }else{
                        try {
                            String s="SELECT  `username`, `password` FROM `pharmacy_management`.`user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
                            contest();
                            st=ct.prepareCall(s);
                            rs=st.executeQuery(s);
                            if(rs.next()){
                                NewMDIApplication hp=new NewMDIApplication();
                                hp.setVisible(true);
                                dispose();

                            }else{
                                JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");

                            }   } catch (SQLException ex) {
                                Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }

                    }

                }
    }//GEN-LAST:event_passwordKeyPressed

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            password.requestFocus();

        }

    }//GEN-LAST:event_userKeyPressed

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_userKeyTyped

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
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

}

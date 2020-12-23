package sergical_shop6;  
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame { 
int a=0;
Connection_Class con; 
    public NewJFrame() {
        initComponents();
      //  jButton2.setVisible(false);
      con=new Connection_Class();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 200, 73, 23);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 250, 73, 23);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 80, 100, 70);

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 170, 73, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(440, 20, 452, 402);
        getContentPane().add(desktopPane);
        desktopPane.setBounds(0, 0, 1350, 700);

        setSize(new java.awt.Dimension(1082, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String strHeader="EMP ID||EMP NAME||DESIGNATION";
       String[] arrStrColumnsInRow=strHeader.split("\\|\\|");
       String s="Jasmin || AKter";
       String[] x=  s.split("\\|\\|");
           JOptionPane.showMessageDialog(this,x[0]);
    String d="29284753447358394356";
    double a=Double.parseDouble(d);
    int aa=2147483647;
        JOptionPane.showMessageDialog(this, a);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int aa=0;
            String s="SELECT\n" +
"  `su_name`,\n" +
"  `purchase_bill_no`,\n" +
"  `Catagory`,\n" +
"  `product_name`,\n" +
"  `pu_date`,\n" +
"  `pu_quantity`,\n" +
"  `pu_price`,\n" +
"  `payment`,\n" +
"  `status`,\n" +
"  `gr_number`\n" +
"FROM `sergical_shop`.`purchase`";
            
            con.contest();
            
            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            while(con.rs.next()){
                 String su_name=con.rs.getString(1);
                 String purchase_bill_no=con.rs.getString(2);
                 String Catagory=con.rs.getString(3);
                 String product_name=con.rs.getString(4);
                 String pu_date=con.rs.getString(5);
                 String pu_quantity=con.rs.getString(6);
                 String pu_price=con.rs.getString(7);
                 String payment=con.rs.getString(8);
                 String status=con.rs.getString(9);
               //  String gr_number=con.rs.getString(10); 
                 
                 aa=aa+1;
             String query=" UPDATE `sergical_shop`.`purchase` SET `gr_number` = '"+aa+"' WHERE `su_name` = '"+su_name+"' AND `purchase_bill_no` = '"+purchase_bill_no+"'\n" +
"    AND `Catagory` = '"+Catagory+"'\n" +
"    AND `product_name` = '"+product_name+"'\n" +
"    AND `pu_date` = '"+pu_date+"'\n" +
"    AND `pu_quantity` = '"+pu_quantity+"'\n" +
"    AND `pu_price` = '"+pu_price+"'\n" +
"    AND `payment` = '"+payment+"'\n" +
"    AND `status` = '"+status+"'";
                Data_Operation(query, "Update");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try {
          DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
       String dd="";
        con.contest(); 
        String s="SELECT `company` FROM `sales_acoount` GROUP BY `company` ORDER BY `company` ASC";
        con.st = con.ct.prepareCall(s);
        con.rs = con.st.executeQuery(s);
        if(con.rs.next()){
           dd=con.rs.getString(1);
         dt.addRow(new Object[]{dd,dd});
        }
        while(con.rs.next()){
           
          dt.addRow(new Object[]{con.rs.getString(1),dd});
          }
    } catch (SQLException ex) {
        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton3ActionPerformed
   
    void Data_Operation(String query,String msg){
        try {
            
            con.contest();
            
            
            // JOptionPane.showMessageDialog(this, "j");
            double   result=con.st.executeUpdate(query);
            if(result>0){
               a=a+1;
            jLabel1.setText(""+a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
} 
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

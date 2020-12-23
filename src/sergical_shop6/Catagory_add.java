 
package sergical_shop6;
  
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Catagory_add extends javax.swing.JFrame {
  Connection_Class con;
   int count=0;
   
    public Catagory_add() {
        initComponents();
           con=new Connection_Class();
           Show();
           jButton4.setVisible(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Category   :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 80, 100, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(100, 80, 250, 30);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 190, 100, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(360, 70, 370, 300);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 240, 100, 23);

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(170, 190, 100, 23);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(280, 190, 70, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*Search By Category");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 10, 170, 20);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(360, 30, 360, 30);
        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1370, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 420);

        setSize(new java.awt.Dimension(777, 413));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int Authintication(){
    int e=0;
if(jTextField1.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Catagory is Empty");
jTextField1.requestFocus();
}else{
e=1;
}

return e;}



 
void Data_Operation(String query,String msg){
    try {  
         con.contest();
            int   result=con.st.executeUpdate(query);
            if(result>0){
                     
         DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
       String n=dt.getValueAt(jTable1.getSelectedRow(), 1).toString(); 
         String q="UPDATE `sergical_shop`.`purchase` SET  `Catagory` = '"+jTextField1.getText()+"' WHERE `Catagory` = '"+n+"'";
   result=con.st.executeUpdate(q);
            if(result>0){
            JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
      
        
        count=0; 
    dt.setRowCount(0); 
                       
            String select="SELECT `category`FROM `sergical_shop`.`category_table`";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){ 
                count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(1)});
                 jTextField1.setText("");
                                 
           }
         }else{
              JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
          
            } 
         
               
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
void Show(){
    
      try {
          con.contest();
          count=0;
          DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
          dt.setRowCount(0);
          
          String select="SELECT `category`FROM `sergical_shop`.`category_table` ORDER BY `category` ASC";
          con.st = con.ct.prepareCall(select);
          con.rs = con.st.executeQuery(select);
          
          while(con.rs.next()){
              count=count+1;
              dt.addRow(new Object[]{count,con.rs.getString(1)});
              
              
          }
      } catch (SQLException ex) {
          Logger.getLogger(Catagory_add.class.getName()).log(Level.SEVERE, null, ex);
      }
          
}
void Showcate(){
    
      try {
          con.contest();
          count=0;
          DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
          dt.setRowCount(0);
          
          String select="SELECT `category`FROM `sergical_shop`.`category_table` where `category` LIKE '"+jTextField2.getText()+"%'";
          con.st = con.ct.prepareCall(select);
          con.rs = con.st.executeQuery(select);
          
          while(con.rs.next()){
              count=count+1;
              dt.addRow(new Object[]{count,con.rs.getString(1)});
              
              
          }
      } catch (SQLException ex) {
          Logger.getLogger(Catagory_add.class.getName()).log(Level.SEVERE, null, ex);
      }
          
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
         if(Authintication()==1){
          
          
             Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
     
     
     
     
    
        String cat=jTextField1.getText(); 
      //  String date1 = sd.format(jDateChooser1.getDate()); 
        String query="INSERT INTO `sergical_shop`.`category_table` (`category`)VALUES ('"+cat+"')";
        Data_Operation(query, "Add");
       
      }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      dispose();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        if(Authintication()==1){
            
         DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
       String n=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String q=" UPDATE `sergical_shop`.`category_table` SET `category` = '"+jTextField1.getText()+"' WHERE `category` = '"+n+"'";
           Data_Operation(q, "Edit");
        
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
       jTextField1.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         if(Authintication()==1){
            
         DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
       String n=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String q="DELETE FROM `sergical_shop`.`category_table` WHERE `category` = '"+n+"'";
           Data_Operation(q, "Edit");
        
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        Showcate();
    }//GEN-LAST:event_jTextField2KeyReleased
 
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
            java.util.logging.Logger.getLogger(Catagory_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catagory_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catagory_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catagory_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catagory_add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

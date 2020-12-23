 
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

public class Accounts extends javax.swing.JFrame {
  Connection_Class con;
   double count=0;
   double b=0,c=0,b1=0,c1=0;
    public Accounts() {
        initComponents();
           con=new Connection_Class();
         Data_Operationbank();
           Data_Operationcash();
            c=b+c;
           jTextField7.setText(""+c);
           
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bank_cr = new javax.swing.JTextField();
        cash_cr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cash_de = new javax.swing.JTextField();
        bank_de = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        total_cash = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        total_bank = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bank Debit");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 50, 90, 30);

        bank_cr.setEditable(false);
        bank_cr.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(bank_cr);
        bank_cr.setBounds(30, 80, 210, 30);

        cash_cr.setEditable(false);
        cash_cr.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cash_cr);
        cash_cr.setBounds(30, 150, 210, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cash Debit");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 120, 90, 30);

        cash_de.setEditable(false);
        cash_de.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cash_de);
        cash_de.setBounds(250, 150, 210, 30);

        bank_de.setEditable(false);
        bank_de.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(bank_de);
        bank_de.setBounds(250, 80, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bank Credit ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 50, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cash Credit");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 120, 90, 30);

        total_cash.setEditable(false);
        total_cash.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(total_cash);
        total_cash.setBounds(480, 150, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Profit");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 120, 120, 30);

        total_bank.setEditable(false);
        total_bank.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(total_bank);
        total_bank.setBounds(480, 80, 240, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Porofit");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 50, 120, 30);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(480, 220, 240, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total profit");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 190, 230, 30);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 320, 100, 23);
        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 780, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 420);

        setSize(new java.awt.Dimension(777, 413));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         dispose();

    }//GEN-LAST:event_jButton2ActionPerformed
int Authintication(){
   int e=0;
if(bank_cr.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Catagory is Empty");
bank_cr.requestFocus();
}else{
e=1;
}

return e;}
 
void Data_Operationcash(){
    try { 
        c=0;
         con.contest();
           
            String select="SELECT *FROM `cash_total`";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            if(con.rs.next()){ 
           cash_de.setText(""+con.rs.getDouble(1));
           cash_cr.setText(""+con.rs.getDouble(2)); 
           b1=Double.parseDouble(""+con.rs.getDouble(2));
           c1=Double.parseDouble(""+con.rs.getDouble(1));
           c=b1-c1;
            c=Math.round(c*100.0)/100.0;
           total_cash.setText(""+c); 
           }
          
          
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}  
void Data_Operationbank(){
    try {  
         con.contest();
           b=0;
            String select="SELECT *FROM `bank_total`";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            if(con.rs.next()){ 
           bank_de.setText(""+con.rs.getDouble(1));
           bank_cr.setText(""+con.rs.getDouble(2));
           b1=Double.parseDouble(""+con.rs.getDouble(2));
           c1=Double.parseDouble(""+con.rs.getDouble(1));
            b=b1-c1;
             b=Math.round(b*100.0)/100.0;
           total_bank.setText(""+b);
           
            }
          
          
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Accounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bank_cr;
    private javax.swing.JTextField bank_de;
    private javax.swing.JTextField cash_cr;
    private javax.swing.JTextField cash_de;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField total_bank;
    private javax.swing.JTextField total_cash;
    // End of variables declaration//GEN-END:variables
}

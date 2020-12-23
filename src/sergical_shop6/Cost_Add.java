
package sergical_shop6;
 
import com.sun.javafx.iio.jpeg.JPEGImageLoader;
import java.awt.Color;
import java.awt.GraphicsEnvironment; 
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel; 
 
public class Cost_Add extends javax.swing.JFrame {
  
     Connection_Class con;
      double i=0,aa=0;
    public Cost_Add() {
        initComponents();
       /*  Toolkit tk=Toolkit.getDefaultToolkit();
        double h=(double) tk.getScreenSize().getHeight();
            double w=(double) tk.getScreenSize().getWidth(); 
            this.setSize(w, h);
            getContentPane().setBackground(Color.white);
        final Podouble x=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPodouble();
        new Thread(new Runnable() {
            @Override
            public void run() {
                if(x.equals(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPodouble())){
                    Rectangle r=GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
                    setSize(r.getSize());
                    
                }
                try{
                Thread.sleep(5000);
                }catch(InterruptedException ex){
                    Logger.getLogger(Cost_Add.class.getName()).log(Level.SEVERE,null,ex) ;
                }
                
             }
        }).start();
        try{
        
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLockAndFieel");
        }catch(Exception err){
        
        }
        */
        con=new Connection_Class();
        show_allData();
       // show_date();
           b_labl.setVisible(false);
         acc_label.setVisible(false);
         bname_combo.setVisible(false);
         account_combo.setVisible(false);
         show_ban();
        
        
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        account_combo = new javax.swing.JComboBox<>();
        acc_label = new javax.swing.JLabel();
        bname_combo = new javax.swing.JComboBox<>();
        b_labl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cost Data");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 10, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bill No                        :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 190, 160, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Cost Type", "Bill No", "Detailse", "Paid By", "Ammount"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(530, 140, 730, 460);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Detailse                      :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 230, 160, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ammount                 :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 270, 160, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Paid By                      :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 310, 160, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date                           :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 350, 160, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cost Type                 :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 150, 160, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Cost", "Sales Cost", "Purchase Cost", "Others Cost" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(200, 150, 210, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(200, 190, 210, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(200, 230, 210, 30);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(200, 270, 210, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(200, 310, 210, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(200, 350, 210, 30);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 550, 140, 40);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(240, 550, 160, 40);

        jButton3.setText("Show for Date");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(90, 600, 140, 40);

        jButton4.setText("Show for Month");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(240, 600, 160, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(980, 600, 280, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Cash");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(120, 390, 93, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Check");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(230, 390, 93, 23);

        account_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel1.add(account_combo);
        account_combo.setBounds(120, 490, 230, 30);

        acc_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        acc_label.setForeground(new java.awt.Color(255, 255, 255));
        acc_label.setText("Account Number");
        jPanel1.add(acc_label);
        acc_label.setBounds(120, 470, 100, 20);

        bname_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        bname_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bname_comboActionPerformed(evt);
            }
        });
        jPanel1.add(bname_combo);
        bname_combo.setBounds(120, 440, 230, 30);

        b_labl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_labl.setForeground(new java.awt.Color(255, 255, 255));
        b_labl.setText("Bank Name");
        jPanel1.add(b_labl);
        b_labl.setBounds(120, 420, 100, 20);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 90, 110);
        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1370, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 730);

        setSize(new java.awt.Dimension(1367, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 void show_ban(){

       try {
            bname_combo.removeAllItems();
            bname_combo.addItem("Select");
           con.contest();
           String s="SELECT `name` FROM `sergical_shop`.`bank_name`";
           
           
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){    
             bname_combo.addItem(""+con.rs.getString(1));
           }
       } catch (SQLException ex) {
           Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
       }
}
void show_accou(){

       try {
            account_combo.removeAllItems();
            account_combo.addItem("Select");
           con.contest();
           String s="select `number` from `sergical_shop`.`bank_name` where `name`='"+bname_combo.getSelectedItem()+"'";
            con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){    
             account_combo.addItem(""+con.rs.getString(1));
           }
       } catch (SQLException ex) {
           Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
       }
}
double Authdoubleication(){
    double e=0;
if(jComboBox1.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Cost Type is empty");
    jComboBox1.requestFocus();
}else if(jTextField1.getText().isEmpty()){
 JOptionPane.showMessageDialog(this, "Bill NO is empty");
    jTextField1.requestFocus();
}else if(jTextField2.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Detailse is empty");
    jTextField2.requestFocus();
}else if(jTextField3.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Ammount is empty");
    jTextField3.requestFocus();
}else if(jTextField4.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Paid By is empty");
    jTextField4.requestFocus();
}else if(((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Date is empty");
    jDateChooser1.requestFocus();
}else{

e=1;

}

return e;
} 

void Dataclar(){
     buttonGroup1.clearSelection();
    jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jComboBox1.setSelectedIndex(0);
 ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
//((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
  
  jComboBox1.requestFocus();
}

void Data_Operation(String query,double aa){
    try {  
         con.contest();
            double   result=con.st.executeUpdate(query);
            if(result>0){   String status="Debit";
                      String details="Cost || "+jTextField2.getText();
                         
 SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
String date1 = sd.format(jDateChooser1.getDate());
                    String ammount=jTextField3.getText();
              if(aa==1)
              {
                  String bname=bname_combo.getSelectedItem().toString();
                    String account=account_combo.getSelectedItem().toString();
                  
                String in="INSERT INTO `sergical_shop`.`bank_data`  (`bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount`) VALUES ('"+bname+"', '"+account+"','"+status+"','"+details+"','"+date1+"','"+ammount+"')";
                cash_check_DAta(in, "Submition");   
                
              }else if(aa==2){
                 
            
       String in="INSERT INTO `sergical_shop`.`cash_table`(`date`,`ammount`,`status`,`detailse`)VALUES ('"+date1+"', '"+ammount+"',  '"+status+"', '"+details+"')";
           cash_check_DAta(in, "Submition");
                  
              }
             
                
      
       
            }else{
            JOptionPane.showMessageDialog(this, "Cost Submition Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Cost_Add.class.getName()).log(Level.SEVERE, null, ex);
        }


} void cash_check_DAta(String query,String msg){
    try {  
         con.contest(); 
            double   result=con.st.executeUpdate(query);
            if(result>0){
            
               JOptionPane.showMessageDialog(this, "Cost Submition Success");
                Dataclar();
                show_allData();
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
     ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(df.format(dt));
 }
void show_allData(){
    try{
      i=0;
      aa=0;
         Date dt1 = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
con.contest();
            String select="SELECT `cost_type`, `bill_no`, `detailse`, `ammount`, `paidby`, `current_date` FROM `sergical_shop`.`cost`WHERE `current_date`='"+df.format(dt1)+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
              dt.addRow(new Object[]{con.rs.getString(6),con.rs.getString(1),con.rs.getString(2),con.rs.getString(3) ,con.rs.getString(5),Double.parseDouble(con.rs.getString(4))});
               aa=Double.parseDouble(con.rs.getString(4));
                i=aa+i;
            
            
            
            }
            jLabel2.setText("Total : "+i);
        } catch (SQLException ex) {
            Logger.getLogger(Cost_Add.class.getName()).log(Level.SEVERE, null, ex);
        }

}

void show_oneData(){
 
     if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Date Is Empty");
            jDateChooser1.requestFocus();
        }else{try{
          i=0;
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
                    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sd.format(jDateChooser1.getDate());
            con.contest();
            String select=" SELECT `cost_type`, `bill_no`, `detailse`, `ammount`, `paidby`, `current_date` FROM `sergical_shop`.`cost`WHERE `current_date`='"+date1+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
              dt.addRow(new Object[]{con.rs.getString(6),con.rs.getString(1),con.rs.getString(2),con.rs.getString(3) ,con.rs.getString(5),Double.parseDouble(con.rs.getString(4))});
     
               aa=Double.parseDouble(con.rs.getString(4)); 
              i=aa+i;
            }
            jLabel2.setText("Total  : "+i);
        } catch (SQLException ex) {
            Logger.getLogger(Cost_Add.class.getName()).log(Level.SEVERE, null, ex);
        }

}}
void show_Month(){
   if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Date Is Empty");
            jDateChooser1.requestFocus();
        }else{   try{
          i=0;  
               DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
                    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
            String date1 = sd.format(jDateChooser1.getDate());
            con.contest();
            String select=" SELECT `cost_type`, `bill_no`, `detailse`, `ammount`, `paidby`, `current_date` FROM `sergical_shop`.`cost`WHERE `current_date`LIKE'%"+date1+"%'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
              dt.addRow(new Object[]{con.rs.getString(6),con.rs.getString(1),con.rs.getString(2),con.rs.getString(3) ,con.rs.getString(5),Double.parseDouble(con.rs.getString(4))});
       aa=Double.parseDouble(con.rs.getString(4)); 
              i=aa+i;
            }
            
            jLabel2.setText("Total  :"+i);
        } catch (SQLException ex) {
            Logger.getLogger(Cost_Add.class.getName()).log(Level.SEVERE, null, ex);
        }

}

}
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(Authdoubleication()==1){
          
          
          double aa=0;
    String status="";
    if(jRadioButton1.isSelected()){ 
    status="Cash";
    }else if(jRadioButton2.isSelected()){
        status="Check"; 
    }else{
    status="";
    }if(status.isEmpty()){ 
JOptionPane.showMessageDialog(this, "Please Select Cash Or Check");
}else{
         if(status.equals("Check")){
         
         if(bname_combo.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(this, "Please select Bank Name");
        bname_combo.requestFocus();
        }else if(account_combo.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(this, "Please select account number");
        bname_combo.requestFocus();
        }else{
        aa=1;

        } 
                }else if(status.equals("Cash")){
         ///
         aa=2;
         
         }
         
             Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
     
     
     
     
    String costType=jComboBox1.getSelectedItem().toString();
        String bill=jTextField1.getText();
        String detail=jTextField2.getText();
        String ammount=jTextField3.getText();
        String paidby=jTextField4.getText(); 
      //  String date1 = sd.format(jDateChooser1.getDate()); 
        String query="INSERT INTO `sergical_shop`.`cost` (`cost_type`, `bill_no`, `detailse`, `ammount`, `paidby`, `current_date`) VALUES ('"+costType+"', '"+bill+"','"+detail+"','"+ammount+"','"+paidby+"','"+ df.format(jDateChooser1.getDate())+"')";
        Data_Operation(query, aa);
       
      }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        show_oneData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        show_Month();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        b_labl.setVisible(false);
        acc_label.setVisible(false);
        bname_combo.setVisible(false);
        account_combo.setVisible(false);
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        b_labl.setVisible(true);
        acc_label.setVisible(true);
        bname_combo.setVisible(true);
        account_combo.setVisible(true);
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void bname_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bname_comboActionPerformed
        show_accou();
    }//GEN-LAST:event_bname_comboActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
           char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (doubleroduced in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(Cost_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cost_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cost_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cost_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Cost_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_label;
    private javax.swing.JComboBox<String> account_combo;
    private javax.swing.JLabel b_labl;
    private javax.swing.JComboBox<String> bname_combo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

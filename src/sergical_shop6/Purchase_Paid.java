 package sergical_shop6;
 
  
import java.awt.Color;
 import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Purchase_Paid extends javax.swing.JFrame {
   Connection_Class con;
 int count=0;
 double tcount=0;
    public Purchase_Paid() {
        initComponents();
       
          con=new Connection_Class();
          AutoCompleteDecorator.decorate(jComboBox1);
       show_ban();
            jLabel16.setVisible(false);
         jLabel15.setVisible(false);
         bname_combo.setVisible(false);
         account_combo.setVisible(false);
        show_suplierName();
        
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        total_leve1 = new javax.swing.JLabel();
        total_leve2 = new javax.swing.JLabel();
        total_leve3 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        due = new javax.swing.JTextField();
        stotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField2 = new javax.swing.JTextField();
        total_leve4 = new javax.swing.JLabel();
        account_combo = new javax.swing.JComboBox<>();
        bname_combo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        desktopPane1 = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Purchase Ammount Paid");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(98, 0, 222, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("*Search Company Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 100, 270, 30);

        jPanel2.setBackground(new java.awt.Color(61, 42, 127));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL No", "Date", "Bill No", "Item", "Total", "Discount", "Paid", "Due"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 940, 450);

        total_leve1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve1.setForeground(new java.awt.Color(255, 255, 255));
        total_leve1.setText("Bill No       :");
        jPanel2.add(total_leve1);
        total_leve1.setBounds(280, 460, 60, 40);

        total_leve2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve2.setForeground(new java.awt.Color(255, 255, 255));
        total_leve2.setText("Paid                         :");
        jPanel2.add(total_leve2);
        total_leve2.setBounds(570, 490, 110, 30);

        total_leve3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve3.setForeground(new java.awt.Color(255, 255, 255));
        total_leve3.setText("Due                          :");
        jPanel2.add(total_leve3);
        total_leve3.setBounds(570, 520, 110, 30);

        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
        });
        jPanel2.add(paid);
        paid.setBounds(680, 490, 260, 30);

        due.setEditable(false);
        jPanel2.add(due);
        due.setBounds(680, 520, 260, 30);

        stotal.setEditable(false);
        jPanel2.add(stotal);
        stotal.setBounds(680, 460, 260, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(770, 610, 160, 31);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(10, 460, 260, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(340, 460, 190, 40);

        total_leve4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve4.setForeground(new java.awt.Color(255, 255, 255));
        total_leve4.setText("Total Due               :");
        jPanel2.add(total_leve4);
        total_leve4.setBounds(570, 460, 110, 30);

        account_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel2.add(account_combo);
        account_combo.setBounds(20, 620, 230, 30);

        bname_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        bname_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bname_comboActionPerformed(evt);
            }
        });
        jPanel2.add(bname_combo);
        bname_combo.setBounds(20, 570, 230, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Bank Name");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(20, 550, 100, 20);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Cash");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(20, 520, 93, 25);

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Check");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(130, 520, 93, 25);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Account Number");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(20, 600, 100, 20);
        jPanel2.add(desktopPane1);
        desktopPane1.setBounds(0, 0, 1370, 720);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(350, 20, 960, 680);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 200, 110, 23);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(10, 130, 280, 30);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17);
        jLabel17.setBounds(0, 0, 90, 110);
        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1370, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 730);

        setSize(new java.awt.Dimension(1359, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
void show_suplierName(){
    try{
        jComboBox1.removeAllItems();
        jComboBox1.addItem(" ");
            con.contest();
            String select="SELECT `company` FROM `purchase_account` GROUP BY `company` ORDER BY `company` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           jComboBox1.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        
    }//GEN-LAST:event_jTable1MouseClicked

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
        if(jComboBox1.getSelectedIndex()<=0){
          JOptionPane.showMessageDialog(this, "Bill No Is Empty");
        }else{
        try{
               Double p=0.0,st=0.0;
     p=Double.parseDouble(paid.getText());
       st=Double.parseDouble(stotal.getText());
       st=st-p;
       due.setText(""+st);
       
        }catch(Exception e){
              
        }
        
        }
    }//GEN-LAST:event_paidKeyReleased
   double Authintication2(){
int e=0;
if(jComboBox1.getSelectedIndex()<=0){
JOptionPane.showMessageDialog(this, "Data Not Found");
jComboBox1.requestFocus();
 }else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
 JOptionPane.showMessageDialog(this, "Date is EMpty");
 
 }else if(jTextField2.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Bill No is empty");
jTextField2.requestFocus();
 }else if(paid.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Paid No is empty");
paid.requestFocus();
 }else{
e=1;
}

return e;
}

void Data_Operation(String query,int aa){
    try {  
         con.contest();
   
         
         
           double   result=con.st.executeUpdate(query);
            if(result>0){
           // JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
             String ss=jTextField2.getText();
                     String status="Debit";
                      String details="Product Purchase || "+ss+" || "+jComboBox1.getSelectedItem();
                 DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        
                    String ammount=paid.getText();
              if(aa==1)
              {
                  String bname=bname_combo.getSelectedItem().toString();
                    String account=account_combo.getSelectedItem().toString();
                  
                String in="INSERT INTO `sergical_shop`.`bank_data`  (`bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount`) VALUES ('"+bname+"', '"+account+"','"+status+"','"+details+"','"+ df.format(jDateChooser1.getDate())+"','"+ammount+"')";
                cash_check_DAta(in, "Submition");   
              }else if(aa==2){
                 
            
       String in="INSERT INTO `sergical_shop`.`cash_table`(`date`,`ammount`,`status`,`detailse`)VALUES ('"+ df.format(jDateChooser1.getDate())+"', '"+ammount+"',  '"+status+"', '"+details+"')";
           cash_check_DAta(in, "Submition");
                  
              }
             
           
           
          
               
            }else{
            JOptionPane.showMessageDialog(this, "Data Submittion Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
void cash_check_DAta(String query,String msg){
    try {  
         con.contest(); 
           double   result=con.st.executeUpdate(query);
            if(result>0){
   //
      JOptionPane.showMessageDialog(this, "Submition Succes");
              Find_Data_bill();
               Find_ammount_bill();
            paid.setText("");
               due.setText("");
               jTextField2.setText("");
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
int billcheck(){
  int e=0;
       try {
           String sdd="SELECT `bill_no` FROM `sergical_shop`.`purchase_account` WHERE `bill_no`='"+jTextField2.getText()+"' AND `company`='"+jComboBox1.getSelectedItem()+"'";
           
           con.st = con.ct.prepareCall(sdd);
           con.rs = con.st.executeQuery(sdd);
           
           while(con.rs.next()){
               e=e+1;
           } 
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
return e;
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Authintication2()==1){
 
           int aa=0;
               String status="";
               if(jRadioButton1.isSelected()){ 
               status="Cash";
               }else if(jRadioButton2.isSelected()){
                   status="Check"; 
               }else{
               status="";
               }
                if(status.isEmpty()){ 
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
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        
           // String co =  company.getText();
             
            String st=stotal.getText(); 
            String pa =paid.getText();
            String du =due.getText();

             Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
         String ss=jTextField2.getText();
              
 String query="INSERT INTO `sergical_shop`.`purchase_account` (`bill_no` ,`date`, `company`, `total_item`,`sub_total`, `discount`, `paid`, `due`, `status`) VALUES"
         + "    ('"+ss+"', '"+df.format(jDateChooser1.getDate())+"', '"+jComboBox1.getSelectedItem()+"', '"+0+"', '"+0+"', '"+0+"', '"+pa+"', '"+du+"','"+status+"');";
                    Data_Operation(query,aa);
                  
                }     
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
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
}void show_ban(){

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
    private void bname_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bname_comboActionPerformed
        show_accou();
    }//GEN-LAST:event_bname_comboActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        jLabel16.setVisible(false);
        jLabel15.setVisible(false);
        bname_combo.setVisible(false);
        account_combo.setVisible(false);

    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        jLabel16.setVisible(true);
        jLabel15.setVisible(true);
        bname_combo.setVisible(true);
        account_combo.setVisible(true);
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
  Find_Data();
        Find_ammount();
jTextField2.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
            Find_Data_bill();
        Find_ammount_bill();
        
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyPressed
 void Find_ammount(){
    try{
        double t=0,p=0,d=0,due=0;
    
      con.contest();
                     
            String select="SELECT  `sub_total` ,`discount`,`paid` FROM  `purchase_account` WHERE `company` = '"+jComboBox1.getSelectedItem()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);      
            while(con.rs.next()){ 
               t=Double.parseDouble(con.rs.getString(1))+t;
               d=Double.parseDouble(con.rs.getString(2))+d;
               p=Double.parseDouble(con.rs.getString(3))+p;
             
               
               
           }   
                due=(t-d)-p;    
                due=Math.round(due*100.0)/100.0;      
               stotal.setText(""+due);
                
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

} 
 void Find_Data(){
    try{
        tcount=0;
        count=0;
       double co=0;          
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    //SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//String date1 = sd.format(jDateChooser1.getDate()); 

      con.contest(); 
            String select="SELECT  `bill_no`,`date`,SUM(`total_item`), SUM(`sub_total`),SUM(`discount`),SUM(`paid`) FROM `sergical_shop`.`purchase_account` WHERE `company` = '"+jComboBox1.getSelectedItem()+"' GROUP BY `bill_no`  ORDER BY `date` DESC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);      
 
          while(con.rs.next()){ 
                count=count+1;
                double t=Double.parseDouble(con.rs.getString(4));
                double p=Double.parseDouble(con.rs.getString(6));
                double d=Double.parseDouble(con.rs.getString(5)); 
                dt.addRow(new Object[]{count ,con.rs.getDate(2) ,con.rs.getString(1),con.rs.getString(3),t,d,p,(Math.round((t-(d+p))*100.0)/100.0) });
                      
                     
           }  

               
               
               
           
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
 void Find_ammount_bill(){
    try{
        double t=0,p=0,d=0,due=0;
    
      con.contest();
                     
            String select="SELECT  `sub_total` ,`discount`,`paid` FROM  `purchase_account` WHERE `company` = '"+jComboBox1.getSelectedItem()+"' AND `bill_no`='"+jTextField2.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);      
            while(con.rs.next()){ 
               t=Double.parseDouble(con.rs.getString(1))+t;
               d=Double.parseDouble(con.rs.getString(2))+d;
               p=Double.parseDouble(con.rs.getString(3))+p;
             
               
               
           } 
             
  due=(t-d)-p;
                  due=Math.round(due*100.0)/100.0;   
               stotal.setText(""+due);
               
               
               
               
               
           
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

} 
    void Find_Data_bill(){
    try{
        tcount=0;
        count=0;  double t=0,p=0,d=0,td=0;
       double co=0;          
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    //SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//String date1 = sd.format(jDateChooser1.getDate()); 

      con.contest(); 
            String select="SELECT  `date`,`bill_no`, `total_item`,`sub_total`,`discount`,`paid`,`due` FROM `sergical_shop`.`purchase_account` WHERE `company` = '"+jComboBox1.getSelectedItem()+"' AND `bill_no`='"+jTextField2.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);      
  if(con.rs.next()){ 
                count=count+1;
                  t=Double.parseDouble(con.rs.getString(4));
                  p=Double.parseDouble(con.rs.getString(6));
                  d=Double.parseDouble(con.rs.getString(5));
                  td=(Math.round((t-(d+p))*100.0)/100.0);
                dt.addRow(new Object[]{count ,con.rs.getDate(1) ,con.rs.getString(2),con.rs.getString(3),t,d,p,td });
                       
           }  
          while(con.rs.next()){ 
                count=count+1;
                  //t=Double.parseDouble(con.rs.getString(4));
                  p=Double.parseDouble(con.rs.getString(6))+p;
               
                 td=(Math.round((t-(p+d))*100.0)/100.0);
                dt.addRow(new Object[]{count ,con.rs.getDate(1) ,con.rs.getString(2),con.rs.getString(3),"0","0",con.rs.getString(6), td});
                       
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
            java.util.logging.Logger.getLogger(Purchase_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Purchase_Paid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> account_combo;
    private javax.swing.JComboBox<String> bname_combo;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JDesktopPane desktopPane1;
    private javax.swing.JTextField due;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField stotal;
    private javax.swing.JLabel total_leve1;
    private javax.swing.JLabel total_leve2;
    private javax.swing.JLabel total_leve3;
    private javax.swing.JLabel total_leve4;
    // End of variables declaration//GEN-END:variables
}

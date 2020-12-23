 package sergical_shop6;  
import java.awt.Graphics;
import java.awt.Graphics2D;
 import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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

public class Sales_paid extends javax.swing.JFrame {
   Connection_Class con;
  double tcount=0,count=0,b1,c1;
  double subt=0,pai=0,dis=0,subtt=0,paii=0,diss=0,sb=0;
    public Sales_paid() {
        initComponents();
    /*    
        final Point x=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        new Thread(new Runnable() {
            @Override
            public void run() {
                if(x.equals(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint())){
                    Rectangle r=GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
                    setSize(r.getSize());
                    
                }
                try{
                Thread.sleep(5000);
                }catch(InterruptedException ex){
                    Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE,null,ex) ;
                }
                
             }
        }).start();
        try{
        
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLockAndFieel");
        }catch(Exception err){
        
        }*/
        
          con=new Connection_Class();
        AutoCompleteDecorator.decorate(shop_combo);
            cust_tst.setVisible(false);
            cust_l.setVisible(false);
            shop_combo.setVisible(true);
            perma_l.setVisible(true);
            
       show_suplierName();
        cust_l1.setVisible(false);
       // jDateChooser1.setVisible(false);
        show_date();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        total_leve3 = new javax.swing.JLabel();
        total_leve2 = new javax.swing.JLabel();
        total_leve4 = new javax.swing.JLabel();
        stotal = new javax.swing.JTextField();
        due = new javax.swing.JTextField();
        paid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sl1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        customer_type = new javax.swing.JComboBox<>();
        shop_combo = new javax.swing.JComboBox<>();
        perma_l = new javax.swing.JLabel();
        cust_tst = new javax.swing.JTextField();
        cust_l = new javax.swing.JLabel();
        cust_l1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        total_leve1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        account_combo = new javax.swing.JComboBox<>();
        acc_label = new javax.swing.JLabel();
        bname_combo = new javax.swing.JComboBox<>();
        b_labl = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales Ammount Paid");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 0, 200, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL No", "Bill No", "Date", "Item", "Sub Total", "Discount", "Paid", "Due"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 660, 220);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(770, 610, 160, 31);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(95, 104, 217));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Bill/Challlan");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(250, 0, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bil.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 30, 640, 150);

        sl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sl.setForeground(new java.awt.Color(102, 102, 255));
        jPanel2.add(sl);
        sl.setBounds(100, 190, 200, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(490, 190, 160, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Name :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 220, 50, 30);
        jPanel2.add(name);
        name.setBounds(90, 220, 580, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Address :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 260, 70, 30);
        jPanel2.add(add);
        add.setBounds(90, 260, 580, 30);

        total_leve3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve3.setText("Due                          :");
        jPanel2.add(total_leve3);
        total_leve3.setBounds(270, 580, 110, 30);

        total_leve2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve2.setText("Paid                         :");
        jPanel2.add(total_leve2);
        total_leve2.setBounds(270, 550, 110, 30);

        total_leve4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve4.setText("Total Due               :");
        jPanel2.add(total_leve4);
        total_leve4.setBounds(270, 520, 110, 30);

        stotal.setEditable(false);
        stotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(stotal);
        stotal.setBounds(380, 520, 300, 30);

        due.setEditable(false);
        due.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(due);
        due.setBounds(380, 580, 300, 30);

        paid.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paidKeyTyped(evt);
            }
        });
        jPanel2.add(paid);
        paid.setBounds(380, 550, 300, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("............................");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(470, 660, 168, 10);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Signature");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(490, 670, 150, 30);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(140, 620, 540, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("In words:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(40, 620, 100, 30);

        sl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sl1.setForeground(new java.awt.Color(102, 102, 255));
        sl1.setText("SL. No.");
        jPanel2.add(sl1);
        sl1.setBounds(20, 190, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Date: ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(430, 190, 55, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(530, 20, 700, 710);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(100, 510, 140, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Customer Type     :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(70, 70, 110, 30);

        customer_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Permanent Customer", "Customer", "" }));
        customer_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_typeActionPerformed(evt);
            }
        });
        jPanel1.add(customer_type);
        customer_type.setBounds(180, 70, 180, 30);

        shop_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        shop_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shop_comboActionPerformed(evt);
            }
        });
        jPanel1.add(shop_combo);
        shop_combo.setBounds(210, 180, 250, 30);

        perma_l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        perma_l.setForeground(new java.awt.Color(255, 255, 255));
        perma_l.setText("Shop/Hospital Name     :");
        jPanel1.add(perma_l);
        perma_l.setBounds(70, 180, 140, 30);

        cust_tst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cust_tstKeyReleased(evt);
            }
        });
        jPanel1.add(cust_tst);
        cust_tst.setBounds(210, 180, 250, 30);

        cust_l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cust_l.setForeground(new java.awt.Color(255, 255, 255));
        cust_l.setText("Customer NAme");
        jPanel1.add(cust_l);
        cust_l.setBounds(70, 180, 140, 30);

        cust_l1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cust_l1.setForeground(new java.awt.Color(255, 255, 255));
        cust_l1.setText("Date");
        jPanel1.add(cust_l1);
        cust_l1.setBounds(70, 270, 140, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyReleased(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(210, 270, 250, 30);

        total_leve1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve1.setForeground(new java.awt.Color(255, 255, 255));
        total_leve1.setText("Bill No       :");
        jPanel1.add(total_leve1);
        total_leve1.setBounds(70, 220, 130, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 220, 250, 30);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(250, 510, 220, 31);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1240, 30, 70, 40);

        account_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel1.add(account_combo);
        account_combo.setBounds(210, 380, 250, 30);

        acc_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        acc_label.setForeground(new java.awt.Color(255, 255, 255));
        acc_label.setText("Account Number");
        jPanel1.add(acc_label);
        acc_label.setBounds(70, 380, 120, 30);

        bname_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        bname_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bname_comboActionPerformed(evt);
            }
        });
        jPanel1.add(bname_combo);
        bname_combo.setBounds(210, 340, 250, 30);

        b_labl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_labl.setForeground(new java.awt.Color(255, 255, 255));
        b_labl.setText("Bank Name");
        jPanel1.add(b_labl);
        b_labl.setBounds(70, 340, 120, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Cash");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(230, 310, 80, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Check");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(330, 310, 80, 23);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 100, 80);
        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1370, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 730);

        setSize(new java.awt.Dimension(1359, 728));
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
 
    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
      if(customer_type.getSelectedIndex()==0){
        
        if(shop_combo.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(this, "Shop/ Hospital NAme is Empty  ");
        }else{
           double t=0, p=0,ft=0,du=0;
            t=Double.parseDouble(stotal.getText()); 
            p=Double.parseDouble(paid.getText());
            
            du=t-p;
    du=Math.round(du*100.0)/100.0;
            due.setText(""+du);}
      
      
      }else{
      
       
        if(cust_tst.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Customer NAme is Empty  ");
        }else{}
      
      
      
      }
        
        
      
    }//GEN-LAST:event_paidKeyReleased
   double Authintication2(){
int e=0;
if(jTextField1.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Data Not Found");
jTextField1.requestFocus();
 }else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
 JOptionPane.showMessageDialog(this, "Date is EMpty");
 
 }else if(jTextField2.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Bill No is empty");
jTextField2.requestFocus();
 }else{
e=1;
}

return e;
}
void cash_check_DAta(String query,String msg){
    try {  
         con.contest(); 
           double   result=con.st.executeUpdate(query);
            if(result>0){
   //
      Find_Data_billWise();
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
void cash_check_DAtaq1(String query,String msg){
    try {  
         con.contest(); 
           double   result=con.st.executeUpdate(query);
            if(result>0){
     JOptionPane.showMessageDialog(this, "Data Submition Success");
              Find_Data_billWise();
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}

void Data_Operation(String query,int aa){
    try {  
         con.contest();
   
         
         
           double   result=con.st.executeUpdate(query);
            if(result>0){
         
                     String status="Credit";
                           String details="Product Sales || "+sl.getText(); 
                       DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        
                 
                    String ammount=paid.getText();
              if(aa==1)
              {
                  String bname=bname_combo.getSelectedItem().toString();
                    String account=account_combo.getSelectedItem().toString();
                  
                String in="INSERT INTO `sergical_shop`.`bank_data`  (`bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount`) VALUES ('"+bname+"', '"+account+"','"+status+"','"+details+"','"+jLabel5.getText()+"','"+ammount+"')";
                cash_check_DAta(in, "Submition");   
              }else if(aa==2){
                 
            
       String in="INSERT INTO `sergical_shop`.`cash_table`(`date`,`ammount`,`status`,`detailse`)VALUES ('"+jLabel5.getText()+"', '"+ammount+"',  '"+status+"', '"+details+"')";
           cash_check_DAta(in, "Submition");
                  
              } 
          
            }else{
            JOptionPane.showMessageDialog(this, "Data Submition Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
void Data_Operation2(String query,int aa){
    try {  
         con.contest();
   
         
         
           double   result=con.st.executeUpdate(query);
            if(result>0){
                
                     String status="Credit";
                      String details="Product Sales";
                       DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        
                 
                    String ammount=paid.getText();
              if(aa==1)
              {
                  String bname=bname_combo.getSelectedItem().toString();
                    String account=account_combo.getSelectedItem().toString();
                  
                String in="INSERT INTO `sergical_shop`.`bank_data`  (`bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount`) VALUES ('"+bname+"', '"+account+"','"+status+"','"+details+"','"+jLabel5.getText()+"','"+ammount+"')";
                cash_check_DAta(in, "Submition");   
              }else if(aa==2){
                 
            
       String in="INSERT INTO `sergical_shop`.`cash_table`(`date`,`ammount`,`status`,`detailse`)VALUES ('"+jLabel5.getText()+"', '"+ammount+"',  '"+status+"', '"+details+"')";
           cash_check_DAtaq1(in, "Submition");
                  
              } 
           
          
            }else{
            JOptionPane.showMessageDialog(this, "Data Submition Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      /*  if(Authintication2()==1){

            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        
           // String co =  company.getText();
             
            String st=stotal.getText(); 
            String pa =paid.getText();
            String du =due.getText();

             Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
         
              
 String query="INSERT INTO `sergical_shop`.`purchase_account` (`bill_no` ,`date`, `company`, `total_item`,`sub_total`, `discount`, `paid`, `due`, `status`) VALUES"
         + "    ('"+jTextField2.getText()+"', '"+df.format(jDateChooser1.getDate())+"', '"+jTextField1.getText()+"', '"+0+"', '"+0+"', '"+0+"', '"+pa+"', '"+du+"','paid');";
                    Data_Operation(query," Submition ");
                  
                    
        }
*/
    }//GEN-LAST:event_jButton1ActionPerformed
public void show_date() {
    
    // if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
     jLabel5.setText(""+df.format(dt));
     ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 
 }void show_suplierName(){
    try{
        shop_combo.removeAllItems();
        shop_combo.addItem(" ");
            con.contest();
            String select="SELECT `shop_name`,`cu_name` FROM `sergical_shop`.`customer` ORDER BY `shop_name` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           shop_combo.addItem(""+con.rs.getString(1)+" || "+con.rs.getString(2));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void customer_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_typeActionPerformed
        if(customer_type.getSelectedIndex()==0){
  cust_tst.setVisible(false);
            cust_l.setVisible(false);
            shop_combo.setVisible(true);
            perma_l.setVisible(true);
          
        }

        else if(customer_type.getSelectedIndex()==1){

            cust_tst.setVisible(true);
            cust_l.setVisible(true);
            shop_combo.setVisible(false);
            perma_l.setVisible(false);

        }
    }//GEN-LAST:event_customer_typeActionPerformed

    private void shop_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shop_comboActionPerformed
if(shop_combo.getSelectedIndex()>0 ){
    jTextField2.setText("");
    cust_tst.setText("");
    name.setText(shop_combo.getSelectedItem().toString());
    Find_Data();
Find_ammount();
}
    }//GEN-LAST:event_shop_comboActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if(customer_type.getSelectedIndex()==0)
    {
    
        
        if(jTextField2.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "New Bill No is empty");
       jTextField2.requestFocus();
       
       }else if(shop_combo.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(this, "Shop Name is empty");
       shop_combo.requestFocus();
       
       }else  if(stotal.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "No Data Found");
       stotal.requestFocus();
       
       }  else  if(paid.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "Paid Data Empty");
       paid.requestFocus();
       
       }else{
   
        String status="";
           int aa=0;
 if(jRadioButton1.isSelected()){ 
    status="Cash";
    }else if(jRadioButton2.isSelected()){
        status="Check"; 
    }else{
    status="";
    }if(status.isEmpty()){ 
JOptionPane.showMessageDialog(this, "Please Select Cash Or Check");
}else{if(status.equals("Check")){
         
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
         
              
 String query="INSERT INTO `sergical_shop`.`sales_acoount` (`bill_no` ,`date`, `company`, `total_item`,`sub_total`, `discount`, `paid`, `due`, `status`) VALUES"
         + "    ('"+jTextField2.getText()+"', '"+jLabel5.getText()+"', '"+shop_combo.getSelectedItem()+"', '"+0+"', '"+0+"', '"+0+"', '"+pa+"', '"+du+"','paid');";
                    Data_Operation(query,aa);
       }
     
       }
    }else{
    
        
        if(jTextField2.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "New Bill No is empty");
       jTextField2.requestFocus();
       
       }else if(cust_tst.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Custommer is empty");
       cust_tst.requestFocus(); 
       }else  if(stotal.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "No Data Found");
       stotal.requestFocus();
       
       }  else  if(paid.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "Paid Data Empty");
       paid.requestFocus();
       
       }else{
          
       String status="";
           int aa=0;
 if(jRadioButton1.isSelected()){ 
    status="Cash";
    }else if(jRadioButton2.isSelected()){
        status="Check"; 
    }else{
    status="";
    }if(status.isEmpty()){ 
JOptionPane.showMessageDialog(this, "Please Select Cash Or Check");
}else{if(status.equals("Check")){
         
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
         
              
 String query="INSERT INTO `sergical_shop`.`sales_acoount` (`bill_no` ,`date`, `company`, `total_item`,`sub_total`, `discount`, `paid`, `due`, `status`) VALUES"
         + "    ('"+jTextField2.getText()+"', '"+jLabel5.getText()+"', '"+cust_tst.getText()+"', '"+0+"', '"+0+"', '"+0+"', '"+pa+"', '"+du+"','paid');";
                    Data_Operation2(query,aa);
       }
      
       }
    }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
       if(shop_combo.getSelectedIndex()>0) {sl.setText(""+jTextField2.getText());
        sl.setText(jTextField2.getText());
       Find_Data_billWise();
      Find_ammount_billWise();
       }
       else if(!cust_tst.getText().isEmpty()){
             sl.setText(jTextField2.getText());
       Find_Data_billWise();
         //Find_ammount_billWise();
       }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jDateChooser1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1KeyReleased

    private void cust_tstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cust_tstKeyReleased
     jTextField2.setText("");
     shop_combo.setSelectedIndex(0);
     name.setText(cust_tst.getText());
     Find_Data();
   Find_ammount();
   //  Find_Data2();
  // Find_ammount2();
    }//GEN-LAST:event_cust_tstKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setJobName("Print Data");
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics pg, PageFormat pf, int PageNum){
                //To change body of generated methods, choose Tools | Templates.
                if(PageNum>0){
                    return NO_SUCH_PAGE;}
                Graphics2D g2=(Graphics2D) pg;
                g2.translate(pf.getImageableX(),pf.getImageableX());
                g2.scale(1,0.8);
                jPanel2.print(g2);
                return Printable.PAGE_EXISTS;
            }

            
        });
        if(job.printDialog()==true){
            JOptionPane.showMessageDialog(this,"Print success..");
            try{
                job.print();
            }catch(PrinterException P){

            }}else{JOptionPane.showMessageDialog(this,"Failed...");}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void bname_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bname_comboActionPerformed
        show_accou();
    }//GEN-LAST:event_bname_comboActionPerformed

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

    private void paidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }

    }//GEN-LAST:event_paidKeyTyped

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
     jLabel5.setText(""+((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
    }//GEN-LAST:event_jDateChooser1PropertyChange
 void Find_ammount(){
    try{
        double t=0,p=0,d=0,due=0;
    
      con.contest();
                    
            String select="SELECT SUM(`sub_total`),SUM(`discount`) ,SUM(`paid`)FROM `sergical_shop`.`sales_acoount` WHERE `company`='"+name.getText()+"' GROUP BY `bill_no`";
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
   void Find_ammount_billWise(){
    try{
        double t=0,p=0,d=0,due=0;
    
      con.contest();
                    
            String select="SELECT `sub_total`,`discount`,`paid` FROM `sergical_shop`.`sales_acoount` WHERE `company`='"+name.getText()+"' AND `bill_no`='"+jTextField2.getText()+"'";
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
            String select="SELECT  `bill_no`,`date`, SUM(`total_item`),SUM(`sub_total`),SUM(`discount`) ,SUM(`paid`)FROM `sergical_shop`.`sales_acoount` WHERE `company`='"+name.getText()+"' GROUP BY `bill_no` ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);     


       
            while(con.rs.next()){ 
                count=count+1;
                subt=Double.parseDouble(con.rs.getString(4));
                pai=Double.parseDouble(con.rs.getString(6));
                dis=Double.parseDouble(con.rs.getString(5));
              // subtt=subt+subtt;
              // paii=pai+paii;
               //diss=dis+diss;
               
                dt.addRow(new Object[]{count,con.rs.getString(1),con.rs.getDate(2),Double.parseDouble(con.rs.getString(3)),subt,dis,pai,((subt)-(pai+dis)) });
                 
          //sb=(subtt)-(paii-diss);  
         
           // stotal.setText(""+sb);     
           }
          
            
/*else{
                co=co-10;
           double co2=0;
             
              while(con.rs.next()){
           if(co2==co){count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(1),con.rs.getDate(2),Double.parseDouble(con.rs.getString(3)),Double.parseDouble(con.rs.getString(4)),Double.parseDouble(con.rs.getString(5)) });
                    name.setText(""+shop_combo.getSelectedItem());
           }else{
           co2=co2+1;
           } 
              } 
    

}*/

               if(customer_type.getSelectedIndex()==0 & shop_combo.getSelectedIndex()>0){
           String ss=name.getText();
          String[] xx=  ss.split("\\|\\| ");  
              String s="SELECT  `address`FROM `sergical_shop`.`customer` WHERE `cu_name`='"+xx[1]+"' AND `shop_name`='"+xx[0]+"'";
              
              con.ps=con.ct.prepareCall(s);
              con.rs=con.ps.executeQuery();
              if(con.rs.next()){  
                 add.setText(""+con.rs.getString(1));
              }     
               
               }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    

}
    
    void Find_Data_billWise(){
   
    
    try{
        tcount=0;
        count=0;
       double co=0;
     DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    //SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//String date1 = sd.format(jDateChooser1.getDate()); 
String cust="";
      con.contest(); 
      
            String select="SELECT  `bill_no`,`date`,`total_item`,`sub_total`,`discount`,`paid`,`due` FROM `sergical_shop`.`sales_acoount` WHERE `company`='"+name.getText()+"' AND `bill_no`='"+jTextField2.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);     
 
            while(con.rs.next()){ 
                count=count+1;
                subt=Double.parseDouble(con.rs.getString(4));
                pai=Double.parseDouble(con.rs.getString(6));
                dis=Double.parseDouble(con.rs.getString(5));
              dt.addRow(new Object[]{count,con.rs.getString(1),con.rs.getDate(2),Double.parseDouble(con.rs.getString(3)),subt,dis,pai,Double.parseDouble(con.rs.getString(7)) });
                
               //   name.setText(""+shop_combo.getSelectedItem());
                     
           }
/*else{
                co=co-10;
           double co2=0;
             
              while(con.rs.next()){
           if(co2==co){count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(1),con.rs.getDate(2),Double.parseDouble(con.rs.getString(3)),Double.parseDouble(con.rs.getString(4)),Double.parseDouble(con.rs.getString(5)) });
                    name.setText(""+shop_combo.getSelectedItem());
           }else{
           co2=co2+1;
           } 
              } 
    

}*/

             if(customer_type.getSelectedIndex()==0 & shop_combo.getSelectedIndex()>0){     
           String ss=name.getText();
       String[] xx=  ss.split("\\|\\| ");  
              String s="SELECT  `address`FROM `sergical_shop`.`customer` WHERE `cu_name`='"+xx[1]+"' AND `shop_name`='"+xx[0]+"'";
              
              con.ps=con.ct.prepareCall(s);
              con.rs=con.ps.executeQuery();
              if(con.rs.next()){  
                 add.setText(""+con.rs.getString(1));
              }     
               
             }
        } catch (SQLException ex) {
            
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    

}
 void Find_ammount2(){
    try{
        double t=0,p=0,d=0,due=0;
    
      con.contest();
                    
            String select="SELECT  SUM(`sub_total`) ,SUM(`discount`),SUM(`paid`) FROM  `sales_acoount` WHERE `company`='"+cust_tst.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);      
            if(con.rs.next()){ 
                
               t=Double.parseDouble(con.rs.getString(1));
               d=Double.parseDouble(con.rs.getString(2));
               p=Double.parseDouble(con.rs.getString(3));
               due=(t-d)-p;
                   due=Math.round(due*100.0)/100.0;
               stotal.setText(""+due);
               
               
               
               
           }  

               
               
               
           
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

} 
    
    void Find_Data2(){
   
    
    try{
        tcount=0;
        count=0;
       double co=0;
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
     dt.setRowCount(0);
     
    //SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//String date1 = sd.format(jDateChooser1.getDate()); 

      con.contest();  
            String select="SELECT  `bill_no`,`date`, `total_item`,`paid`,`due` FROM `sergical_shop`.`sales_acoount` WHERE `company`='"+cust_tst.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);     
 
  while(con.rs.next()){ 
                count=count+1;
               dt.addRow(new Object[]{count,con.rs.getString(1),con.rs.getDate(2),Double.parseDouble(con.rs.getString(3)),Double.parseDouble(con.rs.getString(4)),Double.parseDouble(con.rs.getString(5)) });
                    name.setText(""+cust_tst.getText());
                     
           }     
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    

}
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
            java.util.logging.Logger.getLogger(Sales_paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Sales_paid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_label;
    private javax.swing.JComboBox<String> account_combo;
    private javax.swing.JTextField add;
    private javax.swing.JLabel b_labl;
    private javax.swing.JComboBox<String> bname_combo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cust_l;
    private javax.swing.JLabel cust_l1;
    private javax.swing.JTextField cust_tst;
    private javax.swing.JComboBox<String> customer_type;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JTextField due;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField paid;
    private javax.swing.JLabel perma_l;
    private javax.swing.JComboBox<String> shop_combo;
    private javax.swing.JLabel sl;
    private javax.swing.JLabel sl1;
    private javax.swing.JTextField stotal;
    private javax.swing.JLabel total_leve1;
    private javax.swing.JLabel total_leve2;
    private javax.swing.JLabel total_leve3;
    private javax.swing.JLabel total_leve4;
    // End of variables declaration//GEN-END:variables
}

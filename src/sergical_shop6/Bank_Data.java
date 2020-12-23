
package sergical_shop6;
   
import java.awt.Color;
import java.awt.GraphicsEnvironment;
 
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
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

/**
 *
 * @author jasmi
 */
public class Bank_Data extends javax.swing.JFrame {
   Connection_Class con;
      Connection_Class con1;
  double count=0,tcount=0,cr=0,de=0;
  double b1=0,c1=0;
  
    public Bank_Data() {
        initComponents();
        
        
        con=new Connection_Class();
         show_date();
        show_ban();
        show_data_table();
        jTextField6.setVisible(false);
        jLabel9.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bname_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        accout_txt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bname_combo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        account_combo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton2_d = new javax.swing.JRadioButton();
        jRadioButton2_c = new javax.swing.JRadioButton();
        ammount_txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        datilse_txt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        debi_lab = new javax.swing.JLabel();
        credit_la = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ammount_lab = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bank Data");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 10, 240, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL", "Date", "Bank Name", "Account Number", "Status", "Details", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(430, 160, 910, 390);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("* Bank Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(430, 110, 100, 20);

        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
        });
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(430, 130, 220, 30);

        jButton6.setBackground(new java.awt.Color(0, 20, 104));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Show All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(1180, 130, 150, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(720, 650, 240, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(944, 4, 410, 40);

        jTextField6.setText("hide");
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
        });
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(660, 130, 270, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("* Account Number");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(660, 110, 240, 20);

        bname_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bname_txtFocusGained(evt);
            }
        });
        bname_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bname_txtMouseClicked(evt);
            }
        });
        bname_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bname_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bname_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bname_txtKeyTyped(evt);
            }
        });
        jPanel1.add(bname_txt);
        bname_txt.setBounds(20, 110, 290, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bank Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 290, 100, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Account Number");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 140, 190, 20);

        accout_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accout_txtFocusGained(evt);
            }
        });
        accout_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accout_txtMouseClicked(evt);
            }
        });
        accout_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accout_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                accout_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accout_txtKeyTyped(evt);
            }
        });
        jPanel1.add(accout_txt);
        accout_txt.setBounds(20, 160, 290, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(100, 200, 120, 40);

        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 270, 360, 10);

        bname_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        bname_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bname_comboActionPerformed(evt);
            }
        });
        jPanel1.add(bname_combo);
        bname_combo.setBounds(20, 310, 360, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bank Name");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 90, 190, 20);

        account_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel1.add(account_combo);
        account_combo.setBounds(20, 360, 360, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Account Number");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 340, 100, 20);

        buttonGroup1.add(jRadioButton2_d);
        jRadioButton2_d.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2_d.setText("Debit");
        jPanel1.add(jRadioButton2_d);
        jRadioButton2_d.setBounds(100, 410, 73, 31);

        buttonGroup1.add(jRadioButton2_c);
        jRadioButton2_c.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2_c.setText("Credit");
        jPanel1.add(jRadioButton2_c);
        jRadioButton2_c.setBounds(190, 410, 79, 31);

        ammount_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ammount_txtFocusGained(evt);
            }
        });
        ammount_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ammount_txtMouseClicked(evt);
            }
        });
        ammount_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ammount_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ammount_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ammount_txtKeyTyped(evt);
            }
        });
        jPanel1.add(ammount_txt);
        ammount_txt.setBounds(20, 520, 370, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Amount");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 500, 100, 20);

        datilse_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                datilse_txtFocusGained(evt);
            }
        });
        datilse_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datilse_txtMouseClicked(evt);
            }
        });
        datilse_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datilse_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                datilse_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                datilse_txtKeyTyped(evt);
            }
        });
        jPanel1.add(datilse_txt);
        datilse_txt.setBounds(20, 470, 370, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Details");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 450, 100, 20);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(120, 620, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date               ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 550, 110, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" *Date    ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 50, 70, 20);

        jButton4.setText("Month");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(660, 70, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Debit");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1020, 590, 110, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Credit");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1020, 560, 110, 20);

        debi_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        debi_lab.setForeground(new java.awt.Color(255, 255, 255));
        debi_lab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        debi_lab.setText("Debit");
        jPanel1.add(debi_lab);
        debi_lab.setBounds(1140, 590, 200, 20);

        credit_la.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        credit_la.setForeground(new java.awt.Color(255, 255, 255));
        credit_la.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        credit_la.setText("Credit");
        jPanel1.add(credit_la);
        credit_la.setBounds(1140, 560, 200, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1020, 620, 110, 20);

        ammount_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ammount_lab.setForeground(new java.awt.Color(255, 255, 255));
        ammount_lab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ammount_lab.setText("amunt");
        jPanel1.add(ammount_lab);
        ammount_lab.setBounds(1140, 620, 200, 20);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel16);
        jLabel16.setBounds(0, 0, 90, 110);

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseClicked(evt);
            }
        });
        desktopPane.add(jDateChooser2);
        jDateChooser2.setBounds(20, 570, 370, 30);

        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1370, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 730);

        setSize(new java.awt.Dimension(1359, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
        if(jTextField5.getText().equals("Madecine Search")){

            jTextField5.setText("");
        }
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
        if(jTextField5.getText().equals("Madecine Search")){
            jTextField5.setText("");
        }
    }//GEN-LAST:event_jTextField5MouseClicked
    void find(){
        
    count =0;
    cr=0;
    de=0;
        try {
            if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) { 
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
            con.contest();
            String select="SELECT `bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount` FROM `sergical_shop`.`bank_data` WHERE `bank_name` LIKE '"+jTextField5.getText()+"%'";

            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            double aa=0;
            while(con.rs.next()){
              count=count+1;
                if(con.rs.getString(3).equals("Credit")){
                       aa=Double.parseDouble(con.rs.getString(6)); 
                   
                cr=cr+aa;
             }else if(con.rs.getString(3).equals("Debit")){
                    aa=Double.parseDouble(con.rs.getString(6)); 
                de=de+Double.parseDouble(con.rs.getString(6));
             }
                 dt.addRow(new Object[]{count,con.rs.getDate(5),con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(6))});
              
            }  cr=Math.round(cr*100.0)/100.0;
             credit_la.setText(""+cr);
              de=Math.round(de*100.0)/100.0;
             debi_lab.setText(""+de);
             
              de=cr-de; 
              de=Math.round(de*100.0)/100.0;
           ammount_lab.setText(""+de);
        }else{
               SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sd.format(jDateChooser2.getDate());  
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
            con.contest();
            String select="SELECT `bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount` FROM `sergical_shop`.`bank_data` WHERE `bank_name` LIKE '"+jTextField5.getText()+"%' and `date`='"+date1+"'";
          double aa=0;
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
                if(con.rs.getString(3).equals("Credit")){
                    aa=Double.parseDouble(con.rs.getString(6)); 
                cr=cr+aa;
                   
             }else if(con.rs.getString(3).equals("Debit")){
                 aa=Double.parseDouble(con.rs.getString(6));
                de=de+aa;
                  
             }
              count=count+1;
              dt.addRow(new Object[]{count,con.rs.getDate(5),con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(6))});
              
            }  cr=Math.round(cr*100.0)/100.0;
            credit_la.setText(""+cr);
             de=Math.round(de*100.0)/100.0;
             debi_lab.setText(""+de);
              
              de=cr-de;
               de=Math.round(de*100.0)/100.0;
           ammount_lab.setText(""+de);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        
    }//GEN-LAST:event_jTextField5KeyPressed
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
     jLabel1.setText(""+df.format(dt));
 }
    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
             find();
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        show_product_leg();
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        show_data_table();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bname_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bname_txtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_bname_txtFocusGained

    private void bname_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bname_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bname_txtMouseClicked

    private void bname_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bname_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bname_txtKeyPressed

    private void bname_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bname_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bname_txtKeyReleased

    private void bname_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bname_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_bname_txtKeyTyped

    private void accout_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accout_txtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_accout_txtFocusGained

    private void accout_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accout_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_accout_txtMouseClicked

    private void accout_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accout_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_accout_txtKeyPressed

    private void accout_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accout_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_accout_txtKeyReleased

    private void accout_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accout_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_accout_txtKeyTyped
double auth(){
double r=0;
if(bname_txt.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Bank Name is Empty"); 
bname_txt.requestFocus();
}else if(accout_txt.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Bank Name is Empty"); 
accout_txt.requestFocus();
}else{

r=1;

}

return r;}

double auth_data_entry(){
double r=0;
String status="";
if(jRadioButton2_d.isSelected()){
status="Debit";
}
else if(jRadioButton2_c.isSelected()){
status="Credit";
}else{status="";}



if(bname_combo.getSelectedIndex()<=0){
JOptionPane.showMessageDialog(this, "Bank Name is Empty"); 
bname_combo.requestFocus();
}else if(account_combo.getSelectedIndex()<=0){
JOptionPane.showMessageDialog(this, "Account Number is Empty"); 
account_combo.requestFocus();
}else if(status.isEmpty()){
JOptionPane.showMessageDialog(this, "Please Select Debit or Credit"); 
 
}else if(datilse_txt.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Details is Empty"); 
datilse_txt.requestFocus();
}else if(ammount_txt.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Ammount is Empty"); 
ammount_txt.requestFocus();
}else if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Date Is Empty");
            jDateChooser2.requestFocus();
        }else{

r=1;

}

return r;}



void bank_data_add(String query,String msg){
    try {  
         con.contest(); 
            double   result=con.st.executeUpdate(query);
            if(result>0){
            JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
                show_ban();
        bname_txt.setText("");
        accout_txt.setText("");
        
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
void show_data_table(){
count=0;
cr=0;
de=0;

       try { 
           DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
           con.contest();
           String s="SELECT `bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount` FROM `sergical_shop`.`bank_data`";
           
           double aa=0;
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){    
               count=count+1;
             if(con.rs.getString(3).equals("Credit")){
                 aa=Double.parseDouble(con.rs.getString(6));
             cr=cr+aa;
             }else if(con.rs.getString(3).equals("Debit")){
                    aa=Double.parseDouble(con.rs.getString(6));
           
             de=de+aa;
             }
                  dt.addRow(new Object[]{count,con.rs.getDate(5),con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(6))});
              
           }
            cr=Math.round(cr*100.0)/100.0;
           credit_la.setText(""+cr);
          de=Math.round(de*100.0)/100.0;
           debi_lab.setText(""+de);
           de=cr-de;
            de=Math.round(de*100.0)/100.0;
           ammount_lab.setText(""+de);
        } catch (SQLException ex) {
           Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
       }
}
void bank_dataEntry_add(String query,String msg){
    try {  
         con.contest(); 
            double   result=con.st.executeUpdate(query);
            if(result>0){
       JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
       bname_combo.setSelectedIndex(0);
       account_combo.setSelectedIndex(0);
       buttonGroup1.clearSelection();
       datilse_txt.setText("");
       ammount_txt.setText("");
        ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
                show_data_table();
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(auth()==1){
            
        String bname=bname_txt.getText();
         String account=accout_txt.getText();
        String date1=jLabel1.getText();
        String in="INSERT INTO `sergical_shop`.`bank_name`  (`name`,`number`,`date`)VALUES ('"+bname+"','"+account+"','"+date1+"')";
            bank_data_add(in, "Add");
        } 
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ammount_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ammount_txtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txtFocusGained

    private void ammount_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ammount_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txtMouseClicked

    private void ammount_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txtKeyPressed

    private void ammount_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txtKeyReleased

    private void ammount_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txtKeyTyped
            char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
            

    }//GEN-LAST:event_ammount_txtKeyTyped

    private void datilse_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_datilse_txtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_datilse_txtFocusGained

    private void datilse_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datilse_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_datilse_txtMouseClicked

    private void datilse_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datilse_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_datilse_txtKeyPressed

    private void datilse_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datilse_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_datilse_txtKeyReleased

    private void datilse_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datilse_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_datilse_txtKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(auth_data_entry()==1){  String status="";
            String bname=bname_combo.getSelectedItem().toString();
            String account=account_combo.getSelectedItem().toString();
            if(jRadioButton2_c.isSelected()){
            status="Credit";
            }else if(jRadioButton2_d.isSelected()){
               status="Debit";
            }else{
            status="";
            } 
            String details=datilse_txt.getText();
            String ammount=ammount_txt.getText();
             SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = sd.format(jDateChooser2.getDate());  
       String in="INSERT INTO `sergical_shop`.`bank_data`  (`bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount`) VALUES ('"+bname+"', '"+account+"','"+status+"','"+details+"','"+date1+"','"+ammount+"')";
           bank_dataEntry_add(in, "Submition");
       }
         
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bname_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bname_comboActionPerformed
        show_accou();
    }//GEN-LAST:event_bname_comboActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        count =0;
        cr=0;
        de=0;
        try {
            if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Select Date");
                
            }else if(jTextField5.getText().isEmpty()){
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
            con.contest();
                 SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
        String date1 = sd.format(jDateChooser2.getDate());  
            String select="SELECT `bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount` FROM `sergical_shop`.`bank_data` WHERE `date` LIKE '%"+date1+"%'";
          double aa=0;
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
                
              count=count+1;
                if(con.rs.getString(3).equals("Credit")){
                    aa=Double.parseDouble(con.rs.getString(6));
                cr=cr+aa;
             }else if(con.rs.getString(3).equals("Debit")){
                 aa=Double.parseDouble(con.rs.getString(6));
                de=de+aa;
             }
              
           dt.addRow(new Object[]{count,con.rs.getDate(5),con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(6))});
               }
             cr=Math.round(cr*100.0)/100.0;
            credit_la.setText(""+cr);
             de=Math.round(de*100.0)/100.0;
             debi_lab.setText(""+de);
              de=cr-de;
               de=Math.round(de*100.0)/100.0;
           ammount_lab.setText(""+de);
        }else{
               SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
        String date1 = sd.format(jDateChooser2.getDate());  
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
            con.contest();
            String select="SELECT `bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount` FROM `sergical_shop`.`bank_data` WHERE `bank_name` LIKE '"+jTextField5.getText()+"%' and `date` LIKE '%"+date1+"%'";
          
            double aa=0;
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
              count=count+1;
                if(con.rs.getString(3).equals("Credit")){
                    aa=Double.parseDouble(con.rs.getString(6));
                cr=cr+aa;
             }else if(con.rs.getString(3).equals("Debit")){
                 aa=Double.parseDouble(con.rs.getString(6));
                de=de+aa;
             }
              
           dt.addRow(new Object[]{count,con.rs.getDate(5),con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(6))});
                
            }
             cr=Math.round(cr*100.0)/100.0;
            
            credit_la.setText(""+cr);
             de=Math.round(de*100.0)/100.0;
             debi_lab.setText(""+de);
              de=cr-de;
              de=Math.round(de*100.0)/100.0;
           ammount_lab.setText(""+de);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jDateChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseClicked
  void show_product(){
      double a=0,b=0,c=0;
      double count=0;
        try {
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
            con.contest();
            String s="SELECT `stock`.`Catagory`,`stock`.`product`,`stock`.`pur`,`stock`.`sales`  FROM `stock` ORDER BY (`stock`.`pur`-`stock`.`sales`) ASC ";
            
            
            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            while(con.rs.next()){
                count=count+1;
                b1=Double.parseDouble(con.rs.getString(3));
                c1=Double.parseDouble(con.rs.getString(4));
                b1=b1-c1;
                b1=Math.round(b1*100.0)/100.0;
                  dt.addRow(new Object[]{count,con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),b1});
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
   
   }
   void show_product_leg(){
       if(jTextField6.getText().isEmpty()){
           show_product();
       }else{
       
       
        double a=0,b=0,c=0;
      double count=0;
        try {
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
            con.contest();
            String s="SELECT `stock`.`Catagory`,`stock`.`product`,`stock`.`pur`,`stock`.`sales`  FROM `stock` ORDER BY (`stock`.`pur`-`stock`.`sales`) ASC ";
             
            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            while(con.rs.next()){
                count=count+1;
                a=Double.parseDouble(jTextField6.getText());
                b1=Double.parseDouble(con.rs.getString(3));
                c1=Double.parseDouble(con.rs.getString(4));
                b=b1-c1;
             
                if(b<=a){
               dt.addRow(new Object[]{count,con.rs.getDate(5),con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(6))});
               }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
       
       }
     
   
   }
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
            java.util.logging.Logger.getLogger(Bank_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Bank_Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> account_combo;
    private javax.swing.JTextField accout_txt;
    private javax.swing.JLabel ammount_lab;
    private javax.swing.JTextField ammount_txt;
    private javax.swing.JComboBox<String> bname_combo;
    private javax.swing.JTextField bname_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel credit_la;
    private javax.swing.JTextField datilse_txt;
    private javax.swing.JLabel debi_lab;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton2_c;
    private javax.swing.JRadioButton jRadioButton2_d;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}

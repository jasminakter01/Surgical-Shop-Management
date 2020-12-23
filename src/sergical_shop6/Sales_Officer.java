 
package sergical_shop6;
  
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Sales_Officer extends javax.swing.JFrame {
 Connection_Class con;
    public Sales_Officer() {
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
        
        }
        */
          con=new Connection_Class();
          show_allData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Show_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Add_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Clear_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Find = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
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
        jLabel1.setText("Sales Officer(SR) Data");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 0, 300, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name                             :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 110, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile Number             :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 150, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address                         :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 190, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Position                         : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(680, 70, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Id                                   :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 70, 170, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(330, 70, 310, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(330, 110, 310, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(330, 150, 310, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(330, 190, 310, 30);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(850, 70, 310, 30);

        Show_Button.setText("Show");
        Show_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Show_Button);
        Show_Button.setBounds(970, 310, 170, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", "Name", "Position", "Mobile Number", "Address", "Joining Date", "Refaral Person", "Mobile Number", "Salary"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 420, 1280, 270);

        jButton2.setText("Delete ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(790, 310, 170, 23);

        Add_Button.setText("Add");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Add_Button);
        Add_Button.setBounds(430, 310, 170, 23);

        Update_Button.setText("Update");
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Update_Button);
        Update_Button.setBounds(610, 310, 170, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Joining Date                 : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(680, 110, 170, 30);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.setText("NA");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(850, 150, 310, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Refaral Person             : ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(680, 150, 170, 30);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setText("NA");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(850, 190, 310, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile Number             :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(680, 190, 170, 30);

        Clear_Button.setText("Clear");
        Clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Clear_Button);
        Clear_Button.setBounds(590, 360, 170, 23);

        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Exit_Button);
        Exit_Button.setBounds(770, 360, 170, 23);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(850, 110, 310, 30);

        Find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FindMouseReleased(evt);
            }
        });
        Find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FindKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FindKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FindKeyTyped(evt);
            }
        });
        jPanel1.add(Find);
        Find.setBounds(30, 390, 450, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("* Search By SR Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 360, 230, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "SR Salery", "SR Salrey Report" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(1230, 10, 140, 30);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(330, 230, 310, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Salary                            :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(160, 230, 170, 30);

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
        desktopPane.setBounds(0, 0, 1370, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1380, 730);

        setSize(new java.awt.Dimension(1381, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
       
        dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        
      if(Authintication()==1){
          SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
String date1 = sd.format(jDateChooser1.getDate());
        String id=jTextField1.getText();
        String name=jTextField2.getText();
        String mobile=jTextField3.getText();
        String address=jTextField4.getText();
        String position =jTextField5.getText();   
        String refaral=jTextField6.getText();
        String refaral_mobile= jTextField7.getText();
                String salry= jTextField8.getText();
                 try{
   
            con.contest();
            String select="SELECT `so_id` FROM `sales_officer` WHERE `so_id`='"+jTextField1.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            if(con.rs.next()){
                JOptionPane.showMessageDialog(this, "This id already Add");
                    
              }else{
              String query="INSERT INTO `sergical_shop`.`sales_officer` (`so_id`, `so_name`, `so_posssition`, `so_address`,`so_phone`, `so_joindate`, `refaral_persion`,`refaral_phone`,`salary`)VALUES ('"+id+"', '"+name+"', '"+position+"', '"+address+"', '"+mobile+"', '"+date1+"', '"+refaral+"', '"+refaral_mobile+"','"+salry+"')";
        Data_Operation(query, "Add");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       
      }
               
        
        
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void FindMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindMouseReleased

    }//GEN-LAST:event_FindMouseReleased

    private void FindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindKeyPressed
        /*if (evt.getKeyCode() == KeyEvent.VK_ENTER|| evt.getKeyChar()==KeyEvent.VK_0|| evt.getKeyChar()==KeyEvent.VK_1
            || evt.getKeyChar()==KeyEvent.VK_2
            || evt.getKeyChar()==KeyEvent.VK_3
            || evt.getKeyChar()==KeyEvent.VK_4
            || evt.getKeyChar()==KeyEvent.VK_5
            || evt.getKeyChar()==KeyEvent.VK_6
            || evt.getKeyChar()==KeyEvent.VK_7
            || evt.getKeyChar()==KeyEvent.VK_8
            || evt.getKeyChar()==KeyEvent.VK_9

            || evt.getKeyChar()==KeyEvent.VK_A
            || evt.getKeyChar()==KeyEvent.VK_B
            || evt.getKeyChar()==KeyEvent.VK_C
            || evt.getKeyChar()==KeyEvent.VK_D

            || evt.getKeyChar()==KeyEvent.VK_E
            || evt.getKeyChar()==KeyEvent.VK_F
            || evt.getKeyChar()==KeyEvent.VK_G
            || evt.getKeyChar()==KeyEvent.VK_H

            || evt.getKeyChar()==KeyEvent.VK_I
            || evt.getKeyChar()==KeyEvent.VK_J
            || evt.getKeyChar()==KeyEvent.VK_K
            || evt.getKeyChar()==KeyEvent.VK_L

            || evt.getKeyChar()==KeyEvent.VK_M
            || evt.getKeyChar()==KeyEvent.VK_N
            || evt.getKeyChar()==KeyEvent.VK_O
            || evt.getKeyChar()==KeyEvent.VK_P

            || evt.getKeyChar()==KeyEvent.VK_Q
            || evt.getKeyChar()==KeyEvent.VK_R
            || evt.getKeyChar()==KeyEvent.VK_S
            || evt.getKeyChar()==KeyEvent.VK_T

            || evt.getKeyChar()==KeyEvent.VK_U
            || evt.getKeyChar()==KeyEvent.VK_V
            || evt.getKeyChar()==KeyEvent.VK_W
            || evt.getKeyChar()==KeyEvent.VK_X
            || evt.getKeyChar()==KeyEvent.VK_Y
            || evt.getKeyChar()==KeyEvent.VK_Z

        ) {
            Find_Data();
        }*/
    }//GEN-LAST:event_FindKeyPressed

    private void FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindKeyReleased
        Find_Data();
    }//GEN-LAST:event_FindKeyReleased

    private void FindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindKeyTyped

    }//GEN-LAST:event_FindKeyTyped

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
         
         if(Authintication()==1){      
        String id=jTextField1.getText();
        String name=jTextField2.getText();
        String mobile=jTextField3.getText();
        String address=jTextField4.getText();
        String position =jTextField5.getText();   
        String refaral=jTextField6.getText();
        String refaral_mobile= jTextField7.getText();
        String salary=jTextField8.getText();
        
        String query="UPDATE `sergical_shop`.`sales_officer` SET  `so_name` = '"+name+"',`so_posssition` = '"+position+"',`so_address` = '"+address+"',`so_phone` = '"+mobile+"',`refaral_persion` = '"+refaral+"',`refaral_phone` = '"+refaral_mobile+"',`salary`='"+salary+"' WHERE `so_id` = '"+id+"'";
        Data_Operation(query, "Update"); 
        
 }
        
        
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void Show_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_ButtonActionPerformed
        show_allData();
    }//GEN-LAST:event_Show_ButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
     jTextField1.setText(dt.getValueAt(jTable1.getSelectedRow(), 0).toString());
         jTextField2.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
         
          jTextField3.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
          jTextField5.setText(dt.getValueAt(jTable1.getSelectedRow(), 2).toString()); 
         jTextField4.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
         
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(dt.getValueAt(jTable1.getSelectedRow(), 5).toString());
        
        
         jTextField6.setText(dt.getValueAt(jTable1.getSelectedRow(), 6).toString()); 
         jTextField7.setText(dt.getValueAt(jTable1.getSelectedRow(), 7).toString());
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField8.setText(dt.getValueAt(jTable1.getSelectedRow(), 8).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void Clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_ButtonActionPerformed
       Dataclar();
    }//GEN-LAST:event_Clear_ButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex()==1){
        SR_Salarry s=new SR_Salarry();
        s.setVisible(true);
        dispose();
        }if(jComboBox1.getSelectedIndex()==2){
         SR_Sallary_report s=new SR_Sallary_report();
        s.setVisible(true);
        dispose();
        
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
          
            
            
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String id=jTextField1.getText();
            String s="DELETE FROM `sergical_shop`.`sales_officer` WHERE `so_id` = '"+id+"'";
            Data_Operation(s, "DELETE");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked
int Authintication(){
   int e=0;
if(jTextField1.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Id is empty");
    jTextField1.requestFocus();
}else if(jTextField2.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Name is empty");
    jTextField2.requestFocus();
}else if(jTextField3.getText().isEmpty()){
 JOptionPane.showMessageDialog(this, "Mobile is empty");
    jTextField3.requestFocus();
}else if(jTextField4.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Address is empty");
    jTextField4.requestFocus();
}else if(jTextField8.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Salary is empty");
    jTextField8.requestFocus();
} else if(jTextField5.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Position is empty");
    jTextField5.requestFocus();
}else if(jTextField6.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Refaral Persion Name is empty");
    jTextField6.requestFocus();
}else if(jTextField7.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Refaral Persion Mobile Number is empty");
    jTextField7.requestFocus();
} else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
           JOptionPane.showMessageDialog(Find, "Joining Date Is Empty");
            jDateChooser1.requestFocus();
        }else{ 
e=1;



}

return e;
} 

void Dataclar(){
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText(""); 
jTextField5.setText("");
jTextField6.setText("NA");
jTextField7.setText("NA"); 
jTextField8.setText("");
((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
jTextField1.setEditable(true);
jTextField2.setEditable(true);
jTextField1.requestFocus();

}

void Data_Operation(String query,String msg){
    try {  
         con.contest();
           double   result=con.st.executeUpdate(query);
            if(result>0){
            JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
                Dataclar();
                show_allData();
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}  
void show_allData(){
    try{
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
            con.contest();
            String select="SELECT `so_id`, `so_name`, `so_posssition`, `so_phone`,`so_address`,  `so_joindate`, `refaral_persion`, `refaral_phone`,`salary` FROM `sergical_shop`.`sales_officer`";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
              dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getDate(6),con.rs.getString(7),con.rs.getString(8),Double.parseDouble(con.rs.getString(9))});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

} 
void Find_Data(){
    try{
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
      con.contest();
            String select="SELECT `so_id`, `so_name`, `so_posssition`, `so_phone`,`so_address`,  `so_joindate`, `refaral_persion`, `refaral_phone`,`salary` FROM `sergical_shop`.`sales_officer`\n" +
" WHERE  `so_name` LIKE '"+Find.getText()+"%'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
                dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getDate(6),con.rs.getString(7),con.rs.getString(8),con.rs.getString(9)});
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
            java.util.logging.Logger.getLogger(Sales_Officer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_Officer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_Officer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_Officer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Sales_Officer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Clear_Button;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JTextField Find;
    private javax.swing.JButton Show_Button;
    private javax.swing.JButton Update_Button;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sergical_shop6;
 
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
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
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel; 
 
public class Supplier_Table extends javax.swing.JFrame {
  
     Connection_Class con;
    public Supplier_Table() {
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
        show_allData();
       
        
        
        
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Sup_Id = new javax.swing.JTextField();
        Sup_Name = new javax.swing.JTextField();
        Mobile = new javax.swing.JTextField();
        Company_Name = new javax.swing.JTextField();
        Company_Address = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Add_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Find = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Find1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Find2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Supplier Name       :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 190, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile Number      :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 230, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Company Name     :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 270, 140, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Company Address :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 310, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Id                            :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 150, 140, 30);

        Sup_Id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(Sup_Id);
        Sup_Id.setBounds(190, 150, 310, 30);

        Sup_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sup_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sup_NameActionPerformed(evt);
            }
        });
        jPanel1.add(Sup_Name);
        Sup_Name.setBounds(190, 190, 310, 30);

        Mobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(Mobile);
        Mobile.setBounds(190, 230, 310, 30);

        Company_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Company_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Company_NameActionPerformed(evt);
            }
        });
        jPanel1.add(Company_Name);
        Company_Name.setBounds(190, 270, 310, 30);

        Company_Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Company_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Company_AddressActionPerformed(evt);
            }
        });
        jPanel1.add(Company_Address);
        Company_Address.setBounds(190, 310, 310, 30);

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 430, 170, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Supplier Name", "Mobile Number", "Company Name", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(5);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(7);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(530, 140, 790, 460);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(70, 470, 170, 23);

        Add_Button.setText("Add");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Add_Button);
        Add_Button.setBounds(60, 380, 170, 23);

        Update_Button.setText("Update");
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Update_Button);
        Update_Button.setBounds(250, 380, 170, 23);

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
        Find.setBounds(530, 100, 260, 30);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(60, 430, 170, 23);

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(250, 470, 170, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("* Search By Supplier Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(530, 70, 230, 30);

        Find1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Find1MouseReleased(evt);
            }
        });
        Find1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Find1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Find1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Find1KeyTyped(evt);
            }
        });
        jPanel1.add(Find1);
        Find1.setBounds(800, 100, 250, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("* Search By Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(800, 70, 230, 30);

        Find2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Find2MouseReleased(evt);
            }
        });
        Find2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Find2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Find2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Find2KeyTyped(evt);
            }
        });
        jPanel1.add(Find2);
        Find2.setBounds(1060, 100, 250, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("* Search By Company Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1060, 70, 230, 30);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 90, 110);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier Data");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(90, 10, 170, 30);

        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1370, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 730);

        setSize(new java.awt.Dimension(1367, 727));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sup_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sup_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sup_NameActionPerformed

    private void Company_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Company_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Company_AddressActionPerformed
 

int Authintication(){
   int e=0;
if(Sup_Id.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Id is empty");
    Sup_Id.requestFocus();
}else if(Sup_Name.getText().isEmpty()){
 JOptionPane.showMessageDialog(this, "Supplier name is empty");
    Sup_Name.requestFocus();
}else if(Mobile.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Mobile is empty");
    Mobile.requestFocus();
}else if(Company_Name.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Company Name is empty");
    Company_Name.requestFocus();
}else if(Company_Address.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Company Address is empty");
    Company_Address.requestFocus();
}else{

e=1;

}

return e;
} 

void Dataclar(){
    Find.setText("");
Sup_Id.setText("");
Sup_Name.setText("");
Mobile.setText("");
Company_Name.setText("");
Company_Address.setText("");
Sup_Id.requestFocus();
  Sup_Id.setEditable(true);

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
            String select="SELECT`su_id`,`su_company_name`,`company_address`,`su_name`,`su_phone` FROM `sergical_shop`.`suplier_table`";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
              dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(4),con.rs.getString(5),con.rs.getString(2),con.rs.getString(3)});
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
            String select="SELECT`su_id`,`su_company_name`,`company_address`,`su_name`,`su_phone` FROM `sergical_shop`.`suplier_table`\n" +
" WHERE `su_name` LIKE '"+Find.getText()+"%' ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
            dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(4),con.rs.getString(5),con.rs.getString(2),con.rs.getString(3)});
              }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
void Find_DataAdd(){
    try{
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
      con.contest();
            String select="SELECT`su_id`,`su_company_name`,`company_address`,`su_name`,`su_phone` FROM `sergical_shop`.`suplier_table`\n" +
" WHERE  `company_address` LIKE '"+Find1.getText()+"%'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
            dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(4),con.rs.getString(5),con.rs.getString(2),con.rs.getString(3)});
              }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
void Find_Datacompany(){
    try{
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
      con.contest();
            String select="SELECT`su_id`,`su_company_name`,`company_address`,`su_name`,`su_phone` FROM `sergical_shop`.`suplier_table`\n" +
" WHERE  `su_company_name` LIKE '"+Find2.getText()+"%'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
            dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(4),con.rs.getString(5),con.rs.getString(2),con.rs.getString(3)});
              }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        
      if(Authintication()==1){
        String sid=Sup_Id.getText();
        String sname=Sup_Name.getText();
        String smobile=Mobile.getText();
        String company=Company_Name.getText();
        String addres=Company_Address.getText();  
        String query=" INSERT INTO `sergical_shop`.`suplier_table` (`su_id`,`su_company_name`, `company_address`,`su_name`,`su_phone`)VALUES ('"+sid+"','"+company+"','"+addres+"','"+sname+"','"+smobile+"');";
        Data_Operation(query, "Add");
       
      }
        
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Company_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Company_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Company_NameActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
 if(Authintication()==1){              
        String sid=Sup_Id.getText();
        String sname=Sup_Name.getText();
        String smobile=Mobile.getText();
        String company=Company_Name.getText();
        String addres=Company_Address.getText();  
        String query="UPDATE `sergical_shop`.`suplier_table` SET `su_company_name` = '"+company+"', `company_address` = '"+addres+"',`su_name` = '"+sname+"', `su_phone` = '"+smobile+"' WHERE `su_id` = '"+sid+"'";
        Data_Operation(query, "Update"); 
        
 }
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
         DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
        Sup_Id.setText(dt.getValueAt(jTable1.getSelectedRow(), 0).toString());
         Sup_Name.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
          Mobile.setText(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
           Company_Name.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString()); 
         Company_Address.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
        Sup_Id.setEditable(false);
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
show_allData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindKeyTyped
      
        
        
      
    }//GEN-LAST:event_FindKeyTyped

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

    private void FindMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindMouseReleased
     
    }//GEN-LAST:event_FindMouseReleased

    private void FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindKeyReleased
        Find_Data();  
    }//GEN-LAST:event_FindKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Dataclar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(Authintication()==1){              
        String sid=Sup_Id.getText();
       
        String query="DELETE FROM `sergical_shop`.`suplier_table` WHERE `su_id` = '"+sid+"'";
        Data_Operation(query, "Delete"); 
        
 }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Find1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Find1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Find1MouseReleased

    private void Find1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Find1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Find1KeyPressed

    private void Find1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Find1KeyReleased
        Find_DataAdd();
    }//GEN-LAST:event_Find1KeyReleased

    private void Find1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Find1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Find1KeyTyped

    private void Find2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Find2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Find2MouseReleased

    private void Find2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Find2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Find2KeyPressed

    private void Find2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Find2KeyReleased
      
        Find_Datacompany();
    }//GEN-LAST:event_Find2KeyReleased

    private void Find2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Find2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Find2KeyTyped

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked
 
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
            java.util.logging.Logger.getLogger(Supplier_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Supplier_Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JTextField Company_Address;
    private javax.swing.JTextField Company_Name;
    private javax.swing.JTextField Find;
    private javax.swing.JTextField Find1;
    private javax.swing.JTextField Find2;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField Sup_Id;
    private javax.swing.JTextField Sup_Name;
    private javax.swing.JButton Update_Button;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

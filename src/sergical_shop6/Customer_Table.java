 
package sergical_shop6;
  
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

 
public class Customer_Table extends javax.swing.JFrame {
   Connection_Class con;
    public Customer_Table() {
        initComponents();
        
      /*  final Point x=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
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
         Toolkit tk=Toolkit.getDefaultToolkit();
        int h=(int) tk.getScreenSize().getHeight();
            int w=(int) tk.getScreenSize().getWidth(); 
            this.setSize(w, h);
            getContentPane().setBackground(Color.white);*/
          con=new Connection_Class();
        show_allData();
       
        
        
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cu_Id = new javax.swing.JTextField();
        Mobile = new javax.swing.JTextField();
        Shop_Address = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Shop_name = new javax.swing.JTextField();
        Cu_Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Find = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Find1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Find2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile Number                :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 270, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address                            :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 310, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("* Search By Customer Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(530, 70, 230, 30);

        Cu_Id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(Cu_Id);
        Cu_Id.setBounds(210, 150, 310, 30);

        Mobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileActionPerformed(evt);
            }
        });
        jPanel1.add(Mobile);
        Mobile.setBounds(210, 270, 310, 30);

        Shop_Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(Shop_Address);
        Shop_Address.setBounds(210, 310, 310, 30);

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(240, 403, 170, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Customer Name", "Hospital/ Shop Name", "Mobile Number", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(530, 140, 790, 460);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(50, 403, 170, 30);

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(50, 353, 170, 30);

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(240, 353, 170, 30);

        Shop_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Shop_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shop_nameActionPerformed(evt);
            }
        });
        jPanel1.add(Shop_name);
        Shop_name.setBounds(210, 230, 310, 30);

        Cu_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cu_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cu_NameActionPerformed(evt);
            }
        });
        jPanel1.add(Cu_Name);
        Cu_Name.setBounds(210, 190, 310, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hospital/Shop Name       :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 230, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Customer Name               :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 190, 180, 30);

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
        Find.setBounds(530, 100, 240, 30);

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(50, 453, 170, 30);

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(230, 453, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Id                                       :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 150, 180, 30);

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
        Find1.setBounds(790, 100, 240, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("* Search By Address");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(790, 70, 230, 30);

        Find2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Find2MouseClicked(evt);
            }
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
        Find2.setBounds(1050, 100, 240, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("* Search By Shop Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1050, 70, 230, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Parmanent Customer Data");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(100, 10, 260, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel11);
        jLabel11.setBounds(0, 0, 90, 110);

        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1370, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 730);

        setSize(new java.awt.Dimension(1359, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

int Authintication(){
    int e=0;
if(Cu_Id.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Id is empty");
    Cu_Id.requestFocus();
}else if(Cu_Name.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Customer Name is empty");
    Cu_Name.requestFocus();
}else if(Shop_name.getText().isEmpty()){
 JOptionPane.showMessageDialog(this, "Supplier name is empty");
    Shop_name.requestFocus();
}else if(Mobile.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Mobile is empty");
    Mobile.requestFocus();
}else if(Shop_Address.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Company Name is empty");
    Shop_Address.requestFocus();
}else{ 
e=1;



}

return e;
} 

void Dataclar(){
Cu_Id.setText("");
Shop_name.setText("");
Mobile.setText("");
Shop_Address.setText(""); 
Find.setText("");
Cu_Name.setText("");
Cu_Id.requestFocus();
 Cu_Id.setEditable(true);
}

void Data_Operation(String query,String msg){
    try {  
         con.contest();
            int   result=con.st.executeUpdate(query);
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
            String select="SELECT `cu_id`,`cu_name`,`shop_name`,`number`,`address` FROM `sergical_shop`.`customer`";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
              dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5)});
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
            String select="SELECT `cu_id`,`cu_name`,`shop_name`,`number`,`address` FROM `sergical_shop`.`customer`\n" +
" WHERE `cu_name` LIKE '"+Find.getText()+"%'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
              dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5)});
             }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
void Find_Data_address(){
    try{
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
      con.contest();
            String select="SELECT `cu_id`,`cu_name`,`shop_name`,`number`,`address` FROM `sergical_shop`.`customer`\n" +
" WHERE `address` LIKE '"+Find1.getText()+"%'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
              dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5)});
             }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
void Find_Data_shop(){
    try{
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
      con.contest();
            String select="SELECT `cu_id`,`cu_name`,`shop_name`,`number`,`address` FROM `sergical_shop`.`customer`\n" +
" WHERE `shop_name` LIKE '"+Find2.getText()+"%'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
              dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5)});
             }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    private void Shop_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shop_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_nameActionPerformed

    private void Cu_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cu_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cu_NameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
      if(Authintication()==1){
          try {
              String s="SELECT  `cu_id` FROM `sergical_shop`.`customer` WHERE `cu_id`='"+Cu_Id.getText()+"'";
              con.st = con.ct.prepareCall(s);
              con.rs = con.st.executeQuery(s);
              if(con.rs.next()){
                  JOptionPane.showMessageDialog(this, "Plrase change Id No");
              }else{
              
              String cid=Cu_Id.getText();
              String cname=Cu_Name.getText();
              String cmobile=Mobile.getText();
              String company=Shop_name.getText();
              String address=Shop_Address.getText();
              String query=" INSERT INTO `sergical_shop`.`customer` (`cu_id`, `cu_name`, `shop_name`, `number`, `address`)VALUES ('"+cid+"','"+cname+"','"+company+"','"+cmobile+"','"+address+"')";
              Data_Operation(query, "Add");
              }} catch (SQLException ex) {
              Logger.getLogger(Customer_Table.class.getName()).log(Level.SEVERE, null, ex);
          }
       
      }
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
         if(Authintication()==1){  
             String n="";
              DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
               n=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
       String cid=Cu_Id.getText();
        String cname=Cu_Name.getText();
        String cmobile=Mobile.getText();
        String company=Shop_name.getText();
        String address=Shop_Address.getText();   
        
        String query="UPDATE `sergical_shop`.`customer` SET`cu_name` = '"+cname+"', `shop_name` = '"+company+"', `number` = '"+cmobile+"', `address` = '"+address+"' WHERE `cu_id` = '"+cid+"'";
        Data_Operation(query, "Update"); 
        
 }       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       show_allData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
           
         DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
     Cu_Id.setText(dt.getValueAt(jTable1.getSelectedRow(), 0).toString());
         Cu_Name.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
          Mobile.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
          Shop_name.setText(dt.getValueAt(jTable1.getSelectedRow(), 2).toString()); 
         Shop_Address.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
        Cu_Id.setEditable(false);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Dataclar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         if(Authintication()==1){  
             String n="";
              DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
               n=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
       String cid=Cu_Id.getText();
        String cname=Cu_Name.getText();
        String cmobile=Mobile.getText();
        String company=Shop_name.getText();
        String address=Shop_Address.getText();   
        
        String query="DELETE FROM `sergical_shop`.`customer` WHERE `cu_id` = '"+cid+"'";
        Data_Operation(query, "Delete"); 
        
 }       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Find1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Find1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Find1MouseReleased

    private void Find1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Find1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Find1KeyPressed

    private void Find1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Find1KeyReleased
        Find_Data_address();
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
    Find_Data_shop();
    }//GEN-LAST:event_Find2KeyReleased

    private void Find2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Find2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Find2KeyTyped

    private void Find2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Find2MouseClicked
        
    }//GEN-LAST:event_Find2MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Customer_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Customer_Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cu_Id;
    private javax.swing.JTextField Cu_Name;
    private javax.swing.JTextField Find;
    private javax.swing.JTextField Find1;
    private javax.swing.JTextField Find2;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField Shop_Address;
    private javax.swing.JTextField Shop_name;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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

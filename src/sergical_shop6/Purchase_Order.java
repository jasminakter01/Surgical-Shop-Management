 
package sergical_shop6;
  
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Purchase_Order extends javax.swing.JFrame {
  Connection_Class con;
  double count=0,tcount=0,bb=0;
    public Purchase_Order() {
        initComponents();
       /*  Toolkit tk=Toolkit.getDefaultToolkit();
        double h=(int) tk.getScreenSize().getHeight();
            double w=(int) tk.getScreenSize().getWidth(); 
            this.setSize(w, h);
            getContentPane().setBackground(Color.white);
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
          //show_allData();
        
          AutoCompleteDecorator.decorate(jComboBox1);
           AutoCompleteDecorator.decorate(jComboBox2);
            AutoCompleteDecorator.decorate(jComboBox3);
          show_suplierName();
          show_catagory();
        //  jTextField6.setVisible(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField2 = new javax.swing.JTextField();
        price_text = new javax.swing.JTextField();
        quan_text = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        Order_Button = new javax.swing.JButton();
        EDIT_Button = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        oid = new javax.swing.JLabel();
        suname = new javax.swing.JLabel();
        oodate = new javax.swing.JLabel();
        dddate = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        desktopPane1 = new javax.swing.JDesktopPane();
        jLabel15 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Oder Id                            :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 200, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Order Date                     :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 240, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Price                 :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 430, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Company                       :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 160, 140, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBox1KeyTyped(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(180, 160, 290, 30);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 200, 290, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(180, 240, 290, 30);

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(180, 390, 290, 30);

        price_text.setText("0");
        price_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                price_textMouseClicked(evt);
            }
        });
        price_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                price_textKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                price_textKeyTyped(evt);
            }
        });
        jPanel1.add(price_text);
        price_text.setBounds(180, 430, 290, 30);

        quan_text.setText("0");
        quan_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quan_textMouseClicked(evt);
            }
        });
        quan_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quan_textKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quan_textKeyTyped(evt);
            }
        });
        jPanel1.add(quan_text);
        quan_text.setBounds(180, 470, 290, 30);

        jTextField5.setEditable(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(180, 510, 290, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Delivery Date                :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 280, 140, 30);

        jDateChooser2.setAutoscrolls(true);
        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser2);
        jDateChooser2.setBounds(180, 280, 290, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Product Quantity          :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 470, 140, 30);

        Order_Button.setText("Order");
        Order_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Order_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Order_Button);
        Order_Button.setBounds(120, 560, 140, 40);

        EDIT_Button.setText("Edit");
        EDIT_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDIT_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(EDIT_Button);
        EDIT_Button.setBounds(120, 610, 140, 40);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(280, 560, 150, 40);

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(280, 610, 150, 40);

        jButton6.setText("Go To Purchase");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(280, 660, 150, 40);

        jPanel2.setBackground(new java.awt.Color(61, 42, 127));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL No", "Catagory", "Product", "Price", "Quantity", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 220, 760, 340);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Oder Id                            :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 130, 140, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Company                         :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(40, 90, 140, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Order Date                     :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(460, 100, 140, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("*Search by Order Id");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(490, 160, 150, 30);

        oid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        oid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(oid);
        oid.setBounds(180, 130, 150, 30);

        suname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        suname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(suname);
        suname.setBounds(180, 90, 140, 30);

        oodate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        oodate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(oodate);
        oodate.setBounds(600, 100, 140, 30);

        dddate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dddate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(dddate);
        dddate.setBounds(600, 130, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(410, 560, 390, 30);

        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField6MouseReleased(evt);
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
        jPanel2.add(jTextField6);
        jTextField6.setBounds(490, 190, 310, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Delivery Date                :");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(460, 130, 140, 30);
        jPanel2.add(desktopPane1);
        desktopPane1.setBounds(0, 0, 1370, 720);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(510, 70, 830, 630);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total                                 :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 510, 140, 30);

        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(120, 660, 140, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Purchase Order Data ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 0, 310, 50);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Catagory           : ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(40, 320, 140, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(180, 320, 290, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Product Name         : ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(40, 350, 140, 70);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(180, 360, 290, 30);

        jButton8.setText("Order Report");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(1240, 10, 150, 40);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19);
        jLabel19.setBounds(20, 0, 100, 110);
        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1400, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-20, 0, 1400, 730);

        setSize(new java.awt.Dimension(1379, 724));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
Purchase_page p=new Purchase_page();
p.setVisible(true);
dispose();
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Order_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Order_ButtonActionPerformed
                
      if(Authintication()==1){
          SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
String odate = sd.format(jDateChooser1.getDate());
String ddate = sd.format(jDateChooser2.getDate());
String supier=jComboBox1.getSelectedItem().toString();
String cata=jComboBox2.getSelectedItem().toString();
        String id=jTextField1.getText();
        String name=jTextField2.getText();
        String price=price_text.getText();
        String quantity=quan_text.getText();
        String total =jTextField5.getText();
        
        String query="INSERT INTO `sergical_shop`.`purchase_order`(`pur_order_id`,`company_name`,`catagory`, `pur_product_name`,`pur_product_price`, `pur_product_quantity`, `total`, `pur_order_date`, `pur_delevery_date`)VALUES ('"+id+"','"+supier+"','"+cata+"', '"+name+"', '"+price+"',  '"+quantity+"', '"+total+"', '"+odate+"', '"+ddate+"')";
        Data_Operation(query, "Add");
       
      }
    }//GEN-LAST:event_Order_ButtonActionPerformed
 void show_catagory(){
    try{
        jComboBox2.removeAllItems();
        jComboBox2.addItem(" ");
            con.contest();
            String select="SELECT `category` FROM `sergical_shop`.`category_table` ORDER BY `category` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           jComboBox2.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
   
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      Dataclar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void quan_textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quan_textKeyReleased
       if(price_text.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "Please Entry Price");
       price_text.requestFocus();
       }else{
           double p=0,q=0;
          p=Double.parseDouble(price_text.getText());
          try{
         q=Double.parseDouble(quan_text.getText());
          }catch(Exception e){
              q=0;
           double t=p*q;
         t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);
          }
        double t=p*q;
         t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);}
    }//GEN-LAST:event_quan_textKeyReleased

    private void price_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price_textKeyTyped
       char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_price_textKeyTyped

    private void quan_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quan_textKeyTyped
           char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_quan_textKeyTyped

    private void quan_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quan_textMouseClicked
       quan_text.setText("");
    }//GEN-LAST:event_quan_textMouseClicked

    private void price_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_price_textMouseClicked
       
        price_text.setText("");
    }//GEN-LAST:event_price_textMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
                   
         DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
jComboBox2.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
         jTextField2.setText(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
          price_text.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
          quan_text.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString()); 
         jTextField5.setText(dt.getValueAt(jTable1.getSelectedRow(), 5).toString()); 
         jComboBox1.setSelectedItem(""+suname.getText());
        jTextField1.setText(""+oid.getText());
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+oodate.getText());
          ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText(""+dddate.getText());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void EDIT_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDIT_ButtonActionPerformed
         if(Authintication()==1){  
             String n="",c="";
              DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
               n=dt.getValueAt(jTable1.getSelectedRow(), 2).toString();
                  c=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String id=oid.getText();
        String name=jTextField2.getText();
        String price=price_text.getText();
        String quantity=quan_text.getText();
        String total =jTextField5.getText();    
        
        String query="UPDATE `sergical_shop`.`purchase_order` SET `catagory`='"+jComboBox2.getSelectedItem()+"', `pur_product_name` = '"+name+"', `pur_product_price` = '"+price+"', `pur_product_quantity` = '"+quantity+"' , `total` = '"+total+"' WHERE `pur_order_id` = '"+id+"' AND `pur_product_name`='"+n+"' AND `catagory`='"+c+"'";
        Data_Operation(query, "Update"); 
        
 }
     
    }//GEN-LAST:event_EDIT_ButtonActionPerformed

    private void price_textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price_textKeyReleased
         
        double p=0,q=0;
        
           try{ p=Double.parseDouble(price_text.getText());
        
         q=Double.parseDouble(quan_text.getText());
          }catch(Exception e){
              q=0;
           double t=p*q;
         t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);
          
          }
          
        double t=p*q;
         t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);
    }//GEN-LAST:event_price_textKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseReleased

    }//GEN-LAST:event_jTextField6MouseReleased

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
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
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        Find_Dataid();
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped

    }//GEN-LAST:event_jTextField6KeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
         try{
        jComboBox3.removeAllItems();
        jComboBox3.addItem(" ");
            con.contest();
            String select="SELECT `product_name` FROM `sergical_shop`.`purchase` WHERE `Catagory`='"+jComboBox2.getSelectedItem()+"' GROUP BY `product_name` ORDER BY `product_name` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           jComboBox3.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        try{
         
            con.contest();
            String select="SELECT `pu_price` FROM `sergical_shop`.`purchase` WHERE `Catagory`='"+jComboBox2.getSelectedItem()+"' AND `product_name`='"+jComboBox3.getSelectedItem()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
       jTextField2.setText(""+jComboBox3.getSelectedItem());
       price_text.setText(""+con.rs.getString(1));
           double p=0,q=0;
          p=Double.parseDouble(price_text.getText());
         q=Double.parseDouble(quan_text.getText());
        
        double t=p*q;
         t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
      
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
       
        if(jTextField2.getText().isEmpty()){
        price_text.setText("");
        
        
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                if(Authintication()==1){  
                    try {
                        String n="",c="";
                        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
                        n=dt.getValueAt(jTable1.getSelectedRow(), 2).toString();
                        c=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
                        String id=oid.getText();
                        String name=jTextField2.getText();
                        String sun=suname.getText();
                        String price=price_text.getText();
                        String quantity=quan_text.getText();
                        String total =jTextField5.getText();
                        String query=" DELETE FROM `sergical_shop`.`purchase_order` WHERE `pur_order_id` = '"+id+"' AND `company_name` = '"+sun+"' AND `catagory` = '"+c+"' AND `pur_product_name` = '"+n+"' AND `pur_order_date` = '"+oodate.getText()+"' AND `pur_delevery_date` = '"+dddate.getText()+"' AND `status` = 'order'";
                        double   result=con.st.executeUpdate(query);
                        if(result>0){
                            JOptionPane.showMessageDialog(this, "Data  Delete  Success");
                            Find_Data();
                            Datacl();
                            
                        }else{
                            JOptionPane.showMessageDialog(this, "Data Delete Failed");
                            
                        }       } catch (SQLException ex) {
                        Logger.getLogger(Purchase_Order.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
 }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      Purchase_Order_report p=new Purchase_Order_report();
      p.setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyReleased
 
    }//GEN-LAST:event_jComboBox1KeyReleased

    private void jComboBox1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1KeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        suname.setText(""+jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
     oid.setText(jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
   
        oodate.setText(""+((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
        
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange
         dddate.setText(""+((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());
        
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked
void show_suplierName(){
    try{
        jComboBox1.removeAllItems();
        jComboBox1.addItem(" ");
            con.contest();
            String select=" SELECT `su_company_name` FROM `sergical_shop`.`suplier_table` ORDER BY `su_company_name` ASC  ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           jComboBox1.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    
int Authintication(){
    int e=0;
    

if(jComboBox1.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Supplier Name is empty");
    jComboBox1.requestFocus();
}
else if(jTextField1.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Order Id is empty");
    jTextField1.requestFocus();
} else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Order Date Is Empty");
            jDateChooser1.requestFocus();
        } else if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Delivery Date Is Empty");
            jDateChooser2.requestFocus();
        }else if(jTextField2.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Product Name is empty");
    jTextField2.requestFocus();
}else if(price_text.getText().isEmpty()){
 JOptionPane.showMessageDialog(this, "Product Price is empty");
    price_text.requestFocus();
}else if(quan_text.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Product Quantity is empty");
    quan_text.requestFocus();
}else if(jTextField5.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Total is empty");
    jTextField5.requestFocus();
}else{ 
e=1;



}

return e;
} 



void Datacl(){ 
jTextField2.setText("");
price_text.setText(""+0);
quan_text.setText(""+0); 
jTextField5.setText("");    
jComboBox3.setSelectedIndex(0);
jTextField2.requestFocus();
jComboBox1.setEnabled(false);
jTextField1.setEnabled(false);
jDateChooser1.setEnabled(false);
jDateChooser2.setEnabled(false);
} 

void Dataclar(){
jTextField1.setText("");
jTextField2.setText("");
price_text.setText("");
quan_text.setText(""); 
jTextField5.setText(""); 
jComboBox1.setSelectedIndex(0);
((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText(""); 
jComboBox1.requestFocus();
suname.setText("");
oid.setText("");
dddate.setText("");
oodate.setText("");jComboBox1.setEnabled(true);
jTextField1.setEnabled(true);
jDateChooser1.setEnabled(true);
jDateChooser2.setEnabled(true);
 DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
 //remove 0 for empty then error
  dt.setRowCount(0); 
jLabel8.setText(""); 
jComboBox2.setSelectedIndex(0);
jTextField6.setText("");

} 


void show_allData(){
 
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
              
            double t=Double.parseDouble(jTextField5.getText());
                suname.setText(jComboBox1.getSelectedItem().toString());
                oid.setText(jTextField1.getText());
                oodate.setText(((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
                dddate.setText(((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());
                count=count+1;
                tcount=tcount+t;
              dt.addRow(new Object[]{count,jTextField2.getText(),price_text.getText(),quan_text.getText(),jTextField5.getText()});
            tcount=Math.round(tcount*100.0)/100.0;   
       jLabel8.setText(""+tcount);
}

void Find_Data(){
    try{
        tcount=0;
        count=0;
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
      con.contest();
                    double t=Double.parseDouble(jTextField5.getText());
                   suname.setText(jComboBox1.getSelectedItem().toString());
                oid.setText(jTextField1.getText());
                oodate.setText(((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
                dddate.setText(((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());    
            String select="SELECT  `catagory`,`pur_product_name`, `pur_product_price`, `pur_product_quantity`, `total`  FROM `sergical_shop`.`purchase_order` WHERE `pur_order_id`='"+oid.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){  count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(1),con.rs.getString(2),Double.parseDouble(con.rs.getString(3)),Double.parseDouble(con.rs.getString(4)),Double.parseDouble(con.rs.getString(5))});
               
                bb=Double.parseDouble(con.rs.getString(5));
                tcount=tcount+bb;
                             
                                 
           }
             tcount=Math.round(tcount*100.0)/100.0;
             jLabel8.setText("Total :"+tcount);
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
void Find_Dataid(){
    try{
        tcount=0;
        count=0;
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
      oid.setText("" );  
     suname.setText("");
      oodate.setText(""); 
      dddate.setText("");
             jLabel8.setText("");     
      con.contest();
                  //  double t=Double.parseDouble(jTextField5.getText());
                   
            String select="SELECT `pur_order_id`,`company_name`, `pur_product_name`,`pur_product_price`,`pur_product_quantity`,`total`,`pur_order_date`,`pur_delevery_date`, `catagory` FROM `sergical_shop`.`purchase_order` WHERE `pur_order_id`='"+jTextField6.getText()+"' AND `status`='order'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){  
                
               
                oid.setText(""+con.rs.getString(1));  
                suname.setText(""+con.rs.getString(2));
                
               
                  count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(9),con.rs.getString(3),Double.parseDouble(con.rs.getString(4)),Double.parseDouble(con.rs.getString(5)),Double.parseDouble(con.rs.getString(6))});
                          oodate.setText(""+con.rs.getDate(7)); 
                            dddate.setText(""+con.rs.getDate(8));
                           bb=Double.parseDouble(con.rs.getString(6));
                          tcount=tcount+bb;
                                 
           } tcount=Math.round(tcount*100.0)/100.0;
             jLabel8.setText("Total :"+tcount);
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
void Find_product(){
    try{
        
     con.contest();  String select="SELECT  `company_name` FROM `sergical_shop`.`purchase_order` WHERE `pur_order_id`='"+jTextField1.getText()+"' AND `pur_product_name`='"+jTextField2.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            if(con.rs.next()){  
               JOptionPane.showMessageDialog(this, con.rs.getString(1)+"This product has already been ordered.");
               
             
                                 
           }else{
            
            
            
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
int billcheck(){
    int e=0;
       try {
           String sdd=" SELECT   `status` FROM `sergical_shop`.`purchase_order` WHERE `pur_order_id`='"+jTextField1.getText()+"'";
           
           con.st = con.ct.prepareCall(sdd);
           con.rs = con.st.executeQuery(sdd);
           
           if(con.rs.next()){
              if(con.rs.getString(1).equals("delivery")){
               JOptionPane.showMessageDialog(this, "This order id  has already Complete Delivery.");
           }else{
               e=1;}
           }else{
           
           e=1;
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
return e;
}
void Data_Operation(String query,String msg){
    try {  
         con.contest(); 
         if(billcheck()==1){
         String select="SELECT  `company_name` FROM `sergical_shop`.`purchase_order` WHERE `pur_order_id`='"+jTextField1.getText()+"' AND  `catagory`='"+jComboBox2.getSelectedItem()+"' AND `pur_product_name`='"+jTextField2.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            if(con.rs.next()){  
              // JOptionPane.showMessageDialog(this, con.rs.getString(1)+"This product has already been ordered.");
                String n="",c="";
              DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
               n=dt.getValueAt(jTable1.getSelectedRow(), 2).toString();
                  c=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String id=oid.getText();
        String name=jTextField2.getText();
        String price=price_text.getText();
        String quantity=quan_text.getText();
        String total =jTextField5.getText();    
        
        String query1="UPDATE `sergical_shop`.`purchase_order` SET  `pur_product_price` = '"+price+"', `pur_product_quantity` = '"+quantity+"' , `total` = '"+total+"' WHERE `pur_order_id` = '"+id+"' AND `pur_product_name`='"+n+"' AND `catagory`='"+c+"'";
        double   result=con.st.executeUpdate(query1);
            if(result>0){
            JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
               Find_Data();
               Datacl();
               
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }                       
           }else{
            
            
            double   result=con.st.executeUpdate(query);
            if(result>0){
            JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
               Find_Data();
               Datacl();
               
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            }
            
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
            java.util.logging.Logger.getLogger(Purchase_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Purchase_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EDIT_Button;
    private javax.swing.JButton Order_Button;
    private javax.swing.JLabel dddate;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JDesktopPane desktopPane1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel oid;
    private javax.swing.JLabel oodate;
    private javax.swing.JTextField price_text;
    private javax.swing.JTextField quan_text;
    private javax.swing.JLabel suname;
    // End of variables declaration//GEN-END:variables
}

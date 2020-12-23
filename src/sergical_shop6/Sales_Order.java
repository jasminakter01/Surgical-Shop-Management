 
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
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Sales_Order extends javax.swing.JFrame {
  Connection_Class con;
 int  count=0;
 double tcount=0,bb=0,b1=0,c1=0;
public Sales_Order() {
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
          //show_allData();
          AutoCompleteDecorator.decorate(jComboBox1);
           AutoCompleteDecorator.decorate(jComboBox3);
            AutoCompleteDecorator.decorate(jComboBox2);
          show_suplierName();
          show_Catagory();
        //  show_Product();
    }
 void show_suplierName(){
    try{
        jComboBox1.removeAllItems();
        jComboBox1.addItem(" ");
            con.contest();
            String select="SELECT `shop_name`,`cu_name` FROM `sergical_shop`.`customer` ORDER BY  `shop_name` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){ 
           jComboBox1.addItem(""+con.rs.getString(1)+" || "+con.rs.getString(2));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
  void show_Catagory(){
    try{
        jComboBox3.removeAllItems();
        jComboBox3.addItem(" ");
            con.contest();
            String select="SELECT `category` FROM  `category_table` ORDER BY `category` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           jComboBox3.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
   void show_Product(){
       
    try{
        jComboBox2.removeAllItems();
        jComboBox2.addItem(" ");
            con.contest();
            String select="SELECT `product_name` FROM  `purchase` WHERE `Catagory`='"+jComboBox3.getSelectedItem()+"' GROUP BY `product_name` ASC  ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           jComboBox2.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
 
   void show_Product_price(){
    try{
         
            con.contest();
            String select="SELECT `pu_price` FROM  `purchase` WHERE `gr_number`='"+product1.getSelectedItem()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           purchase_price_txt.setText(""+con.rs.getString(1)); 
            /* double p=0,q=0;
        p=Double.parseDouble(jTextField3.getText());
        q=Double.parseDouble(jTextField4.getText());

       double t=p*q;
        t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);*/
            }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
 
 int Authintication(){
   int e=0;
    

if(jComboBox1.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Custommer Name is empty");
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
        }
        else if(product1.getSelectedIndex()==0){
 JOptionPane.showMessageDialog(this, "GR Number is empty");
    product1.requestFocus();
}
     else if(jTextField3.getText().isEmpty()){
 JOptionPane.showMessageDialog(this, "Product Price is empty");
    jTextField3.requestFocus();
}else if(jTextField4.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Product Quantity is empty");
    jTextField4.requestFocus();
}else if(jTextField5.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Total is empty");
    jTextField5.requestFocus();
}else{ 
e=1;



}

return e;
} 


void Data_Operation(String query,String msg){
    try {  
         con.contest();
           double   result=con.st.executeUpdate(query);
            if(result>0){
            JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
               Find_Data();
               Datacl();
               
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


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
            String select="SELECT  `Catagory`,`product_name`, `product_price`,`product_quantity`, `total`, `gr_number`  FROM `sergical_shop`.`sales_order` WHERE `order_id`='"+oid.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){  count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(6),con.rs.getString(1),con.rs.getString(2),Double.parseDouble(con.rs.getString(3)),Double.parseDouble(con.rs.getString(4)),Double.parseDouble(con.rs.getString(5))});
                        bb=Double.parseDouble(con.rs.getString(5));
                
                tcount=tcount+bb;
                                 
           } tcount=Math.round(tcount*100.0)/100.0;
             jLabel15.setText("Total :"+tcount);
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
void Datacl(){ 
//jTextField2.setText("");
jTextField3.setText(""+0);
jTextField4.setText(""+0); 
jTextField5.setText("");
jComboBox3.setSelectedIndex(0);
stock_quantity_txt.setText("0"); 
purchase_price_txt.setText("");
jComboBox1.setEnabled(false);
jTextField1.setEnabled(false);
jDateChooser1.setEnabled(false);
jDateChooser2.setEnabled(false);
//jTextField2.requestFocus();
} 

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Edit_Update = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        desktopPane1 = new javax.swing.JDesktopPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        product1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        purchase_price_txt = new javax.swing.JTextField();
        stock_quantity_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        gr_txt = new javax.swing.JTextField();
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
        jLabel1.setBounds(40, 120, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Name               : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 280, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Order Date                     :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 160, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sales Price          :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 440, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total                                  :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 520, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Shop/Hospital Name     :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 80, 140, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Delivery Date                :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 200, 140, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Product Quantity   :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 480, 140, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sales/Customer Order ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 0, 330, 40);

        jPanel2.setBackground(new java.awt.Color(61, 42, 127));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL No", "GR Number", "Catacory", "Product", "Price", "Quantity", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(19);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(25);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 760, 340);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Oder Id                            :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 50, 140, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Supplier Name               :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 10, 140, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Order Date                     :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(480, 10, 140, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Delivery Date                :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(480, 50, 140, 30);

        oid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        oid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(oid);
        oid.setBounds(160, 50, 260, 30);

        suname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        suname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(suname);
        suname.setBounds(160, 10, 260, 30);

        oodate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        oodate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(oodate);
        oodate.setBounds(620, 20, 140, 30);

        dddate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dddate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(dddate);
        dddate.setBounds(620, 50, 140, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel15);
        jLabel15.setBounds(580, 480, 200, 30);

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(300, 600, 150, 40);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(140, 600, 140, 40);

        Edit_Update.setText("Edit");
        Edit_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Edit_Update);
        Edit_Update.setBounds(140, 550, 140, 40);

        jButton6.setText("Go to Sales Page");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(300, 550, 150, 40);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(300, 500, 150, 40);

        jButton2.setText("Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(140, 500, 140, 40);
        jPanel2.add(desktopPane1);
        desktopPane1.setBounds(0, 0, 1370, 720);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(500, 50, 810, 670);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(180, 80, 290, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 120, 290, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(180, 160, 290, 30);

        jTextField3.setText("0");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(180, 440, 290, 30);

        jTextField4.setText("0");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(180, 480, 290, 30);

        jTextField5.setEditable(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(180, 520, 290, 30);

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser2);
        jDateChooser2.setBounds(180, 200, 290, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(180, 280, 290, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Catagory                         :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(40, 240, 140, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(180, 240, 290, 30);

        jButton8.setText("Order Report");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(1200, 10, 150, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GR Number                    :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 320, 140, 30);

        product1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select GR Number" }));
        product1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product1ActionPerformed(evt);
            }
        });
        jPanel1.add(product1);
        product1.setBounds(180, 320, 290, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Purchase  Price          :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(40, 400, 140, 30);

        purchase_price_txt.setText("0");
        purchase_price_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchase_price_txtMouseClicked(evt);
            }
        });
        purchase_price_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                purchase_price_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                purchase_price_txtKeyTyped(evt);
            }
        });
        jPanel1.add(purchase_price_txt);
        purchase_price_txt.setBounds(180, 400, 290, 30);

        stock_quantity_txt.setText("0");
        stock_quantity_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stock_quantity_txtMouseClicked(evt);
            }
        });
        stock_quantity_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stock_quantity_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stock_quantity_txtKeyTyped(evt);
            }
        });
        jPanel1.add(stock_quantity_txt);
        stock_quantity_txt.setBounds(180, 360, 290, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Stock Quantity            :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(40, 360, 140, 30);
        jPanel1.add(gr_txt);
        gr_txt.setBounds(180, 320, 290, 30);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19);
        jLabel19.setBounds(0, 0, 90, 110);
        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1380, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1380, 730);

        setSize(new java.awt.Dimension(1375, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked

        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
       double p=0,q=0;
       try{
        p=Double.parseDouble(jTextField3.getText());
        q=Double.parseDouble(jTextField4.getText()); 
       double t=p*q;
        t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);
       }catch(Exception e){
           
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
     char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        if(jTextField3.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Entry Price");
            jTextField3.requestFocus();
        }else{
           double p=0,q=0,sq;
           
            p=Double.parseDouble(jTextField3.getText());
          try{
              sq=Double.parseDouble(stock_quantity_txt.getText()); 
            q=Double.parseDouble(jTextField4.getText());
           if(q>sq){
               jTextField4.setText("");
               JOptionPane.showMessageDialog(this,"Stock Quantity < Quantity ");
           }
            double t=p*q; 
            t=Math.round(t*100.0)/100.0;
            jTextField5.setText(""+t);
          
          }catch(Exception e){
          q=0;
          double t=p*q; 
            t=Math.round(t*100.0)/100.0;
            jTextField5.setText(""+t);
          }
          }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
           char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped
int billcheck(){
   int e=0;
       try {
           String sdd="SELECT `status` FROM `sergical_shop`.`sales_order` WHERE `order_id`='"+jTextField1.getText()+"' AND `status`='delivery' ";
           
           con.st = con.ct.prepareCall(sdd);
           con.rs = con.st.executeQuery(sdd);
           
           if(con.rs.next()){
               JOptionPane.showMessageDialog(this, "This order id has already been Delevery.");
           }else{
           
           e=1;
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
return e;
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     if(Authintication()==1){
          SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
String odate = sd.format(jDateChooser1.getDate());
String ddate = sd.format(jDateChooser2.getDate());
String shop=jComboBox1.getSelectedItem().toString();
        String id=jTextField1.getText();
      String pname=jComboBox2.getSelectedItem().toString();
        String price=jTextField3.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText(); 
        String caata=jComboBox3.getSelectedItem().toString();
        
        if(billcheck()==1){
            
          String query=" INSERT INTO `sergical_shop`.`sales_order`(`order_id`, `customer_name`,`Catagory`,`product_name`,`product_price`,`product_quantity`,`total`,`order_date`,`delivery_date`,`status`, `gr_number`,`pur_price`)\n" +
"VALUES ('"+id+"', '"+shop+"',  '"+caata+"', '"+pname+"','"+price+"', '"+quantity+"', '"+total+"', '"+odate+"', '"+ddate+"', 'order','"+product1.getSelectedItem()+"','"+purchase_price_txt.getText()+"');";
        Data_Operation(query, "Add"); 
      } 
        
        
        }
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
  show_Product();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
      try {
          product1.removeAllItems();
          // show_Product_price();
          product1.removeAllItems();
          product1.addItem("Select Gr.");
          double a1=0,a2=0;
          con.contest();
          String select="SELECT `gr_wise_stock`.`gr_number` FROM `gr_wise_stock` WHERE `gr_wise_stock`.`Catagory`='"+jComboBox3.getSelectedItem()+"' AND `gr_wise_stock`.`product_name`='"+jComboBox2.getSelectedItem()+"'";
          con.st = con.ct.prepareCall(select);
          con.rs = con.st.executeQuery(select);
          while(con.rs.next()){
               String aaa=con.rs.getString(1);
        // JOptionPane.showMessageDialog(this, "con.rs.getString(1) "+aaa);
            ceck_stock(aaa);
          }
      } catch (SQLException ex) {
          Logger.getLogger(Sales_Order.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_jComboBox2ActionPerformed
void ceck_stock(String gr){
     try {
  
         double a1=0,a2=0;
         con.contest();
         String select="SELECT `gr_wise_stock`.`pu_quantity`,`gr_wise_stock`.`s_quantity` FROM `gr_wise_stock` WHERE  `gr_wise_stock`.`gr_number`='"+gr+"'";
         con.st = con.ct.prepareCall(select);
         con.rss = con.st.executeQuery(select);
           if(con.rss.next()){
                
                   try{
                   
                    a1=Double.parseDouble(con.rss.getString(1));
                  a2=Double.parseDouble(con.rss.getString(2));
               double a=a1-a2;
               a=Math.round(a*100.0)/100.0;
                  if(a>0)
                    { //JOptionPane.showMessageDialog(this, "q==="+a);
                    product1.addItem(gr);
                    }
                   }catch(Exception e){
                       a2=0;
                   double a=a1-a2;
                    a=Math.round(a*100.0)/100.0;
                   
                    if(a>0)
                    { //JOptionPane.showMessageDialog(this, "q=="+a);
                    product1.addItem(gr);
                    }
                 
                   }
                
               //}
                
              
            } 
     } catch (SQLException ex) {
         Logger.getLogger(Sales_Page.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
    private void Edit_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_UpdateActionPerformed
              if(Authintication()==1){  
             String n="",c="",g="";
              DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
                g=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
               //n=dt.getValueAt(jTable1.getSelectedRow(), 2).toString();
               //   c=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String id=oid.getText();
        String name=jComboBox2.getSelectedItem().toString();
        String price=jTextField3.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText();    
        String cata=jComboBox3.getSelectedItem().toString();
        String query="UPDATE `sergical_shop`.`sales_order` SET `Catagory` = '"+cata+"',`product_name` = '"+name+"', `gr_number`='"+product1.getSelectedItem()+"',`product_price` = '"+price+"',`product_quantity` = '"+quantity+"',`total` = '"+total+"',`pur_price`='"+purchase_price_txt.getText()+"' WHERE `order_id` = '"+id+"'   AND   `gr_number`='"+g+"'   AND `status` = 'order';";
        Data_Operation(query, " Edit "); 
        
 }
    }//GEN-LAST:event_Edit_UpdateActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        Sales_Page sp=new Sales_Page();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
      
        jComboBox3.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jComboBox2.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 3).toString()); 
        product1.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField3.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
        jTextField4.setText(dt.getValueAt(jTable1.getSelectedRow(), 5).toString());
        jTextField5.setText(dt.getValueAt(jTable1.getSelectedRow(),6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jTextField1.setText("");
 
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText(""); 

jTextField5.setText(""); 
jComboBox1.setSelectedIndex(0);
jComboBox2.setSelectedIndex(0);
jComboBox3.setSelectedIndex(0);
////



jTextField1.setText(""); 
       jTextField3.setText(""+0);
jTextField4.setText(""+0); 
jTextField5.setText(""); 
jComboBox1.setSelectedIndex(0);
((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText(""); 
jComboBox1.requestFocus();
suname.setText("");
oid.setText("");
dddate.setText("");
oodate.setText("");
 DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
 //remove 0 for empty then error
  dt.setRowCount(0); 
jLabel15.setText(""); 
jComboBox2.setSelectedIndex(0); 
jComboBox1.setEnabled(true);
jTextField1.setEnabled(true);
jDateChooser1.setEnabled(true);
jDateChooser2.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            if(Authintication()==1){  
             String n="",c="";
              DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
               n=dt.getValueAt(jTable1.getSelectedRow(), 3).toString();
                  c=dt.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String id=oid.getText();
        String name=jComboBox2.getSelectedItem().toString();
        String price=jTextField3.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText();    
        String cata=jComboBox3.getSelectedItem().toString();
    String query="DELETE FROM `sergical_shop`.`sales_order` WHERE `order_id` = '"+id+"'  AND  `gr_number`='"+product1.getSelectedItem()+"'  AND `status` = 'order'";
    Data_Operation(query, " Delete "); 
        
 }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Sales__Order_report p=new Sales__Order_report();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      suname.setText(""+jComboBox1.getSelectedItem());
    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
     
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
       
     oodate.setText(""+((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange
      
         dddate.setText(""+((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
           oid.setText(""+jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void product1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product1ActionPerformed
       if(product1.getSelectedIndex()>0){
    gr_txt.setText(""+product1.getSelectedItem());
    } else if(product1.getSelectedIndex()==0){
      gr_txt.setText("");
    }
       show_Product_price();
          show_Product_quantity();   
    
    }//GEN-LAST:event_product1ActionPerformed
void show_Product_quantity(){
         try {
         double a1=0,a2=0;
         con.contest();
         String select="SELECT `gr_wise_stock`.`pu_quantity`,`gr_wise_stock`.`s_quantity` FROM `gr_wise_stock` WHERE  `gr_wise_stock`.`gr_number`='"+gr_txt.getText()+"'";
         con.st = con.ct.prepareCall(select);
         con.rss = con.st.executeQuery(select);
           if(con.rss.next()){
                
                   try{
                    a1=Double.parseDouble(con.rss.getString(1));
                  a2=Double.parseDouble(con.rss.getString(2));
               double a=a1-a2;
               a=Math.round(a*100.0)/100.0;
                  if(a>0)
                    { //JOptionPane.showMessageDialog(this, "q==="+a);
                   stock_quantity_txt.setText(""+a);
                    }
                   }catch(Exception e){
                       a2=0;
                   double a=a1-a2;
                    a=Math.round(a*100.0)/100.0;
                   
                    if(a>0)
                    { //JOptionPane.showMessageDialog(this, "q=="+a);
                stock_quantity_txt.setText(""+a);
                    }
                 
                   }
                
               //}
                
              
            } 
     } catch (SQLException ex) {
         Logger.getLogger(Sales_Page.class.getName()).log(Level.SEVERE, null, ex);
     }

}
    private void purchase_price_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchase_price_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_purchase_price_txtMouseClicked

    private void purchase_price_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchase_price_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_purchase_price_txtKeyReleased

    private void purchase_price_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchase_price_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_purchase_price_txtKeyTyped

    private void stock_quantity_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stock_quantity_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_quantity_txtMouseClicked

    private void stock_quantity_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stock_quantity_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_quantity_txtKeyReleased

    private void stock_quantity_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stock_quantity_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_quantity_txtKeyTyped

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    
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
            java.util.logging.Logger.getLogger(Sales_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit_Update;
    private javax.swing.JLabel dddate;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JDesktopPane desktopPane1;
    private javax.swing.JTextField gr_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel oid;
    private javax.swing.JLabel oodate;
    private javax.swing.JComboBox<String> product1;
    private javax.swing.JTextField purchase_price_txt;
    private javax.swing.JTextField stock_quantity_txt;
    private javax.swing.JLabel suname;
    // End of variables declaration//GEN-END:variables
}

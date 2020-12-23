package sergical_shop6;
  
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
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
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author jasmi
 */
public class Return_product extends javax.swing.JFrame {
   Connection_Class con;
      Connection_Class con1;
  int count=0;
  double tcount=0,b1=0;
  double ss=0;
  String to="";
  String gr="";
    public Return_product() {
        initComponents();
        
       /*  Toolkit tk=Toolkit.getDefaultToolkit();
        double h=(int) tk.getScreenSize().getHeight();
            double w=(int) tk.getScreenSize().getWidth(); 
            this.setSize(w, h);
            getContentPane().setBackground(Color.white);
        final Podouble x=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
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
        AutoCompleteDecorator.decorate(catagory);
         AutoCompleteDecorator.decorate(jComboBox2);
        AutoCompleteDecorator.decorate(product);
         show_catagory();
         jLabel3.setVisible(false);
         
         
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Bill_No_txt = new javax.swing.JTextField();
        total_leve1 = new javax.swing.JLabel();
        stotal = new javax.swing.JTextField();
        total_leve2 = new javax.swing.JLabel();
        stotal1 = new javax.swing.JTextField();
        total_leve = new javax.swing.JLabel();
        dis = new javax.swing.JTextField();
        total_leve3 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        total_leve4 = new javax.swing.JLabel();
        due = new javax.swing.JTextField();
        catagory = new javax.swing.JComboBox<>();
        product = new javax.swing.JComboBox<>();
        price = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        retu = new javax.swing.JTextField();
        new_total_price = new javax.swing.JTextField();
        new_quantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Return Product ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 10, 270, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 540, 240, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(944, 4, 410, 40);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Purchase", "Sales" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(20, 130, 290, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL No.", "GR Number", "Catagory", "Product Name", "Price", "Quantity", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(340, 92, 990, 380);

        Bill_No_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bill_No_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bill_No_txtKeyReleased(evt);
            }
        });
        jPanel1.add(Bill_No_txt);
        Bill_No_txt.setBounds(20, 210, 290, 30);

        total_leve1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve1.setForeground(new java.awt.Color(255, 255, 255));
        total_leve1.setText("Sub Total      :");
        jPanel1.add(total_leve1);
        total_leve1.setBounds(980, 470, 80, 30);

        stotal.setEditable(false);
        jPanel1.add(stotal);
        stotal.setBounds(1070, 470, 260, 30);

        total_leve2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve2.setForeground(new java.awt.Color(255, 255, 255));
        total_leve2.setText("Sub Total      :");
        jPanel1.add(total_leve2);
        total_leve2.setBounds(980, 470, 80, 30);

        stotal1.setEditable(false);
        jPanel1.add(stotal1);
        stotal1.setBounds(1070, 470, 260, 30);

        total_leve.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve.setForeground(new java.awt.Color(255, 255, 255));
        total_leve.setText("Discount        :");
        jPanel1.add(total_leve);
        total_leve.setBounds(980, 500, 80, 30);

        dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                disKeyTyped(evt);
            }
        });
        jPanel1.add(dis);
        dis.setBounds(1070, 500, 260, 30);

        total_leve3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve3.setForeground(new java.awt.Color(255, 255, 255));
        total_leve3.setText("Paid                :");
        jPanel1.add(total_leve3);
        total_leve3.setBounds(980, 530, 80, 30);

        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paidKeyTyped(evt);
            }
        });
        jPanel1.add(paid);
        paid.setBounds(1070, 530, 260, 30);

        total_leve4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve4.setForeground(new java.awt.Color(255, 255, 255));
        total_leve4.setText("Due                 :");
        jPanel1.add(total_leve4);
        total_leve4.setBounds(980, 560, 80, 30);

        due.setEditable(false);
        jPanel1.add(due);
        due.setBounds(1070, 560, 260, 30);

        catagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoryActionPerformed(evt);
            }
        });
        jPanel1.add(catagory);
        catagory.setBounds(20, 270, 290, 30);

        jPanel1.add(product);
        product.setBounds(20, 330, 290, 30);

        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        jPanel1.add(price);
        price.setBounds(20, 390, 130, 30);

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });
        jPanel1.add(quantity);
        quantity.setBounds(160, 390, 150, 30);

        retu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                retuKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                retuKeyTyped(evt);
            }
        });
        jPanel1.add(retu);
        retu.setBounds(20, 450, 130, 30);

        new_total_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                new_total_priceKeyTyped(evt);
            }
        });
        jPanel1.add(new_total_price);
        new_total_price.setBounds(20, 510, 290, 30);

        new_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_quantityActionPerformed(evt);
            }
        });
        new_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                new_quantityKeyTyped(evt);
            }
        });
        jPanel1.add(new_quantity);
        new_quantity.setBounds(160, 450, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 360, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Total Price");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 480, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 300, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Return ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 420, 90, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("New Quantity");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(160, 420, 150, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 360, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Category");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 240, 90, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Return");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 560, 130, 40);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(20, 170, 290, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 100, 110);

        jLabel3.setText("jLabel3");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(200, 650, 110, 50);

        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1370, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 730);

        setSize(new java.awt.Dimension(1359, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   void find_SUpplier(){
       try {
           jComboBox2.removeAllItems();
           jComboBox2.addItem(" ");
           con.contest();
           String s="SELECT `su_name` FROM `purchase` GROUP BY `su_name` ORDER BY `su_name` ASC";
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s); 
           while(con.rs.next()){ 
               
            jComboBox2.addItem(""+con.rs.getString(1));
            
           }
       } catch (SQLException ex) {
           Logger.getLogger(Puchase_report_ACCOUNT_Bill_Wise.class.getName()).log(Level.SEVERE, null, ex);
       }

}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
 void Find_or(){
    try{
        if(jComboBox1.getSelectedIndex()==1){
            if(jComboBox2.getSelectedIndex()>=0){
                tcount=0;
                count=0;
                DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                  con.contest();  
                  
             // Bill_No_txt.setText("");
             // cuname.setText("");
              Date dtt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
            String select="SELECT `purchase_bill_no`,`gr_number`,`Catagory`,`product_name`, `pu_price`,`pu_quantity`, `payment` FROM `sergical_shop`.`purchase` WHERE `purchase_bill_no`='"+Bill_No_txt.getText()+"'  AND `su_name`='"+jComboBox2.getSelectedItem()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){  
                count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(5)),Double.parseDouble(con.rs.getString(6)),Double.parseDouble(con.rs.getString(7))});
                      b1=Double.parseDouble(con.rs.getString(7));
                tcount=tcount+b1; 
           } tcount=Math.round(tcount*100.0)/100.0;
           
           stotal.setText(""+tcount);
           
           String s="SELECT  `discount`,`paid` FROM `sergical_shop`.`purchase_account` WHERE `bill_no`='"+Bill_No_txt.getText()+"'";
            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            if(con.rs.next()){
             dis.setText(""+con.rs.getString(1));
             paid.setText(""+con.rs.getString(2));  
            }
            }
        }else if(jComboBox1.getSelectedIndex()==2){
           tcount=0;
                count=0;
                DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                  con.contest();  
                  
             // Bill_No_txt.setText("");
             // cuname.setText("");
              Date dtt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
  //((JTextField) oodate.getDateEditor().getUiComponent()).setText("");   
                
                   
            String select=" SELECT `sales_bill_no`,`gr_number`,`Catagory`,`product_name`,`s_price`,`s_quantity`, `total` FROM `sales_table`WHERE `sales_bill_no`='"+Bill_No_txt.getText()+"' ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){ 
                  count=count+1;
                   dt.addRow(new Object[]{count,con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(5)),Double.parseDouble(con.rs.getString(6)),Double.parseDouble(con.rs.getString(7))});
                   b1=Double.parseDouble(con.rs.getString(7));
                      tcount=tcount+b1; 
           } 
            tcount=Math.round(tcount*100.0)/100.0;
           stotal.setText(""+tcount);
           
           String s="SELECT  `discount`,`paid` FROM `sergical_shop`.`sales_acoount` WHERE `bill_no`='"+Bill_No_txt.getText()+"'";
            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            if(con.rs.next()){
             dis.setText(""+con.rs.getString(1));
             paid.setText(""+con.rs.getString(2));  
            }
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        } 

}
    private void Bill_No_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bill_No_txtKeyReleased
        Find_or();
    }//GEN-LAST:event_Bill_No_txtKeyReleased

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
        if(dis.getText().isEmpty()){
            dis.setText("0");
        }else{
            
            double t=0,d=0,p=0,ft=0,du=0;
            t=Double.parseDouble(stotal.getText());
            d=Double.parseDouble(dis.getText());
            p=Double.parseDouble(paid.getText());
            ft=t-d;
            du=ft-p; 
             du=Math.round(du*100.0)/100.0;
            due.setText(""+du);}
    }//GEN-LAST:event_paidKeyReleased

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void new_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_quantityActionPerformed
  void show_catagory(){
    try{
        catagory.removeAllItems();
        catagory.addItem(" ");
            con.contest();
            String select="SELECT `category`FROM `sergical_shop`.`category_table` ORDER BY `category` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           catagory.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
         retu.setText("");
        new_quantity.setText("");
        new_total_price.setText("");
       DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
catagory.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
product.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
       price.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
        quantity.setText(dt.getValueAt(jTable1.getSelectedRow(), 5).toString());
      gr=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
       // to=stotal.getText();
        //JOptionPane.showMessageDialog(this, to);
       
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void catagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoryActionPerformed
          try{
        product.removeAllItems();
        product.addItem(" ");
            con.contest();
            String select="SELECT `product_name` FROM `sergical_shop`.`purchase` WHERE `Catagory`='"+catagory.getSelectedItem()+"' GROUP BY `product_name` ORDER BY `product_name` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           product.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_catagoryActionPerformed

    private void retuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retuKeyReleased
       if(quantity.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "No data Found");
       quantity.requestFocus();
       }else{
       double pq=Double.parseDouble(quantity.getText());
       double rq=Double.parseDouble(retu.getText());
       double p=Double.parseDouble(price.getText());
       double stf=0;
      // double st=Double.parseDouble(stotal.getText());
        if(pq<rq){
        JOptionPane.showMessageDialog(this, "Sorry learg Quantity retun not Allow");
        retu.setText("");
        quantity.setText("");
        }else{
           stf=p*rq; 
           stf=tcount-stf;
            stf=Math.round(stf*100.0)/100.0;
           stotal.setText(""+stf);
        pq=pq-rq;
         pq=Math.round(pq*100.0)/100.0;
        new_quantity.setText(""+pq);
        pq=pq*p;
         pq=Math.round(pq*100.0)/100.0;
        new_total_price.setText(""+pq);
        
         double t=0,d=0,pp=0,ft=0,du=0;
            t=Double.parseDouble(stotal.getText());
            d=Double.parseDouble(dis.getText());
            pp=Double.parseDouble(paid.getText());
            ft=t-d;
            du=ft-pp; 
             du=Math.round(du*100.0)/100.0;
            due.setText(""+du);
        
        }
       
       
       }
        
    }//GEN-LAST:event_retuKeyReleased
int Authintication1(){
    int e=0;
    

 if(jComboBox1.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Select Purchase or Sales is empty");
    jComboBox1.requestFocus();
}   
else if(Bill_No_txt.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Bill No is empty");
    Bill_No_txt.requestFocus();
} else if(catagory.getSelectedIndex()<=0){
JOptionPane.showMessageDialog(this, "Catagory  is empty");
    catagory.requestFocus();
}else if(product.getSelectedIndex()<=0){
 JOptionPane.showMessageDialog(this, "Product Name is empty");
    product.requestFocus();
}else if(price.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Product Price is empty");
    price.requestFocus();
}else if(quantity.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Quantity is empty");
    quantity.requestFocus();
}else if(retu.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Return is empty");
    retu.requestFocus();
}else if(new_quantity.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "New Quantity is empty");
    new_quantity.requestFocus();
}else if(new_total_price.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "New Total Price is empty");
    new_total_price.requestFocus();
}else if(stotal.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Sub Total is empty");
    stotal.requestFocus();
}else if(dis.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Discount is empty");
    dis.requestFocus();
}else if(paid.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Paid is empty");
    paid.requestFocus();
}else if(due.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Due is empty");
    due.requestFocus();
}else{ 
e=1;



}

return e;
} 
int Authintication2(){
    int e=0;
    

 if(jComboBox1.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Select Purchase or Sales is empty");
    jComboBox1.requestFocus();
}   
else if(Bill_No_txt.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Bill No is empty");
    Bill_No_txt.requestFocus();
} else if(catagory.getSelectedIndex()<=0){
JOptionPane.showMessageDialog(this, "Catagory  is empty");
    catagory.requestFocus();
}else if(product.getSelectedIndex()<=0){
 JOptionPane.showMessageDialog(this, "Product Name is empty");
    product.requestFocus();
}else if(price.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Product Price is empty");
    price.requestFocus();
}else if(quantity.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Quantity is empty");
    quantity.requestFocus();
}
else{ 
e=1;



}

return e;
} 
void data_clear(){
catagory.setSelectedIndex(0);
product.setSelectedIndex(0);
price.setText("0");
quantity.setText("0");
retu.setText("0");
new_quantity.setText("0");
new_total_price.setText("0");
}
void data_clearALL(){
catagory.setSelectedIndex(0);
product.setSelectedIndex(0);
price.setText("0");
quantity.setText("0");
retu.setText("0");
new_quantity.setText("0");
new_total_price.setText("0");
Bill_No_txt.setText("");
stotal.setText("0");
dis.setText("0");
paid.setText("0");
due.setText("");
}

void Data_Operation(String query,String msg){
    try {  
         con.contest();
   
           
           
            int   result=con.st.executeUpdate(query); 
            if(result>0){ 
                if(jComboBox1.getSelectedIndex()==1){ 
                String update_puAccou="UPDATE `sergical_shop`.`purchase_account` SET  `sub_total` = '"+stotal.getText()+"',  `discount` = '"+dis.getText()+"',  `paid` = '"+paid.getText()+"',`due` = '"+due.getText()+"' WHERE `bill_no`='"+Bill_No_txt.getText()+"'  AND `company`='"+jComboBox2.getSelectedItem()+"' AND `sub_total`='"+tcount+"'";        
                    Data_Operation2(update_puAccou, msg); 
                } else if(jComboBox1.getSelectedIndex()==2){
                String update_puAccou="UPDATE `sergical_shop`.`sales_acoount` SET  `sub_total` = '"+stotal.getText()+"',  `discount` = '"+dis.getText()+"',  `paid` = '"+paid.getText()+"',`due` = '"+due.getText()+"' WHERE `bill_no` = '"+Bill_No_txt.getText()+"' AND `sub_total`='"+tcount+"'";        
                    Data_Operation2(update_puAccou, msg); 
                }  
            }else{
            JOptionPane.showMessageDialog(this, "Account "+msg+" Failed"); 
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
void Data_Operation2(String query,String msg){
    try {  
         con.contest();
   
         
         
            double   result=con.st.executeUpdate(query);
              String status="";
            if(result>0){ 
                 String details="";
                  String ss=Bill_No_txt.getText();
                  if(jComboBox1.getSelectedIndex()==1){
                         details="Product Purchase || "+ss+" || "+jComboBox2.getSelectedItem();
                      status="Credit";
                  }
                  else if(jComboBox1.getSelectedIndex()==2){
                     status="Debit";
                   details="Product Purchase || "+ss;
                     }
                     
                 DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        
                    String ammount=paid.getText();
                Date dt = new Date();
        DateFormat dff = new SimpleDateFormat("yyyy-MM-dd");
      double p,q;
                 p=Double.parseDouble(price.getText());
        q=Double.parseDouble(retu.getText());
        double tt=p*q;
            jLabel3.setText(""+tt);
                      ammount=jLabel3.getText();
               String in="INSERT INTO `sergical_shop`.`cash_table`(`date`,`ammount`,`status`,`detailse`)VALUES ('"+ dff.format(dt)+"', '"+ammount+"',  '"+status+"', '"+details+"')";
           cash_check_DAta(in, msg);
              // JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
                
            }else{
            JOptionPane.showMessageDialog(this, " Cash Data "+msg+" Failed");
              
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
      JOptionPane.showMessageDialog(this," Data "+msg+" Success");
            Find_or();
               data_clear();
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
           char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_priceKeyTyped

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
          char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_quantityKeyTyped

    private void retuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retuKeyTyped
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_retuKeyTyped

    private void new_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_new_quantityKeyTyped
            char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_new_quantityKeyTyped

    private void new_total_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_new_total_priceKeyTyped
            char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_new_total_priceKeyTyped

    private void disKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_disKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_disKeyTyped

    private void paidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyTyped
     char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_paidKeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       if(jComboBox1.getSelectedIndex()==1){
           find_SUpplier();
           data_clear();
           
       }  else if(jComboBox1.getSelectedIndex()==2){
       jComboBox2.removeAllItems();
       
       }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(Authintication1()==1){ 
    double quantity=Double.parseDouble(new_quantity.getText());
    double pric=Double.parseDouble(price.getText());
    double sto=Double.parseDouble(new_total_price.getText());
    String bill=Bill_No_txt.getText();
   String cata= catagory.getSelectedItem().toString();
    String pro= product.getSelectedItem().toString();
    
if(jComboBox1.getSelectedIndex()==1){
    
  
    
        String update_pu="UPDATE `sergical_shop`.`purchase` SET  `pu_quantity` = '"+quantity+"',`pu_price` = '"+pric+"',`payment` = '"+sto+"',  `status` = 'Return'   WHERE `purchase_bill_no`='"+Bill_No_txt.getText()+"'  AND `su_name`='"+jComboBox2.getSelectedItem()+"'  AND `Catagory` = '"+cata+"' AND `product_name` = '"+pro+"' ";
        Data_Operation(update_pu, "Update");
        


}else if(jComboBox1.getSelectedIndex()==2){
  
   String update_pu="UPDATE `sergical_shop`.`sales_table` SET `s_quantity` = '"+quantity+"',`s_price` = '"+pric+"',`total` = '"+sto+"',  `status` = 'Return' WHERE `sales_bill_no` = '"+bill+"'  AND `gr_number`='"+gr+"' AND `Catagory` = '"+cata+"' AND `product_name` = '"+pro+"'";
        Data_Operation(update_pu, "Update");       
        
}  
}  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
      
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked
 
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
            java.util.logging.Logger.getLogger(Return_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Return_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bill_No_txt;
    private javax.swing.JComboBox<String> catagory;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JTextField dis;
    private javax.swing.JTextField due;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField new_quantity;
    private javax.swing.JTextField new_total_price;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> product;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField retu;
    private javax.swing.JTextField stotal;
    private javax.swing.JTextField stotal1;
    private javax.swing.JLabel total_leve;
    private javax.swing.JLabel total_leve1;
    private javax.swing.JLabel total_leve2;
    private javax.swing.JLabel total_leve3;
    private javax.swing.JLabel total_leve4;
    // End of variables declaration//GEN-END:variables
}

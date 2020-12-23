package sergical_shop6; 
 
  
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
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
import jdk.nashorn.internal.ir.BreakNode;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator; 
public class Sales_Page extends javax.swing.JFrame {
 Connection_Class con;
    Connection_Class con1;
 int  count=0;
      double r=0,tcount=0,bb,b1,c1;
    public Sales_Page() {
        initComponents();
       /**    
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
        
        } 
        */ 
          con=new Connection_Class();
          AutoCompleteDecorator.decorate(shop_combo); 
          AutoCompleteDecorator.decorate(catagory);
           AutoCompleteDecorator.decorate(product);
          show_suplierName();
          show_Catagory();
          show_Product();
         b_labl.setVisible(false);
         acc_label.setVisible(false);
         bname_combo.setVisible(false);
         account_combo.setVisible(false);
         perma_l.setVisible(false);
        shop_combo.setVisible(false);
         show_ban();
        showrrname();
        check.setVisible(false);
        AutoCompleteDecorator.decorate(pur_price_combo);  
 
    }
 
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        SAles_Button = new javax.swing.JButton();
        shop_combo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sales_price_txt = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        product = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        catagory = new javax.swing.JComboBox<>();
        perma_l = new javax.swing.JLabel();
        customer_type = new javax.swing.JComboBox<>();
        cust_tst = new javax.swing.JTextField();
        cust_l = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bill_no = new javax.swing.JLabel();
        cuname = new javax.swing.JLabel();
        oodate = new javax.swing.JLabel();
        total_leve = new javax.swing.JLabel();
        total_leve1 = new javax.swing.JLabel();
        total_leve2 = new javax.swing.JLabel();
        total_leve3 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        due = new javax.swing.JTextField();
        dis = new javax.swing.JTextField();
        stotal = new javax.swing.JTextField();
        submitionbutton = new javax.swing.JButton();
        Find = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        account_combo = new javax.swing.JComboBox<>();
        acc_label = new javax.swing.JLabel();
        bname_combo = new javax.swing.JComboBox<>();
        b_labl = new javax.swing.JLabel();
        desktopPane1 = new javax.swing.JDesktopPane();
        s_quantity = new javax.swing.JTextField();
        Update_Data = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sr_name = new javax.swing.JComboBox<>();
        sr_txt = new javax.swing.JTextField();
        check = new javax.swing.JLabel();
        pur_price_combo = new javax.swing.JComboBox<>();
        product1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        gr_txt = new javax.swing.JTextField();
        desktopPane = new javax.swing.JDesktopPane();
        sp = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date                                :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 240, 140, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SR");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 530, 140, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jDateChooser1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyPressed(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(180, 240, 290, 30);

        SAles_Button.setText("Sales");
        SAles_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAles_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SAles_Button);
        SAles_Button.setBounds(60, 610, 200, 40);

        shop_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        shop_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shop_comboActionPerformed(evt);
            }
        });
        jPanel1.add(shop_combo);
        shop_combo.setBounds(180, 160, 290, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Customer Type        :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 120, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bill Number                        :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 200, 140, 30);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 200, 290, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GR Number                :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 360, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Price          :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 400, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total                                 :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 490, 140, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Product Quantity   :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 440, 140, 30);

        sales_price_txt.setText("0");
        sales_price_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sales_price_txtMouseClicked(evt);
            }
        });
        sales_price_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sales_price_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sales_price_txtKeyTyped(evt);
            }
        });
        jPanel1.add(sales_price_txt);
        sales_price_txt.setBounds(320, 400, 150, 30);

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
        jTextField4.setBounds(320, 440, 150, 30);

        jTextField5.setEditable(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(180, 490, 290, 30);

        product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        jPanel1.add(product);
        product.setBounds(180, 320, 290, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Catagory                         :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(40, 280, 140, 30);

        catagory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        catagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoryActionPerformed(evt);
            }
        });
        jPanel1.add(catagory);
        catagory.setBounds(180, 280, 290, 30);

        perma_l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        perma_l.setForeground(new java.awt.Color(255, 255, 255));
        perma_l.setText("Shop/Hospital Name       :");
        jPanel1.add(perma_l);
        perma_l.setBounds(20, 160, 140, 30);

        customer_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Permanent Customer" }));
        customer_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_typeActionPerformed(evt);
            }
        });
        jPanel1.add(customer_type);
        customer_type.setBounds(180, 120, 290, 30);

        cust_tst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cust_tstKeyReleased(evt);
            }
        });
        jPanel1.add(cust_tst);
        cust_tst.setBounds(180, 160, 290, 30);

        cust_l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cust_l.setForeground(new java.awt.Color(255, 255, 255));
        cust_l.setText("Customer Name");
        jPanel1.add(cust_l);
        cust_l.setBounds(40, 160, 140, 30);

        jPanel2.setBackground(new java.awt.Color(61, 42, 127));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL No", "GR Number", "Catagory", "Product", "Price", "Quantity", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 760, 340);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bill Number                      :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(40, 30, 140, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Shop/Hospital/Customer Name  :");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(40, 70, 190, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Date      :");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(420, 30, 60, 30);

        bill_no.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bill_no.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(bill_no);
        bill_no.setBounds(180, 30, 220, 30);

        cuname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cuname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(cuname);
        cuname.setBounds(230, 70, 220, 30);

        oodate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        oodate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(oodate);
        oodate.setBounds(480, 30, 170, 30);

        total_leve.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve.setForeground(new java.awt.Color(255, 255, 255));
        total_leve.setText("Discount        :");
        jPanel2.add(total_leve);
        total_leve.setBounds(430, 510, 80, 30);

        total_leve1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve1.setForeground(new java.awt.Color(255, 255, 255));
        total_leve1.setText("Sub Total      :");
        jPanel2.add(total_leve1);
        total_leve1.setBounds(430, 480, 80, 30);

        total_leve2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve2.setForeground(new java.awt.Color(255, 255, 255));
        total_leve2.setText("Paid                :");
        jPanel2.add(total_leve2);
        total_leve2.setBounds(430, 540, 80, 30);

        total_leve3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_leve3.setForeground(new java.awt.Color(255, 255, 255));
        total_leve3.setText("Due                 :");
        jPanel2.add(total_leve3);
        total_leve3.setBounds(430, 570, 80, 30);

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
        paid.setBounds(520, 540, 260, 30);

        due.setEditable(false);
        due.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(due);
        due.setBounds(520, 570, 260, 30);

        dis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                disKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                disKeyTyped(evt);
            }
        });
        jPanel2.add(dis);
        dis.setBounds(520, 510, 260, 30);

        stotal.setEditable(false);
        stotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(stotal);
        stotal.setBounds(520, 480, 260, 30);

        submitionbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitionbutton.setText("Submit");
        submitionbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitionbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(submitionbutton);
        submitionbutton.setBounds(613, 610, 160, 31);

        Find.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FindMouseReleased(evt);
            }
        });
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
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
        jPanel2.add(Find);
        Find.setBounds(430, 110, 300, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("* Search By Order Id/ Bill No ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(530, 80, 200, 30);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Show Sales", "Show Order", "Order Sales" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox5);
        jComboBox5.setBounds(650, 10, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(744, 114, 30, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Cash");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(70, 510, 93, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Check");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(180, 510, 93, 23);

        account_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel2.add(account_combo);
        account_combo.setBounds(70, 610, 230, 30);

        acc_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        acc_label.setForeground(new java.awt.Color(255, 255, 255));
        acc_label.setText("Account Number");
        jPanel2.add(acc_label);
        acc_label.setBounds(70, 590, 100, 20);

        bname_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        bname_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bname_comboActionPerformed(evt);
            }
        });
        jPanel2.add(bname_combo);
        bname_combo.setBounds(70, 560, 230, 30);

        b_labl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_labl.setForeground(new java.awt.Color(255, 255, 255));
        b_labl.setText("Bank Name");
        jPanel2.add(b_labl);
        b_labl.setBounds(70, 540, 100, 20);
        jPanel2.add(desktopPane1);
        desktopPane1.setBounds(0, 0, 1370, 720);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(510, 20, 800, 680);

        s_quantity.setEditable(false);
        jPanel1.add(s_quantity);
        s_quantity.setBounds(180, 440, 130, 30);

        Update_Data.setText("Edit");
        Update_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_DataActionPerformed(evt);
            }
        });
        jPanel1.add(Update_Data);
        Update_Data.setBounds(270, 610, 180, 40);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(200, 680, 110, 23);

        sr_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_nameActionPerformed(evt);
            }
        });
        jPanel1.add(sr_name);
        sr_name.setBounds(180, 530, 290, 30);
        jPanel1.add(sr_txt);
        sr_txt.setBounds(180, 570, 290, 30);

        check.setText("0");
        jPanel1.add(check);
        check.setBounds(260, 10, 120, 30);

        pur_price_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        pur_price_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pur_price_comboActionPerformed(evt);
            }
        });
        jPanel1.add(pur_price_combo);
        pur_price_combo.setBounds(180, 400, 130, 30);

        product1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select GR Number" }));
        product1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product1ActionPerformed(evt);
            }
        });
        jPanel1.add(product1);
        product1.setBounds(180, 360, 290, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product Name             :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 320, 140, 30);

        gr_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gr_txtActionPerformed(evt);
            }
        });
        gr_txt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                gr_txtPropertyChange(evt);
            }
        });
        gr_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gr_txtKeyReleased(evt);
            }
        });
        jPanel1.add(gr_txt);
        gr_txt.setBounds(180, 360, 290, 30);

        sp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sp.setForeground(new java.awt.Color(255, 255, 255));
        sp.setText("Sales Product ");
        desktopPane.add(sp);
        sp.setBounds(100, 10, 240, 30);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel13);
        jLabel13.setBounds(10, 0, 90, 110);

        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1420, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 1420, 730);

        setSize(new java.awt.Dimension(1419, 732));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
void show_suplierName(){
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
void showrrname(){
     
     try {
         sr_name.removeAllItems();
         sr_name.addItem("NA");
         con.contest();
         String s="SELECT `so_name` FROM `sergical_shop`.`sales_officer`";
         
         con.st = con.ct.prepareCall(s);
         con.rs = con.st.executeQuery(s);    
         while(con.rs.next()){
             sr_name.addItem(""+con.rs.getString(1));
         }
     } catch (SQLException ex) {
         Logger.getLogger(Sales_Page.class.getName()).log(Level.SEVERE, null, ex);
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
void show_Catagory(){
    try{
        catagory.removeAllItems();
        catagory.addItem(" ");
            con.contest();
            String select="SELECT `category` FROM  `category_table` ORDER BY `category` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           catagory.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
void show_Product(){
    try{
        product.removeAllItems();
        product.addItem(" ");
            con.contest();
            String select="SELECT `product_name` FROM  `purchase` WHERE `Catagory`='"+catagory.getSelectedItem()+"' GROUP BY `product_name` ORDER BY `product_name` ASC  ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           product.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

} 
    private void sales_price_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_price_txtMouseClicked

        sales_price_txt.setText("");
    }//GEN-LAST:event_sales_price_txtMouseClicked

    private void sales_price_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sales_price_txtKeyReleased
       double p=0,q=0;  
      
        try{
        p=Double.parseDouble(sales_price_txt.getText());
      q=Double.parseDouble(jTextField4.getText());
        }catch(Exception e){
        p=0;
        q=0;
           double t=p*q;
           
       t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);
        } 
       double t=p*q;
       
       t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);
    }//GEN-LAST:event_sales_price_txtKeyReleased

    private void sales_price_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sales_price_txtKeyTyped
     char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_sales_price_txtKeyTyped

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
         if(product1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Please Select GR NUmber");
            product1.requestFocus();
        }else if(sales_price_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Entry Price");
            sales_price_txt.requestFocus();
        }else{ 
           double st=Double.parseDouble(s_quantity.getText());
           double p=0,q=0;
            p=Double.parseDouble(sales_price_txt.getText());
            try{
            q=Double.parseDouble(jTextField4.getText()); 
            }catch(Exception e){
            q=0;
             if(q<=st){ 
           double t=p*q;
           
       t=Math.round(t*100.0)/100.0;
            jTextField5.setText(""+t);}
            else{
            JOptionPane.showMessageDialog(this, "learg quantity ");
            jTextField4.requestFocus();
            jTextField4.setText("");
            }
            }
            if(q<=st){ 
           double t=p*q;
           
       t=Math.round(t*100.0)/100.0;
            jTextField5.setText(""+t);}
            else{
            JOptionPane.showMessageDialog(this, "learg quantity ");
            jTextField4.requestFocus();
            jTextField4.setText("");
            }
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
           char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void catagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoryActionPerformed
  show_Product(); 
    }//GEN-LAST:event_catagoryActionPerformed
double billcheckorder(){
   double e=0;
       try {
           String sdd="SELECT `bill_no` FROM `sergical_shop`.`sales_acoount` WHERE `bill_no`='"+bill_no.getText()+"'";
           
           
           
           con.st = con.ct.prepareCall(sdd);
           con.rs = con.st.executeQuery(sdd);
           
           if(con.rs.next()){
               JOptionPane.showMessageDialog(Find, "This Bill has already been Submited.Change bill No ");
           }else{
           
           e=1;
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
return e;
}
double billcheck(){
   double e=0;
       try {
           String sdd="SELECT `bill_no` FROM `sergical_shop`.`sales_acoount` WHERE `bill_no`='"+bill_no.getText()+"'";
           
           con.st = con.ct.prepareCall(sdd);
           con.rs = con.st.executeQuery(sdd);
           
           if(con.rs.next()){
               JOptionPane.showMessageDialog(Find, "This Bill has already been Submited.");
           }else{
           
           e=1;
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
return e;
} 
    private void SAles_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAles_ButtonActionPerformed
     if(Find.getText().isEmpty()){
     if(Authintication()==1){
       
        String date1 = oodate.getText();
        
        String bill=bill_no.getText();
        String name=product.getSelectedItem().toString();
        String price=sales_price_txt.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText(); 
        String cata=catagory.getSelectedItem().toString();
        String gr=product1.getSelectedItem().toString();
        
        
         if(customer_type.getSelectedIndex()==0){
                if(cuname.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Customer NAme is empty");
                cust_tst.requestFocus();
                }else{
                String supier=cuname.getText();
                //insrt
                 
                  if(billcheck()==1){
                    try {
                        String ss="SELECT `product_name` FROM `sergical_shop`.`sales_table` WHERE `sales_bill_no`='"+bill+"' AND`gr_number`='"+product1.getSelectedItem()+"' AND `s_price` ='"+price+"'";
                        
                        con.st = con.ct.prepareCall(ss);
                        con.rs = con.st.executeQuery(ss);
                        
                        if(con.rs.next()){
                            JOptionPane.showMessageDialog(Find, "This Product And Product Price Already Submited Please click edit.");
                            
                        }else{
                            //purchase
                            String query="INSERT INTO `sergical_shop`.`sales_table`(`cus_name`, `sales_bill_no`, `Catagory`, `product_name`, `s_date`, `s_quantity`, `s_price`, `total`,`SR`,`pur_price`,`gr_number`)VALUES ('"+supier+"', '"+bill+"','"+cata+"', '"+name+"', '"+date1+"', '"+quantity+"', '"+price+"', '"+total+"','"+sr_txt.getText()+"','"+pur_price_combo.getSelectedItem()+"','"+product1.getSelectedItem()+"')";
                            Data_Operation(query, "Add");
                        }       } catch (SQLException ex) {
                        Logger.getLogger(Sales_Page.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                   
            } 
            
                
                
                }
                
        
        }else{
        
          if(cuname.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Shop/Hospital NAme is empty");
                shop_combo.requestFocus();
                }else{
                
                //insrt
                
                String supier=cuname.getText();
                //insrt
                 
                 try {
                 if(billcheck()==1){
             String ss="SELECT `product_name` FROM `sergical_shop`.`sales_table` WHERE `sales_bill_no`='"+bill+"' AND `gr_number`='"+product1.getSelectedItem()+"'";
         
                con.st = con.ct.prepareCall(ss); 
                con.rs = con.st.executeQuery(ss);
       
            if(con.rs.next()){
            JOptionPane.showMessageDialog(Find, "This product has already been Sales.");
            
            }else{
                //purchase 
              String query="INSERT INTO `sergical_shop`.`sales_table`(`cus_name`, `sales_bill_no`, `Catagory`, `product_name`, `s_date`, `s_quantity`, `s_price`, `total`,`SR`,`pur_price`,`gr_number`)VALUES ('"+supier+"', '"+bill+"','"+cata+"', '"+name+"', '"+date1+"', '"+quantity+"', '"+price+"', '"+total+"','"+sr_txt.getText()+"','"+pur_price_combo.getSelectedItem()+"','"+product1.getSelectedItem()+"')";
        Data_Operation(query, "Add");
           
            }}
            } catch (SQLException ex) {
                Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
            }//
                
                
                
                
                
                }
        }
         
         
     }
     
        
          
     
     }else{
     //find
      if(Authintication()==1){
        
        String date1 =oodate.getText(); 
        String supier=cuname.getText();
        String bill=bill_no.getText();
        String name=product.getSelectedItem().toString();
        String price=sales_price_txt.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText(); 
        String cata=catagory.getSelectedItem().toString();
         
                //check same product
                
           try {
                 if(billcheck()==1){
              String ss="SELECT `product_name` FROM `sergical_shop`.`sales_table` WHERE `sales_bill_no`='"+bill+"' AND `Catagory`='"+cata+"' AND `product_name`='"+name+"'";
         
                con.st = con.ct.prepareCall(ss); 
                con.rs = con.st.executeQuery(ss);
       
            if(con.rs.next()){
            JOptionPane.showMessageDialog(Find, "This product has already been Sales.");
            
            }else{
                //purchase 
              String query="INSERT INTO `sergical_shop`.`sales_table`(`cus_name`, `sales_bill_no`, `Catagory`, `product_name`, `s_date`, `s_quantity`, `s_price`, `total`,`SR`,`pur_price`,`gr_number`)VALUES('"+supier+"', '"+bill+"','"+cata+"', '"+name+"', '"+date1+"', '"+quantity+"', '"+price+"', '"+total+"','"+sr_txt.getText()+"','"+pur_price_combo.getSelectedItem()+"','"+product1.getSelectedItem()+"')";
        Data_Operation1(query, "Add");
                 
                    
                   
            }}
            } catch (SQLException ex) {
                Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
        
        
      
       
      }
       
     
     
     }
    }//GEN-LAST:event_SAles_ButtonActionPerformed
double orderauth(){
double e=0;
if(bill_no.getText().isEmpty()){
JOptionPane.showMessageDialog(Find, "+Data Not Found for Find+");
Find.requestFocus();
}
else{




} 
return e;
}
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
try{
    
      DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
      
      catagory.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 2).toString()); 
      product.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
      product1.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(),1).toString()); 
      sales_price_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString()); 
      jTextField4.setText(dt.getValueAt(jTable1.getSelectedRow(), 5).toString());
      jTextField5.setText(dt.getValueAt(jTable1.getSelectedRow(), 6).toString());
      gr_txt.setText(dt.getValueAt(jTable1.getSelectedRow(),1).toString());
      String s=" SELECT `pur_price` FROM `sales_table` WHERE `gr_number`='"+gr_txt.getText()+"'  GROUP BY `gr_number`";
      
       con.st = con.ct.prepareCall(s);
       con.rs = con.st.executeQuery(s); 
      if(con.rs.next()){
       pur_price_combo.addItem(""+con.rs.getString(1));
          }
      
        //jTextField2.setText(cuname.getText());
}catch(Exception e){
    
}   
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
    if(stotal.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "No Data Found"); 
        }else if(dis.getText().isEmpty()){
            dis.setText("0");
        }
 else{
            double t=0,d=0,p=0,ft=0,du=0;
            t=Double.parseDouble(stotal.getText());
            try{
            d=Double.parseDouble(dis.getText());}
            catch(Exception e){
            d=0;
             p=Double.parseDouble(paid.getText());
            ft=t-d;
            du=ft-p;
            du=Math.round(du*100.0)/100.0;
            due.setText(""+du);
 }
            try{
            p=Double.parseDouble(paid.getText());}
            catch(Exception e ){
            ft=t-d;
            du=ft-p;
 du=Math.round(du*100.0)/100.0;
            due.setText(""+du);
            }
            ft=t-d;
            du=ft-p;
 du=Math.round(du*100.0)/100.0;
            due.setText(""+du);}
    }//GEN-LAST:event_paidKeyReleased
double Authintication2(){
   double e=0;
    

 if(bill_no.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Bill No is empty");
    bill_no.requestFocus();
} else if (oodate.getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Date Is Empty");
            oodate.requestFocus();
        }  
else if(cuname.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Company Name is empty");
    cuname.requestFocus();
}else if(stotal.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Sub Total is empty");
    stotal.requestFocus();
}else if(dis.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Discount is empty");
    dis.requestFocus();
}
else if(paid.getText().isEmpty()){
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
    private void submitionbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitionbuttonActionPerformed
        if(Authintication2()==1){
            String status="";
           double aa=0;
 if(jRadioButton1.isSelected()){ 
    status="Cash";
    }else if(jRadioButton2.isSelected()){
        status="Check"; 
    }else{
    status="";
    }if(status.isEmpty()){ 
JOptionPane.showMessageDialog(this, "Please Select Cash Or Check");
}else{ if(status.equals("Check")){
         
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
         
            
            String date1 =  oodate.getText();
            String comp=cuname.getText();
            String bill=bill_no.getText();
        //    String name=cust_tst.getText();
           double i=count;
            // JOptionPane.showMessageDialog(this, con);
            String st=stotal.getText();
            String di=dis.getText();
            String pa =paid.getText();
            String du =due.getText();

                 if(Find.getText().isEmpty()){

                    String query="INSERT INTO `sergical_shop`.`sales_acoount` (`bill_no`, `date`, `company`, `total_item`, `sub_total`, `discount`, `paid`, `due`,`status` ) VALUES ('"+bill+"', '"+date1+"', '"+comp+"', '"+i+"', '"+st+"', '"+di+"',  '"+pa+"', '"+du+"','"+status+"')";
                    Data_Operation2(query,aa);
                    con.contest();
                   

                }else{

                    if(jLabel6.getText().equals("X")){
                        JOptionPane.showMessageDialog(this, "Please Select order Purchase");

                    }else{

                        String query="INSERT INTO `sergical_shop`.`sales_acoount` (`bill_no`, `date`, `company`, `total_item`, `sub_total`, `discount`, `paid`, `due`,`status`) VALUES ('"+bill+"', '"+date1+"', '"+comp+"', '"+i+"', '"+st+"', '"+di+"',  '"+pa+"', '"+du+"','"+status+"')";
                        Data_Operation2(query,aa);
                        con.contest();
                   

                    }

                }
    }
        }

    }//GEN-LAST:event_submitionbuttonActionPerformed
void cash_check_DAta(String query,String msg){
    try {     
         con.contest(); 
           double   result=con.st.executeUpdate(query);
            if(result>0){  
     //String bi= bill_no.getText(); 
    // Sales_Page s=new Sales_Page();
    // Sales_bill2 b=new Sales_bill2(bi);
     DatALLCLear();  
    // b.setVisible(true); 
    // s.setVisible(false); 
      // s.setVisible(false); 
       JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}

void Data_Operation2(String query,double aa){
    try {  
         con.contest();
           double   result=con.st.executeUpdate(query);
            if(result>0){
                
                     String status="Credit";
                      String details="Product Sales || "+bill_no.getText();
                    String date1= oodate.getText();
                    String ammount=paid.getText();
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
                
               // JOptionPane.showMessageDialog(this, "Submition Succes");
              
             
                
            } else{
            
            JOptionPane.showMessageDialog(this, "Submition Failed");
            
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


} 
void DatALLCLear(){ 
    customer_type.setEnabled(true);
shop_combo.setEnabled(true);
cust_tst.setEnabled(true);
jDateChooser1.setEnabled(true);
 
jTextField1.setEnabled(true);

 sr_name.setEnabled(true);
 sr_txt.setEnabled(true);
 check.setText("0");
shop_combo.setSelectedIndex(0);
jTextField1.setText("");
cust_tst.setText("");
sales_price_txt.setText(""+0);
jTextField4.setText(""+0); 
jTextField5.setText("");    
((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
bill_no.setText("");
cuname.setText("");
oodate.setText("");
stotal.setText("");
dis.setText("0");
paid.setText("");
due.setText("");
 DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);

shop_combo.requestFocus();
Find.setText("");
jLabel6.setText("X");
buttonGroup1.clearSelection();
catagory.setSelectedIndex(0);


} 
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
   void Find_or(){
    try{
        if(jComboBox5.getSelectedIndex()==1){
           tcount=0;
                count=0;
                DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                  con.contest();
                   
                 
               bill_no.setText("");
               cuname.setText("");
                  Date dtt = new Date();
       // DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
                oodate.setText("");   
                
                   
            String select="SELECT `sales_bill_no`, `cus_name`,`Catagory`,`product_name`, `s_price`,`s_quantity`, `total`,`s_date`,`gr_number` FROM `sergical_shop`.`sales_table` WHERE `sales_bill_no`='"+Find.getText()+"' ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){  
               bill_no.setText(""+con.rs.getString(1));
               cuname.setText(""+con.rs.getString(2)); 
                oodate.setText(""+con.rs.getDate(8));   
                jDateChooser1.setDate(con.rs.getDate(8));
                
                count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(9),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(5)),Double.parseDouble(con.rs.getString(6)),Double.parseDouble(con.rs.getString(7))});
                      bb=Double.parseDouble(con.rs.getString(7));
                tcount=tcount+bb;
                         jLabel6.setText("*");
           }
           //  stotal.setText(""+tcount);
        }else if(jComboBox5.getSelectedIndex()==2){
           tcount=0;
                count=0;
                DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                  con.contest();
                  
                  
                  
                 
               bill_no.setText("");
               cuname.setText("");
                  Date dtt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
                oodate.setText("");   
                
                   
            String select="SELECT `order_id`, `customer_name`,`Catagory`,`product_name`, `product_price`, `product_quantity`, `total`,`delivery_date`,`gr_number` FROM `sergical_shop`.`sales_order` WHERE `order_id`='"+Find.getText()+"' AND `status`='order'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){ 
                
                
               bill_no.setText(""+con.rs.getString(1));
               cuname.setText(""+con.rs.getString(2));
                 
                oodate.setText(""+con.rs.getDate(8));   
                 jDateChooser1.setDate(con.rs.getDate(8));
                
                count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(9),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(5)),Double.parseDouble(con.rs.getString(6)),Double.parseDouble(con.rs.getString(7))});
                       bb=Double.parseDouble(con.rs.getString(7));
                tcount=tcount+bb;
              jLabel6.setText("X");                    
           } tcount=Math.round(tcount*100.0)/100.0;
             stotal.setText(""+tcount);
        }
        
             
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    private void FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindKeyReleased
        Find_or();
    }//GEN-LAST:event_FindKeyReleased

    private void FindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindKeyTyped

    }//GEN-LAST:event_FindKeyTyped
  void in(String pur_order_id,String company_name,String catagory,String pur_product_name,double pur_product_price,double pur_product_quantity,double total,String da,double pur_price,String gr)
{
       try {
           
         /*  
            if(billcheck()==1){
            if(pcheck(pur_order_id, catagory, pur_product_name)==1){*/
            con.contest();
           DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         
           String queryy=" INSERT INTO `sergical_shop`.`sales_table`(`cus_name`, `sales_bill_no`, `Catagory`, `product_name`,`s_price`, `s_quantity`, `total`,`s_date`,  `status`,`SR`,`pur_price`,`gr_number`)VALUES('"+company_name+"', '"+pur_order_id+"', '"+catagory+"','"+pur_product_name+"','"+pur_product_price+"', '"+pur_product_quantity+"', '"+total+"','"+da+"',  'preorder','"+sr_txt.getText()+"','"+pur_price+"','"+gr+"')";
           
          
          double   resultt=con.st.executeUpdate(queryy);
           if(resultt>0){
              jLabel6.setText("*");
              // JOptionPane.showMessageDialog(this, "Data Add Success");
                  String up=" UPDATE `sergical_shop`.`sales_order` SET `status` = 'delivery' WHERE `order_id` = '"+Find.getText()+"' AND `status`='order'";
                upda(up);
                stotal.setText(""+tcount);
    customer_type.setEnabled(false);
shop_combo.setEnabled(false);
cust_tst.setEnabled(false);
jDateChooser1.setEnabled(false);
 sr_name.setEnabled(false);
 sr_txt.setEnabled(false);
jTextField1.setEnabled(false);
check.setText("1");
           }
            
            
            
          //  }  
             
           
          
          // }
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    
}
  
void upda(String query){
       try {
           con.contest();
          double   result=con.st.executeUpdate(query);
            if(result>0){
        jLabel6.setText("*");
          
          }
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
           

}
double test(String p,double q,String g){

     try {
       /*  con.contest();
         String select="SELECT * FROM `stock` WHERE `stock`.`product`='"+p+"'";
         con.st = con.ct.prepareCall(select);
         con.rs = con.st.executeQuery(select);
         if(con.rs.next()){
            try{
             b1=Double.parseDouble(con.rs.getString(3));
            c1=Double.parseDouble(con.rs.getString(4));
            }catch(Exception e){
                c1=0; 
                double a=b1-c1;
            if(q>a){
           r=r+1;
            }
            }
            double a=b1-c1;
            if(q>a){
           r=r+1;
            }
                
         }*/
         
         
        
         double a1=0,a2=0;
         con.contest();
         String select="SELECT `gr_wise_stock`.`pu_quantity`,`gr_wise_stock`.`s_quantity` FROM `gr_wise_stock` WHERE  `gr_wise_stock`.`gr_number`='"+g+"'";
         con.st = con.ct.prepareCall(select);
         con.rss = con.st.executeQuery(select);
           if(con.rss.next()){
                
                   try{
                    a1=Double.parseDouble(con.rss.getString(1));
                  a2=Double.parseDouble(con.rss.getString(2));
               double a=a1-a2;
               a=Math.round(a*100.0)/100.0;
                     if(q>a){
           r=r+1;
            }
                   }catch(Exception e){
                       a2=0;
                   double a=a1-a2;
                    a=Math.round(a*100.0)/100.0;
                    
                   if(q>a){
           r=r+1;
            }
                   }
                
               //}
                
              
            } 
         
     } catch (SQLException ex) {}
 return r;
}
double iii(){

         r=r+1; 
    
return r;

}
    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
      
        if(jComboBox5.getSelectedIndex()==3){
            r=0;
String p="";
double  q=0;
String g="";

if(billcheckorder()==1){

try {
            tcount=0;
                count=0;
                DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                con.contest();

               // bill_no.setText("");
               //////////// cuname.setText("");
                Date dtt = new Date();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                //oodate.setText("");
                String select="SELECT `order_id`, `customer_name`,`Catagory`,`product_name`,  `product_price`,`product_quantity`, `total`,`delivery_date`,`pur_price`,`gr_number` FROM `sergical_shop`.`sales_order`  WHERE `order_id`='"+Find.getText()+"' AND `status`='order'";
                con.st = con.ct.prepareCall(select);
                con.rs = con.st.executeQuery(select);

                while(con.rs.next()){
 
 
                    count=count+1;
                    dt.addRow(new Object[]{count,con.rs.getString(10),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(5)),Double.parseDouble(con.rs.getString(6)),Double.parseDouble(con.rs.getString(7))});
                 bb=Double.parseDouble(con.rs.getString(7));
                 
                    tcount=tcount+bb;
                  String pur_order_id=bill_no.getText();
                    String company_name=con.rs.getString(2);
                    String catagory=con.rs.getString(3);

                    String pur_product_name=con.rs.getString(4);
                   double pur_product_price=Double.parseDouble(con.rs.getString(5));
                   double pur_product_quantity=Double.parseDouble(con.rs.getString(6));
                   double  total=Double.parseDouble(con.rs.getString(7));
                    String date=oodate.getText();
                    
                double pur_price=Double.parseDouble(con.rs.getString(9));
                    String gr=con.rs.getString(10);
                    in(pur_order_id,company_name,catagory,pur_product_name,pur_product_price,pur_product_quantity,total,date,pur_price,gr);

                
            }
            } catch (SQLException ex) {
                Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
            }

}
            
        }else{

            DatALLCLear();
        }

    }//GEN-LAST:event_jComboBox5ActionPerformed
   void show_Product_price(){
    try{
        pur_price_combo.removeAllItems(); 
         sales_price_txt.setText("0");
         jTextField5.setText("");
          jTextField4.setText("0");
            con.contest();
            String select="SELECT `pur_gr`.`pu_price` FROM `pur_gr` WHERE `pur_gr`.`gr_number`='"+gr_txt.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
                pur_price_combo.addItem(""+con.rs.getString(1));
           //sales_price_txt.setText(""+con.rs.getString(1)); 
             double p=0,q=0;
        p=Double.parseDouble(sales_price_txt.getText());
        q=Double.parseDouble(jTextField4.getText());

       double t=p*q;
       t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);  
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
 void show_Product_quantity(){
         try {
         double a1=0,a2=0;
         con.contest();
         s_quantity.setText("0");
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
                   s_quantity.setText(""+a);
                    }
                   }catch(Exception e){
                       a2=0;
                   double a=a1-a2;
                    a=Math.round(a*100.0)/100.0;
                   
                    if(a>0)
                    { //JOptionPane.showMessageDialog(this, "q=="+a);
                s_quantity.setText(""+a);
                    }
                 
                   }
                
               //}
                
              
            } 
     } catch (SQLException ex) {
         Logger.getLogger(Sales_Page.class.getName()).log(Level.SEVERE, null, ex);
     }

}
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
 void show_Product_Gr_number(){
     try {
         product1.removeAllItems();
         product1.addItem("Select GR Number");
         con.contest();
         String s="  SELECT  `pur_gr`.`gr_number` FROM `pur_gr` WHERE  `pur_gr`.`Catagory`='"+catagory.getSelectedItem()+"' AND `pur_gr`.`product_name`='"+product.getSelectedItem()+"' ORDER BY `pur_gr`.`gr_number` DESC";
         
         con.st = con.ct.prepareCall(s);
         con.rs = con.st.executeQuery(s);
         while(con.rs.next()){
         product1.addItem(""+con.rs.getString(1));
         }
         
         
         
     } catch (SQLException ex) {
         Logger.getLogger(Sales_Page.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
}
    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
     //  
        show_Product_Gr_number();
    }//GEN-LAST:event_productActionPerformed
 double Authintication1(){
   double e=0;
    

 if(bill_no.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Bill No is empty");
    bill_no.requestFocus();
} else if (oodate.getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Date Is Empty");
            oodate.requestFocus();
        }  
else if(cuname.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Customer/shop/hospital Name is empty");
    cuname.requestFocus();
} else if(catagory.getSelectedIndex()==0){
JOptionPane.showMessageDialog(this, "Catagory  is empty");
    cust_tst.requestFocus();
}else if(product.getSelectedIndex()==0){
JOptionPane.showMessageDialog(this, "Product Name is empty");
    cust_tst.requestFocus();
}else if(pur_price_combo.getSelectedIndex()<=0){
 JOptionPane.showMessageDialog(this, "Product Purchase Price is empty");
    pur_price_combo.requestFocus();
}else if(sales_price_txt.getText().isEmpty()){
 JOptionPane.showMessageDialog(this, "Product Sales Price is empty");
    sales_price_txt.requestFocus();
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
 int Authintication(){
   int e=0;
    
 if(bill_no.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Id is empty");
    jTextField1.requestFocus();
} else if (oodate.getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Date Is Empty");
            jDateChooser1.requestFocus();
        }  else if(product.getSelectedIndex()<=0){
JOptionPane.showMessageDialog(this, "Product Name is empty");
    product.requestFocus();
} else if(gr_txt.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "GR NUmber is empty");
    gr_txt.requestFocus();
} else if(sales_price_txt.getText().isEmpty()){
 JOptionPane.showMessageDialog(this, "Product Sales Price is empty");
    sales_price_txt.requestFocus();
}else if(jTextField4.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Product Quantity is empty");
    jTextField4.requestFocus();
}else if(jTextField5.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Total is empty");
    jTextField5.requestFocus();
}else if(sr_txt.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "SR  is empty");
    sr_txt.requestFocus();
}else{ 
e=1;



}

return e;
} 
    private void Update_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_DataActionPerformed
        if(Find.getText().isEmpty()){

            if(Authintication()==1){
                if(billcheck()==1){
                String n="";
                String c="";
                 String p="";
                String q="";
                String g="";
                DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();

                String name=product.getSelectedItem().toString();
                String price=sales_price_txt.getText();
                String quantity=jTextField4.getText();
                String total =jTextField5.getText();
                String cata=catagory.getSelectedItem().toString(); 
               
                String date1 =oodate.getText();
                String company=cuname.getText();
                String bill=bill_no.getText();
                
                try{
                          g=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
                 n=dt.getValueAt(jTable1.getSelectedRow(), 3).toString();
                c=dt.getValueAt(jTable1.getSelectedRow(), 2).toString();
             p=dt.getValueAt(jTable1.getSelectedRow(), 4).toString();
                q=dt.getValueAt(jTable1.getSelectedRow(), 5).toString();
                String query="UPDATE `sergical_shop`.`sales_table` SET `Catagory` = '"+catagory.getSelectedItem()+"',`product_name` = '"+name+"',`gr_number`='"+gr_txt.getText()+"',`s_quantity` = '"+quantity+"', `s_price` = '"+price+"', `total` = '"+total+"' WHERE `cus_name`= '"+cuname.getText()+"'  AND `sales_bill_no` = '"+bill_no.getText()+"'  AND `gr_number`='"+g+"' AND `s_date`='"+date1+"' AND `s_price` ='"+p+"'AND  `s_quantity`='"+q+"'";
             
                Data_Operation(query, "Update");}
                catch(Exception e){
                    JOptionPane.showMessageDialog(jTable1, "Please Select Product");
                }
//JOptionPane.showMessageDialog(Find, ""+c+"  "+n+"  "+date1+"  "+cuname.getText()+"  "+bill_no.getText());

            }}
         

        }else{ if(Authintication()==1){
            
            
            if(billcheck()==1){
            String n="";
            String c="";
             String p="";
            String q="";
            String g="";
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel(); 
 String cata=catagory.getSelectedItem().toString();
            String name=product.getSelectedItem().toString();
            String price=sales_price_txt.getText();
            String quantity=jTextField4.getText();
            String total =jTextField5.getText();
               String date1 =oodate.getText();
            String company=cuname.getText();
            String bill=bill_no.getText();
            try{     g=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();
                 n=dt.getValueAt(jTable1.getSelectedRow(), 3).toString();
                c=dt.getValueAt(jTable1.getSelectedRow(), 2).toString();
             p=dt.getValueAt(jTable1.getSelectedRow(), 4).toString();
                q=dt.getValueAt(jTable1.getSelectedRow(), 5).toString();
                 
                if(jComboBox5.getSelectedIndex()==2 && jLabel6.getText().equals("X"))
{
        String queryy="UPDATE `sergical_shop`.`sales_order` SET `Catagory` = '"+cata+"',`product_name` = '"+name+"',`gr_number`='"+gr_txt.getText()+"',`product_price` = '"+price+"',`product_quantity` = '"+quantity+"',`total` = '"+total+"' WHERE `order_id` = '"+Find.getText()+"'  AND `gr_number`='"+g+"'  AND `status` = 'order' AND `s_price` ='"+p+"'AND  `s_quantity`='"+q+"'";
         JOptionPane.showMessageDialog(this, "Data Update Success");
         Find_or();
               Datacl();
}  else{   
         String query="UPDATE `sergical_shop`.`sales_table` SET `Catagory` = '"+catagory.getSelectedItem()+"',`product_name` = '"+name+"',`gr_number`='"+gr_txt.getText()+"',`s_quantity` = '"+quantity+"', `s_price` = '"+price+"', `total` = '"+total+"' WHERE `cus_name`= '"+cuname.getText()+"'  AND `sales_bill_no` = '"+bill_no.getText()+"'  AND `gr_number`='"+g+"' AND `s_date`='"+date1+"' AND `s_price` ='"+p+"'AND  `s_quantity`='"+q+"'";
                
           
       //    String query=" UPDATE `sergical_shop`.`sales_table` SET `Catagory` = '"+catagory.getSelectedItem()+"',`product_name` = '"+name+"',`gr_number`='"+gr_txt.getText()+"',`s_quantity` = '"+quantity+"', `s_price` = '"+price+"', `total` = '"+total+"' WHERE `cus_name`= '"+cuname.getText()+"'  AND `sales_bill_no` = '"+bill_no.getText()+"'  AND `gr_number`='"+g+"' AND `s_date`='"+date1+"' AND `s_price` ='"+p+"'AND  `s_quantity`='"+q+"'";
            Data_Operation1(query, "Update");}
            }catch(Exception e){
                    JOptionPane.showMessageDialog(jTable1, "Please Select Product");
                }
        
            

        }
        }}

    }//GEN-LAST:event_Update_DataActionPerformed

    private void customer_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_typeActionPerformed
        if(customer_type.getSelectedIndex()==0){
          
           cust_tst.setVisible(true);
           cust_l.setVisible(true);
           shop_combo.setVisible(false);
           perma_l.setVisible(false);
           shop_combo.setSelectedIndex(0);
              cust_tst.setText("");
                     
          }
           
         else if(customer_type.getSelectedIndex()==1){
          cust_tst.setText("");
          cuname.setText("");
            cust_tst.setVisible(false);
            cust_l.setVisible(false);
            
                     shop_combo.setVisible(true);
                      perma_l.setVisible(true);
                       
          }
    }//GEN-LAST:event_customer_typeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
    if(check.getText().equals("1")){
        JOptionPane.showMessageDialog(this, "Please Complete Submition");
        }
        else{
        
        dispose();} 
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void sr_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_nameActionPerformed
        sr_txt.setText(""+sr_name.getSelectedItem().toString());

    }//GEN-LAST:event_sr_nameActionPerformed

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

    private void disKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_disKeyReleased
     if(stotal.getText().isEmpty()){
     JOptionPane.showMessageDialog(this, "No Amount Found");
     }else{
           double t=0,d=0,p=0,ft=0,du=0;
            t=Double.parseDouble(stotal.getText());
            try{
            d=Double.parseDouble(dis.getText());
            }catch(Exception e){
            dis.setText("0");
             ft=t-d; 
       ft=Math.round(ft*100.0)/100.0;
       paid.setText(""+ft);  
               p=Double.parseDouble(paid.getText());
            du=ft-p;

       du=Math.round(du*100.0)/100.0;
            due.setText(""+du);
            }
            ft=t-d;
             ft=Math.round(ft*100.0)/100.0;
               paid.setText(""+ft);  
               p=Double.parseDouble(paid.getText());
               
            du=ft-p;
 du=Math.round(du*100.0)/100.0;
            due.setText(""+du);}
    }//GEN-LAST:event_disKeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
   bill_no.setText(""+jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void shop_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shop_comboActionPerformed
        cuname.setText(""+shop_combo.getSelectedItem());
    }//GEN-LAST:event_shop_comboActionPerformed

    private void cust_tstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cust_tstKeyReleased
          cuname.setText(""+cust_tst.getText());
    }//GEN-LAST:event_cust_tstKeyReleased

    private void jDateChooser1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser1CaretPositionChanged
       
    }//GEN-LAST:event_jDateChooser1CaretPositionChanged

    private void jDateChooser1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyPressed

    }//GEN-LAST:event_jDateChooser1KeyPressed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
             
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
 oodate.setText(""+((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
            
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FindActionPerformed

    private void pur_price_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pur_price_comboActionPerformed
    if(pur_price_combo.getSelectedIndex()>0){
    sales_price_txt.setText(""+pur_price_combo.getSelectedItem());
    }
    }//GEN-LAST:event_pur_price_comboActionPerformed

    private void product1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product1ActionPerformed
       if(product1.getSelectedIndex()>0){
    gr_txt.setText(""+product1.getSelectedItem());
    } else if(product1.getSelectedIndex()==0){
      gr_txt.setText("");
    }
       show_Product_price();
          show_Product_quantity();   
    
    }//GEN-LAST:event_product1ActionPerformed

    private void gr_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gr_txtKeyReleased
   
    }//GEN-LAST:event_gr_txtKeyReleased

    private void gr_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gr_txtActionPerformed

    }//GEN-LAST:event_gr_txtActionPerformed

    private void gr_txtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_gr_txtPropertyChange
       
    }//GEN-LAST:event_gr_txtPropertyChange

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       if(check.getText().equals("1")){
        JOptionPane.showMessageDialog(this, "Please Complete Submition");
        }
        else{
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose(); }   
    }//GEN-LAST:event_jLabel13MouseClicked
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
void Data_Operation1(String query,String msg){
    try {  
         con.contest();
   
         
         
           double   result=con.st.executeUpdate(query);
            if(result>0){
            JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
               Find_Data1();
               Datacl();
               
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
 
void Datacl(){ 
 
catagory.setSelectedIndex(0);
sales_price_txt.setText(""+0);
jTextField4.setText(""+0); 
jTextField5.setText("");    
cust_tst.requestFocus();
s_quantity.setText("");
    customer_type.setEnabled(false);
shop_combo.setEnabled(false);
cust_tst.setEnabled(false);
jDateChooser1.setEnabled(false);
 sr_name.setEnabled(false);
 sr_txt.setEnabled(false);
jTextField1.setEnabled(false);
check.setText("1");
 

} 
void Find_Data1(){
    try{
        tcount=0;
        count=0;
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
      con.contest(); 
              
             String select=" SELECT `Catagory`,`product_name`,`s_quantity`, `s_price`, `total`,`gr_number` FROM `sergical_shop`.`sales_table` WHERE `sales_bill_no`='"+bill_no.getText()+"' AND `s_date`='"+oodate.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){  count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(6),con.rs.getString(1),con.rs.getString(2),con.rs.getString(4),con.rs.getString(3),con.rs.getString(5)});
                        bb=Double.parseDouble(con.rs.getString(5));
                tcount=tcount+bb;
                                 
           } tcount=Math.round(tcount*100.0)/100.0;
             stotal.setText(""+tcount);
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
 void Data_Operation(String query,String msg){
    try {  
         con.contest();
   
         
        // JOptionPane.showMessageDialog(this, "j");
           double   result=con.st.executeUpdate(query);
            if(result>0){
               // JOptionPane.showMessageDialog(this, "j2");
            JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
             Find_Data_cust();
               Datacl();
               
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
 void Find_Data_cust(){
    try{
        tcount=0;
        count=0;
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);

      con.contest();
                //   double t=Double.parseDouble(jTextField5.getText());
                  /*    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                        String date1 = sd.format(jDateChooser1.getDate());
                   if(customer_type.getSelectedIndex()==0){
                    
                     cuname.setText(cust_tst.getText());
                    }else{
                    cuname.setText(shop_combo.getSelectedItem().toString());
                    }
                  
             //   bill_no.setText(jTextField1.getText());
                oodate.setText(date1);*/
              //  dddate.setText(((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());    
            String select="SELECT `Catagory`,`product_name`, `s_quantity`,`s_price`, `total`,`gr_number` FROM `sergical_shop`.`sales_table` WHERE `sales_bill_no`='"+bill_no.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){  count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(6),con.rs.getString(1),con.rs.getString(2),con.rs.getString(4),con.rs.getString(3),con.rs.getString(5)});
                          bb=Double.parseDouble(con.rs.getString(5));
                tcount=tcount+bb;
                                 
           } tcount=Math.round(tcount*100.0)/100.0;
             stotal.setText(""+tcount);
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
            java.util.logging.Logger.getLogger(Sales_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Sales_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Find;
    private javax.swing.JButton SAles_Button;
    private javax.swing.JButton Update_Data;
    private javax.swing.JLabel acc_label;
    private javax.swing.JComboBox<String> account_combo;
    private javax.swing.JLabel b_labl;
    private javax.swing.JLabel bill_no;
    private javax.swing.JComboBox<String> bname_combo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> catagory;
    private javax.swing.JLabel check;
    private javax.swing.JLabel cuname;
    private javax.swing.JLabel cust_l;
    private javax.swing.JTextField cust_tst;
    private javax.swing.JComboBox<String> customer_type;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JDesktopPane desktopPane1;
    private javax.swing.JTextField dis;
    private javax.swing.JTextField due;
    private javax.swing.JTextField gr_txt;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel oodate;
    private javax.swing.JTextField paid;
    private javax.swing.JLabel perma_l;
    private javax.swing.JComboBox<String> product;
    private javax.swing.JComboBox<String> product1;
    private javax.swing.JComboBox<String> pur_price_combo;
    private javax.swing.JTextField s_quantity;
    private javax.swing.JTextField sales_price_txt;
    private javax.swing.JComboBox<String> shop_combo;
    private javax.swing.JLabel sp;
    private javax.swing.JComboBox<String> sr_name;
    private javax.swing.JTextField sr_txt;
    private javax.swing.JTextField stotal;
    private javax.swing.JButton submitionbutton;
    private javax.swing.JLabel total_leve;
    private javax.swing.JLabel total_leve1;
    private javax.swing.JLabel total_leve2;
    private javax.swing.JLabel total_leve3;
    // End of variables declaration//GEN-END:variables
}

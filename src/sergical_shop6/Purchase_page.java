 
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
 
public class Purchase_page extends javax.swing.JFrame {
   Connection_Class con;
      Connection_Class con1;
  int count=0;
  double tcount=0,bb=0,b1=0,c1=0;
    public Purchase_page() {
        initComponents();
      
        /*Toolkit tk=Toolkit.getDefaultToolkit();
        double h=(int) tk.getScreenSize().getHeight();
            double w=(int) tk.getScreenSize().getWidth(); 
            this.setSize(w, h);
            getContentPane().setBackground(Color.WHITE);
        
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
         con=new Connection_Class();
         AutoCompleteDecorator.decorate(jComboBox1);
         AutoCompleteDecorator.decorate(jComboBox2); 
         AutoCompleteDecorator.decorate(jComboBox4);
         AutoCompleteDecorator.decorate(jComboBox5);
        show_suplierName();
         show_catagory();
         b_labl.setVisible(false);
         acc_label.setVisible(false);
         bname_combo.setVisible(false);
         account_combo.setVisible(false);
         show_ban();
         show_date();
         check.setVisible(false);
         jTextField2.setVisible(false);
         jTextField3.setVisible(false);
         gr_num();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        check = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bill_no = new javax.swing.JLabel();
        cuname = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        account_combo = new javax.swing.JComboBox<>();
        acc_label = new javax.swing.JLabel();
        bname_combo = new javax.swing.JComboBox<>();
        b_labl = new javax.swing.JLabel();
        oodate = new com.toedter.calendar.JDateChooser();
        desktopPane1 = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Update_Data = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        GR_number = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bill Number            :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 160, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date                        :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 200, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Quantity :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 360, 110, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total                        :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 400, 110, 30);

        check.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("0");
        jPanel1.add(check);
        check.setBounds(210, 60, 40, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(160, 120, 270, 30);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 160, 270, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(160, 200, 270, 30);

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
        jTextField2.setBounds(160, 280, 270, 30);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(150, 640, 180, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Product Price        :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 320, 110, 30);

        jPanel2.setBackground(new java.awt.Color(61, 42, 127));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL No", "GR", "Catagory", "Product", "Price", "Quantity", "Total"
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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 760, 340);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bill Number                      :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 30, 140, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Company                          :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(40, 70, 140, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date      :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(420, 30, 60, 30);

        bill_no.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bill_no.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(bill_no);
        bill_no.setBounds(180, 30, 220, 30);

        cuname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cuname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(cuname);
        cuname.setBounds(180, 70, 220, 30);

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

        paid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
        due.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        due.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(due);
        due.setBounds(520, 570, 260, 30);

        dis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
        stotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
        jPanel2.add(Find);
        Find.setBounds(430, 110, 300, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("* Search By Order Id/ Bill No ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(430, 80, 200, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Show Purchase", "Show Order", "Order Purchase" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(650, 10, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(744, 114, 30, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Cash");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(70, 513, 93, 20);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Check");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(180, 513, 93, 20);

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

        oodate.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(oodate);
        oodate.setBounds(480, 30, 150, 30);
        jPanel2.add(desktopPane1);
        desktopPane1.setBounds(0, 0, 1370, 720);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(510, 20, 800, 680);

        jButton3.setText("Purchase");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(50, 530, 180, 40);

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
        jTextField3.setBounds(160, 320, 270, 30);

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
        jTextField4.setBounds(160, 360, 270, 30);

        jTextField5.setEditable(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(160, 400, 270, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(160, 240, 270, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Catagory               : ");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 240, 110, 30);

        Update_Data.setText("Edit");
        Update_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_DataActionPerformed(evt);
            }
        });
        jPanel1.add(Update_Data);
        Update_Data.setBounds(240, 580, 180, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Product Name  : ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(50, 280, 110, 30);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(160, 280, 270, 30);

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(240, 530, 180, 40);

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(50, 580, 180, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Company               : ");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 120, 110, 30);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(160, 320, 270, 30);

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("New");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(430, 280, 70, 23);

        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("New");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(430, 320, 70, 23);

        GR_number.setEditable(false);
        jPanel1.add(GR_number);
        GR_number.setBounds(160, 440, 270, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GR                           :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 440, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Purchase Product ");
        desktopPane.add(jLabel5);
        jLabel5.setBounds(100, 0, 240, 30);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel16);
        jLabel16.setBounds(0, 0, 90, 110);

        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1370, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 730);

        setSize(new java.awt.Dimension(1359, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
     
 }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

       DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
        jComboBox2.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
       jTextField2.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jTextField3.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
       jComboBox4.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
       jComboBox5.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
       jTextField4.setText(dt.getValueAt(jTable1.getSelectedRow(), 5).toString());
        jTextField5.setText(dt.getValueAt(jTable1.getSelectedRow(), 6).toString());
   //GR_number.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    void gr_num(){
        int id=0;
       try {
           String s="SELECT `pur_gr`.`gr_number` FROM `pur_gr`";
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           
           while(con.rs.next()){
                
               id=id+1;    
           }
            id=id+1;
            GR_number.setText(""+id);
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    
    }
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(check.getText().equals("1")){
JOptionPane.showMessageDialog(Find, "Please Complete your submition");
}   else{     
        dispose();}
    }//GEN-LAST:event_jButton2ActionPerformed
double billcheck(){
    double e=0;
       try {
           String sdd="SELECT `bill_no` FROM `sergical_shop`.`purchase_account` WHERE `bill_no`='"+bill_no.getText()+"' AND `company` ='"+cuname.getText()+"'";
           
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
double billcheckfor_pu_search(){
    double e=0;
       try {
           String sdd="SELECT `bill_no` FROM `sergical_shop`.`purchase_account` WHERE `bill_no`='"+bill_no.getText()+"'  AND `company` ='"+cuname.getText()+"'";
           
           con.st = con.ct.prepareCall(sdd);
           con.rs = con.st.executeQuery(sdd);
           
           if(con.rs.next()){
               //JOptionPane.showMessageDialog(Find, "This Bill has already been Submited.");
               jLabel6.setText("X");
           }else{
           
           e=1;
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
return e;
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(Find.getText().isEmpty()){
         if(Authintication()==1){
            
          SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = sd.format(jDateChooser1.getDate()); 
        String supier=jComboBox1.getSelectedItem().toString();
        String bill=jTextField1.getText();
        String name=jTextField2.getText();
        String price=jTextField3.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText(); 
        String cata=jComboBox2.getSelectedItem().toString();
        String gr=GR_number.getText();
         
                //check same product
                
           try {
                 if(billcheck()==1){
               String ss="SELECT `product_name` FROM `sergical_shop`.`purchase` WHERE `purchase_bill_no`='"+bill+"' AND `Catagory`='"+cata+"' AND `product_name`='"+name+"' AND `su_name`='"+jComboBox1.getSelectedItem()+"'";
         
                con.st = con.ct.prepareCall(ss); 
                con.rs = con.st.executeQuery(ss);
       
            if(con.rs.next()){
            JOptionPane.showMessageDialog(Find, "This product has already been Purchase.");
            
            }else{
                //purchase 
              String query="INSERT INTO `sergical_shop`.`purchase` (`su_name`, `purchase_bill_no`, `Catagory`, `product_name`, `pu_date`, `pu_quantity`, `pu_price`, `payment`,`gr_number`)VALUES ('"+supier+"', '"+bill+"','"+cata+"', '"+name+"', '"+date1+"', '"+quantity+"', '"+price+"', '"+total+"','"+gr+"')";
        Data_Operation(query, "Add");
                 
                    
                   
            }}
            } catch (SQLException ex) {
                Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
        
        
      
       
      }
       
       
        
        }else{
        ///
            
            
            
         if(Authintication1()==1){
        String date1=((JTextField) oodate.getDateEditor().getUiComponent()).getText();
        String supier=cuname.getText();
        String bill=bill_no.getText();
        String name=jTextField2.getText();
        String price=jTextField3.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText(); 
        String cata=jComboBox2.getSelectedItem().toString();
        String gr=GR_number.getText();
         
                //check same product
                
           try {
                 if(billcheck()==1){
               String ss="SELECT `product_name` FROM `sergical_shop`.`purchase` WHERE `purchase_bill_no`='"+bill+"' AND `Catagory`='"+cata+"' AND `product_name`='"+name+"' AND `su_name`='"+jComboBox1.getSelectedItem()+"'";
         
                con.st = con.ct.prepareCall(ss); 
                con.rs = con.st.executeQuery(ss);
       
            if(con.rs.next()){
            JOptionPane.showMessageDialog(Find, "This product has already been Purchase.");
            
            }else{
                //purchase 
              String query="INSERT INTO `sergical_shop`.`purchase` (`su_name`, `purchase_bill_no`, `Catagory`, `product_name`, `pu_date`, `pu_quantity`, `pu_price`, `payment`,`gr_number`)VALUES ('"+supier+"', '"+bill+"','"+cata+"', '"+name+"', '"+date1+"', '"+quantity+"', '"+price+"', '"+total+"','"+gr+"')";
  
          Data_Operation1(query, "Add");
         
                    
                   
            }}
            } catch (SQLException ex) {
                Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
        
        
      
       
      }
       
       ///
        
        
        
        }
        //normal purchase
       
        
       /* 
        else{
           
           
           
           
           
           try {
               //order bill purchase
               
              
               
              
                   String product="";
               String cat="";
               double sl=0,prie=0,quantiy=0,total=0;
               DefaultTableModel modal= (DefaultTableModel) jTable1.getModel();
               double nROw=modal.getRowCount();
               double nCulmn=modal.getColumnCount();
               Object [][] tabledata=new Object[nROw][nCulmn];
               for (double i = 0; i < nROw; i++) {
                   for (double j = 0; j <nCulmn; j++) {
                       tabledata[i][j]=modal.getValueAt(i, j);
                       if (j==0){
                          
                           sl=(int) tabledata[i][j];
                           
                       }
                       else if (j==1){
                           cat=  (String) tabledata[i][j];
                           
                       }else if (j==2){
                           
                           product=(String) tabledata[i][j];
                       }else if (j==3){
                           
                           prie=(int) tabledata[i][j];
                       }else if (j==4){
                           quantiy=(int) tabledata[i][j];
                           
                       }else if (j==5){
                           
                           total=(int) tabledata[i][j];
                       }
                       
                       
                      
                   }
                   String sss="SELECT `product_name` FROM `sergical_shop`.`purchase` WHERE `purchase_bill_no`='"+bill_no.getText()+"' AND `Catagory`='"+cat+"' AND `product_name`='"+product+"'";
               con.st = con.ct.prepareCall(sss);
               con.rs = con.st.executeQuery(sss);
               if(con.rs.next()){
                     // JOptionPane.showMessageDialog(Find, "This product has already been Purchase.");
               }else{
                   String query="INSERT INTO `sergical_shop`.`purchase` (`su_name`, `purchase_bill_no`, `Catagory`, `product_name`,`pu_price`, `pu_quantity`, `payment`,`pu_date`,  `status`)VALUES "
                           + "('"+cuname.getText()+"', '"+bill_no.getText()+"','"+cat+"', '"+product+"','"+prie+"', '"+quantiy+"', '"+total+"', '"+oodate.getText()+"', 'pre_order')";
                   add(query );}
               }
               String up="UPDATE `sergical_shop`.`purchase_order` SET `status` = 'delivery' WHERE `pur_order_id` = '"+bill_no.getText()+"' AND `status`='order' ";
               upda(up);
           } catch (SQLException ex) {
               Logger.getLogger(purchase_page.class.getName()).log(Level.SEVERE, null, ex);
           }
           
                
                
           
           
           
        }*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked

        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
      
        double p=0,q=0; 
       if(jTextField3.getText().isEmpty()){
           p=1;
       }else if(jTextField4.getText().isEmpty()){  
          q=1;
       }else if(jTextField4.getText().isEmpty() && jTextField3.getText().isEmpty()){  
          p=0;
          q=0;
       } else{
          p=Double.parseDouble(jTextField3.getText());
        q=Double.parseDouble(jTextField4.getText());
          
       } 
        double t=p*q;
         t=Math.round(t*100.0)/100.0;
        jTextField5.setText(""+t);   
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
            double p=0,q=0;
            if(jTextField4.getText().isEmpty()){
                        p=Double.parseDouble(jTextField3.getText());
            q=0;
               double t=p*q;
                 t=Math.round(t*100.0)/100.0;
            jTextField5.setText(""+t);
            }else{
            
            p=Double.parseDouble(jTextField3.getText());
            q=Double.parseDouble(jTextField4.getText());

            double t=p*q;
              t=Math.round(t*100.0)/100.0;
            jTextField5.setText(""+t);}}
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
            char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
             if(stotal.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "No Amount Found");
             
             }else if(dis.getText().isEmpty()){ 
            dis.setText("0");
        }else{
                 if(paid.getText().isEmpty()){
                  double t=0,d=0,p=0,ft=0,du=0;
            t=Double.parseDouble(stotal.getText());
            d=Double.parseDouble(dis.getText());
           ft=t-d;
            du=ft-p; 
            du=Math.round(du*100.0)/100.0;
            due.setText(""+du);
                 }else{
            double t=0,d=0,p=0,ft=0,du=0;
            t=Double.parseDouble(stotal.getText());
            d=Double.parseDouble(dis.getText());
            p=Double.parseDouble(paid.getText());
ft=t-d;
du=ft-p;
du=Math.round(du*100.0)/100.0;
      
            due.setText(""+du);}}
    }//GEN-LAST:event_paidKeyReleased

    private void submitionbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitionbuttonActionPerformed
  if(Authintication2()==1){
     double aa=0;
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
String date1 = ((JTextField) oodate.getDateEditor().getUiComponent()).getText();
        String comp=cuname.getText();
        String bill=bill_no.getText();
        String name=jTextField2.getText();
            double i=count;
       // JOptionPane.showMessageDialog(this, con);
        String st=stotal.getText();
        String di=dis.getText();
        String pa =paid.getText();  
        String du =due.getText();  
          try {
            
              
              
              
                String sdd="SELECT `bill_no` FROM `sergical_shop`.`purchase_account` WHERE `bill_no`='"+bill_no.getText()+"' AND `company`='"+jComboBox1.getSelectedItem()+"'";
           
           con.st = con.ct.prepareCall(sdd);
           con.rs = con.st.executeQuery(sdd);
           
           if(con.rs.next()){
               JOptionPane.showMessageDialog(Find, "This Bill has already Paid.");
           }else{
             if(Find.getText().isEmpty()){
              
           
            String query="INSERT INTO `sergical_shop`.`purchase_account` (`bill_no`, `date`, `company`, `total_item`, `sub_total`, `discount`, `paid`, `due`,`status` ) VALUES ('"+bill+"', '"+date1+"', '"+comp+"', '"+i+"', '"+st+"', '"+di+"',  '"+pa+"', '"+du+"','"+status+"')";
            Data_Operation2(query,aa); 
            con.contest();
           String up="UPDATE `sergical_shop`.`purchase` SET `status` = 'pur' WHERE `su_name` = '"+cuname.getText()+"' AND `purchase_bill_no` = '"+bill_no.getText()+"' AND `status` = 'normal';";
           double result= con.st.executeUpdate(up);
           if(result>=0) {
           //JOptionPane.showMessageDialog(Find, "pur");eti kaj korchena
             }
              
              
              }else{
              
              if(jLabel6.getText().equals("X")){
              JOptionPane.showMessageDialog(this, "Please Select order Purchase");
              
              
              }else{
               
            String query="INSERT INTO `sergical_shop`.`purchase_account` (`bill_no`, `date`, `company`, `total_item`, `sub_total`, `discount`, `paid`, `due`,`status` ) VALUES ('"+bill+"', '"+date1+"', '"+comp+"', '"+i+"', '"+st+"', '"+di+"',  '"+pa+"', '"+du+"','"+status+"')";
            Data_Operation2(query,aa); 
            con.contest();
           String up="UPDATE `sergical_shop`.`purchase` SET `status` = 'pur' WHERE `su_name` = '"+cuname.getText()+"' AND `purchase_bill_no` = '"+bill_no.getText()+"' AND `status` = 'normal';";
           double result= con.st.executeUpdate(up);
           if(result>=0) {
           //JOptionPane.showMessageDialog(Find, "pur");eti kaj korchena
              } 
              }
              
              
              }
              
              
              
           
           
           }
            
              
              
              
              
        } catch (SQLException ex) {
            Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
      }      
        
    }//GEN-LAST:event_submitionbuttonActionPerformed

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
        Find_or();
    }//GEN-LAST:event_FindKeyReleased

    private void FindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindKeyTyped

    }//GEN-LAST:event_FindKeyTyped

    private void Update_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_DataActionPerformed
if(Find.getText().isEmpty()){


 if(Authintication1()==1){
     if(billcheck()==1){
            String n="";
             String c="";
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
          
        String name=jTextField2.getText();
        String price=jTextField3.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText(); 
        String cata=jComboBox2.getSelectedItem().toString();
        
        
        n=dt.getValueAt(jTable1.getSelectedRow(), 3).toString(); 
        c=dt.getValueAt(jTable1.getSelectedRow(), 2).toString();          
        String date1 =((JTextField) oodate.getDateEditor().getUiComponent()).getText();
        String company=cuname.getText();
        String bill=bill_no.getText();
        
            String query=" UPDATE `sergical_shop`.`purchase` SET `Catagory` = '"+jComboBox2.getSelectedItem()+"',`product_name` = '"+name+"',`pu_quantity` = '"+quantity+"', `pu_price` = '"+price+"', `payment` = '"+total+"' WHERE `su_name` = '"+cuname.getText()+"'  AND `purchase_bill_no` = '"+bill_no.getText()+"'  AND `product_name`='"+n+"' AND `catagory`='"+c+"'AND `pu_date`='"+date1+"'";
            Data_Operation(query, "Update"); 
        }
}



}else{ 
if(Authintication1()==1){if(billcheck()==1){
            String n="";
             String c="";
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
          
        String name=jTextField2.getText();
        String price=jTextField3.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText(); 
        String cata=jComboBox2.getSelectedItem().toString();
        
        
        n=dt.getValueAt(jTable1.getSelectedRow(), 3).toString(); 
        c=dt.getValueAt(jTable1.getSelectedRow(), 2).toString();          
        String date1 =((JTextField) oodate.getDateEditor().getUiComponent()).getText();
        String company=cuname.getText();
        String bill=bill_no.getText();
       
            String query=" UPDATE `sergical_shop`.`purchase` SET `Catagory` = '"+jComboBox2.getSelectedItem()+"',`product_name` = '"+name+"',`pu_quantity` = '"+quantity+"', `pu_price` = '"+price+"', `payment` = '"+total+"' WHERE `su_name` = '"+cuname.getText()+"'  AND `purchase_bill_no` = '"+bill_no.getText()+"'  AND `product_name`='"+n+"' AND `catagory`='"+c+"'AND `pu_date`='"+date1+"'";
            Data_Operation1(query, "Update"); 
        }}
}
       
    }//GEN-LAST:event_Update_DataActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if(jComboBox3.getSelectedIndex()==3){
        
          if(billcheck()==1){
            try {
                tcount=0;
                count=0;
                DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                con.contest();   
                
                
                
                
             //   bill_no.setText("");
                cuname.setText("");
                Date dtt = new Date();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
   
               // ((JTextField) oodate.getDateEditor().getUiComponent()).setText("");
                
                String select="SELECT `pur_order_id`, `company_name`,`catagory`,`pur_product_name`,  `pur_product_price`, `pur_product_quantity`, `total` FROM `sergical_shop`.`purchase_order` WHERE `pur_order_id`='"+Find.getText()+"' AND `status`='order'";
                con.st = con.ct.prepareCall(select);
                con.rs = con.st.executeQuery(select);
                String gr_=GR_number.getText();
                int gr_n=Integer.parseInt(gr_);
                if(gr_n>=2147483647){
                JOptionPane.showMessageDialog(this, "Please Contact 01812669757");
                
                
                }else{
                while(con.rs.next()){
                    
                    
                  //  bill_no.setText(""+con.rs.getString(1));
                    cuname.setText(""+con.rs.getString(2));
                    
                //((JTextField) oodate.getDateEditor().getUiComponent()).setText(""+df.format(dtt));
                    
                    gr_n=gr_n+1;
                     GR_number.setText(""+gr_n);
                    count=count+1;
                    dt.addRow(new Object[]{count,gr_n,con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(5)),Double.parseDouble(con.rs.getString(6)),Double.parseDouble(con.rs.getString(7))});
         b1=Double.parseDouble(con.rs.getString(7));
                    tcount=tcount+b1;
             String pur_order_id=bill_no.getText();
              String company_name=con.rs.getString(2);
              String catagory=con.rs.getString(3);
             
                     String pur_product_name=con.rs.getString(4);
                   String pur_product_price=con.rs.getString(5);
                    String pur_product_quantity=con.rs.getString(6);
                    String  total=con.rs.getString(7);
                    
                   
                     in(pur_order_id,company_name,catagory,pur_product_name,pur_product_price,pur_product_quantity,total,gr_n);
                    
                }
                String up="UPDATE `sergical_shop`.`purchase_order` SET `status` = 'delivery' WHERE `pur_order_id` = '"+Find.getText()+"' AND `status`='order' ";
               upda(up);
                stotal.setText(""+tcount);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           
           
        
        }else{
        
        DatALLCLear();
        }
        
        
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
  b_labl.setVisible(true);
         acc_label.setVisible(true);
         bname_combo.setVisible(true);
         account_combo.setVisible(true);
    }//GEN-LAST:event_jRadioButton2MouseClicked
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
    private void bname_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bname_comboActionPerformed
        show_accou();
    }//GEN-LAST:event_bname_comboActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        b_labl.setVisible(false);
         acc_label.setVisible(false);
         bname_combo.setVisible(false);
         account_combo.setVisible(false);
                                        
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        try{
            jComboBox5.removeAllItems();
            con.contest();
            String select="SELECT `pu_price` FROM `sergical_shop`.`purchase` WHERE `Catagory`='"+jComboBox2.getSelectedItem()+"' AND `product_name`='"+jComboBox4.getSelectedItem()+"' group by  `pu_price` ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
                jTextField2.setText(""+jComboBox4.getSelectedItem());
                jComboBox5.addItem(""+con.rs.getString(1));
                double p=0,q=0;
                p=Double.parseDouble(jTextField3.getText());
                q=Double.parseDouble(jTextField4.getText());
 
                double t=p*q;
                  t=Math.round(t*100.0)/100.0;
                jTextField5.setText(""+t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
      
        
        try{
        jComboBox4.removeAllItems();
        jComboBox4.addItem("Select");
        jTextField2.setText("");
            con.contest();
            String select="SELECT `product_name` FROM `sergical_shop`.`purchase` WHERE `Catagory`='"+jComboBox2.getSelectedItem()+"' GROUP BY `product_name` ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           jComboBox4.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if(check.getText().equals("1")){
JOptionPane.showMessageDialog(Find, "Please Complete your submition");
}   else{       DatALLCLear();}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     if(Find.getText().isEmpty()){

 if(Authintication1()==1){
            String n="";
             String c="";
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
          
        String name=jTextField2.getText();
        String price=jTextField3.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText(); 
        String cata=jComboBox2.getSelectedItem().toString();
        
        
        n=dt.getValueAt(jTable1.getSelectedRow(), 3).toString(); 
        c=dt.getValueAt(jTable1.getSelectedRow(), 2).toString();          
        String date1 =((JTextField) oodate.getDateEditor().getUiComponent()).getText();
        String company=cuname.getText();
        String bill=bill_no.getText();
        String query="DELETE FROM `sergical_shop`.`purchase` WHERE `su_name` = '"+cuname.getText()+"'  AND `purchase_bill_no` = '"+bill_no.getText()+"'  AND `product_name`='"+n+"' AND `catagory`='"+c+"'AND `pu_date`='"+date1+"'";
            Data_Operation(query, "Delete"); 
        }




}else{ if(Authintication1()==1){
            String n="";
             String c="";
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
          
        String name=jTextField2.getText();
        String price=jTextField3.getText();
        String quantity=jTextField4.getText();
        String total =jTextField5.getText(); 
        String cata=jComboBox2.getSelectedItem().toString();
        
        
        n=dt.getValueAt(jTable1.getSelectedRow(), 2).toString(); 
        c=dt.getValueAt(jTable1.getSelectedRow(), 1).toString();          
        String date1 =((JTextField) oodate.getDateEditor().getUiComponent()).getText();
        String company=cuname.getText();
        String bill=bill_no.getText();
         String query="DELETE FROM `sergical_shop`.`purchase` WHERE `su_name` = '"+cuname.getText()+"'  AND `purchase_bill_no` = '"+bill_no.getText()+"'  AND `product_name`='"+n+"' AND `catagory`='"+c+"'AND `pu_date`='"+date1+"'";
            Data_Operation1(query, "Delete"); 
        }
}
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       bill_no.setText(""+jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

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
                 if(dis.getText().isEmpty()){
                  double t=0,d=0,p=0,ft=0,du=0;
                 dis.setText("0");
            t=Double.parseDouble(stotal.getText()); 
           ft=t-d;
            ft=Math.round(ft*100.0)/100.0;
            paid.setText(""+ft);
            du=ft-p; 
            du=Math.round(du*100.0)/100.0;
            due.setText(""+du);
                 }else{
            double t=0,d=0,p=0,ft=0,du=0;
            t=Double.parseDouble(stotal.getText());
            d=Double.parseDouble(dis.getText());
            ft=t-d;
                 ft=Math.round(ft*100.0)/100.0;
              paid.setText(""+ft);
            p=Double.parseDouble(paid.getText());

du=ft-p;
        du=Math.round(du*100.0)/100.0;
            due.setText(""+du);}}
    }//GEN-LAST:event_disKeyReleased

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
      
        ((JTextField) oodate.getDateEditor().getUiComponent()).setText(""+((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
       
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange
       
       
    }//GEN-LAST:event_jComboBox1PropertyChange

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     if(jComboBox1.getSelectedIndex()>0){
            cuname.setText(""+jComboBox1.getSelectedItem());
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
       if(jComboBox4.getSelectedIndex()>0){
        jTextField3.setText(""+jComboBox5.getSelectedItem());}
      
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
if(jCheckBox1.isSelected()){
    jTextField2.setVisible(true);}else{
       jTextField2.setVisible(false);
}

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
       if(jCheckBox2.isSelected()){
    jTextField3.setVisible(true);}else{
       jTextField3.setVisible(false);
}

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
     jTextField3.setText("");
     jComboBox4.setSelectedIndex(0);
     jComboBox5.setSelectedIndex(0);
        
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
if(check.getText().equals("1")){
JOptionPane.showMessageDialog(Find, "Please Complete your submition");
}   else{         NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();}
    }//GEN-LAST:event_jLabel16MouseClicked
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
double pcheck(double b,String c,String p){
double e=0;
       try {
           String ss="SELECT `product_name` FROM `sergical_shop`.`purchase` WHERE `purchase_bill_no`='"+b+"' AND `Catagory`='"+c+"' AND `product_name`='"+p+"'";
           con.contest();
           con.st = con.ct.prepareCall(ss);
           con.rs = con.st.executeQuery(ss);
           
           if(con.rs.next()){
               JOptionPane.showMessageDialog(Find, "This product has already been Purchase for this order no.");
               
           }else{
           
           
           
           e=1;}
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
return  e;
}
    
    
    
    
    void in(String pur_order_id,String company_name,String catagory,String pur_product_name,String pur_product_price,String pur_product_quantity,String total,int gr)
{
       try {
           
         /*  
            if(billcheck()==1){
            if(pcheck(pur_order_id, catagory, pur_product_name)==1){*/
            con.contest();
           DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         
           String queryy="INSERT INTO `sergical_shop`.`purchase` (`su_name`, `purchase_bill_no`, `Catagory`, `product_name`,`pu_price`, `pu_quantity`, `payment`,`pu_date`,  `status`,`gr_number`)VALUES"
                   + "                                            ('"+company_name+"', '"+pur_order_id+"', '"+catagory+"','"+pur_product_name+"','"+pur_product_price+"', '"+pur_product_quantity+"', '"+total+"','"+((JTextField) oodate.getDateEditor().getUiComponent()).getText()+"',  'preorder','"+gr+"')";
           
          
           double   resultt=con.st.executeUpdate(queryy);
           if(resultt>0){
             
              // JOptionPane.showMessageDialog(this, "Data Add Success");
           }
            
            
            
          //  }  
             
           
          
          // }
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_page.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    
}
    
    
    void add(String query){
       try {
           con.contest();
     con.st.executeUpdate(query);
          
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
void Data_Operation(String query,String msg){
    try {  
         con.contest();
   
         
         
            double   result=con.st.executeUpdate(query);
            if(result>0){
            JOptionPane.showMessageDialog(this, "Data "+msg+" Success");
           
            Find_Data();
            if(msg.equals("Add")){  gr_num();}
          
               Datacl(); 
               
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
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
                  if(msg.equals("Add")){  gr_num();}
               
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}

public double purchasbill(){
    double p=0; 
         p=Double.parseDouble(bill_no.getText());   
return p;}

void Data_Operation2(String query,double aa){
    try {  
         con.contest();
            double   result=con.st.executeUpdate(query);
            if(result>0){ 
                    String status="Debit";
                    String details="Product Purchase || "+bill_no.getText()+" || "+cuname.getText();
                    String date1= ((JTextField) oodate.getDateEditor().getUiComponent()).getText();
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
             
               
            } else{
            
            JOptionPane.showMessageDialog(this, "Submition Failed");
            
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
                DatALLCLear();
            }else{
            JOptionPane.showMessageDialog(this, "Data "+msg+" Failed");
              
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }


}
void DatALLCLear(){ 
jComboBox1.setSelectedIndex(0);
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText(""+0);
jTextField4.setText(""+0); 
jTextField5.setText(""); 
bill_no.setText("");
cuname.setText(""); 
((JTextField) oodate.getDateEditor().getUiComponent()).setText("");
stotal.setText("");
dis.setText("0");
paid.setText("");
due.setText(""); 
jComboBox2.setSelectedIndex(0);
       buttonGroup1.clearSelection();
       bname_combo.setSelectedIndex(0);
       account_combo.setSelectedIndex(0);
       bname_combo.setVisible(false);
       account_combo.setVisible(false);
       b_labl.setVisible(false);
       acc_label.setVisible(false);
 DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);

jComboBox1.requestFocus();
Find.setText("");
jLabel6.setText("X");
jComboBox1.setEnabled(true);
jTextField1.setEnabled(true);
jDateChooser1.setEnabled(true); 
jComboBox5.removeAllItems();
check.setText("0");
} 
void Datacl(){ 
jTextField2.setText("");
jTextField3.setText(""+0);
jTextField4.setText(""+0); 
jTextField5.setText("");    
jTextField2.requestFocus();
jComboBox4.setSelectedIndex(0);
jComboBox1.setEnabled(false);
jTextField1.setEnabled(false);
jDateChooser1.setEnabled(false); 
check.setText("1");

} 
void Find_Data1(){
    try{
        tcount=0;
        count=0;
    DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
      con.contest(); 
              
             String select="SELECT `Catagory`,`product_name`, `pu_price`,`pu_quantity`,  `payment`,`gr_number` FROM `sergical_shop`.`purchase` WHERE `purchase_bill_no`='"+bill_no.getText()+"' AND `pu_date`='"+((JTextField) oodate.getDateEditor().getUiComponent()).getText()+"' AND `su_name`='"+cuname.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){  count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(6),con.rs.getString(1),con.rs.getString(2),Double.parseDouble(con.rs.getString(3)),Double.parseDouble(con.rs.getString(4)),Double.parseDouble(con.rs.getString(5))});
                  bb=Double.parseDouble(con.rs.getString(5));
                tcount=tcount+bb;
                                
           }  tcount=Math.round(tcount*100.0)/100.0; 
             stotal.setText(""+tcount);
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
    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
String date1 = sd.format(jDateChooser1.getDate()); 
      con.contest();
                    double t=Double.parseDouble(jTextField5.getText());
                   cuname.setText(jComboBox1.getSelectedItem().toString());
                bill_no.setText(jTextField1.getText());
               
                ((JTextField) oodate.getDateEditor().getUiComponent()).setText(date1); 
              //  dddate.setText(((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());    
            String select="SELECT `Catagory`,`product_name`, `pu_price`,`pu_quantity`,  `payment`,`gr_number` FROM `sergical_shop`.`purchase` WHERE `purchase_bill_no`='"+bill_no.getText()+"' AND `su_name`='"+cuname.getText()+"' AND `pu_date`='"+date1+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){  count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(6),con.rs.getString(1),con.rs.getString(2),Double.parseDouble(con.rs.getString(3)),Double.parseDouble(con.rs.getString(4)),Double.parseDouble(con.rs.getString(5))});
                          
                bb=Double.parseDouble(con.rs.getString(5));
                tcount=tcount+bb;
                                 
           }   tcount=Math.round(tcount*100.0)/100.0; 
             stotal.setText(""+tcount);
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

}
   double Authintication(){
    double e=0;
    

if(jComboBox1.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Company Name is empty");
    jComboBox1.requestFocus();
}
else if(jTextField1.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Id is empty");
    jTextField1.requestFocus();
} else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Date Is Empty");
            jDateChooser1.requestFocus();
        }  else if(jTextField2.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Product Name is empty");
    jTextField2.requestFocus();
}else if(jTextField3.getText().isEmpty()){
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
double Authintication2(){
   
double e=0;
 if(bill_no.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Bill No is empty");
    bill_no.requestFocus();
} else if (((JTextField) oodate.getDateEditor().getUiComponent()).getText().isEmpty()) {
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
     ///check e in kore
    
    e=1; 
  

}

return e;
} 
 double Authintication1(){
    double e=0;
    

 if(bill_no.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Bill No is empty");
    bill_no.requestFocus();
} else if (((JTextField) oodate.getDateEditor().getUiComponent()).getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Date Is Empty");
            oodate.requestFocus();
        }  
else if(cuname.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Company Name is empty");
    cuname.requestFocus();
} else if(jTextField2.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Product Name is empty");
    jTextField2.requestFocus();
}else if(jTextField3.getText().isEmpty()){
 JOptionPane.showMessageDialog(this, "Product Price is empty");
    jTextField3.requestFocus();
}else if(jTextField4.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Product Quantity is empty");
    jTextField4.requestFocus();
}else if(jTextField5.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Total is empty");
    jTextField5.requestFocus();
}
else if(GR_number.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "GR Number is empty");
    GR_number.requestFocus();
}else{ 
e=1;



}

return e;
} 
 
    void Find_or(){
    try{
        if(jComboBox3.getSelectedIndex()==1){
           tcount=0;
                count=0;
                DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                  con.contest();  
                  
               bill_no.setText("");
               cuname.setText("");
                  Date dtt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
        ((JTextField) oodate.getDateEditor().getUiComponent()).setText("");   
            String select="SELECT `purchase_bill_no`, `su_name`,`Catagory`,`product_name`, `pu_price`,`pu_quantity`, `payment`,`pu_date`,`gr_number` FROM `sergical_shop`.`purchase` WHERE `purchase_bill_no`='"+Find.getText()+"' AND `su_name` ='"+jComboBox1.getSelectedItem()+"' ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
   
            while(con.rs.next()){ 
                
                JOptionPane.showMessageDialog(Find, "jj");
               bill_no.setText(""+con.rs.getString(1));
               cuname.setText(""+con.rs.getString(2));
                 
            ((JTextField) oodate.getDateEditor().getUiComponent()).setText(""+con.rs.getDate(8));   
                
                
                count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(9),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(5)),Double.parseDouble(con.rs.getString(6)),Double.parseDouble(con.rs.getString(7))});
                 bb=Double.parseDouble(con.rs.getString(7));
                tcount=tcount+bb;
                                 
           }
              tcount=Math.round(tcount*100.0)/100.0;
              stotal.setText(""+tcount); 
            if(billcheckfor_pu_search()==1){
                 
               
            jLabel6.setText("*");
            
            } 
        }else if(jComboBox3.getSelectedIndex()==2){
           tcount=0;
                count=0;
                DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                  con.contest();
                  
                  
                  
                 
               bill_no.setText("");
               cuname.setText("");
                  Date dtt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
             ((JTextField) oodate.getDateEditor().getUiComponent()).setText("");   
                
                   
            String select="SELECT `pur_order_id`, `company_name`,`catagory`,`pur_product_name`,  `pur_product_price`, `pur_product_quantity`, `total`,`gr_number` FROM `sergical_shop`.`purchase_order` WHERE `pur_order_id`='"+Find.getText()+"' AND `status`='order' `company_name` ='"+jComboBox1.getSelectedItem()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
       
            while(con.rs.next()){ 
                
                
               bill_no.setText(""+con.rs.getString(1));
               cuname.setText(""+con.rs.getString(2));
                 
                ((JTextField) oodate.getDateEditor().getUiComponent()).setText(""+df.format(dtt));   
                
                
                count=count+1;
                dt.addRow(new Object[]{count,con.rs.getString(8),con.rs.getString(3),con.rs.getString(4),Double.parseDouble(con.rs.getString(5)),Double.parseDouble(con.rs.getString(6)),Double.parseDouble(con.rs.getString(7))});
                           
                bb=Double.parseDouble(con.rs.getString(7));
                
                
                tcount=tcount+bb;
                                 
           }  tcount=Math.round(tcount*100.0)/100.0; 
             stotal.setText(""+tcount);
        }
        
             
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    void show_suplierName(){
    try{
        jComboBox1.removeAllItems();
        jComboBox1.addItem(" ");
            con.contest();
            String select=" SELECT `su_company_name` FROM `sergical_shop`.`suplier_table` order by `su_company_name` asc ";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           jComboBox1.addItem(""+con.rs.getString(1));  }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
     void show_catagory(){
    try{
        jComboBox2.removeAllItems();
        jComboBox2.addItem(" ");
            con.contest();
            String select="SELECT `category`FROM `sergical_shop`.`category_table` ORDER BY `category` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){
           jComboBox2.addItem(""+con.rs.getString(1)); }
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
            java.util.logging.Logger.getLogger(Purchase_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Purchase_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Find;
    private javax.swing.JTextField GR_number;
    private javax.swing.JButton Update_Data;
    private javax.swing.JLabel acc_label;
    private javax.swing.JComboBox<String> account_combo;
    private javax.swing.JLabel b_labl;
    private javax.swing.JLabel bill_no;
    private javax.swing.JComboBox<String> bname_combo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel check;
    private javax.swing.JLabel cuname;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JDesktopPane desktopPane1;
    private javax.swing.JTextField dis;
    private javax.swing.JTextField due;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private com.toedter.calendar.JDateChooser oodate;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField stotal;
    private javax.swing.JButton submitionbutton;
    private javax.swing.JLabel total_leve;
    private javax.swing.JLabel total_leve1;
    private javax.swing.JLabel total_leve2;
    private javax.swing.JLabel total_leve3;
    // End of variables declaration//GEN-END:variables
}

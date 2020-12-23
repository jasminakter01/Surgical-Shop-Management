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

public class Cash_Data extends javax.swing.JFrame {
    Connection_Class con; 
    int count = 0;
    double tcount = 0, cr = 0, de = 0, aa;
    double b1 = 0, c1 = 0;

    public Cash_Data() {
        initComponents();
          AutoCompleteDecorator.decorate(bname_combo1);
             AutoCompleteDecorator.decorate(account_combo1);
        con = new Connection_Class();
        show_date();
        show_ban1();
        show_data_table();
        show_data_table_saving();
        Loan_Show();

    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ammount_lab = new javax.swing.JLabel();
        debi_lab = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        credit_la = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        desktopPane3 = new javax.swing.JDesktopPane();
        From_date = new com.toedter.calendar.JDateChooser();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        To_date = new com.toedter.calendar.JDateChooser();
        jRadioButton2_c = new javax.swing.JRadioButton();
        ammount_txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        datilse_txt = new javax.swing.JTextField();
        jRadioButton2_d = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ammount_lab1 = new javax.swing.JLabel();
        debi_lab1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        credit_la1 = new javax.swing.JLabel();
        desktopPane2 = new javax.swing.JDesktopPane();
        bname_combo1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        account_combo1 = new javax.swing.JComboBox<>();
        ammount_txt4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        ammount_txt3 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        desktopPane4 = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        desktopPane5 = new javax.swing.JDesktopPane();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        From_date1 = new com.toedter.calendar.JDateChooser();
        To_date1 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ammount_lab2 = new javax.swing.JLabel();
        debi_lab2 = new javax.swing.JLabel();
        credit_la2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        ammount_lab3 = new javax.swing.JLabel();
        salse_lab3 = new javax.swing.JLabel();
        purchase_lab3 = new javax.swing.JLabel();
        ammount_lab4 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        credit_la4 = new javax.swing.JLabel();
        debi_lab4 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        From_date3 = new com.toedter.calendar.JDateChooser();
        To_date2 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        Loan_Show_Table = new javax.swing.JTable();
        loan_radio_debit = new javax.swing.JRadioButton();
        loan_radio_all = new javax.swing.JRadioButton();
        loan_radio_credit = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        ammount_lab5 = new javax.swing.JLabel();
        debi_lab3 = new javax.swing.JLabel();
        credit_la3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(0, 51, 153));
        jPanel4.setLayout(null);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 610, 240, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(944, 4, 410, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(950, 610, 110, 20);

        ammount_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ammount_lab.setForeground(new java.awt.Color(255, 255, 255));
        ammount_lab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ammount_lab.setText("amunt");
        jPanel1.add(ammount_lab);
        ammount_lab.setBounds(1060, 610, 270, 20);

        debi_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        debi_lab.setForeground(new java.awt.Color(255, 255, 255));
        debi_lab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        debi_lab.setText("Debit");
        jPanel1.add(debi_lab);
        debi_lab.setBounds(1060, 580, 270, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Debit");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(950, 580, 110, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Credit");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(950, 550, 110, 20);

        credit_la.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        credit_la.setForeground(new java.awt.Color(255, 255, 255));
        credit_la.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        credit_la.setText("Credit");
        jPanel1.add(credit_la);
        credit_la.setBounds(1060, 550, 270, 20);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 90, 110);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL", "Date", "Details", "Status", "Ammount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 1310, 260);

        jPanel2.setBackground(new java.awt.Color(61, 42, 127));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), "Show", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        From_date.setDateFormatString("yyyy-MM-dd");
        From_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                From_datePropertyChange(evt);
            }
        });
        desktopPane3.add(From_date);
        From_date.setBounds(850, 100, 140, 30);

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Sales");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        desktopPane3.add(jRadioButton2);
        jRadioButton2.setBounds(940, 70, 60, 25);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Purchase");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        desktopPane3.add(jRadioButton1);
        jRadioButton1.setBounds(850, 70, 89, 25);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("All");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        desktopPane3.add(jRadioButton3);
        jRadioButton3.setBounds(1000, 70, 50, 25);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setText("Show All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        desktopPane3.add(jButton6);
        jButton6.setBounds(1170, 90, 150, 40);

        To_date.setDateFormatString("yyyy-MM-dd");
        To_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                To_datePropertyChange(evt);
            }
        });
        desktopPane3.add(To_date);
        To_date.setBounds(1000, 100, 130, 30);

        jPanel2.add(desktopPane3);
        desktopPane3.setBounds(-830, -10, 2200, 730);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(830, 120, 500, 150);

        buttonGroup1.add(jRadioButton2_c);
        jRadioButton2_c.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2_c.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2_c.setText("Credit");
        desktopPane.add(jRadioButton2_c);
        jRadioButton2_c.setBounds(610, 90, 79, 31);

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
        desktopPane.add(ammount_txt);
        ammount_txt.setBounds(140, 90, 370, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ammount");
        desktopPane.add(jLabel14);
        jLabel14.setBounds(140, 70, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date               ");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(140, 20, 110, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Details");
        desktopPane.add(jLabel15);
        jLabel15.setBounds(520, 20, 100, 20);

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
        desktopPane.add(datilse_txt);
        datilse_txt.setBounds(520, 40, 370, 30);

        buttonGroup1.add(jRadioButton2_d);
        jRadioButton2_d.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2_d.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2_d.setText("Debit");
        desktopPane.add(jRadioButton2_d);
        jRadioButton2_d.setBounds(520, 90, 73, 31);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        desktopPane.add(jDateChooser1);
        jDateChooser1.setBounds(140, 40, 370, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton3);
        jButton3.setBounds(350, 150, 120, 30);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Loan");
        desktopPane.add(jCheckBox1);
        jCheckBox1.setBounds(240, 150, 69, 31);

        jPanel1.add(desktopPane);
        desktopPane.setBounds(0, 0, 1380, 720);

        jTabbedPane1.addTab("Cash Data", jPanel1);

        jPanel5.setBackground(new java.awt.Color(61, 42, 127));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL", "Date", "Details", "Status", "Ammount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(40, 330, 1310, 260);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setText("Show All");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8);
        jButton8.setBounds(1190, 280, 150, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(400, 610, 240, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(jLabel4);
        jLabel4.setBounds(944, 4, 410, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Amount :");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(960, 650, 110, 20);

        ammount_lab1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ammount_lab1.setForeground(new java.awt.Color(255, 255, 255));
        ammount_lab1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel5.add(ammount_lab1);
        ammount_lab1.setBounds(1070, 650, 270, 20);

        debi_lab1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        debi_lab1.setForeground(new java.awt.Color(255, 255, 255));
        debi_lab1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel5.add(debi_lab1);
        debi_lab1.setBounds(1070, 620, 270, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Debit");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(960, 620, 110, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Credit");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(960, 590, 110, 20);

        credit_la1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        credit_la1.setForeground(new java.awt.Color(255, 255, 255));
        credit_la1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel5.add(credit_la1);
        credit_la1.setBounds(1070, 590, 270, 20);

        bname_combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        bname_combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bname_combo1ActionPerformed(evt);
            }
        });
        desktopPane2.add(bname_combo1);
        bname_combo1.setBounds(450, 90, 360, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Amount(TK)");
        desktopPane2.add(jLabel22);
        jLabel22.setBounds(640, 180, 100, 20);

        account_combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        account_combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_combo1ActionPerformed(evt);
            }
        });
        desktopPane2.add(account_combo1);
        account_combo1.setBounds(450, 140, 360, 30);

        ammount_txt4.setEditable(false);
        ammount_txt4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ammount_txt4FocusGained(evt);
            }
        });
        ammount_txt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ammount_txt4MouseClicked(evt);
            }
        });
        ammount_txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ammount_txt4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ammount_txt4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ammount_txt4KeyTyped(evt);
            }
        });
        desktopPane2.add(ammount_txt4);
        ammount_txt4.setBounds(640, 200, 130, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Bank Name");
        desktopPane2.add(jLabel20);
        jLabel20.setBounds(450, 70, 100, 20);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Amount(%)");
        desktopPane2.add(jLabel23);
        jLabel23.setBounds(490, 180, 100, 20);

        jDateChooser3.setDateFormatString("yyyy-MM-dd");
        jDateChooser3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser3PropertyChange(evt);
            }
        });
        desktopPane2.add(jDateChooser3);
        jDateChooser3.setBounds(450, 30, 360, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Account Number");
        desktopPane2.add(jLabel21);
        jLabel21.setBounds(450, 120, 100, 20);

        ammount_txt3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ammount_txt3FocusGained(evt);
            }
        });
        ammount_txt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ammount_txt3MouseClicked(evt);
            }
        });
        ammount_txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ammount_txt3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ammount_txt3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ammount_txt3KeyTyped(evt);
            }
        });
        desktopPane2.add(ammount_txt3);
        ammount_txt3.setBounds(490, 200, 130, 30);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("Send Bank");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        desktopPane2.add(jButton11);
        jButton11.setBounds(510, 250, 250, 40);

        jPanel7.setBackground(new java.awt.Color(61, 42, 127));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Send Bank", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(null);
        jPanel7.add(desktopPane4);
        desktopPane4.setBounds(0, 0, 1370, 720);

        desktopPane2.add(jPanel7);
        jPanel7.setBounds(390, 10, 490, 290);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        desktopPane2.add(jLabel8);
        jLabel8.setBounds(140, 10, 250, 50);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        desktopPane2.add(jLabel13);
        jLabel13.setBounds(0, 0, 90, 110);

        jPanel5.add(desktopPane2);
        desktopPane2.setBounds(0, 0, 1350, 700);

        jTabbedPane1.addTab("Send Bank", jPanel5);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        desktopPane5.add(jLabel16);
        jLabel16.setBounds(140, 10, 250, 50);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        desktopPane5.add(jLabel17);
        jLabel17.setBounds(0, 0, 90, 110);

        From_date1.setDateFormatString("yyyy-MM-dd");
        From_date1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                From_date1PropertyChange(evt);
            }
        });
        desktopPane5.add(From_date1);
        From_date1.setBounds(170, 70, 320, 30);

        To_date1.setDateFormatString("yyyy-MM-dd");
        To_date1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                To_date1PropertyChange(evt);
            }
        });
        desktopPane5.add(To_date1);
        To_date1.setBounds(530, 70, 320, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Amount :");
        desktopPane5.add(jLabel18);
        jLabel18.setBounds(490, 280, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Debit");
        desktopPane5.add(jLabel5);
        jLabel5.setBounds(490, 250, 110, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Credit");
        desktopPane5.add(jLabel19);
        jLabel19.setBounds(490, 220, 110, 20);

        ammount_lab2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ammount_lab2.setForeground(new java.awt.Color(255, 255, 255));
        ammount_lab2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desktopPane5.add(ammount_lab2);
        ammount_lab2.setBounds(600, 280, 270, 20);

        debi_lab2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        debi_lab2.setForeground(new java.awt.Color(255, 255, 255));
        debi_lab2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desktopPane5.add(debi_lab2);
        debi_lab2.setBounds(600, 250, 270, 20);

        credit_la2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        credit_la2.setForeground(new java.awt.Color(255, 255, 255));
        credit_la2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desktopPane5.add(credit_la2);
        credit_la2.setBounds(600, 220, 270, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cash  :");
        desktopPane5.add(jLabel24);
        jLabel24.setBounds(490, 440, 110, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Sales");
        desktopPane5.add(jLabel25);
        jLabel25.setBounds(490, 380, 110, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Purchase");
        desktopPane5.add(jLabel26);
        jLabel26.setBounds(490, 410, 110, 30);

        ammount_lab3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ammount_lab3.setForeground(new java.awt.Color(255, 255, 255));
        ammount_lab3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desktopPane5.add(ammount_lab3);
        ammount_lab3.setBounds(600, 440, 270, 30);

        salse_lab3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salse_lab3.setForeground(new java.awt.Color(255, 255, 255));
        salse_lab3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desktopPane5.add(salse_lab3);
        salse_lab3.setBounds(600, 380, 270, 30);

        purchase_lab3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        purchase_lab3.setForeground(new java.awt.Color(255, 255, 255));
        purchase_lab3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desktopPane5.add(purchase_lab3);
        purchase_lab3.setBounds(600, 410, 270, 30);

        ammount_lab4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ammount_lab4.setForeground(new java.awt.Color(255, 255, 255));
        ammount_lab4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desktopPane5.add(ammount_lab4);
        ammount_lab4.setBounds(670, 590, 270, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Profite :");
        desktopPane5.add(jLabel27);
        jLabel27.setBounds(480, 590, 110, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Purchase Ammount");
        desktopPane5.add(jLabel28);
        jLabel28.setBounds(480, 560, 210, 20);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Sales Ammount");
        desktopPane5.add(jLabel29);
        jLabel29.setBounds(480, 530, 190, 20);

        credit_la4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        credit_la4.setForeground(new java.awt.Color(255, 255, 255));
        credit_la4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desktopPane5.add(credit_la4);
        credit_la4.setBounds(660, 530, 270, 20);

        debi_lab4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        debi_lab4.setForeground(new java.awt.Color(255, 255, 255));
        debi_lab4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desktopPane5.add(debi_lab4);
        debi_lab4.setBounds(660, 560, 270, 20);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("*Total Sales Wise without account");
        desktopPane5.add(jLabel30);
        jLabel30.setBounds(380, 470, 480, 30);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("*Total Accounts");
        desktopPane5.add(jLabel31);
        jLabel31.setBounds(440, 170, 300, 30);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("*Total Accounts Purchase And Sales Wise");
        desktopPane5.add(jLabel32);
        jLabel32.setBounds(390, 330, 400, 40);

        jTabbedPane1.addTab("Purchase/Sales wise profit", desktopPane5);

        jPanel3.setLayout(null);
        jPanel3.add(jDesktopPane1);
        jDesktopPane1.setBounds(687, 5, 100, 100);

        From_date3.setDateFormatString("yyyy-MM-dd");
        From_date3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                From_date3PropertyChange(evt);
            }
        });
        jDesktopPane2.add(From_date3);
        From_date3.setBounds(230, 90, 140, 30);

        To_date2.setDateFormatString("yyyy-MM-dd");
        To_date2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                To_date2PropertyChange(evt);
            }
        });
        jDesktopPane2.add(To_date2);
        To_date2.setBounds(380, 90, 130, 30);

        Loan_Show_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL", "Date", "Details", "Status", "Ammount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Loan_Show_Table);
        if (Loan_Show_Table.getColumnModel().getColumnCount() > 0) {
            Loan_Show_Table.getColumnModel().getColumn(0).setPreferredWidth(20);
            Loan_Show_Table.getColumnModel().getColumn(2).setResizable(false);
            Loan_Show_Table.getColumnModel().getColumn(2).setPreferredWidth(200);
            Loan_Show_Table.getColumnModel().getColumn(3).setResizable(false);
            Loan_Show_Table.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jDesktopPane2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 170, 1330, 380);

        buttonGroup3.add(loan_radio_debit);
        loan_radio_debit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loan_radio_debit.setForeground(new java.awt.Color(255, 255, 255));
        loan_radio_debit.setText("Debit");
        loan_radio_debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_radio_debitActionPerformed(evt);
            }
        });
        jDesktopPane2.add(loan_radio_debit);
        loan_radio_debit.setBounds(330, 50, 80, 31);

        buttonGroup3.add(loan_radio_all);
        loan_radio_all.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loan_radio_all.setForeground(new java.awt.Color(255, 255, 255));
        loan_radio_all.setText("All");
        jDesktopPane2.add(loan_radio_all);
        loan_radio_all.setBounds(420, 50, 80, 31);

        buttonGroup3.add(loan_radio_credit);
        loan_radio_credit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loan_radio_credit.setForeground(new java.awt.Color(255, 255, 255));
        loan_radio_credit.setText("Credit");
        jDesktopPane2.add(loan_radio_credit);
        loan_radio_credit.setBounds(240, 50, 80, 31);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Debit");
        jDesktopPane2.add(jLabel33);
        jLabel33.setBounds(950, 590, 110, 20);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Credit");
        jDesktopPane2.add(jLabel34);
        jLabel34.setBounds(950, 560, 110, 20);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Amount :");
        jDesktopPane2.add(jLabel35);
        jLabel35.setBounds(950, 620, 110, 20);

        ammount_lab5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ammount_lab5.setForeground(new java.awt.Color(255, 255, 255));
        ammount_lab5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ammount_lab5.setText("amunt");
        jDesktopPane2.add(ammount_lab5);
        ammount_lab5.setBounds(1060, 620, 270, 20);

        debi_lab3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        debi_lab3.setForeground(new java.awt.Color(255, 255, 255));
        debi_lab3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        debi_lab3.setText("Debit");
        jDesktopPane2.add(debi_lab3);
        debi_lab3.setBounds(1060, 590, 270, 20);

        credit_la3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        credit_la3.setForeground(new java.awt.Color(255, 255, 255));
        credit_la3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        credit_la3.setText("Credit");
        jDesktopPane2.add(credit_la3);
        credit_la3.setBounds(1060, 560, 270, 20);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButton4);
        jButton4.setBounds(400, 620, 240, 40);

        jPanel3.add(jDesktopPane2);
        jDesktopPane2.setBounds(0, -1, 1360, 690);

        jTabbedPane1.addTab("Show Loan", jPanel3);

        jPanel4.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1360, 730);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1360, 730);

        setSize(new java.awt.Dimension(1358, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     void find() {

        count = 0;
        cr = 0;
        de = 0;
        try {
            if (!((JTextField) From_date.getDateEditor().getUiComponent()).getText().isEmpty()) {

                String status = "";
                if (jRadioButton1.isSelected()) {
                    status = "Product Purchase";
                } else if (jRadioButton2.isSelected()) {
                    status = "Product Sales ";
                } else if (jRadioButton3.isSelected()) {
                    status = "All";
                } else {
                    status = "";
                }
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(From_date.getDate());
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                con.contest();
                if (status.equals("All") || status.equals("")) {

                    String select = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `date`='" + date1 + "'";

                    con.st = con.ct.prepareCall(select);
                    con.rs = con.st.executeQuery(select);
                    while (con.rs.next()) {
                        count = count + 1;
                        if (con.rs.getString(3).equals("Credit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            cr = cr + aa;
                        } else if (con.rs.getString(3).equals("Debit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            de = de + aa;
                        }
                        dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});
                    }
                    cr = Math.round(cr * 100.0) / 100.0;
                    credit_la.setText("" + cr);
                    de = Math.round(de * 100.0) / 100.0;
                    debi_lab.setText("" + de);
                    de = cr - de;
                    de = Math.round(de * 100.0) / 100.0;
                    ammount_lab.setText("" + de);

                } else {

                    String select = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `date`='" + date1 + "' AND `detailse`LIKE'" + status + "%'";

                    con.st = con.ct.prepareCall(select);
                    con.rs = con.st.executeQuery(select);
                    while (con.rs.next()) {
                        count = count + 1;
                        if (con.rs.getString(3).equals("Credit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            cr = cr + aa;
                        } else if (con.rs.getString(3).equals("Debit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            de = de + aa;
                        }
                        dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});
                    }
                    cr = Math.round(cr * 100.0) / 100.0;
                    credit_la.setText("" + cr);
                    de = Math.round(de * 100.0) / 100.0;
                    debi_lab.setText("" + de);
                    de = cr - de;
                    de = Math.round(de * 100.0) / 100.0;
                    ammount_lab.setText("" + de);
                    
                    
                     

                }

            }  if (!((JTextField) From_date.getDateEditor().getUiComponent()).getText().isEmpty() && !((JTextField) To_date.getDateEditor().getUiComponent()).getText().isEmpty()) {
 
                String status = "";
                if (jRadioButton1.isSelected()) {
                    status = "Product Purchase";
                } else if (jRadioButton2.isSelected()) {
                    status = "Product Sales ";
                } else if (jRadioButton3.isSelected()) {
                    status = "All";
                } else {
                    status = "";
                }
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date2 = sd.format(From_date.getDate());
                String date1 = sd.format(To_date.getDate());
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                con.contest();
                if (status.equals("All") || status.equals("")) {

                    String select = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `date`>='" + date2+ "' AND `date`<='" + date1 + "'";

                    con.st = con.ct.prepareCall(select);
                    con.rs = con.st.executeQuery(select);
                    while (con.rs.next()) {
                        count = count + 1;
                        if (con.rs.getString(3).equals("Credit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            cr = cr + aa;
                        } else if (con.rs.getString(3).equals("Debit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            de = de + aa;
                        }
                        dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});
                    }
                    cr = Math.round(cr * 100.0) / 100.0;
                    credit_la.setText("" + cr);
                    de = Math.round(de * 100.0) / 100.0;
                    debi_lab.setText("" + de);
                    de = cr - de;
                    de = Math.round(de * 100.0) / 100.0;
                    ammount_lab.setText("" + de);

                } else {

                    String select = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `date`>='" + date2+ "' AND `date`<='" + date1 + "' AND `detailse`LIKE'" + status + "%'";

                    con.st = con.ct.prepareCall(select);
                    con.rs = con.st.executeQuery(select);
                    while (con.rs.next()) {
                        count = count + 1;
                        if (con.rs.getString(3).equals("Credit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            cr = cr + aa;
                        } else if (con.rs.getString(3).equals("Debit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            de = de + aa;
                        }
                        dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});
                    }
                    cr = Math.round(cr * 100.0) / 100.0;
                    credit_la.setText("" + cr);
                    de = Math.round(de * 100.0) / 100.0;
                    debi_lab.setText("" + de);
                    de = cr - de;
                    de = Math.round(de * 100.0) / 100.0;
                    ammount_lab.setText("" + de);

                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void findMonth() {

        count = 0;
        cr = 0;
        de = 0;
        try {
            if (!((JTextField) From_date.getDateEditor().getUiComponent()).getText().isEmpty()) {

                String status = "";
                if (jRadioButton1.isSelected()) {
                    status = "Product Purchase";
                } else if (jRadioButton2.isSelected()) {
                    status = "Product Sales ";
                } else if (jRadioButton3.isSelected()) {
                    status = "All";
                } else {
                    status = "";
                }
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date1 = sd.format(From_date.getDate());
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                con.contest();
                if (status.equals("All") || status.equals("")) {

                    String select = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `date`LIKE'" + date1 + "%'";

                    con.st = con.ct.prepareCall(select);
                    con.rs = con.st.executeQuery(select);
                    while (con.rs.next()) {
                        count = count + 1;
                        if (con.rs.getString(3).equals("Credit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            cr = cr + aa;
                        } else if (con.rs.getString(3).equals("Debit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            de = de + aa;
                        }
                        dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});
                    }
                    cr = Math.round(cr * 100.0) / 100.0;
                    credit_la.setText("" + cr);
                    de = Math.round(de * 100.0) / 100.0;
                    debi_lab.setText("" + de);
                    de = cr - de;
                    de = Math.round(de * 100.0) / 100.0;
                    ammount_lab.setText("" + de);

                } else {

                    String select = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `date`LIKE'" + date1 + "%' AND `detailse`LIKE'" + status + "%'";

                    con.st = con.ct.prepareCall(select);
                    con.rs = con.st.executeQuery(select);
                    while (con.rs.next()) {
                        count = count + 1;
                        if (con.rs.getString(3).equals("Credit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            cr = cr + aa;
                        } else if (con.rs.getString(3).equals("Debit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            de = de + aa;
                        }
                        dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});
                    }
                    cr = Math.round(cr * 100.0) / 100.0;
                    credit_la.setText("" + cr);
                    de = Math.round(de * 100.0) / 100.0;
                    debi_lab.setText("" + de);
                    de = cr - de;
                    de = Math.round(de * 100.0) / 100.0;
                    ammount_lab.setText("" + de);

                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void findYear() {

        count = 0;
        cr = 0;
        de = 0;
        try {
            if (!((JTextField) From_date.getDateEditor().getUiComponent()).getText().isEmpty()) {

                String status = "";
                if (jRadioButton1.isSelected()) {
                    status = "Product Purchase";
                } else if (jRadioButton2.isSelected()) {
                    status = "Product Sales ";
                } else if (jRadioButton3.isSelected()) {
                    status = "All";
                } else {
                    status = "";
                }
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date1 = sd.format(From_date.getDate());
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
                con.contest();
                if (status.equals("All") || status.equals("")) {

                    String select = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `date`LIKE'%" + date1 + "%'";

                    con.st = con.ct.prepareCall(select);
                    con.rs = con.st.executeQuery(select);
                    while (con.rs.next()) {
                        count = count + 1;
                        if (con.rs.getString(3).equals("Credit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            cr = cr + aa;
                        } else if (con.rs.getString(3).equals("Debit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            de = de + aa;
                        }
                        dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});
                    }
                    cr = Math.round(cr * 100.0) / 100.0;
                    credit_la.setText("" + cr);
                    de = Math.round(de * 100.0) / 100.0;
                    debi_lab.setText("" + de);
                    de = cr - de;
                    de = Math.round(de * 100.0) / 100.0;
                    ammount_lab.setText("" + de);

                } else {

                    String select = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `date`LIKE'%" + date1 + "%' AND `detailse`LIKE'" + status + "%'";

                    con.st = con.ct.prepareCall(select);
                    con.rs = con.st.executeQuery(select);
                    while (con.rs.next()) {
                        count = count + 1;
                        if (con.rs.getString(3).equals("Credit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            cr = cr + aa;
                        } else if (con.rs.getString(3).equals("Debit")) {
                            aa = Double.parseDouble(con.rs.getString(4));
                            de = de + aa;
                        }
                        dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});
                    }
                    cr = Math.round(cr * 100.0) / 100.0;
                    credit_la.setText("" + cr);
                    de = Math.round(de * 100.0) / 100.0;
                    debi_lab.setText("" + de);
                    de = cr - de;
                    de = Math.round(de * 100.0) / 100.0;
                    ammount_lab.setText("" + de);

                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        jLabel1.setText("" + df.format(dt));
              jLabel4.setText("" + df.format(dt));
    }
    
    int auth_data_entry() {
        int r = 0;
        String status = "";
        if (jRadioButton2_d.isSelected()) {
            status = "Debit";
        } else if (jRadioButton2_c.isSelected()) {
            status = "Credit";
        } else {
            status = "";
        }

        if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date Is Empty");
            jDateChooser1.requestFocus();
        } else if (ammount_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ammount is Empty");
            ammount_txt.requestFocus();
        } else if (datilse_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Details is Empty");
            datilse_txt.requestFocus();
        } else if (status.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select Debit or Credit");

        } else {

            r = 1;

        }

        return r;
    }

    void bank_data_add(String query, String msg) {
        try {
            con.contest();
            int result = con.st.executeUpdate(query);
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Data " + msg + " Success");

            } else {
                JOptionPane.showMessageDialog(this, "Data " + msg + " Failed");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void show_data_table() {
        count = 0;
        cr = 0;
        de = 0;
        try {
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            con.contest();
            String s = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table`";

            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            while (con.rs.next()) {
                count = count + 1;
                if (con.rs.getString(3).equals("Credit")) {
                    aa = Double.parseDouble(con.rs.getString(4));
                    cr = cr + aa;
                } else if (con.rs.getString(3).equals("Debit")) {
                    aa = Double.parseDouble(con.rs.getString(4));
                    de = de + aa;
                }

                dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});

            }
            cr = Math.round(cr * 100.0) / 100.0;
            credit_la.setText("" + cr);
            de = Math.round(de * 100.0) / 100.0;
            debi_lab.setText("" + de);

            de = cr - de;
            de = Math.round(de * 100.0) / 100.0;
            ammount_lab.setText("" + de);
        } catch (SQLException ex) {
            Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void show_data_table_saving() {
        count = 0;
        cr = 0;
        de = 0;
        try {
            DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
            dt.setRowCount(0);
            con.contest();
            String s = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `detailse`='Send 5% ammount for saving from cash' ORDER BY `date` DESC";

            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            while (con.rs.next()) {
                count = count + 1;
                if (con.rs.getString(3).equals("Credit")) {
                    aa = Double.parseDouble(con.rs.getString(4));
                    cr = cr + aa;
                } else if (con.rs.getString(3).equals("Debit")) {
                    aa = Double.parseDouble(con.rs.getString(4));
                    de = de + aa;
                }

                dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});

            }
            cr = Math.round(cr * 100.0) / 100.0;
            credit_la1.setText("" + cr);
            de = Math.round(de * 100.0) / 100.0;
            debi_lab1.setText("" + de);

           // de = cr - de;
           // de = Math.round(de * 100.0) / 100.0;
          //  ammount_lab1.setText("" + de);
          ammount_lab1.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void cash_dataEntry_add(String query, String msg) {
        try {
            con.contest();
            int result = con.st.executeUpdate(query);
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Data " + msg + " Success"); 
                buttonGroup1.clearSelection();
                datilse_txt.setText("");
                ammount_txt.setText("");
                ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
                show_data_table_saving();
            } else {
                JOptionPane.showMessageDialog(this, "Data " + msg + " Failed");   

            }

        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void cash_dataEntry_add2(String query, String msg) {
        try {
            con.contest();
            int result = con.st.executeUpdate(query);
            if (result > 0) {
                String status = "Credit";
                String details = "5% ammount for saving from cash";
               // String ammount = ammount_txt4.getText();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser3.getDate());
               double parsentage=Double.parseDouble(ammount_txt4.getText());

                String in = "INSERT INTO `sergical_shop`.`bank_data`  (`bank_name`,`account_number`,`status`,`detailse`,`date`,`ammount`) VALUES ('" + bname_combo1.getSelectedItem() + "', '" + account_combo1.getSelectedItem() + "','" + status + "','" + details + "','" + date1 + "','" + parsentage + "')";
               // cash_dataEntry_add(in, "Submition");
              result = con.st.executeUpdate(in);
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Data Submition Success");
 
               bname_combo1.setSelectedIndex(0);
                 
                ammount_txt3.setText("0");
                ammount_txt4.setText("");
                ((JTextField) jDateChooser3.getDateEditor().getUiComponent()).setText("");
                show_data_table_saving();
            } else {
                JOptionPane.showMessageDialog(this, "Data Submition Failed");

            }
            } else {
                JOptionPane.showMessageDialog(this, "Data " + msg + " Failed");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Table.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void show_ban1() {

        try {
            bname_combo1.removeAllItems();
            bname_combo1.addItem("Select");
            con.contest();
            String s = "SELECT `name` FROM `sergical_shop`.`bank_name`";

            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            while (con.rs.next()) {
                bname_combo1.addItem("" + con.rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void show_accou1() {

        try {
            account_combo1.removeAllItems();
            account_combo1.addItem("Select");
            con.contest();
            String s = "select `number` from `sergical_shop`.`bank_name` where `name`='" + bname_combo1.getSelectedItem() + "'";
            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            while (con.rs.next()) {
                account_combo1.addItem("" + con.rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jDateChooser3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser3PropertyChange

        if (!((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            try {
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser3.getDate());
                DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
                credit_la1.setText("");
                debi_lab1.setText("");
                ammount_lab1.setText("");
                cr=0;de=0;aa=0;
                dt.setRowCount(0);
                con.contest();

                String select = "SELECT `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `date`='" + date1 + "' AND `detailse`LIKE'Product Sales %'";

                con.st = con.ct.prepareCall(select);
                con.rs = con.st.executeQuery(select);
                while (con.rs.next()) {
                    count = count + 1;
                    if (con.rs.getString(3).equals("Credit")) {
                        aa = Double.parseDouble(con.rs.getString(4));
                        cr = cr + aa;
                    } else if (con.rs.getString(3).equals("Debit")) {
                        aa = Double.parseDouble(con.rs.getString(4));
                        de = de + aa;
                    }
                    dt.addRow(new Object[]{count, con.rs.getDate(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4))});
                }
                cr = Math.round(cr * 100.0) / 100.0;
                credit_la1.setText("" + cr);
                de = Math.round(de * 100.0) / 100.0;
                debi_lab1.setText("" + de);
                de = cr - de;
                de = Math.round(de * 100.0) / 100.0;
                ammount_lab1.setText("" + de);
            } catch (SQLException ex) {
                Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jDateChooser3PropertyChange

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        if (bname_combo1.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this, "Bank Name is Empty");
            bname_combo1.requestFocus();
        } else if (account_combo1.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this, "Account Number is Empty");
            account_combo1.requestFocus();
        } else if (ammount_txt3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ammount is Empty");
            ammount_txt3.requestFocus();
        } else if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date Is Empty");
            jDateChooser3.requestFocus();
        } else {
            String status = "Debit";
            String details = "Send 5% ammount for saving from cash";
            String ammount = ammount_txt3.getText();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sd.format(jDateChooser3.getDate());
            //double parsentage = Double.parseDouble(ammount);
            //double dayammount = Double.parseDouble(credit_la1.getText());
           // parsentage = (dayammount / 100) * parsentage;
           // parsentage=Math.round(parsentage*100.0)/100.0;
          double parsentage=Double.parseDouble(ammount_txt4.getText());
            String in = "INSERT INTO `sergical_shop`.`cash_table`(`date`,`ammount`,`status`,`detailse`)VALUES ('" + date1 + "', '" + parsentage + "',  '" + status + "', '"+details+"')";
            cash_dataEntry_add2(in, "Submition");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void ammount_txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txt3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txt3KeyTyped

    private void ammount_txt3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txt3KeyReleased
        if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date Is Empty");
            jDateChooser3.requestFocus();
        }else{
            String ammount = ammount_txt3.getText();
           double parsentage = Double.parseDouble(ammount);
            double dayammount = Double.parseDouble(credit_la1.getText());
            parsentage = (dayammount / 100) * parsentage;
       parsentage=Math.round(parsentage*100.0)/100.0;
            ammount_txt4.setText(""+parsentage);

        }
    }//GEN-LAST:event_ammount_txt3KeyReleased

    private void ammount_txt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txt3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txt3KeyPressed

    private void ammount_txt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ammount_txt3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txt3MouseClicked

    private void ammount_txt3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ammount_txt3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txt3FocusGained

    private void bname_combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bname_combo1ActionPerformed
        show_accou1();
    }//GEN-LAST:event_bname_combo1ActionPerformed

    private void account_combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_combo1ActionPerformed

    private void ammount_txt4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ammount_txt4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txt4FocusGained

    private void ammount_txt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ammount_txt4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txt4MouseClicked

    private void ammount_txt4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txt4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txt4KeyPressed

    private void ammount_txt4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txt4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txt4KeyReleased

    private void ammount_txt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txt4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txt4KeyTyped

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        show_data_table_saving();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (auth_data_entry() == 1) {
            String status = "";

            if (jRadioButton2_c.isSelected()) {
                status = "Credit";
            } else if (jRadioButton2_d.isSelected()) {
                status = "Debit";
            } else {
                status = "";
            }
            String details="";
            if(jCheckBox1.isSelected()){
          details ="Loan || "+datilse_txt.getText();
            JOptionPane.showConfirmDialog(this, "jj");
            }else{   details =datilse_txt.getText();}
           
            String ammount = ammount_txt.getText();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sd.format(jDateChooser1.getDate());
            String in = "INSERT INTO `sergical_shop`.`cash_table`(`date`,`ammount`,`status`,`detailse`)VALUES ('" + date1 + "', '" + ammount + "',  '" + status + "', '" + details+ "')";
            cash_dataEntry_add(in, "Submition");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void datilse_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datilse_txtKeyTyped

    }//GEN-LAST:event_datilse_txtKeyTyped

    private void datilse_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datilse_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_datilse_txtKeyReleased

    private void datilse_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datilse_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_datilse_txtKeyPressed

    private void datilse_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datilse_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_datilse_txtMouseClicked

    private void datilse_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_datilse_txtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_datilse_txtFocusGained

    private void ammount_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txtKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_ammount_txtKeyTyped

    private void ammount_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txtKeyReleased

    private void ammount_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammount_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txtKeyPressed

    private void ammount_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ammount_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txtMouseClicked

    private void ammount_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ammount_txtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txtFocusGained

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        show_data_table();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        find();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        find();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        find();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void From_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_From_datePropertyChange
find();
    }//GEN-LAST:event_From_datePropertyChange

    private void To_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_To_datePropertyChange
       find();
    }//GEN-LAST:event_To_datePropertyChange

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
       NewMDIApplication n=new NewMDIApplication();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void From_date1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_From_date1PropertyChange
 try { 
     credit_la2.setText("0");
     debi_lab2.setText("0");
    ammount_lab2.setText("0");
    salse_lab3.setText("0");
    purchase_lab3.setText("0");
    ammount_lab3.setText("0");
    credit_la4.setText("0");
    debi_lab4.setText("0");
    ammount_lab4.setText("");
     double c=0,d=0,t=0;
     
     if(!((JTextField) From_date1.getDateEditor().getUiComponent()).getText().isEmpty()){
   
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = sd.format(From_date1.getDate());
                String s="SELECT  `ammount`,`status` FROM `sergical_shop`.`cash_table` WHERE `date`='"+date1+"'";
                con.st = con.ct.prepareCall(s); 
                con.rs = con.st.executeQuery(s);
                while(con.rs.next()){
                if(con.rs.getString(2).equals("Credit")){
                c=con.rs.getDouble(1)+c; 
                } if(con.rs.getString(2).equals("Debit")){ 
                 d=con.rs.getDouble(1)+d;
                }
                t=c-d;
                c=Math.round(c*100.0)/100.0;
                credit_la2.setText(""+c);
                 d=Math.round(d*100.0)/100.0;
                debi_lab2.setText(""+d);
                t=Math.round(t*100.0)/100.0;
                ammount_lab2.setText(""+t);
               }
               double pu=0,sa=0,pr=0;
     String s1=" SELECT `ammount`,`status` FROM `sergical_shop`.`cash_table` WHERE `detailse`LIKE 'Product Purchase%' AND `date`='"+date1+"'";
                con.st = con.ct.prepareCall(s1); 
                con.rs = con.st.executeQuery(s1);
                while(con.rs.next()){
               /* if(con.rs.getString(2).equals("Credit")){
                c=con.rs.getDouble(1)+c; 
                }*/
               if(con.rs.getString(2).equals("Debit")){ 
                pu=con.rs.getDouble(1)+pu;
                }
             pu=Math.round(pu*100.0)/100.0;
              purchase_lab3.setText(""+pu); 
               }
 
    String s2=" SELECT `ammount`,`status` FROM `sergical_shop`.`cash_table` WHERE `detailse`LIKE 'Product Sales%' AND `date`='"+date1+"'";
                con.st = con.ct.prepareCall(s2); 
                con.rs = con.st.executeQuery(s2);
                while(con.rs.next()){
                if(con.rs.getString(2).equals("Credit")){
                sa=con.rs.getDouble(1)+sa; 
            //    JOptionPane.showMessageDialog(this,"j");
                }
                /*
               if(con.rs.getString(2).equals("Debit")){ 
                pu=con.rs.getDouble(1)+pu;
                }*/
             sa=Math.round(sa*100.0)/100.0;
             salse_lab3.setText(""+sa);
                
               }
                   pr=sa-pu;
             pr=Math.round(pr*100.0)/100.0;
                ammount_lab3.setText(""+pr);
                double pur=0,sal=0,pro=0;
              String s3="SELECT  `total`, ( `s_quantity`*`pur_price`) AS `total_purPrice`,(`total`-( `s_quantity`*`pur_price`)) AS `profit` FROM `sergical_shop`.`sales_table` WHERE `s_date`='"+date1+"'";
                con.st = con.ct.prepareCall(s3); 
                con.rs = con.st.executeQuery(s3);
                //  JOptionPane.showMessageDialog(this,"while");
                while(con.rs.next()){
                    try{
                    pur=Double.parseDouble(con.rs.getString(2))+pur;
                     sal=Double.parseDouble(con.rs.getString(1))+sal;
                      pro=Double.parseDouble(con.rs.getString(3))+pro;
                    //  JOptionPane.showMessageDialog(this,"while===");
                   sal=Math.round(sal*100.0)/100.0;
                    credit_la4.setText(""+sal);
                     pur=Math.round(pur*100.0)/100.0;
                   debi_lab4.setText(""+pur);
                    pro=Math.round(pro*100.0)/100.0;
                 ammount_lab4.setText(""+pro);  }catch(Exception e){ 
                     pur=Double.parseDouble(con.rs.getString(2))+pur;
                     sal=Double.parseDouble(con.rs.getString(1))+sal;
                      pro=Double.parseDouble(con.rs.getString(3))+pro;
                    //  JOptionPane.showMessageDialog(this,"while===");
                   sal=Math.round(sal*100.0)/100.0;
                    credit_la4.setText(""+sal);
                     pur=Math.round(pur*100.0)/100.0;
                   debi_lab4.setText(""+pur);
                    pro=Math.round(pro*100.0)/100.0;
                 ammount_lab4.setText(""+pro);
                     
                 }
               }
                    
                 
                
                
                
                
                
                
                
                
                
                
            }
} catch (SQLException ex) {
        Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
    }



        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_From_date1PropertyChange

    private void To_date1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_To_date1PropertyChange
          if (!((JTextField) To_date1.getDateEditor().getUiComponent()).getText().isEmpty()) {
          
           try { 
     credit_la2.setText("0");
     debi_lab2.setText("0");
    ammount_lab2.setText("0");
    salse_lab3.setText("0");
    purchase_lab3.setText("0");
    ammount_lab3.setText("0");
    credit_la4.setText("0");
    debi_lab4.setText("0");
    ammount_lab4.setText("");
     double c=0,d=0,t=0;
     
     if(!((JTextField) From_date1.getDateEditor().getUiComponent()).getText().isEmpty()){
   
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
             String date2 = sd.format(From_date1.getDate());
                String date1 = sd.format(To_date1.getDate()); 
                String s="SELECT  `ammount`,`status` FROM `sergical_shop`.`cash_table` WHERE `date` >='"+date2+"' AND `date`<='"+date1+"'";
                con.st = con.ct.prepareCall(s); 
                con.rs = con.st.executeQuery(s);
                while(con.rs.next()){
                if(con.rs.getString(2).equals("Credit")){
                c=con.rs.getDouble(1)+c; 
                } if(con.rs.getString(2).equals("Debit")){ 
                 d=con.rs.getDouble(1)+d;
                }
                t=c-d;
                c=Math.round(c*100.0)/100.0;
                credit_la2.setText(""+c);
                 d=Math.round(d*100.0)/100.0;
                debi_lab2.setText(""+d);
                t=Math.round(t*100.0)/100.0;
                ammount_lab2.setText(""+t);
               }
               double pu=0,sa=0,pr=0;
     String s1=" SELECT `ammount`,`status` FROM `sergical_shop`.`cash_table` WHERE `detailse`LIKE 'Product Purchase%' AND `date`>='"+date2+"' AND `date`<='"+date1+"'";
                con.st = con.ct.prepareCall(s1); 
                con.rs = con.st.executeQuery(s1);
                while(con.rs.next()){
               /* if(con.rs.getString(2).equals("Credit")){
                c=con.rs.getDouble(1)+c; 
                }*/
               if(con.rs.getString(2).equals("Debit")){ 
                pu=con.rs.getDouble(1)+pu;
                }
             pu=Math.round(pu*100.0)/100.0;
              purchase_lab3.setText(""+pu); 
               }
 
    String s2=" SELECT `ammount`,`status` FROM `sergical_shop`.`cash_table` WHERE `detailse`LIKE 'Product Sales%' AND `date`>='"+date2+"' AND `date`<='"+date1+"'";
                con.st = con.ct.prepareCall(s2); 
                con.rs = con.st.executeQuery(s2);
                while(con.rs.next()){
                if(con.rs.getString(2).equals("Credit")){
                sa=con.rs.getDouble(1)+sa; 
            //    JOptionPane.showMessageDialog(this,"j");
                }
                /*
               if(con.rs.getString(2).equals("Debit")){ 
                pu=con.rs.getDouble(1)+pu;
                }*/
             sa=Math.round(sa*100.0)/100.0;
             salse_lab3.setText(""+sa);
                
               }
                   pr=sa-pu;
             pr=Math.round(pr*100.0)/100.0;
                ammount_lab3.setText(""+pr);
                double pur=0,sal=0,pro=0;
              String s3="SELECT  `total`, ( `s_quantity`*`pur_price`) AS `total_purPrice`,(`total`-( `s_quantity`*`pur_price`)) AS `profit` FROM `sergical_shop`.`sales_table` WHERE `s_date`>='"+date2+"' AND `s_date`<='"+date1+"'";
                con.st = con.ct.prepareCall(s3); 
                con.rs = con.st.executeQuery(s3);
                //  JOptionPane.showMessageDialog(this,"while");
                while(con.rs.next()){
                    pur=Double.parseDouble(con.rs.getString(2))+pur;
                     sal=Double.parseDouble(con.rs.getString(1))+sal;
                      pro=Double.parseDouble(con.rs.getString(3))+pro;
                    //  JOptionPane.showMessageDialog(this,"while===");
                   sal=Math.round(sal*100.0)/100.0;
                    credit_la4.setText(""+sal);
                     pur=Math.round(pur*100.0)/100.0;
                   debi_lab4.setText(""+pur);
                    pro=Math.round(pro*100.0)/100.0;
                 ammount_lab4.setText(""+pro);   
               }    
            }
} catch (SQLException ex) {
        Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
    }



        
        
        
        
        
      
          
          
          }
        
        
        
        
        
    }//GEN-LAST:event_To_date1PropertyChange
    void Loan_Show(){
        try {
            count=0;
            cr=de=aa=0;
            con.contest();
            DefaultTableModel dt=(DefaultTableModel) Loan_Show_Table.getModel();
            dt.setRowCount(0); 
            String s=" SELECT  `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `detailse` LIKE 'Loan %'";
            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            while(con.rs.next()){   
            count=count+1;
               dt.addRow(new Object[]{count,con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),Double.parseDouble(con.rs.getString(4))});
             if(con.rs.getString(3).equals("Credit")){
             cr=Double.parseDouble(con.rs.getString(4))+cr;
             }else if(con.rs.getString(3).equals("Debit")){
             de=Double.parseDouble(con.rs.getString(4))+de;
             } 
            aa=cr-de;
            
            } 
            credit_la3.setText(""+cr);
            debi_lab3.setText(""+de);
            ammount_lab5.setText(""+aa);
            
        } catch (SQLException ex) {
            Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
        }




}
    private void From_date3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_From_date3PropertyChange
    
        try {
            String sta=null;
            if(loan_radio_credit.isSelected()){
                sta="Credit";
            }else  if(loan_radio_debit.isSelected()){
                sta="Debit";
            }else if(loan_radio_all.isSelected()){
                sta=null;
            }
            
            
             if (!((JTextField) From_date3.getDateEditor().getUiComponent()).getText().isEmpty()  ) {
            
                 
                 
                 SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
             String date1 = sd.format(From_date3.getDate());
             DefaultTableModel dt=(DefaultTableModel) Loan_Show_Table.getModel();
             dt.setRowCount(0);
             cr=de=aa=0;
             
             if(sta.equals(null)){
             String s=" SELECT  `date`,`detailse`,`status`,`ammount` FROM `sergical_shop`.`cash_table` WHERE `detailse` LIKE 'Loan %' AND `date`='"+date1+"'";
             con.contest();
             
             con.st = con.ct.prepareCall(s);
             con.rs = con.st.executeQuery(s);
             while(con.rs.next()){
                 count=count+1;
                 dt.addRow(new Object[]{count,con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),Double.parseDouble(con.rs.getString(4))});
                 if(con.rs.getString(3).equals("Credit")){
                     cr=Double.parseDouble(con.rs.getString(4))+cr;
                 }else if(con.rs.getString(3).equals("Debit")){
                     de=Double.parseDouble(con.rs.getString(4))+de;
                 }  
                 aa=cr-de;
                 
             }
             credit_la3.setText(""+cr);
             debi_lab3.setText(""+de);
             ammount_lab5.setText("");   
             }
             
           
         
         } 
         } catch (SQLException ex) {
             Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
         }
     
    
    }//GEN-LAST:event_From_date3PropertyChange

    private void To_date2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_To_date2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_To_date2PropertyChange

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void loan_radio_debitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loan_radio_debitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loan_radio_debitActionPerformed
    void show_product() {
        int a = 0, b = 0, c = 0;
        int count = 0;
        try {
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            con.contest();
            String s = "SELECT `stock`.`Catagory`,`stock`.`product`,`stock`.`pur`,`stock`.`sales`  FROM `stock` ORDER BY (`stock`.`pur`-`stock`.`sales`) ASC ";

            con.st = con.ct.prepareCall(s);
            con.rs = con.st.executeQuery(s);
            while (con.rs.next()) {
                count = count + 1;
                b1 = Double.parseDouble(con.rs.getString(3));
                c1 = Double.parseDouble(con.rs.getString(4));
                b1 = b1 - c1;
                b1 = Math.round(b1 * 100.0) / 100.0;
                dt.addRow(new Object[]{count, con.rs.getString(1), con.rs.getString(2), con.rs.getString(3), Double.parseDouble(con.rs.getString(4)), b1});

            }
        } catch (SQLException ex) {
            Logger.getLogger(Cash_Data.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Cash_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cash_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cash_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cash_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cash_Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser From_date;
    private com.toedter.calendar.JDateChooser From_date1;
    private com.toedter.calendar.JDateChooser From_date3;
    private javax.swing.JTable Loan_Show_Table;
    private com.toedter.calendar.JDateChooser To_date;
    private com.toedter.calendar.JDateChooser To_date1;
    private com.toedter.calendar.JDateChooser To_date2;
    private javax.swing.JComboBox<String> account_combo1;
    private javax.swing.JLabel ammount_lab;
    private javax.swing.JLabel ammount_lab1;
    private javax.swing.JLabel ammount_lab2;
    private javax.swing.JLabel ammount_lab3;
    private javax.swing.JLabel ammount_lab4;
    private javax.swing.JLabel ammount_lab5;
    private javax.swing.JTextField ammount_txt;
    private javax.swing.JTextField ammount_txt3;
    private javax.swing.JTextField ammount_txt4;
    private javax.swing.JComboBox<String> bname_combo1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel credit_la;
    private javax.swing.JLabel credit_la1;
    private javax.swing.JLabel credit_la2;
    private javax.swing.JLabel credit_la3;
    private javax.swing.JLabel credit_la4;
    private javax.swing.JTextField datilse_txt;
    private javax.swing.JLabel debi_lab;
    private javax.swing.JLabel debi_lab1;
    private javax.swing.JLabel debi_lab2;
    private javax.swing.JLabel debi_lab3;
    private javax.swing.JLabel debi_lab4;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JDesktopPane desktopPane2;
    private javax.swing.JDesktopPane desktopPane3;
    private javax.swing.JDesktopPane desktopPane4;
    private javax.swing.JDesktopPane desktopPane5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton2_c;
    private javax.swing.JRadioButton jRadioButton2_d;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton loan_radio_all;
    private javax.swing.JRadioButton loan_radio_credit;
    private javax.swing.JRadioButton loan_radio_debit;
    private javax.swing.JLabel purchase_lab3;
    private javax.swing.JLabel salse_lab3;
    // End of variables declaration//GEN-END:variables
}

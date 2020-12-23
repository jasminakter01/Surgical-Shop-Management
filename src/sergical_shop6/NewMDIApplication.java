 
package sergical_shop6;
 
import javax.swing.JOptionPane;

/**
 *
 * @author jasmin
 */
public class NewMDIApplication extends javax.swing.JFrame {
 
    public NewMDIApplication() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        exitMenuItem3 = new javax.swing.JMenuItem();
        exitMenuItem4 = new javax.swing.JMenuItem();
        exitMenuItem5 = new javax.swing.JMenuItem();
        exitMenuItem8 = new javax.swing.JMenuItem();
        exitMenuItem7 = new javax.swing.JMenuItem();
        exitMenuItem9 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        cutMenuItem1 = new javax.swing.JMenuItem();
        copyMenuItem1 = new javax.swing.JMenuItem();
        pasteMenuItem1 = new javax.swing.JMenuItem();
        deleteMenuItem1 = new javax.swing.JMenuItem();
        deleteMenuItem2 = new javax.swing.JMenuItem();
        fileMenu1 = new javax.swing.JMenu();
        openMenuItem1 = new javax.swing.JMenuItem();
        saveMenuItem1 = new javax.swing.JMenuItem();
        saveAsMenuItem1 = new javax.swing.JMenuItem();
        exitMenuItem1 = new javax.swing.JMenuItem();
        openMenuItem2 = new javax.swing.JMenuItem();
        saveMenuItem2 = new javax.swing.JMenuItem();
        saveAsMenuItem2 = new javax.swing.JMenuItem();
        exitMenuItem2 = new javax.swing.JMenuItem();
        exitMenuItem6 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        helpMenu1 = new javax.swing.JMenu();
        aboutMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("jMenu9");

        jMenuItem1.setText("jMenuItem1");

        jMenu10.setText("jMenu10");

        jMenu11.setText("jMenu11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bil2.png"))); // NOI18N
        desktopPane.add(jLabel7);
        jLabel7.setBounds(-60, -70, 1360, 690);

        getContentPane().add(desktopPane);
        desktopPane.setBounds(0, 0, 1370, 720);

        fileMenu.setBorder(null);
        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/folder.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("File  ");
        fileMenu.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N

        openMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Supplier");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Custommer");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Catagory");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Cash");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        exitMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        exitMenuItem3.setMnemonic('x');
        exitMenuItem3.setText("Bank");
        exitMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem3);

        exitMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        exitMenuItem4.setMnemonic('x');
        exitMenuItem4.setText("Cost");
        exitMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem4ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem4);

        exitMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        exitMenuItem5.setMnemonic('x');
        exitMenuItem5.setText("Return");
        exitMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem5ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem5);

        exitMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        exitMenuItem8.setMnemonic('x');
        exitMenuItem8.setText("Stock");
        exitMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem8ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem8);

        exitMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        exitMenuItem7.setMnemonic('x');
        exitMenuItem7.setText("Accounts");
        exitMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem7ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem7);

        exitMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        exitMenuItem9.setMnemonic('x');
        exitMenuItem9.setText("Admin");
        exitMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem9ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem9);

        menuBar.add(fileMenu);

        editMenu.setBorder(null);
        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pur.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Purchase  ");
        editMenu.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Purchase");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Purchase Order");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pasteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Purchase Due Paid");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem);

        cutMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cutMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        cutMenuItem1.setMnemonic('t');
        cutMenuItem1.setText("Purchase Report ( Supplier )");
        cutMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem1);

        copyMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        copyMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        copyMenuItem1.setMnemonic('y');
        copyMenuItem1.setText("Purchase Report ( Bill )");
        copyMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem1);

        pasteMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pasteMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        pasteMenuItem1.setMnemonic('p');
        pasteMenuItem1.setText("Purchase Report ( Product )");
        pasteMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem1);

        deleteMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        deleteMenuItem1.setMnemonic('d');
        deleteMenuItem1.setText("Purchase Report ( Account )");
        deleteMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem1);

        deleteMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        deleteMenuItem2.setMnemonic('d');
        deleteMenuItem2.setText("Purchase Order Report ");
        deleteMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItem2ActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem2);

        menuBar.add(editMenu);

        fileMenu1.setBorder(null);
        fileMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sale.png"))); // NOI18N
        fileMenu1.setMnemonic('f');
        fileMenu1.setText("Sales   ");
        fileMenu1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N

        openMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        openMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        openMenuItem1.setMnemonic('o');
        openMenuItem1.setText("Sales");
        openMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu1.add(openMenuItem1);

        saveMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        saveMenuItem1.setMnemonic('s');
        saveMenuItem1.setText("Sales Order");
        saveMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu1.add(saveMenuItem1);

        saveAsMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveAsMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        saveAsMenuItem1.setMnemonic('a');
        saveAsMenuItem1.setText("Sales Due Paid");
        saveAsMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu1.add(saveAsMenuItem1);

        exitMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        exitMenuItem1.setMnemonic('x');
        exitMenuItem1.setText("Sales Report ( Product )");
        exitMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu1.add(exitMenuItem1);

        openMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        openMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        openMenuItem2.setMnemonic('o');
        openMenuItem2.setText("Sales Report ( Custommer )");
        openMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu1.add(openMenuItem2);

        saveMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        saveMenuItem2.setMnemonic('s');
        saveMenuItem2.setText("Sales Report ( Bill )");
        saveMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu1.add(saveMenuItem2);

        saveAsMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveAsMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        saveAsMenuItem2.setMnemonic('a');
        saveAsMenuItem2.setText("Sales Report ( Accounts  )");
        saveAsMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu1.add(saveAsMenuItem2);

        exitMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        exitMenuItem2.setMnemonic('x');
        exitMenuItem2.setText("Sales Profit");
        exitMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu1.add(exitMenuItem2);

        exitMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        exitMenuItem6.setMnemonic('x');
        exitMenuItem6.setText("Sales Order Report");
        exitMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem6ActionPerformed(evt);
            }
        });
        fileMenu1.add(exitMenuItem6);

        menuBar.add(fileMenu1);

        helpMenu.setBorder(null);
        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sr.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("SR   ");
        helpMenu.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N

        contentMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("SR");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("SR Salary");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        helpMenu1.setBorder(null);
        helpMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help.png"))); // NOI18N
        helpMenu1.setMnemonic('h');
        helpMenu1.setText("Help  ");
        helpMenu1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N

        aboutMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        aboutMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/allfile.png"))); // NOI18N
        aboutMenuItem1.setMnemonic('a');
        aboutMenuItem1.setText("About");
        aboutMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu1.add(aboutMenuItem1);

        menuBar.add(helpMenu1);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1376, 757));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
     
      Cash_Data ct=new Cash_Data();
      ct.setVisible(true);
      dispose();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
Supplier_Table st=new Supplier_Table();
st.setVisible(true);
dispose();
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
   Customer_Table cs=new Customer_Table();
   cs.setVisible(true);
   dispose();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void openMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem1ActionPerformed
       Sales_Page sp=new Sales_Page();
       sp.setVisible(true);
       dispose();
    }//GEN-LAST:event_openMenuItem1ActionPerformed

    private void saveMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItem1ActionPerformed
        Sales_Order sp=new Sales_Order();
       sp.setVisible(true);
       dispose();
    }//GEN-LAST:event_saveMenuItem1ActionPerformed

    private void exitMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem1ActionPerformed
        Sales_report_Productl_Wise s=new Sales_report_Productl_Wise();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitMenuItem1ActionPerformed

    private void cutMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem1ActionPerformed
           Puchase_report_Company_Wise ps=new Puchase_report_Company_Wise(); 
     ps.setVisible(true);
    dispose(); 
    }//GEN-LAST:event_cutMenuItem1ActionPerformed

    private void openMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem2ActionPerformed
        Sales_report_Company_Wise s=new Sales_report_Company_Wise();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_openMenuItem2ActionPerformed

    private void saveMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItem2ActionPerformed
       Sales_report_Bill_Wise s=new Sales_report_Bill_Wise();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_saveMenuItem2ActionPerformed

    private void exitMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem2ActionPerformed
Sales_Profite_Productl_Wise sp=new Sales_Profite_Productl_Wise();
sp.setVisible(true);
dispose();
    }//GEN-LAST:event_exitMenuItem2ActionPerformed

    private void saveAsMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItem1ActionPerformed
        
         Sales_paid ps=new Sales_paid(); 
    ps.setVisible(true);
    dispose();
    }//GEN-LAST:event_saveAsMenuItem1ActionPerformed

    private void pasteMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItem1ActionPerformed
    Puchase_report_Productl_Wise ps=new Puchase_report_Productl_Wise(); 
    ps.setVisible(true);
    dispose(); 
    }//GEN-LAST:event_pasteMenuItem1ActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
       Catagory_add ct=new Catagory_add();
           ct.setVisible(true); 
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void exitMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem3ActionPerformed
       Bank_Data bt=new Bank_Data();
       bt.setVisible(true);
       dispose();
    }//GEN-LAST:event_exitMenuItem3ActionPerformed

    private void exitMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem4ActionPerformed
Cost_Add c=new Cost_Add();
c.setVisible(true);
dispose();
    }//GEN-LAST:event_exitMenuItem4ActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
      Purchase_page pg=new Purchase_page();
      pg.setVisible(true);
      dispose();
        
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
     Purchase_Order ps= new Purchase_Order();
     ps.setVisible(true);
    dispose(); 
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
       Purchase_Paid ps=new Purchase_Paid(); 
     ps.setVisible(true);
    dispose(); 
    }//GEN-LAST:event_pasteMenuItemActionPerformed

    private void copyMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem1ActionPerformed
         Puchase_report_Bill_Wise ps=new Puchase_report_Bill_Wise(); 
     ps.setVisible(true);
    dispose(); 
    }//GEN-LAST:event_copyMenuItem1ActionPerformed

    private void deleteMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItem1ActionPerformed
  Puchase_report_ACCOUNT_Bill_Wise ps=new Puchase_report_ACCOUNT_Bill_Wise(); 
    ps.setVisible(true);
    dispose(); 
    }//GEN-LAST:event_deleteMenuItem1ActionPerformed

    private void deleteMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItem2ActionPerformed
    Purchase_Order_report ps=new Purchase_Order_report(); 
    ps.setVisible(true);
    dispose();   
    }//GEN-LAST:event_deleteMenuItem2ActionPerformed

    private void saveAsMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItem2ActionPerformed
       Sales_report_ACCOUNT_Bill_Wise s=new Sales_report_ACCOUNT_Bill_Wise();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_saveAsMenuItem2ActionPerformed

    private void exitMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem5ActionPerformed
     Return_product r=new Return_product();
     r.setVisible(true);
     dispose();
    }//GEN-LAST:event_exitMenuItem5ActionPerformed

    private void exitMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem6ActionPerformed
Sales__Order_report s=new Sales__Order_report();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitMenuItem6ActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
Sales_Officer so=new Sales_Officer();
so.setVisible(true);
dispose();


    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
       SR_Salarry sr=new SR_Salarry();
       sr.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void exitMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem7ActionPerformed
     Accounts a=new Accounts();
     a.setVisible(true);
    }//GEN-LAST:event_exitMenuItem7ActionPerformed

    private void exitMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem8ActionPerformed
      Stock s=new Stock();
      s.setVisible(true);
      dispose();
    }//GEN-LAST:event_exitMenuItem8ActionPerformed

    private void exitMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem9ActionPerformed
       Create_Login_Pin c=new Create_Login_Pin(); 
    c.setVisible(true);
    }//GEN-LAST:event_exitMenuItem9ActionPerformed

    private void aboutMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMDIApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem aboutMenuItem1;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem copyMenuItem1;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem cutMenuItem1;
    private javax.swing.JMenuItem deleteMenuItem1;
    private javax.swing.JMenuItem deleteMenuItem2;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem exitMenuItem1;
    private javax.swing.JMenuItem exitMenuItem2;
    private javax.swing.JMenuItem exitMenuItem3;
    private javax.swing.JMenuItem exitMenuItem4;
    private javax.swing.JMenuItem exitMenuItem5;
    private javax.swing.JMenuItem exitMenuItem6;
    private javax.swing.JMenuItem exitMenuItem7;
    private javax.swing.JMenuItem exitMenuItem8;
    private javax.swing.JMenuItem exitMenuItem9;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu helpMenu1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem openMenuItem1;
    private javax.swing.JMenuItem openMenuItem2;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem pasteMenuItem1;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem1;
    private javax.swing.JMenuItem saveAsMenuItem2;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem saveMenuItem1;
    private javax.swing.JMenuItem saveMenuItem2;
    // End of variables declaration//GEN-END:variables

}

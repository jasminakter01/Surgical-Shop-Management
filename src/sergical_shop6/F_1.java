package sergical_shop6;

  
import java.awt.Color;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class F_1 extends javax.swing.JFrame {
    double day;
public F_1() {
       
            initComponents(); 

}
        
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 42, 127));
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bil.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 10, 720, 250);

        jProgressBar2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.add(jProgressBar2);
        jProgressBar2.setBounds(270, 626, 813, 20);

        jProgressBar3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.add(jProgressBar3);
        jProgressBar3.setBounds(270, 626, 813, 20);

        jProgressBar1.setBackground(new java.awt.Color(61, 42, 127));
        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jProgressBar1KeyPressed(evt);
            }
        });
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(50, 320, 610, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 470);

        setSize(new java.awt.Dimension(738, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jProgressBar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jProgressBar1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProgressBar1KeyPressed

    public static void main(String args[]) {
             F_1 ff=new F_1();  
       ff.setVisible(true);
       
          
                for (int i = -1; i <=99;) {
             i++;
                 try {
                     Thread.sleep(40); 
                      jProgressBar1.setValue(i);
                      if(i==100){
          Show f =new Show();
          f.setVisible(true);
               
                ff.setVisible(false);
             }
                 } catch (InterruptedException ex) {
                     Logger.getLogger(F_1.class.getName()).log(Level.SEVERE, null, ex);
                 }

            
           
             
} 


     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JProgressBar jProgressBar1;
    private static javax.swing.JProgressBar jProgressBar2;
    private static javax.swing.JProgressBar jProgressBar3;
    // End of variables declaration//GEN-END:variables
}

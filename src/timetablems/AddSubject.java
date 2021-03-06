/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablems;

import com.sun.glass.events.KeyEvent;
import timetablems.DBConnect;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Supun
 */
public class AddSubject extends javax.swing.JFrame {

    /**
     * Creates new form AddSubject
     */
    public AddSubject() throws SQLException {
        initComponents();
        con = DBConnect.connect();
        // disabale Maximize button
        setResizable(false);
        //srean center code
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    Connection con;
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtscode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtyear = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        save = new javax.swing.JButton();
        txtlec = new javax.swing.JComboBox<>();
        txttute = new javax.swing.JComboBox<>();
        txtlab = new javax.swing.JComboBox<>();
        txteve = new javax.swing.JComboBox<>();
        txtsem = new javax.swing.JComboBox<>();
        errorsname = new javax.swing.JLabel();
        errorscode = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Add Subjects");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Subject Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 105, 114, 25));

        txtsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsnameActionPerformed(evt);
            }
        });
        txtsname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsnameKeyReleased(evt);
            }
        });
        jPanel1.add(txtsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 105, 166, 29));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Subject Code");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 188, 114, 25));

        txtscode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtscodeActionPerformed(evt);
            }
        });
        txtscode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtscodeKeyReleased(evt);
            }
        });
        jPanel1.add(txtscode, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 188, 166, 29));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Number of Lecture Hours");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 167, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Number of Tutorial Hours");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 167, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Offered Year");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 273, 114, 25));

        txtyear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year 1", "Year 2", "Year 3", "Year 4" }));
        txtyear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtyearActionPerformed(evt);
            }
        });
        txtyear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtyearKeyReleased(evt);
            }
        });
        jPanel1.add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 270, 166, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Number of Lab Hours");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 167, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Offered Semester");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 371, 114, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Number of Evelution Hours");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 167, 25));

        Clear.setBackground(new java.awt.Color(0, 102, 204));
        Clear.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        Clear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ClearKeyReleased(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 446, 104, 36));

        save.setBackground(new java.awt.Color(0, 102, 204));
        save.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        save.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                saveKeyPressed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 446, 104, 36));

        txtlec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtlec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Hours/Week", "2 Hours/Week", "3 Hours/Week", "4 Hours/Week", "5 Hours/Week" }));
        txtlec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtlec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlecActionPerformed(evt);
            }
        });
        txtlec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlecKeyReleased(evt);
            }
        });
        jPanel1.add(txtlec, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 168, 31));

        txttute.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Hours/Week", "2 Hours/Week", "3 Hours/Week", "4 Hours/Week", "5 Hours/Week", "No Hours" }));
        txttute.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txttute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttuteActionPerformed(evt);
            }
        });
        txttute.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttuteKeyReleased(evt);
            }
        });
        jPanel1.add(txttute, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 168, 31));

        txtlab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtlab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Hours/Week", "2 Hours/Week", "3 Hours/Week", "4 Hours/Week", "5 Hours/Week", "No Hours" }));
        txtlab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtlab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlabActionPerformed(evt);
            }
        });
        txtlab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlabKeyReleased(evt);
            }
        });
        jPanel1.add(txtlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 168, 31));

        txteve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txteve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Hours/Week", "2 Hours/Week", "3 Hours/Week", "4 Hours/Week", "5 Hours/Week", "No Hours" }));
        txteve.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txteve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteveActionPerformed(evt);
            }
        });
        txteve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txteveKeyReleased(evt);
            }
        });
        jPanel1.add(txteve, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 168, 31));

        txtsem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2" }));
        txtsem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsemActionPerformed(evt);
            }
        });
        txtsem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsemKeyReleased(evt);
            }
        });
        jPanel1.add(txtsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 368, 166, 31));

        errorsname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(errorsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 105, 197, 30));

        errorscode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(errorscode, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 185, 197, 32));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetablems/1799658.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsnameActionPerformed

    private void txtyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtyearActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
         
        //Validations
        if(txtsname.getText().trim().isEmpty()){
            errorsname.setText("*Please Enter Subject Name !");
        }
        else
            errorsname.setText("");
            
        if(txtscode.getText().trim().isEmpty()){
            errorscode.setText("*Please Enter Subject Code !");
        }
        else
            errorscode.setText("");
        
        if(txtsname.getText().trim().isEmpty() || txtscode.getText().trim().isEmpty()){
            Component frame = null;
            
            JOptionPane.showMessageDialog(frame, " Please fill in a valid value ");
        
        }
        
        //Data Input
        else{
      
        try {
        
            String SubName = txtsname.getText();
            String SubCode = txtscode.getText();
            String OfferedYear = txtyear.getSelectedItem().toString();
            String OfferedSemester = txtsem.getSelectedItem().toString();
            String Lecturehr = txtlec.getSelectedItem().toString();
            String Tutehr = txttute.getSelectedItem().toString();
            String Labhr = txtlab.getSelectedItem().toString();
            String Evehr = txteve.getSelectedItem().toString();
            
           
                pst = con.prepareStatement("insert into subject(name,s_code,year,semester,lechr,tutehr,labhr,evehr) values(?,?,?,?,?,?,?,?)");
                pst.setString(1,SubName);
                pst.setString(2,SubCode);
                pst.setString(3,OfferedYear);
                pst.setString(4,OfferedSemester);
                pst.setString(5,Lecturehr);
                pst.setString(6,Tutehr);
                pst.setString(7,Labhr);
                pst.setString(8,Evehr);
                
                pst.executeUpdate();
                
            JOptionPane.showMessageDialog(this, "New Subject Added Successfully");
           // this.setVisible(false);
            
            txtsname.setText("");
            txtscode.setText("");
            txtyear.setSelectedIndex(0);
            txtsem.setSelectedIndex(0);
            txtlec.setSelectedIndex(0);
            txttute.setSelectedIndex(0);
            txtlab.setSelectedIndex(0);
            txteve.setSelectedIndex(0);
            
            } catch (SQLException ex) {
                Logger.getLogger(AddSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
    }//GEN-LAST:event_saveActionPerformed

    private void txtlecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlecActionPerformed

    private void txttuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttuteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttuteActionPerformed

    private void txtlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlabActionPerformed

    private void txteveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteveActionPerformed

    private void txtsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsemActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
            txtsname.setText("");
            txtscode.setText("");
            txtyear.setSelectedIndex(0);
            txtsem.setSelectedIndex(0);
            txtlec.setSelectedIndex(0);
            txttute.setSelectedIndex(0);
            txtlab.setSelectedIndex(0);
            txteve.setSelectedIndex(0);
    }//GEN-LAST:event_ClearActionPerformed

    private void txtscodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtscodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtscodeActionPerformed

    private void txtsnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsnameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "[A-Z]{2,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtsname.getText());
        if(!match.matches()){
            //errorsname.setText("* Subject Name is invalid !");
            errorsname.setText("* Fill with Capital letters !");
            save.setEnabled(false);
        }
        else{
            errorsname.setText(null);
            save.setEnabled(true);
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtscode.requestFocus();
            }
    }//GEN-LAST:event_txtsnameKeyReleased

    private void txtscodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtscodeKeyReleased
        // TODO add your handling code here:
        String PATTERN = "[IT|SE|IE|CSIE|IM]{2,4}[0-9]{4}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtscode.getText());

        if(!match.matches()){
            errorscode.setText("* Subject code is incorrect !!");
            save.setEnabled(false);
        }
        else{
            errorscode.setText(null);
            save.setEnabled(true);
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtyear.requestFocus();
            }
    }//GEN-LAST:event_txtscodeKeyReleased

    private void saveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saveKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            save.requestFocus();
            }
    }//GEN-LAST:event_saveKeyPressed

    private void txtyearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtyearKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtsem.requestFocus();
            }
    }//GEN-LAST:event_txtyearKeyReleased

    private void txtsemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsemKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtlec.requestFocus();
            }
    }//GEN-LAST:event_txtsemKeyReleased

    private void txtlecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlecKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txttute.requestFocus();
            }
    }//GEN-LAST:event_txtlecKeyReleased

    private void txttuteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttuteKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtlab.requestFocus();
            }
    }//GEN-LAST:event_txttuteKeyReleased

    private void txtlabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlabKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txteve.requestFocus();
            }
    }//GEN-LAST:event_txtlabKeyReleased

    private void txteveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txteveKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Clear.requestFocus();
            }
    }//GEN-LAST:event_txteveKeyReleased

    private void ClearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClearKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            save.requestFocus();
            }
    }//GEN-LAST:event_ClearKeyReleased

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
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddSubject().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddSubject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel errorscode;
    private javax.swing.JLabel errorsname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> txteve;
    private javax.swing.JComboBox<String> txtlab;
    private javax.swing.JComboBox<String> txtlec;
    private javax.swing.JTextField txtscode;
    private javax.swing.JComboBox<String> txtsem;
    private javax.swing.JTextField txtsname;
    private javax.swing.JComboBox<String> txttute;
    private javax.swing.JComboBox<String> txtyear;
    // End of variables declaration//GEN-END:variables
}

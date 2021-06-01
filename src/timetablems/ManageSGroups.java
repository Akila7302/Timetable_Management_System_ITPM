/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablems;

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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author 94763
 */
public class ManageSGroups extends javax.swing.JFrame {

    //  Connection conn = null;
    //PreparedStatement pst  = null;
    ResultSet rs = null;
    //   DefaultTableModel model = new  DefaultTableModel () ;
    // DefaultTableModel df ;

    public ManageSGroups() {
        initComponents();
        conn = ManageSGroups.ConnectDb();
        load();
        setResizable(false);
        //srean center code
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    Connection conn;
    PreparedStatement pst;
    DefaultTableModel df;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        YearBox = new javax.swing.JComboBox<>();
        Probox = new javax.swing.JComboBox<>();
        GNBox = new javax.swing.JSpinner();
        SGNBox = new javax.swing.JSpinner();
        GID = new javax.swing.JTextField();
        SGID = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Sserach = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Year and sem", "Programme", "Group number", "Sub group number", "Group Id", "Sub group id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 155, 827, 298));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 113, 58));

        YearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y1S1", "Y1S2", "Y2S1", "Y2S2", "Y3S1", "Y3S2", "Y4S1", "Y4S2" }));
        jPanel1.add(YearBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 471, 67, 32));

        Probox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "CSSE", "IM", "CSE" }));
        jPanel1.add(Probox, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 521, -1, 29));

        GNBox.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        jPanel1.add(GNBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 580, 49, -1));

        SGNBox.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));
        jPanel1.add(SGNBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 622, 49, -1));

        GID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GIDActionPerformed(evt);
            }
        });
        jPanel1.add(GID, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 471, 222, 32));
        jPanel1.add(SGID, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 542, 222, 29));

        jButton3.setBackground(new java.awt.Color(0, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 264, 113, 52));

        Sserach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SserachActionPerformed(evt);
            }
        });
        jPanel1.add(Sserach, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 98, 235, 35));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 94, 103, 43));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        jLabel1.setText("Manage  Students  Groups");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 14, 400, 62));

        jButton4.setBackground(new java.awt.Color(0, 51, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 334, 113, 55));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Year And Sem");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 471, 131, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Programme");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 521, 131, 29));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Group number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 576, 131, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Sub Group number ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 618, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Group Id");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 473, 81, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Sub Group Id");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 542, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetablems/1799658.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        YearBox.setSelectedItem("");
        Probox.setSelectedItem("");
        // GNBox.setValue("");
        // SGNBox.setValue("");
        GID.setText("");
        SGID.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String val = Sserach.getText().toString();

        int a;

        try {

            pst  = conn.prepareStatement("select * from student where sg_groupnum like '%"+val+"%'");
            ResultSet rs = pst.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a= rd.getColumnCount();
            df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);

            while(rs.next())
            {

                Vector v2 = new Vector();
                for(int i=1; i<=a; i++)

                {
                    v2.add(rs.getString("st_id"));
                    v2.add(rs.getString("yearsem"));
                    v2.add(rs.getString("programme"));
                    v2.add(rs.getInt("sg_groupnum"));
                    v2.add(rs.getInt("sg_subgroupnum"));
                    v2.add(rs.getString("groupid"));
                    v2.add(rs.getString("subgroupid"));

                }
                df.addRow(v2);
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void SserachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SserachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SserachActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        df = (DefaultTableModel) jTable1.getModel();

        int selected = jTable1.getSelectedRow();

        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());

        int X = JOptionPane.showConfirmDialog(null, "do you want delete", "Delete", JOptionPane.YES_NO_OPTION);

        if (X == 0) {
            try {

                pst = conn.prepareStatement("Delete from student where  st_id = ?");
                pst.setInt(1, id);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "group deleted");

                YearBox.setSelectedItem("");
                Probox.setSelectedItem("");
                // GNBox.setValue("");
                // SGNBox.setValue("");
                GID.setText("");
                SGID.setText("");

                load();

            } catch (SQLException ex) {
                Logger.getLogger(ManageTag.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void GIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        df = (DefaultTableModel) jTable1.getModel();

        int selected = jTable1.getSelectedRow();

        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());

        String YearAndSem = YearBox.getSelectedItem().toString();
        String pRogramme = Probox.getSelectedItem().toString();
        int groupNumber = (int) GNBox.getValue();
        int subGroupNumber = (int) SGNBox.getValue();

        //
        GID.setText(YearAndSem + "." + pRogramme + "." + groupNumber);
        SGID.setText(YearAndSem + "." + pRogramme + "." + groupNumber + "." + subGroupNumber);

        String groupId = GID.getText();
        String SubgroupId = SGID.getText();

        try {
            pst = conn.prepareStatement("update student set sg_groupnum = ?,sg_subgroupnum  = ?, programme = ?, yearsem = ?,groupid = ? , subgroupid = ? where st_id = ?");

            pst.setInt(1, groupNumber);

            pst.setInt(2, subGroupNumber);

            pst.setString(3, pRogramme);
            pst.setString(4, YearAndSem);
            pst.setString(5, groupId);
            pst.setString(6, SubgroupId);
            pst.setInt(7, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student Group updated");
            Probox.setSelectedItem("");
            YearBox.setSelectedItem("");
            GID.setText("");
            SGID.setText("");

            load();
            //jButton1.setEnabled(false);

        } catch (SQLException ex) {
            Logger.getLogger(ManageSGroups.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        df = (DefaultTableModel) jTable1.getModel();

        int selected = jTable1.getSelectedRow();

        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        YearBox.setSelectedItem(df.getValueAt(selected, 1).toString());
        Probox.setSelectedItem(df.getValueAt(selected, 2).toString());
        GNBox.setValue(df.getValueAt(selected, 3).hashCode());
        SGNBox.setValue(df.getValueAt(selected, 4).hashCode());
        GID.setText(df.getValueAt(selected, 5).toString());
        SGID.setText(df.getValueAt(selected, 6).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    public static Connection ConnectDb() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:ttms.db");
            return conn;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    /**
     *
     *
     *
     *
     * @param args the command line arguments
     */
    public void load() {

        String sql = "Select * from student";

        int a;
        try {
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);

            while (rs.next()) {

                Vector v2 = new Vector();
                for (int i = 1; i <= a; i++) {

                    v2.add(rs.getString("st_id"));
                    v2.add(rs.getString("yearsem"));
                    v2.add(rs.getString("programme"));
                    v2.add(rs.getInt("sg_groupnum"));
                    v2.add(rs.getInt("sg_subgroupnum"));
                    v2.add(rs.getString("groupid"));
                    v2.add(rs.getString("subgroupid"));

                }
                df.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManageSGroups.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void tabledata() {

        int r = jTable1.getSelectedRow();

        String yearAndSem = jTable1.getValueAt(r, 0).toString();
        String programme = jTable1.getValueAt(r, 1).toString();
        int groupNumber = (int) jTable1.getValueAt(r, 2);
        int subGroupNumber = (int) jTable1.getValueAt(r, 3);

        String groupId = jTable1.getValueAt(r, 4).toString();
        String SubgroupId = jTable1.getValueAt(r, 5).toString();

        YearBox.setSelectedItem(yearAndSem);
        Probox.setSelectedItem(programme);
        GNBox.setValue(groupNumber);
        SGNBox.setValue(subGroupNumber);
        GID.setText(groupId);
        SGID.setText(SubgroupId);
    }

    public void update() {

        int r = jTable1.getSelectedRow();

        int value = (int) (jTable1.getModel().getValueAt(r, 0));

        String yearAndSem = YearBox.getSelectedItem().toString();
        String programme = Probox.getSelectedItem().toString();
        int groupNumber = (int) GNBox.getValue();
        int subGroupNumber = (int) SGNBox.getValue();
        String groupId = GID.getText();
        String SubgroupId = SGID.getText();

        try {

            String sql = "UPDATE student SET  sg_groupnum='" + groupNumber + "',sg_subgroupnum='" + subGroupNumber + "',programme='" + programme + "',yearsem='" + yearAndSem + "',groupid='" + groupId + "',subgroupid='" + SubgroupId + "'WHERE id= '" + value + "'";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "updated");

            tabledata();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
            java.util.logging.Logger.getLogger(ManageSGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSGroups().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GID;
    private javax.swing.JSpinner GNBox;
    private javax.swing.JComboBox<String> Probox;
    private javax.swing.JTextField SGID;
    private javax.swing.JSpinner SGNBox;
    private javax.swing.JTextField Sserach;
    private javax.swing.JComboBox<String> YearBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
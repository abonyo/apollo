/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_s;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import logins.login;
import login_s.load_data;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class load_data extends javax.swing.JFrame {

    /**
     * Creates new form load_data
     */
    public load_data() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblMAINDATA = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtdays = new javax.swing.JTextField();
        jTxtrooms = new javax.swing.JTextField();
        jTxtcourse = new javax.swing.JTextField();
        jTxtbuilding = new javax.swing.JTextField();
        jBtnADD = new javax.swing.JButton();
        jBtnEDIT = new javax.swing.JButton();
        jBtnDELETE = new javax.swing.JButton();
        jBtnBACK = new javax.swing.JButton();
        jMessage = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(211, 28, 28));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MAIN DATA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 237, 30));

        jTblMAINDATA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "days", "rooms", "course", "building"
            }
        ));
        jScrollPane1.setViewportView(jTblMAINDATA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 400, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("days");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("rooms");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("course");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("building");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jTxtdays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtdaysActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, -1));
        jPanel1.add(jTxtrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, -1));

        jTxtcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtcourseActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 140, -1));
        jPanel1.add(jTxtbuilding, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 140, -1));

        jBtnADD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnADD.setText("ADD");
        jBtnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnADDActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jBtnEDIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnEDIT.setText("EDIT");
        jBtnEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEDITActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnEDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jBtnDELETE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnDELETE.setText("DELETE");
        jBtnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDELETEActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jBtnBACK.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnBACK.setText("BACK");
        jBtnBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBACKActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnBACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jMessage.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\classroom-management-image.jpg")); // NOI18N
        jMessage.setText("jLabel6");
        jPanel1.add(jMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtdaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtdaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtdaysActionPerformed

    private void jTxtcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtcourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtcourseActionPerformed

    private void jBtnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnADDActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTblMAINDATA.getModel();
        model.addRow(new Object[]{jTxtdays.getText(),jTxtrooms.getText(),jTxtcourse.getText(),jTxtbuilding.getText()});
        
    }//GEN-LAST:event_jBtnADDActionPerformed

    private void jBtnEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEDITActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTblMAINDATA.getModel();
        if(jTblMAINDATA.getSelectedRow()==-1){
            if(jTblMAINDATA.getRowCount()==0){
                jMessage.setText("empty table");
            }else{
                jMessage.setText("you must select a row");
            }
        }else{
            model.setValueAt(jTxtdays.getText(),jTblMAINDATA.getSelectedRow(),0);
            model.setValueAt(jTxtrooms.getText(),jTblMAINDATA.getSelectedRow(),0);
            model.setValueAt(jTxtcourse.getText(),jTblMAINDATA.getSelectedRow(),0);
            model.setValueAt(jTxtbuilding.getText(),jTblMAINDATA.getSelectedRow(),0);
        }
    }//GEN-LAST:event_jBtnEDITActionPerformed

    private void jBtnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDELETEActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTblMAINDATA.getModel();
        model.removeRow(jTblMAINDATA.getSelectedRow());
        if(jTblMAINDATA.getSelectedRow()==-1){
            if(jTblMAINDATA.getRowCount()==0){
                jMessage.setText("empty table");
            }
        }else{
            model.removeRow(jTblMAINDATA.getSelectedRow());
            }
    }//GEN-LAST:event_jBtnDELETEActionPerformed

    private void jBtnBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBACKActionPerformed
        setVisible(false);
        login info = new login();
        info.setVisible(true);
        
    }//GEN-LAST:event_jBtnBACKActionPerformed

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
            java.util.logging.Logger.getLogger(load_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(load_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(load_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(load_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new load_data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnADD;
    private javax.swing.JButton jBtnBACK;
    private javax.swing.JButton jBtnDELETE;
    private javax.swing.JButton jBtnEDIT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblMAINDATA;
    private javax.swing.JTextField jTxtbuilding;
    private javax.swing.JTextField jTxtcourse;
    private javax.swing.JTextField jTxtdays;
    private javax.swing.JTextField jTxtrooms;
    // End of variables declaration//GEN-END:variables
}

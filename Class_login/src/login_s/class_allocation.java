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
import login_s.class_allocation;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class class_allocation extends javax.swing.JFrame {

    /**
     * Creates new form class_allocation
     */
    public class_allocation() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblallocation = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTfroomnumber = new javax.swing.JTextField();
        jTfroomcapacity = new javax.swing.JTextField();
        jTfcoursename = new javax.swing.JTextField();
        jTfcoursecode = new javax.swing.JTextField();
        jTfcoursecapacity = new javax.swing.JTextField();
        jBtnadd = new javax.swing.JButton();
        jBtnedit = new javax.swing.JButton();
        jBtndelete = new javax.swing.JButton();
        jBtnback = new javax.swing.JButton();
        jLmessage = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTblallocation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "room number", "room capacity", "course name", "Course code", "Course capacity"
            }
        ));
        jScrollPane1.setViewportView(jTblallocation);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 490, 390));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("room number");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("room capacity");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("course name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("course code");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("course capacity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel1.add(jTfroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 90, -1));
        jPanel1.add(jTfroomcapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, -1));
        jPanel1.add(jTfcoursename, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, -1));
        jPanel1.add(jTfcoursecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, -1));

        jTfcoursecapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfcoursecapacityActionPerformed(evt);
            }
        });
        jPanel1.add(jTfcoursecapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, -1));

        jBtnadd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnadd.setText("ADD");
        jBtnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnaddActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jBtnedit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnedit.setText("EDIT");
        jBtnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtneditActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jBtndelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtndelete.setText("DELETE");
        jBtndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jBtndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jBtnback.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnback.setText("BACK");
        jBtnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnbackActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));
        jPanel1.add(jLmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 150, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\classroom-management-image.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnaddActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTblallocation.getModel();
         model.addRow(new Object[]{jTfroomnumber.getText(),jTfroomcapacity.getText(),jTfcoursename.getText(),jTfcoursecode.getText(),jTfcoursecapacity.getText()});
    }//GEN-LAST:event_jBtnaddActionPerformed

    private void jBtneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtneditActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTblallocation.getModel();
        if(jTblallocation.getSelectedRow()==-1){
            if(jTblallocation.getRowCount()==0){
                jLmessage.setText("empty");
            }
        }else{
            model.setValueAt(jTfroomnumber.getText(),jTblallocation.getSelectedRow(),0);
            model.setValueAt(jTfroomcapacity.getText(),jTblallocation.getSelectedRow(),1);
            model.setValueAt(jTfcoursename.getText(),jTblallocation.getSelectedRow(),2);
            model.setValueAt(jTfcoursecode.getText(),jTblallocation.getSelectedRow(),3);
            model.setValueAt(jTfcoursecapacity.getText(),jTblallocation.getSelectedRow(),4);
        }
    }//GEN-LAST:event_jBtneditActionPerformed

    private void jBtnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnbackActionPerformed
         setVisible(false);
        login info = new login();
        info.setVisible(true);
    }//GEN-LAST:event_jBtnbackActionPerformed

    private void jTfcoursecapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfcoursecapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfcoursecapacityActionPerformed

    private void jBtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtndeleteActionPerformed
       DefaultTableModel model = (DefaultTableModel) jTblallocation.getModel();
       model.removeRow(jTblallocation.getSelectedRow());
       if(jTblallocation.getSelectedRow()==-1){
           if(jTblallocation.getRowCount()==0){
               jLmessage.setText("");
           }
       }else{
           model.removeRow(jTblallocation.getSelectedRow());
       }
    }//GEN-LAST:event_jBtndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(class_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(class_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(class_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(class_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new class_allocation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnadd;
    private javax.swing.JButton jBtnback;
    private javax.swing.JButton jBtndelete;
    private javax.swing.JButton jBtnedit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLmessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblallocation;
    private javax.swing.JTextField jTfcoursecapacity;
    private javax.swing.JTextField jTfcoursecode;
    private javax.swing.JTextField jTfcoursename;
    private javax.swing.JTextField jTfroomcapacity;
    private javax.swing.JTextField jTfroomnumber;
    // End of variables declaration//GEN-END:variables
}

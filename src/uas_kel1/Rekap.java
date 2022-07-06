/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_kel1;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LABKOM2-17
 */
public class Rekap extends javax.swing.JFrame {

    /**
     * Creates new form Rekap
     */
    public Rekap() throws SQLException {
        initComponents();
        renderTable();
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
        jLabelHeader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nim = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        semester = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelMahasiswa = new javax.swing.JTable();
        jButtonMenu = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        absensi = new javax.swing.JComboBox<>();
        submit = new java.awt.Button();
        jButtonPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 164, 250));

        jLabelHeader.setBackground(new java.awt.Color(0, 0, 51));
        jLabelHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelHeader.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeader.setText("Absensi Mahasiswa Politeknik Hasnur");
        jLabelHeader.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel3.setText("SEMESTER");

        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6" }));

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setText("ABSENSI");

        TabelMahasiswa.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        TabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Semester", "Hadir", "Sakit", "Alfa"
            }
        ));
        TabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabelMahasiswa);

        jButtonMenu.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButtonMenu.setText("Menu Mahasiswa");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        absensi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hadir", "sakit", "Alfa" }));

        submit.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        submit.setLabel("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jButtonPrint.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButtonPrint.setText("PRINT");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(semester, 0, 190, Short.MAX_VALUE)
                            .addComponent(nim, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(absensi, 0, 190, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPrint)
                        .addGap(18, 18, 18)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPrint))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(absensi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMahasiswaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TabelMahasiswaMouseClicked

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
                this.setVisible(false);
        new MMahasiswa().setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
                // EXIT
        int jawab = JOptionPane.showOptionDialog(this,
            "Tutup Program?",
            "Tutup",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null);

        if(jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Program Ditutup");
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        try {
            // TODO add your handling code here:
            this.renderTable();
        } catch (SQLException ex) {
            Logger.getLogger(Rekap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            // TODO add your handling code here:
            Connection conn = uas_kel1.koneksi.koneksiDB();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO absensi VALUES (?,?,?,?)");
            stmt.setString(1,nim.getText());
            
            // Fill absensi
            String selected = absensi.getSelectedItem().toString();
            
            if ( selected.equals("Hadir") ) {
                stmt.setBoolean(2, true);
                stmt.setBoolean(3, false);
                stmt.setBoolean(4, false);
            } else if ( selected.equals("Sakit") ) {
                stmt.setBoolean(2, false);
                stmt.setBoolean(3, true);
                stmt.setBoolean(4, false);
            } else if ( selected.equals("Alfa") ) {
                stmt.setBoolean(2, false);
                stmt.setBoolean(3, false);
                stmt.setBoolean(4, true);
            }
            
            if ( this.validateNIM() ) {
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Insert data sukses");
                 this.renderTable();
            } else {
                JOptionPane.showMessageDialog(this, "NIM tidak ditemukan");
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Rekap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        try {
            // TODO add your handling code here:
            TabelMahasiswa.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Rekap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed
    
    private boolean validateNIM() throws SQLException {
        Connection conn = uas_kel1.koneksi.koneksiDB();
        Statement stmt = conn.createStatement();
        String SQL = "SELECT NIM from mhs WHERE nim = " + nim.getText();
        
        try {
            ResultSet results = stmt.executeQuery(SQL);
            if  ( results.next() ) {
                return true;
            }
        } catch( SQLException ex ) {
            Logger.getLogger(Rekap.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
//    private boolean[] generateAbsensi() {
////        String selected = absensi.getSelectedItem().toString();
////        
////        boolean[] arr= {false, false, false};
////        
////        if ( selected.equals("Hadir") )
////            arr = {};
////        
////        return arr;
//    }
    
    private void renderTable () throws SQLException {
        // Create model
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Semester");
        model.addColumn("Hadir");
        model.addColumn("Sakit");
        model.addColumn("Alfa");
        
        // binding model
        TabelMahasiswa.setModel(model);
        
        // Remove all rows before render table
        model.setNumRows(0);
        
        // Create connection
        Connection conn = uas_kel1.koneksi.koneksiDB();
        
        //  Get all mahasiswa from table "mhs"
        try {
            Statement stmt = conn.createStatement();
            String SQL = "SELECT * FROM mhs ";
            ResultSet results = stmt.executeQuery(SQL);
            
            while ( results.next() ) {
                // Get data from table absensi using NIM as a spesific key
                model.addRow( new Object[] {
                    results.getString("NIM"),
                    results.getString("nama"),
                    results.getString("semester"),
                    // Hadir
                    this.countQuery(conn, "SELECT COUNT(NIM) FROM absensi WHERE hadir = 1 AND NIM = " + results.getString("NIM") ),
                    // Sakit
                    this.countQuery(conn, "SELECT COUNT(NIM) FROM absensi WHERE sakit = 1 AND NIM = " + results.getString("NIM") ),
                    // Alfa
                    this.countQuery(conn, "SELECT COUNT(NIM) FROM absensi WHERE alfa = 1 AND NIM = " + results.getString("NIM") )
                });
            }
        } catch( SQLException ex ) {
            Logger.getLogger(Rekap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String countQuery (Connection conn, String SQL ) throws SQLException  {
        Statement stmt = conn.createStatement();
        ResultSet counts = stmt.executeQuery(SQL);
        try {
            if ( counts.next() ) {
                return counts.getInt(1) + "";
            }
        } catch( SQLException ex ) {
            
        } finally {
            try { if (counts != null) counts.close(); } catch (Exception e) {};
        }
        return "0";
    }
    
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
            java.util.logging.Logger.getLogger(Rekap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rekap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rekap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rekap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Rekap().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Rekap.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TabelMahasiswa;
    private javax.swing.JComboBox<String> absensi;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.TextField nim;
    private javax.swing.JButton refresh;
    private javax.swing.JComboBox<String> semester;
    private java.awt.Button submit;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_kel1;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LABKOM2-17
 */
public class MMahasiswa extends javax.swing.JFrame {
    
    DefaultTableModel tabModel;
    ResultSet RsMahasiswa=null;
    /**
     * Creates new form MMahasiswa
     */
    
    public MMahasiswa() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(0,164,250));
        
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize=this.getSize();
        if(frameSize.height > screenSize.height){
        frameSize.height=screenSize.height;
        }
        if(frameSize.width > screenSize.width){
        frameSize.width=screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2,
        (screenSize.height = screenSize.height) / 20); 
        
        //fungsi Tampil data dan set edit off dijalankan saat aplikasi di run
        tampilData();
        SetEditOff();
    }

            private void tampilData(){
        try{
            Object[] judul_kolom = {"NIM", "semester ", "nama", "kelamin", "no_telp", "Alamat"};
            tabModel=new DefaultTableModel(null,judul_kolom);
            TabelMahasiswa.setModel(tabModel);
            
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            RsMahasiswa=stt.executeQuery("SELECT * from mhs ");  
            while(RsMahasiswa.next()){
                Object[] data={
                    RsMahasiswa.getString("NIM"),
                    RsMahasiswa.getString("semester"),
                    RsMahasiswa.getString("nama"),
                    RsMahasiswa.getString("kelamin"),
                    RsMahasiswa.getString("no_telp"),
                    RsMahasiswa.getString("Alamat")         
                };
               tabModel.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
        
        // disable button
        jButtonSave.setEnabled(false);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonCancel.setEnabled(false);
    
    }

               private void cariData(String key){
        try{
            Object[] judul_kolom = {"NIM", "semester ", "nama", "jenis kelamin", "Nomor Hp", "alamat"};
            tabModel=new DefaultTableModel(null,judul_kolom);
            TabelMahasiswa.setModel(tabModel);
            
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            RsMahasiswa=stt.executeQuery("SELECT * from mhs WHERE NIM LIKE '%"+key+"%' OR semester LIKE '%"+key+"%' OR nama LIKE '%"+key+"%'");  
            while(RsMahasiswa.next()){
                Object[] data={
                    RsMahasiswa.getString("NIM"),
                    RsMahasiswa.getString("semester"),
                    RsMahasiswa.getString("nama"),
                    RsMahasiswa.getString("kelamin"),
                    RsMahasiswa.getString("no_telp"),
                    RsMahasiswa.getString("alamat")        
                };
               tabModel.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
    }
                             //menampilkan data ke form saat data pada tabel di klik 
         void tblKeForm(){
        jTextNIM.setText(tabModel.getValueAt(TabelMahasiswa.getSelectedRow(),0)+"");
        jComboBoxSemester.setSelectedItem(tabModel.getValueAt(TabelMahasiswa.getSelectedRow(),1)+"");
         jTextNama.setText(tabModel.getValueAt(TabelMahasiswa.getSelectedRow(),2)+"");
         jComboBoxJeniskelamin.setSelectedItem(tabModel.getValueAt(TabelMahasiswa.getSelectedRow(),3)+"");
        jTextNomorHP.setText(tabModel.getValueAt(TabelMahasiswa.getSelectedRow(),4)+"");
        jTextAlamat.setText(tabModel.getValueAt(TabelMahasiswa.getSelectedRow(),5)+"");
        
        jButtonUpdate.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonCancel.setEnabled(true);
        jButtonSave.setEnabled(false);
    }
       //membersihkan form
   private void BersihData(){
        jTextNIM.setText("");
        jComboBoxSemester.setSelectedIndex(0);
        jTextNama.setText("");
        jComboBoxJeniskelamin.setSelectedIndex(0);
        jTextNomorHP.setText(""); 
        jTextAlamat.setText("");
    } 
   
      //disable form
   private void SetEditOff(){
        jTextNIM.setEnabled(false);
        jComboBoxSemester.setEnabled(false);
        jTextNama.setEnabled(false);
        jComboBoxJeniskelamin.setEnabled(false);
        jTextNomorHP.setEnabled(false);
        jTextAlamat.setEnabled(false);
   }
   
      private void seteditOn(){
        jTextNIM.setEnabled(true);
        jComboBoxSemester.setEnabled(true);
        jTextNama.setEnabled(true);
        jComboBoxJeniskelamin.setEnabled(true);
        jTextNomorHP.setEnabled(true);
        jTextAlamat.setEnabled(true);
   }
       private void reset(){
        jTextNIM.setText("");
        jTextNama.setText("");
        jTextNomorHP.setText("");
        jTextAlamat.setText("");
}

   
   
     //fungsi untuk menampilkan data mahasiswa ke dalam tabel          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxJeniskelamin = new javax.swing.JComboBox();
        jTextNama = new javax.swing.JTextField();
        jComboBoxSemester = new javax.swing.JComboBox();
        jTextNIM = new javax.swing.JTextField();
        jLabelHeader = new javax.swing.JLabel();
        jLabelNIM = new javax.swing.JLabel();
        jLabelSemester = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jLabelJeniskelamin = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAlamat = new javax.swing.JTextArea();
        jLabelAlamat = new javax.swing.JLabel();
        jLabelNomorHP = new javax.swing.JLabel();
        jTextNomorHP = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelMahasiswa = new javax.swing.JTable();
        TextCari = new javax.swing.JTextField();
        jLabelSearch = new javax.swing.JLabel();
        jButtonRekap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 164, 250));

        jComboBoxJeniskelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki-laki", "Perempuan" }));
        jComboBoxJeniskelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJeniskelaminActionPerformed(evt);
            }
        });

        jTextNama.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jTextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaActionPerformed(evt);
            }
        });

        jComboBoxSemester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        jComboBoxSemester.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSemesterItemStateChanged(evt);
            }
        });
        jComboBoxSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSemesterActionPerformed(evt);
            }
        });
        jComboBoxSemester.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxSemesterPropertyChange(evt);
            }
        });

        jTextNIM.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        jLabelHeader.setBackground(new java.awt.Color(0, 0, 51));
        jLabelHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelHeader.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeader.setText("Data Mahasiswa Politeknik Hasnur 4B-1");
        jLabelHeader.setOpaque(true);

        jLabelNIM.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelNIM.setText("NIM");

        jLabelSemester.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelSemester.setText("Semester");

        jLabelNama.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelNama.setText("Nama");

        jLabelJeniskelamin.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelJeniskelamin.setText("Jenis Kelamin");

        jButtonSave.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonUpdate.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonAdd.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButtonAdd.setText("AddNew");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jTextAlamat.setColumns(20);
        jTextAlamat.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jTextAlamat.setRows(5);
        jScrollPane1.setViewportView(jTextAlamat);

        jLabelAlamat.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelAlamat.setText("Alamat");

        jLabelNomorHP.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelNomorHP.setText("No. HP");

        jTextNomorHP.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        exit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Semester", "Nama", "Jenis Kelamin", "No.HP", "Alamat"
            }
        ));
        TabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabelMahasiswa);

        TextCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCariActionPerformed(evt);
            }
        });
        TextCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextCariKeyReleased(evt);
            }
        });

        jLabelSearch.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelSearch.setText("Search");

        jButtonRekap.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButtonRekap.setText("RECAP");
        jButtonRekap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRekapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSemester)
                            .addComponent(jLabelNama)
                            .addComponent(jComboBoxSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextNama)
                            .addComponent(jTextNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomorHP)
                                    .addComponent(jTextNomorHP, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAlamat))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelJeniskelamin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxJeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSearch)
                        .addGap(104, 699, Short.MAX_VALUE))
                    .addComponent(TextCari)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRekap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomorHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNomorHP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAlamat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRekap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxJeniskelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJeniskelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxJeniskelaminActionPerformed

    private void jTextNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamaActionPerformed

    private void jComboBoxSemesterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSemesterItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSemesterItemStateChanged

    private void jComboBoxSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSemesterActionPerformed

    private void jComboBoxSemesterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxSemesterPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSemesterPropertyChange

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        String NIM=jTextNIM.getText();
        String semester=jComboBoxSemester.getSelectedItem().toString();
        String nama=jTextNama.getText();
        String kelamin=jComboBoxJeniskelamin.getSelectedItem().toString();
        String no_telp=jTextNomorHP.getText();
        String alamat=jTextAlamat.getText();

        java.util.Date tanggal = new java.util.Date();
        java.text.SimpleDateFormat TanggalFormat= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String CreateDate=TanggalFormat.format(tanggal);

        if (NIM.isEmpty() ) {
            JOptionPane.showMessageDialog(this,"NIM  tidak boleh kosong");
            jTextNIM.requestFocus();
        }else if (semester.isEmpty()) {
            JOptionPane.showMessageDialog(this,"semester tidak boleh kosong");
            jComboBoxSemester.requestFocus();
        }else if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(this,"nama tidak boleh kosong");
            jTextNama.requestFocus();
        }else if (kelamin.isEmpty()) {
            JOptionPane.showMessageDialog(this,"kelamin tidak boleh kosong");
            jComboBoxJeniskelamin.requestFocus();
        }else if (no_telp.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Nomor HP tidak boleh kosong");
            jTextNomorHP.requestFocus();
        }else if (alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Alamat tidak boleh kosong");
            jTextAlamat.requestFocus();
        }
        else if (!(new Scanner(NIM).hasNextInt())) {
            JOptionPane.showMessageDialog(this,"NIM harus angka");
            jTextNIM.requestFocus();
        }else{
            try{
                Connection conn=(Connection)koneksi.koneksiDB();
                Statement stt=conn.createStatement();
                stt.executeUpdate("insert into mhs(NIM,semester,nama,kelamin,no_telp,alamat)"+
                    "VALUES('"+NIM+"','"+semester+"','"+nama+"','"+kelamin+"','"+no_telp+"','"+alamat+"')");
                BersihData();
                tampilData();
                SetEditOff();
                JOptionPane.showMessageDialog(this,"Data berhasil disimpan","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Simpan data gagal \n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String NIM=jTextNIM.getText();
        String semester=jComboBoxSemester.getSelectedItem().toString();
        String nama=jTextNama.getText();
        String kelamin=jComboBoxJeniskelamin.getSelectedItem().toString();
        String no_telp=jTextNomorHP.getText();
        String alamat=jTextAlamat.getText();

        java.util.Date tanggal = new java.util.Date();
        java.text.SimpleDateFormat TanggalFormat= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String CreateDate=TanggalFormat.format(tanggal);

        if (NIM.isEmpty() ) {
            JOptionPane.showMessageDialog(this,"NIM tidak boleh kosong");
            jTextNIM.requestFocus();
        }else if (semester.isEmpty()) {
            JOptionPane.showMessageDialog(this,"semester tidak boleh kosong");
            jComboBoxSemester.requestFocus();
        }else if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(this,"nama tidak boleh kosong");
            jTextNama.requestFocus();
        }else if (kelamin.isEmpty()) {
            JOptionPane.showMessageDialog(this,"kelamin tidak boleh kosong");
            jComboBoxJeniskelamin.requestFocus();
        }else if (no_telp.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Nomor HP tidak boleh kosong");
            jTextNomorHP.requestFocus();
        }else if (alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Alamat tidak boleh kosong");
            jTextAlamat.requestFocus();
        }
        else if (!(new Scanner(NIM).hasNextInt())) {
            JOptionPane.showMessageDialog(this,"NIM harus angka");
            jTextNIM.requestFocus();
        }else{
            try{
                Connection conn=(Connection)koneksi.koneksiDB();
                Statement stt=conn.createStatement();
                stt.executeUpdate("UPDATE mhs set semester='"+semester+"',nama='"+nama+"', kelamin='"+kelamin+"', no_telp='"+no_telp+"',"+"alamat='"+alamat+"' WHERE NIM='"+NIM+"'");
                System.out.println("UPDATE mhs set semester='"+semester+"',nama='"+nama+"', kelamin='"+kelamin+"', no_telp='"+no_telp+"',"+"alamat='"+alamat+"' WHERE NIM='"+NIM+"'");
                BersihData();
                tampilData();
                SetEditOff();
                JOptionPane.showMessageDialog(this,"Data berhasil diubah","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Ubah data gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        String NIM=jTextNIM.getText();

        if (NIM.isEmpty() ) {
            JOptionPane.showMessageDialog(this,"NIM tidak boleh kosong");
            jTextNIM.requestFocus();
        }else if(JOptionPane.showConfirmDialog(this,"Apakah anda yakin akan menghapus data ini?",
            "Informasi",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE)==JOptionPane.OK_OPTION){
        try{
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            stt.executeUpdate("DELETE FROM mhs WHERE NIM='"+NIM+"'");
            BersihData();
            tampilData();
            SetEditOff();
            JOptionPane.showMessageDialog(this,"Data berhasil di hapus","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Delete data gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        BersihData();
        jButtonSave.setEnabled(false);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
        SetEditOff();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        BersihData();
        jTextNIM.requestFocus();
        jButtonSave.setEnabled(true);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
        seteditOn();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // RESET
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
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
    }//GEN-LAST:event_exitActionPerformed

    private void TabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMahasiswaMouseClicked
        // TODO add your handling code here:
        seteditOn();
        jTextNIM.setEnabled(false);
        tblKeForm();
    }//GEN-LAST:event_TabelMahasiswaMouseClicked

    private void TextCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCariActionPerformed

    private void TextCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCariKeyReleased
        // MENAMPILKAN CARI
        String key=TextCari.getText();
        System.out.println(key);

        if(key!=""){
            cariData(key);
        }else{
            tampilData();
        }
    }//GEN-LAST:event_TextCariKeyReleased

    private void jButtonRekapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRekapActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new Rekap().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRekapActionPerformed

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
            java.util.logging.Logger.getLogger(MMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TabelMahasiswa;
    private javax.swing.JTextField TextCari;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonRekap;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox jComboBoxJeniskelamin;
    private javax.swing.JComboBox jComboBoxSemester;
    private javax.swing.JLabel jLabelAlamat;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelJeniskelamin;
    private javax.swing.JLabel jLabelNIM;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelNomorHP;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelSemester;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAlamat;
    private javax.swing.JTextField jTextNIM;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JTextField jTextNomorHP;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.*;

/**
 *
 * @author bhadr
 */
public class EditPermintaanView extends javax.swing.JFrame {

    /**
     * Creates new form TambahPenjemputanView
     */
    public EditPermintaanView() {
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

        simpanBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuBeratPoint = new javax.swing.JButton();
        menuHome = new javax.swing.JButton();
        menuKurir = new javax.swing.JButton();
        menuPenjemputan = new javax.swing.JButton();
        menuPermintaan = new javax.swing.JButton();
        menuRiwayat = new javax.swing.JButton();
        menuTracking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        namaPelanggan = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        alamatLabel = new javax.swing.JLabel();
        alamatLabel1 = new javax.swing.JLabel();
        jenisSampah = new javax.swing.JComboBox<>();
        beratLabel = new javax.swing.JLabel();
        beratSampah = new javax.swing.JTextField();
        hapusBtn = new javax.swing.JButton();
        simpanBtn2 = new javax.swing.JButton();

        simpanBtn.setBackground(new java.awt.Color(51, 153, 0));
        simpanBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        simpanBtn.setForeground(new java.awt.Color(255, 255, 255));
        simpanBtn.setText("Simpan");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(34, 139, 34));
        jPanel1.setForeground(new java.awt.Color(34, 139, 34));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 486));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GreenBytes");

        menuBeratPoint.setBackground(new java.awt.Color(50, 205, 50));
        menuBeratPoint.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuBeratPoint.setForeground(new java.awt.Color(255, 255, 255));
        menuBeratPoint.setText("Total Berat & Point");
        menuBeratPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBeratPointActionPerformed(evt);
            }
        });

        menuHome.setBackground(new java.awt.Color(50, 205, 50));
        menuHome.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuHome.setForeground(new java.awt.Color(255, 255, 255));
        menuHome.setText("Halaman Utama");
        menuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHomeActionPerformed(evt);
            }
        });

        menuKurir.setBackground(new java.awt.Color(50, 205, 50));
        menuKurir.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuKurir.setForeground(new java.awt.Color(255, 255, 255));
        menuKurir.setText("Kurir");
        menuKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKurirActionPerformed(evt);
            }
        });

        menuPenjemputan.setBackground(new java.awt.Color(50, 205, 50));
        menuPenjemputan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuPenjemputan.setForeground(new java.awt.Color(255, 255, 255));
        menuPenjemputan.setText("Status Penjemputan");
        menuPenjemputan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPenjemputanActionPerformed(evt);
            }
        });

        menuPermintaan.setBackground(new java.awt.Color(50, 205, 50));
        menuPermintaan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuPermintaan.setForeground(new java.awt.Color(255, 255, 255));
        menuPermintaan.setText("Permintaan");
        menuPermintaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPermintaanActionPerformed(evt);
            }
        });

        menuRiwayat.setBackground(new java.awt.Color(50, 205, 50));
        menuRiwayat.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuRiwayat.setForeground(new java.awt.Color(255, 255, 255));
        menuRiwayat.setText("Riwayat Penjemputan");
        menuRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRiwayatActionPerformed(evt);
            }
        });

        menuTracking.setBackground(new java.awt.Color(50, 205, 50));
        menuTracking.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        menuTracking.setForeground(new java.awt.Color(255, 255, 255));
        menuTracking.setText("Status Tracking");
        menuTracking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrackingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuKurir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPenjemputan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPermintaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBeratPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuRiwayat, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(menuTracking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(menuHome, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(menuKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPenjemputan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPermintaan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuTracking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuBeratPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(menuHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel2.setText("Edit Permintaan");

        namaLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        namaLabel.setText("Nama Pelanggan");

        namaPelanggan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        namaPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPelangganActionPerformed(evt);
            }
        });

        alamat.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        alamatLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        alamatLabel.setText("Alamat");

        alamatLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        alamatLabel1.setText("Jenis Sampah");

        jenisSampah.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jenisSampah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HP  ", "Laptop  ", "Televisi  ", "Kulkas  ", "Mesin Cuci  ", "AC  ", "Charger  ", "Earphone  ", "Baterai  ", "Monitor  ", "Keyboard  ", "Mouse  ", "Kamera Digital  ", "Blender  ", "Microwave  ", "Printer  ", "Power Bank  ", "Hard Drive Eksternal  ", "Router  ", "Lampu LED" }));

        beratLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        beratLabel.setText("Berat Sampah");

        beratSampah.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        beratSampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beratSampahActionPerformed(evt);
            }
        });

        hapusBtn.setBackground(new java.awt.Color(255, 0, 0));
        hapusBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        hapusBtn.setForeground(new java.awt.Color(255, 255, 255));
        hapusBtn.setText("Hapus");

        simpanBtn2.setBackground(new java.awt.Color(51, 153, 0));
        simpanBtn2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        simpanBtn2.setForeground(new java.awt.Color(255, 255, 255));
        simpanBtn2.setText("Simpan");
        simpanBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaLabel)
                            .addComponent(alamatLabel)
                            .addComponent(alamatLabel1)
                            .addComponent(beratLabel))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamat)
                            .addComponent(namaPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                            .addComponent(jenisSampah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beratSampah)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(simpanBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(namaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatLabel)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatLabel1)
                    .addComponent(jenisSampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beratLabel)
                    .addComponent(beratSampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void editPermintaan(ActionListener listener) {
        simpanBtn2.addActionListener(listener);
    }
    
    public void deletePermintaan(ActionListener listener) {
        hapusBtn.addActionListener(listener);
    }

    public void setNama(String nama){
        namaPelanggan.setText(nama);
    }

    public void setAlamat(String alamats){
        alamat.setText(alamats);
    }

    public void setBeratSampah(String berat){
        beratSampah.setText(berat);
    }

    public void setJenis(String statuss) {
        jenisSampah.setSelectedItem(statuss);
    }

    public void redirectHome(ActionListener listener){
        menuHome.addActionListener(listener);
    }
    
    public void redirectStatusPenjemputan(ActionListener listener){
        menuPenjemputan.addActionListener(listener);
    }

    public void redirectKurir(ActionListener listener){
        menuKurir.addActionListener(listener);
    }

    public void redirectRiwayat(ActionListener listener){
        menuRiwayat.addActionListener(listener);
    }
    
    public void redirectTotalBeratPoint(ActionListener listener){
        menuBeratPoint.addActionListener(listener);
    }
    
    public void redirectPermintaan(ActionListener listener){
        menuPermintaan.addActionListener(listener);
    }
    public void redirectTracking(ActionListener listener){
        menuTracking.addActionListener(listener);
    }
    
    
    private void menuBeratPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBeratPointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBeratPointActionPerformed

    private void menuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHomeActionPerformed

    private void menuKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKurirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuKurirActionPerformed

    private void menuPenjemputanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPenjemputanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPenjemputanActionPerformed

    private void menuPermintaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPermintaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPermintaanActionPerformed

    private void menuRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRiwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRiwayatActionPerformed

    private void menuTrackingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrackingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTrackingActionPerformed

    private void namaPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPelangganActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void beratSampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beratSampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beratSampahActionPerformed

    private void simpanBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simpanBtn2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField alamat;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JLabel alamatLabel1;
    private javax.swing.JLabel beratLabel;
    public javax.swing.JTextField beratSampah;
    public javax.swing.JButton hapusBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> jenisSampah;
    private javax.swing.JButton menuBeratPoint;
    private javax.swing.JButton menuHome;
    private javax.swing.JButton menuKurir;
    private javax.swing.JButton menuPenjemputan;
    private javax.swing.JButton menuPermintaan;
    private javax.swing.JButton menuRiwayat;
    private javax.swing.JButton menuTracking;
    private javax.swing.JLabel namaLabel;
    public javax.swing.JTextField namaPelanggan;
    private javax.swing.JButton simpanBtn;
    public javax.swing.JButton simpanBtn2;
    // End of variables declaration//GEN-END:variables
}

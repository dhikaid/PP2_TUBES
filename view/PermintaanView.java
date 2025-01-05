/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Kurir;
import model.Penjemputan;

import java.awt.event.*;

import model.Permintaan;

/**
 *
 * @author bhadr
 */
public class PermintaanView extends javax.swing.JFrame {

    /**
     * Creates new form TambahPenjemputanView
     */
    public PermintaanView() {
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
        menuBeratPoint = new javax.swing.JButton();
        menuHome = new javax.swing.JButton();
        menuKurir = new javax.swing.JButton();
        menuPenjemputan = new javax.swing.JButton();
        menuPermintaan = new javax.swing.JButton();
        menuRiwayat = new javax.swing.JButton();
        menuTracking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePermintaan = new javax.swing.JTable();
        btnAddPermintaan = new javax.swing.JButton();
        btnExportPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kurir");
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
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(menuHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel2.setText("Permintaan");

        tablePermintaan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Pelanggan", "Alamat", "Jenis Sampah", "Berat Sampah", "Tanggal Permintaan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePermintaan);

        btnAddPermintaan.setBackground(new java.awt.Color(0, 153, 0));
        btnAddPermintaan.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnAddPermintaan.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPermintaan.setText("Tambah Permintaan");
        btnAddPermintaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPermintaanActionPerformed(evt);
            }
        });

        btnExportPDF.setBackground(new java.awt.Color(51, 51, 255));
        btnExportPDF.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnExportPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnExportPDF.setText("Export PDF");
        btnExportPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportPDFActionPerformed(evt);
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
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddPermintaan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportPDF)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPermintaan)
                    .addComponent(btnExportPDF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Fungsi untuk mengisi data ke tabel
    public void setTableData(List<Permintaan> permintaanList) {
        // Mendapatkan model tabel
        DefaultTableModel model = (DefaultTableModel) tablePermintaan.getModel();
        
        // Menghapus data sebelumnya
        model.setRowCount(0);
        
        // Menambahkan data baru
        for (Permintaan permintaan : permintaanList) {
            model.addRow(new Object[]{
                permintaan.getId(),
                permintaan.getNamaPelanggan(),
                permintaan.getAlamat(),
                permintaan.getJenisSampah(),
                permintaan.getBeratSampah() + " kg",
                permintaan.getTanggalPermintaan(),
            });
        }
    }

    
    public void editPermintaan(MouseListener listener) {
        tablePermintaan.addMouseListener(listener);
    }

    public JTable getTable() {
        return tablePermintaan;
    }
    
    public DefaultTableModel getTableModel() {
        return (DefaultTableModel) tablePermintaan.getModel();
    }

    public void addPermintaan(ActionListener listener){
        btnAddPermintaan.addActionListener(listener);
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

    private void btnAddPermintaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPermintaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPermintaanActionPerformed

    private void btnExportPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportPDFActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddPermintaan;
    public javax.swing.JButton btnExportPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuBeratPoint;
    private javax.swing.JButton menuHome;
    private javax.swing.JButton menuKurir;
    private javax.swing.JButton menuPenjemputan;
    private javax.swing.JButton menuPermintaan;
    private javax.swing.JButton menuRiwayat;
    private javax.swing.JButton menuTracking;
    public javax.swing.JTable tablePermintaan;
    // End of variables declaration//GEN-END:variables
}

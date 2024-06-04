/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mobil;

import com.mysql.cj.protocol.Resultset;
import javax.swing.JFrame;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class mobil extends javax.swing.JFrame {

    public mobil() {
        initComponents();
        buka_tabel();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        prosesSupplierData();
    }

    private void prosesSupplierData() {
        dataIdSupplier.removeAllItems();
        try {
            java.sql.Connection conn = Koneksi.koneksi.ConnectionDB();
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery("SELECT id_supplier, nama_supplier FROM supplier");
            while (rs.next()) {
                String item = String.valueOf(rs.getInt("id_supplier") + " - " + rs.getString("nama_supplier"));
                dataIdSupplier.addItem(item);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading supplier data: " + e.getMessage());
        }
    }

    private void setPilihanSupplier(int idSupplier) {
        for (int i = 0; i < dataIdSupplier.getItemCount(); i++) {
            String item = dataIdSupplier.getItemAt(i);
            if (Integer.parseInt(item.split(" - ")[1]) == idSupplier) {
                dataIdSupplier.setSelectedIndex(i);
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        logo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        navbar = new javax.swing.JPanel();
        TombolMobil = new javax.swing.JButton();
        TombolPelanggan = new javax.swing.JButton();
        TombilSupplier = new javax.swing.JButton();
        TombolHome = new javax.swing.JButton();
        TombolTransaksi = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dataMerek = new javax.swing.JTextField();
        dataModel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dataHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dataIdSupplier = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Mobil = new javax.swing.JTable();
        Submit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        dataTahun = new javax.swing.JTextField();
        dataId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dataStatus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        dataNopol = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        header.setPreferredSize(new java.awt.Dimension(1366, 300));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Jasa Rental Mobil Terpercaya");

        jLabel12.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        jLabel12.setText("Ahmad Rental Car");

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addGroup(logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        TombolMobil.setIcon(new javax.swing.ImageIcon("F:\\download\\download 15 5 2024\\car.png")); // NOI18N
        TombolMobil.setText("Data Mobil");
        TombolMobil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TombolMobil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TombolMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolMobilActionPerformed(evt);
            }
        });

        TombolPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/client.png"))); // NOI18N
        TombolPelanggan.setText("Data Pelanggan");
        TombolPelanggan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TombolPelanggan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TombolPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolPelangganActionPerformed(evt);
            }
        });

        TombilSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/showroom.png"))); // NOI18N
        TombilSupplier.setText("Data Supplier");
        TombilSupplier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TombilSupplier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TombilSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombilSupplierActionPerformed(evt);
            }
        });

        TombolHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        TombolHome.setText("Home");
        TombolHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TombolHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TombolHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolHomeActionPerformed(evt);
            }
        });

        TombolTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sell.png"))); // NOI18N
        TombolTransaksi.setText("Data Transaksi");
        TombolTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TombolTransaksi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TombolTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TombolHome, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(TombolMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(TombolPelanggan)
                .addGap(20, 20, 20)
                .addComponent(TombilSupplier)
                .addGap(20, 20, 20)
                .addComponent(TombolTransaksi)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TombolTransaksi)
                    .addComponent(TombolHome)
                    .addComponent(TombilSupplier)
                    .addComponent(TombolPelanggan)
                    .addComponent(TombolMobil))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabel Data Mobil");

        jLabel2.setText("Merek Mobil");

        jLabel3.setText("Model Mobil");

        jLabel4.setText("Tahun Mobil");

        jLabel5.setText("Harga Sewa Mobil");

        jLabel6.setText("Status Mobil");

        Tabel_Mobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama Supplier", "No. Polisi", "Merek", "Mobil", "Tahun", "Harga Sewa", "Status"
            }
        ));
        Tabel_Mobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_MobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Mobil);

        Submit.setText("Krim");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Delete.setText("Hapus");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Edit.setText("Ubah");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        dataId.setEnabled(false);

        jLabel7.setText("Id Mobil");

        jLabel8.setText("/hari");

        dataStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tersedia", "disewa" }));

        jLabel9.setText("Supplier");

        jLabel13.setText("No. Polisi mobil");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addGap(35, 35, 35)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataId, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataIdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Submit))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Edit)
                                .addGap(28, 28, 28)
                                .addComponent(Delete))
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(dataStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataNopol, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataModel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dataTahun, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                                    .addComponent(dataHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataIdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataNopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataMerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Submit)
                            .addComponent(Delete)
                            .addComponent(Edit))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO mobil ("
                    + "supplier_id, "
                    + "nopol_mobil, "
                    + "merek_mobil, "
                    + "model_mobil, "
                    + "tahun_mobil, "
                    + "harga_sewa_mobil, "
                    + "status_mobil) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            java.sql.Connection conn = Koneksi.koneksi.ConnectionDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            // Mendapatkan ID supplier dari JComboBox
            
            String selectedSupplier = (String) dataIdSupplier.getSelectedItem();
            int idSupplier = Integer.parseInt(selectedSupplier.split(" - ")[0]);
            pst.setInt(1, idSupplier);
            pst.setString(2, dataNopol.getText());
            pst.setString(3, dataMerek.getText());
            pst.setString(4, dataModel.getText());
            pst.setInt(5, Integer.parseInt(dataTahun.getText()));
            pst.setDouble(6, Double.parseDouble(dataHarga.getText()));
            pst.setString(7, dataStatus.getSelectedItem().toString());
            
            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                java.sql.ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    int idMobil = rs.getInt(1);
                    JOptionPane.showMessageDialog(null, "Data Mobil Berhasil Disimpan dengan ID: " + idMobil);
                }
            }

            // Bersihkan inputan seteDlah penyimpanan berhasil
            dataNopol.setText("");
            dataMerek.setText("");
            dataModel.setText("");
            dataTahun.setText("");
            dataHarga.setText("");
            dataStatus.setSelectedItem("");
            dataIdSupplier.setSelectedItem("");

            Tabel_Mobil.requestFocusInWindow();
            buka_tabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM mobil WHERE id_mobil=?";

            java.sql.Connection conn = Koneksi.koneksi.ConnectionDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, Integer.parseInt(dataId.getText())); // ID mobil yang akan dihapus

            int affectedRows = pst.executeUpdate();

            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Data Mobil Berhasil Dihapus");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Menghapus Data Mobil");
            }

            // Bersihkan inputan setelah penyimpanan berhasil
            dataNopol.setText("");
            dataMerek.setText("");
            dataModel.setText("");
            dataTahun.setText("");
            dataHarga.setText("");
            dataStatus.setSelectedItem("");
            dataIdSupplier.setSelectedItem("");

            // Refresh tabel setelah penghapusan data
            buka_tabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE mobil SET "
                    + "supplier_id=?, "
                    + "nopol_mobil=?, "
                    + "merek_mobil=?, "
                    + "model_mobil=?, "
                    + "tahun_mobil=?, "
                    + "harga_sewa_mobil=?, "
                    + "status_mobil=? "
                    + "WHERE id_mobil=?";

            java.sql.Connection conn = Koneksi.koneksi.ConnectionDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            // Mendapatkan ID supplier dari JComboBox
            String selectedSupplier = (String) dataIdSupplier.getSelectedItem();
            int idSupplier = Integer.parseInt(selectedSupplier.split(" - ")[0]);
            pst.setInt(1, idSupplier);
            
            pst.setString(2, dataNopol.getText());
            pst.setString(3, dataMerek.getText());
            pst.setString(4, dataModel.getText());
            pst.setInt(5, Integer.parseInt(dataTahun.getText()));
            pst.setDouble(6, Double.parseDouble(dataHarga.getText()));
            pst.setString(7, dataStatus.getSelectedItem().toString());
            pst.setInt(8, Integer.parseInt(dataId.getText())); // ID mobil yang akan diubah

            int affectedRows = pst.executeUpdate();

            // Bersihkan inputan setelah penyimpanan berhasil
            dataNopol.setText("");
            dataMerek.setText("");
            dataModel.setText("");
            dataTahun.setText("");
            dataHarga.setText("");
            dataStatus.setSelectedItem("");
            dataIdSupplier.setSelectedItem("");
            // Refresh tabel setelah perubahan data
            buka_tabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_EditActionPerformed

    private void Tabel_MobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_MobilMouseClicked
        // TODO add your handling code here:
        int row = Tabel_Mobil.getSelectedRow();
        dataId.setText(Tabel_Mobil.getModel().getValueAt(row, 0).toString());
        dataIdSupplier.setSelectedItem(Tabel_Mobil.getModel().getValueAt(row, 1).toString());
        dataNopol.setText(Tabel_Mobil.getModel().getValueAt(row, 2).toString());
        dataMerek.setText(Tabel_Mobil.getModel().getValueAt(row, 3).toString());
        dataModel.setText(Tabel_Mobil.getModel().getValueAt(row, 4).toString());
        dataTahun.setText(Tabel_Mobil.getModel().getValueAt(row, 5).toString());
        dataHarga.setText(Tabel_Mobil.getModel().getValueAt(row, 6).toString());
        dataStatus.setSelectedItem(Tabel_Mobil.getModel().getValueAt(row, 7).toString());
    }//GEN-LAST:event_Tabel_MobilMouseClicked

    private void TombolMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolMobilActionPerformed
        this.setVisible(false);
        new mobil().setVisible(true);
    }//GEN-LAST:event_TombolMobilActionPerformed

    private void TombolPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolPelangganActionPerformed
        this.setVisible(false);
        new pelanggan.pelanggan().setVisible(true);
    }//GEN-LAST:event_TombolPelangganActionPerformed

    private void TombilSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombilSupplierActionPerformed
        this.setVisible(false);
        new supplier.supplier().setVisible(true);
    }//GEN-LAST:event_TombilSupplierActionPerformed

    private void TombolHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolHomeActionPerformed
        this.setVisible(false);
        new Menu.Menu().setVisible(true);
    }//GEN-LAST:event_TombolHomeActionPerformed

    private void TombolTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolTransaksiActionPerformed
        this.setVisible(false);
        new transaksi.transaksi().setVisible(true);
    }//GEN-LAST:event_TombolTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Submit;
    private javax.swing.JTable Tabel_Mobil;
    private javax.swing.JButton TombilSupplier;
    private javax.swing.JButton TombilSupplier3;
    private javax.swing.JButton TombilSupplier4;
    private javax.swing.JButton TombolHome;
    private javax.swing.JButton TombolHome2;
    private javax.swing.JButton TombolHome3;
    private javax.swing.JButton TombolMobil;
    private javax.swing.JButton TombolMobil3;
    private javax.swing.JButton TombolMobil4;
    private javax.swing.JButton TombolPelanggan;
    private javax.swing.JButton TombolPelanggan3;
    private javax.swing.JButton TombolPelanggan4;
    private javax.swing.JButton TombolTransaksi;
    private javax.swing.JButton TombolTransaksi3;
    private javax.swing.JButton TombolTransaksi4;
    private javax.swing.JTextField dataHarga;
    private javax.swing.JTextField dataId;
    private javax.swing.JComboBox<String> dataIdSupplier;
    private javax.swing.JTextField dataMerek;
    private javax.swing.JTextField dataModel;
    private javax.swing.JTextField dataNopol;
    private javax.swing.JComboBox<String> dataStatus;
    private javax.swing.JTextField dataTahun;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel main;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel navbar3;
    private javax.swing.JPanel navbar4;
    // End of variables declaration//GEN-END:variables

    private void buka_tabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nama Supplier");
        model.addColumn("No. Polisi");
        model.addColumn("Merek Mobil");
        model.addColumn("Model Mobil");
        model.addColumn("Tahun Mobil");
        model.addColumn("Harga Sewa");
        model.addColumn("Status");

        try {
            String sql = "SELECT mobil.id_mobil, "
                    + "supplier.nama_supplier, "
                    + "mobil.nopol_mobil, "
                    + "mobil.merek_mobil, "
                    + "mobil.model_mobil, "
                    + "mobil.tahun_mobil, "
                    + "mobil.harga_sewa_mobil, "
                    + "mobil.status_mobil "
                    + "FROM mobil "
                    + "JOIN supplier ON mobil.supplier_id = supplier.id_supplier";
            java.sql.Connection conn = Koneksi.koneksi.ConnectionDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString("id_mobil"),
                    res.getString("nama_supplier"),
                    res.getString("nopol_mobil"),
                    res.getString("merek_mobil"),
                    res.getString("model_mobil"),
                    res.getString("tahun_mobil"),
                    res.getString("harga_sewa_mobil"),
                    res.getString("status_mobil")
                });
            }
            Tabel_Mobil.setModel(model);
        } catch (Exception e) {
            e.printStackTrace(); // Untuk debugging, print stack trace dari exception
        }
    }
}

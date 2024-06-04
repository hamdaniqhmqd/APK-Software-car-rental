/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pelanggan;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

public class pelanggan extends javax.swing.JFrame {

    public pelanggan() {
        initComponents();
        buka_pelanggan();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submit2 = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        dataId = new javax.swing.JTextField();
        dataNama = new javax.swing.JTextField();
        dataAlamat = new javax.swing.JTextField();
        dataNomor = new javax.swing.JTextField();
        dataEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPelanggan = new javax.swing.JTable();
        dataNoKtp = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        atas = new javax.swing.JPanel();
        logo5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        navbar = new javax.swing.JPanel();
        TombolMobil = new javax.swing.JButton();
        TombolPelanggan = new javax.swing.JButton();
        TombilSupplier = new javax.swing.JButton();
        TombolHome = new javax.swing.JButton();
        TombolTransaksi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabel Data Pelanggan");

        jLabel7.setText("Id Pelanggan");

        jLabel2.setText("Nama Pelanggan");

        jLabel3.setText("Alamat Pelanggan");

        jLabel4.setText("No. HP Pelanggan");

        jLabel5.setText("Email Pelanggan");

        submit2.setText("Kirim");
        submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit2ActionPerformed(evt);
            }
        });

        edit.setText("Ubah");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setText("Hapus");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        dataId.setEnabled(false);

        dataNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNomorActionPerformed(evt);
            }
        });

        tabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "No. KTP", "Nama", "Alamat", "No. HP", "Email"
            }
        ));
        tabelPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPelanggan);

        jLabel25.setText("No. KTP");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(submit2)
                                .addGap(18, 18, 18)
                                .addComponent(edit)
                                .addGap(18, 18, 18)
                                .addComponent(delete))
                            .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dataEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dataAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dataNoKtp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))))
                .addGap(936, 936, 936))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(mainLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 31, Short.MAX_VALUE)
                            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dataId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dataNama, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(168, 168, 168)))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNoKtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit2)
                    .addComponent(edit)
                    .addComponent(delete))
                .addGap(27, 27, 27))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dataId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dataNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("Jasa Rental Mobil Terpercaya");

        jLabel24.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        jLabel24.setText("Ahmad Rental Car");

        javax.swing.GroupLayout logo5Layout = new javax.swing.GroupLayout(logo5);
        logo5.setLayout(logo5Layout);
        logo5Layout.setHorizontalGroup(
            logo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel22)
                .addGap(26, 26, 26)
                .addGroup(logo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logo5Layout.setVerticalGroup(
            logo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo5Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logo5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
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
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TombolTransaksi)
                    .addComponent(TombolHome)
                    .addComponent(TombilSupplier)
                    .addComponent(TombolPelanggan)
                    .addComponent(TombolMobil))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout atasLayout = new javax.swing.GroupLayout(atas);
        atas.setLayout(atasLayout);
        atasLayout.setHorizontalGroup(
            atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atasLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(logo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        atasLayout.setVerticalGroup(
            atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atasLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit2ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO pelanggan ("
                    + "no_ktp_pelanggan, "
                    + "nama_pelanggan, "
                    + "alamat_pelanggan, "
                    + "no_telepon_pelanggan, "
                    + "email_pelanggan) "
                    + "VALUES (?, ?, ?, ?, ?)";

            java.sql.Connection conn = Koneksi.koneksi.ConnectionDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

            pst.setLong(1, Long.parseLong(dataNoKtp.getText()));
            pst.setString(2, dataNama.getText());
            pst.setString(3, dataAlamat.getText());
            pst.setInt(4, Integer.parseInt(dataNomor.getText()));
            pst.setString(5, dataEmail.getText());

            int affectedRows = pst.executeUpdate();

            if (affectedRows > 0) {
                java.sql.ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    int id_pelanggan = rs.getInt(1);
                    JOptionPane.showMessageDialog(null, "Data Pelanggan Berhasil Disimpan dengan ID: " + id_pelanggan);
                }
            }

            // Bersihkan inputan setelah penyimpanan berhasil
            dataNoKtp.setText("");
            dataNama.setText("");
            dataAlamat.setText("");
            dataNomor.setText("");
            dataEmail.setText("");

            tabelPelanggan.requestFocusInWindow();
            buka_pelanggan();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_submit2ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE pelanggan SET "
                    + "no_ktp_pelanggan=?, "
                    + "nama_pelanggan=?, "
                    + "alamat_pelanggan=?, "
                    + "no_telepon_pelanggan=?, "
                    + "email_pelanggan=? "
                    + "WHERE id_pelanggan=?";

            java.sql.Connection conn = Koneksi.koneksi.ConnectionDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setLong(1, Long.parseLong(dataNoKtp.getText()));
            pst.setString(2, dataNama.getText());
            pst.setString(3, dataAlamat.getText());
            pst.setInt(4, Integer.parseInt(dataNomor.getText()));
            pst.setString(5, dataEmail.getText());
            pst.setInt(6, Integer.parseInt(dataId.getText())); // ID mobil yang akan diubah

            int affectedRows = pst.executeUpdate();
            // Bersihkan inputan setelah penyimpanan berhasil
            dataNoKtp.setText("");
            dataNama.setText("");
            dataAlamat.setText("");
            dataNomor.setText("");
            dataEmail.setText("");

            tabelPelanggan.requestFocusInWindow();

            // Refresh tabel setelah perubahan data
            buka_pelanggan();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM pelanggan WHERE id_pelanggan=?";

            java.sql.Connection conn = Koneksi.koneksi.ConnectionDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, Integer.parseInt(dataId.getText())); // ID mobil yang akan dihapus

            int affectedRows = pst.executeUpdate();

            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Data Pelanggan Berhasil Dihapus");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Menghapus Data pelanggan");
            }

            // Bersihkan inputan setelah penyimpanan berhasil
            dataNoKtp.setText("");
            dataNama.setText("");
            dataAlamat.setText("");
            dataNomor.setText("");
            dataEmail.setText("");

            tabelPelanggan.requestFocusInWindow();
            // Refresh tabel setelah penghapusan data
            buka_pelanggan();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void tabelPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPelangganMouseClicked
        // TODO add your handling code here:
        int row = tabelPelanggan.getSelectedRow();
        dataId.setText(tabelPelanggan.getModel().getValueAt(row, 0).toString());
        dataNoKtp.setText(tabelPelanggan.getModel().getValueAt(row, 1).toString());
        dataNama.setText(tabelPelanggan.getModel().getValueAt(row, 2).toString());
        dataAlamat.setText(tabelPelanggan.getModel().getValueAt(row, 3).toString());
        dataNomor.setText(tabelPelanggan.getModel().getValueAt(row, 4).toString());
        dataEmail.setText(tabelPelanggan.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_tabelPelangganMouseClicked

    private void TombolMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolMobilActionPerformed
        this.setVisible(false);
        new mobil.mobil().setVisible(true);
    }//GEN-LAST:event_TombolMobilActionPerformed

    private void TombolPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolPelangganActionPerformed
        this.setVisible(false);
        new pelanggan().setVisible(true);
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

    private void dataNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNomorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNomorActionPerformed

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
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TombilSupplier;
    private javax.swing.JButton TombolHome;
    private javax.swing.JButton TombolMobil;
    private javax.swing.JButton TombolPelanggan;
    private javax.swing.JButton TombolTransaksi;
    private javax.swing.JPanel atas;
    private javax.swing.JTextField dataAlamat;
    private javax.swing.JTextField dataEmail;
    private javax.swing.JTextField dataId;
    private javax.swing.JTextField dataNama;
    private javax.swing.JTextField dataNoKtp;
    private javax.swing.JTextField dataNomor;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel header2;
    private javax.swing.JPanel header3;
    private javax.swing.JPanel header4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel logo1;
    private javax.swing.JPanel logo2;
    private javax.swing.JPanel logo3;
    private javax.swing.JPanel logo4;
    private javax.swing.JPanel logo5;
    private javax.swing.JPanel main;
    private javax.swing.JPanel navbar;
    private javax.swing.JButton submit2;
    private javax.swing.JTable tabelPelanggan;
    // End of variables declaration//GEN-END:variables

    private void buka_pelanggan() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("No. KTP");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("No. HP");
        model.addColumn("Email");

        try {
            String sql = "SELECT * FROM pelanggan";
            java.sql.Connection conn = (Connection) Koneksi.koneksi.ConnectionDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6),});
            }
            tabelPelanggan.setModel(model);
        } catch (Exception e) {

        }
    }
}

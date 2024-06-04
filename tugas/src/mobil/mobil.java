/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mobil;

import com.mysql.cj.protocol.Resultset;
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
        setLocationRelativeTo(this);
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

        jPanel1 = new javax.swing.JPanel();
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama Supplier", "Merek", "Mobil", "Tahun", "Harga Sewa", "Status"
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

        jLabel9.setText("Id Supplier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Submit))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(dataTahun, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dataModel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dataMerek, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dataIdSupplier, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE)
                                        .addComponent(dataId, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(1, 1, 1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(dataHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Edit)
                                    .addGap(28, 28, 28)
                                    .addComponent(Delete))
                                .addComponent(dataStatus, 0, 209, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataIdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataMerek))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataTahun)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataHarga)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Submit)
                            .addComponent(Delete)
                            .addComponent(Edit))
                        .addGap(20, 20, 20))))
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
                    + "merek_mobil, "
                    + "model_mobil, "
                    + "tahun_mobil, "
                    + "harga_sewa_mobil, "
                    + "status_mobil) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";

            java.sql.Connection conn = Koneksi.koneksi.ConnectionDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

            // Mendapatkan ID supplier dari JComboBox
            String selectedSupplier = (String) dataIdSupplier.getSelectedItem();
            int idSupplier = Integer.parseInt(selectedSupplier.split(" - ")[0]);
            pst.setInt(1, idSupplier);

            pst.setString(2, dataMerek.getText());
            pst.setString(3, dataModel.getText());
            pst.setInt(4, Integer.parseInt(dataTahun.getText()));
            pst.setDouble(5, Double.parseDouble(dataHarga.getText()));
            pst.setString(6, dataStatus.getSelectedItem().toString());

            int affectedRows = pst.executeUpdate();

            if (affectedRows > 0) {
                java.sql.ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    int idMobil = rs.getInt(1);
                    JOptionPane.showMessageDialog(null, "Data Mobil Berhasil Disimpan dengan ID: " + idMobil);
                }
            }

            // Bersihkan inputan setelah penyimpanan berhasil
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

            pst.setString(2, dataMerek.getText());
            pst.setString(3, dataModel.getText());
            pst.setInt(4, Integer.parseInt(dataTahun.getText()));
            pst.setDouble(5, Double.parseDouble(dataHarga.getText()));
            pst.setString(6, dataStatus.getSelectedItem().toString());
            pst.setInt(7, Integer.parseInt(dataId.getText())); // ID mobil yang akan diubah

            int affectedRows = pst.executeUpdate();

            // Bersihkan inputan setelah penyimpanan berhasil
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
        dataMerek.setText(Tabel_Mobil.getModel().getValueAt(row, 2).toString());
        dataModel.setText(Tabel_Mobil.getModel().getValueAt(row, 3).toString());
        dataTahun.setText(Tabel_Mobil.getModel().getValueAt(row, 4).toString());
        dataHarga.setText(Tabel_Mobil.getModel().getValueAt(row, 5).toString());
        dataStatus.setSelectedItem(Tabel_Mobil.getModel().getValueAt(row, 6).toString());
    }//GEN-LAST:event_Tabel_MobilMouseClicked

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
    private javax.swing.JTextField dataHarga;
    private javax.swing.JTextField dataId;
    private javax.swing.JComboBox<String> dataIdSupplier;
    private javax.swing.JTextField dataMerek;
    private javax.swing.JTextField dataModel;
    private javax.swing.JComboBox<String> dataStatus;
    private javax.swing.JTextField dataTahun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void buka_tabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nama Supplier");
        model.addColumn("Merek Mobil");
        model.addColumn("Model Mobil");
        model.addColumn("Tahun Mobil");
        model.addColumn("Harga Sewa");
        model.addColumn("Status");

        try {
            String sql = "SELECT mobil.id_mobil, "
                    + "supplier.nama_supplier, "
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

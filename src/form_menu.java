/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author farid,shiddiq,reza
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class form_menu extends javax.swing.JFrame {

    /**
     * Creates new form form_tambah_menu
     */
    public form_menu() {
        initComponents();
        loadDataToTable();
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
        jLabel5 = new javax.swing.JLabel();
        btn_tambah_menu = new javax.swing.JButton();
        btn_hapus_menu = new javax.swing.JButton();
        btn_edit_menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_nama_menu = new javax.swing.JTextField();
        txt_harga_menu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbx_jenis_menu = new javax.swing.JComboBox<>();
        txt_stok_menu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DAFTAR MENU");

        jLabel5.setText("Stok");

        btn_tambah_menu.setBackground(new java.awt.Color(153, 255, 0));
        btn_tambah_menu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_tambah_menu.setText("Tambah");
        btn_tambah_menu.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_tambah_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_menuActionPerformed(evt);
            }
        });

        btn_hapus_menu.setBackground(new java.awt.Color(153, 255, 0));
        btn_hapus_menu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_hapus_menu.setText("Hapus");
        btn_hapus_menu.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_hapus_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus_menuActionPerformed(evt);
            }
        });

        btn_edit_menu.setBackground(new java.awt.Color(153, 255, 0));
        btn_edit_menu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_edit_menu.setText("Edit");
        btn_edit_menu.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_edit_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_menuActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Menu");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Menu", "Nama Menu", "Harga Menu", "Jenis Menu", "Stok"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(102, 255, 204));
        jTable1.setSelectionBackground(new java.awt.Color(153, 255, 204));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Harga Menu");

        jLabel4.setText("Jenis Menu");

        cbx_jenis_menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DASHBOARD");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_harga_menu)
                            .addComponent(txt_nama_menu)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_stok_menu, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_tambah_menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbx_jenis_menu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btn_hapus_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_edit_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nama_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_harga_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_jenis_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_stok_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_hapus_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(btn_tambah_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_edit_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_menuActionPerformed
        // TODO add your handling code here:
        editMenu();
        loadDataToTable();
    }//GEN-LAST:event_btn_edit_menuActionPerformed

    private void btn_hapus_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus_menuActionPerformed
        // TODO add your handling code here:
        hapusMenu();
    }//GEN-LAST:event_btn_hapus_menuActionPerformed

    private void btn_tambah_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_menuActionPerformed
        // TODO add your handling code here:
        tambahMenu();
        loadDataToTable();
    }//GEN-LAST:event_btn_tambah_menuActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0) {
        txt_nama_menu.setText(jTable1.getValueAt(selectedRow, 1).toString());
        txt_harga_menu.setText(jTable1.getValueAt(selectedRow, 2).toString());
        cbx_jenis_menu.setSelectedItem(jTable1.getValueAt(selectedRow, 3).toString());
        txt_stok_menu.setText(jTable1.getValueAt(selectedRow, 4).toString());
    }
    
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
        
        Dashboard.getInstance().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(form_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_menu().setVisible(true);
            }
        });
    }
    
    private void tambahMenu() {
        String namaMenu = txt_nama_menu.getText();
        String hargaMenu = txt_harga_menu.getText();
        String jenisMenu = cbx_jenis_menu.getSelectedItem().toString();
        String stokMenu = txt_stok_menu.getText();

        String sql = "INSERT INTO `menu`(`nama_menu`, `harga_menu`, `jenis_menu`, `stok`) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rm-padang", "root", "");
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, namaMenu);
            pst.setString(2, hargaMenu);
            pst.setString(3, jenisMenu);
            pst.setString(4, stokMenu);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data: " + e.getMessage());
        }
    }
    
    private void editMenu() {
         int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0) {
        int idMenu = Integer.parseInt(jTable1.getValueAt(selectedRow, 0).toString());
        String namaMenu = txt_nama_menu.getText();
        String hargaMenu = txt_harga_menu.getText();
        String jenisMenu = cbx_jenis_menu.getSelectedItem().toString();
        String stokMenu = txt_stok_menu.getText();

        String sql = "UPDATE `menu` SET `nama_menu` = ?, `harga_menu` = ?, `jenis_menu` = ?, `stok` = ? WHERE `id_menu` = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rm-padang", "root", "");
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, namaMenu);
            pst.setString(2, hargaMenu);
            pst.setString(3, jenisMenu);
            pst.setString(4, stokMenu);
            pst.setInt(5, idMenu);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diedit!");
            loadDataToTable();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal mengedit data: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin diedit!");
    }
    }
    
    private void hapusMenu() {
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0) {
        int idMenu = Integer.parseInt(jTable1.getValueAt(selectedRow, 0).toString());
        String sql = "DELETE FROM `menu` WHERE `id_menu` = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rm-padang", "root", "");
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setInt(1, idMenu);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            loadDataToTable();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
    }
    }
    
    private void loadDataToTable() {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            String sql = "SELECT * FROM `menu`";

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rm-padang", "root", "");
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    int idMenu = rs.getInt("id_menu");
                    String namaMenu = rs.getString("nama_menu");
                    String hargaMenu = rs.getString("harga_menu");
                    String jenisMenu = rs.getString("jenis_menu");
                    int stok = rs.getInt("stok");

                    model.addRow(new Object[]{idMenu, namaMenu, hargaMenu, jenisMenu, stok});
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
            }
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit_menu;
    private javax.swing.JButton btn_hapus_menu;
    private javax.swing.JButton btn_tambah_menu;
    private javax.swing.JComboBox<String> cbx_jenis_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_harga_menu;
    private javax.swing.JTextField txt_nama_menu;
    private javax.swing.JTextField txt_stok_menu;
    // End of variables declaration//GEN-END:variables
}

package view;

import control.HakAksesControl;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sipit
 */
public class HakAksesPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormHakAkses
     */
    private HakAksesControl hakAksesControl = new HakAksesControl();

    public HakAksesPanel() {
        initComponents();
        hakAksesControl.loadLevel(this);
        hakAksesControl.disable(this);
    }

    public JCheckBox getGudangCheckBox() {
        return gudangCheckBox;
    }

    public JCheckBox getHakAksesCheckBox() {
        return hakAksesCheckBox;
    }

    public JCheckBox getHargaCheckBox() {
        return hargaCheckBox;
    }

    public JCheckBox getItemCheckBox() {
        return itemCheckBox;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public JCheckBox getKategoriCheckBox() {
        return kategoriCheckBox;
    }

    public JCheckBox getLaporanGudangCheckBox() {
        return laporanGudangCheckBox;
    }

    public JCheckBox getLaporanPembelianCheckBox() {
        return laporanPembelianCheckBox;
    }

    public JCheckBox getLaporanPenjualanCheckBox() {
        return laporanPenjualanCheckBox;
    }

    public JCheckBox getPembelianCheckBox() {
        return pembelianCheckBox;
    }

    public JCheckBox getPenggunaCheckBox() {
        return penggunaCheckBox;
    }

    public JCheckBox getPenjualanCheckBox() {
        return penjualanCheckBox;
    }

    public JComboBox getLevelComboBox() {
        return levelComboBox;
    }

    public JCheckBox getSupplierCheckBox() {
        return supplierCheckBox;
    }

    public JCheckBox getTransaksiCheckBox() {
        return transaksiCheckBox;
    }

    public JCheckBox getTransaksiGudangCheckBox() {
        return transaksiGudangCheckBox;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        baruKey1 = new javax.swing.JButton();
        levelComboBox = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        penggunaCheckBox = new javax.swing.JCheckBox();
        hakAksesCheckBox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        gudangCheckBox = new javax.swing.JCheckBox();
        itemCheckBox = new javax.swing.JCheckBox();
        hargaCheckBox = new javax.swing.JCheckBox();
        kategoriCheckBox = new javax.swing.JCheckBox();
        supplierCheckBox = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        pembelianCheckBox = new javax.swing.JCheckBox();
        penjualanCheckBox = new javax.swing.JCheckBox();
        transaksiGudangCheckBox = new javax.swing.JCheckBox();
        transaksiCheckBox = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        laporanGudangCheckBox = new javax.swing.JCheckBox();
        laporanPembelianCheckBox = new javax.swing.JCheckBox();
        laporanPenjualanCheckBox = new javax.swing.JCheckBox();
        tambahButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(231, 231, 231));
        setName("Hak Akses"); // NOI18N
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(75, 191, 96));

        jPanel6.setBackground(new java.awt.Color(65, 166, 83));

        jLabel10.setBackground(new java.awt.Color(65, 166, 83));
        jLabel10.setForeground(new java.awt.Color(65, 166, 83));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(19, 19, 19))
        );

        jPanel7.setOpaque(false);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hak Akses");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Form ini digunakan untuk membatasi ruang gerak pengguna");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("sesuai Level si pengguna program");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 40, 40));
        jLabel2.setText("Level");

        baruKey1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        baruKey1.setForeground(new java.awt.Color(40, 40, 40));
        baruKey1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/process.png"))); // NOI18N
        baruKey1.setText("Simpan");
        baruKey1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        baruKey1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baruKey1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        baruKey1.setIconTextGap(23);
        baruKey1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baruKey1ActionPerformed(evt);
            }
        });

        levelComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        levelComboBox.setForeground(new java.awt.Color(40, 40, 40));
        levelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "            ", "Item 1", "Item 2", "Item 3", "Item 4" }));
        levelComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40)));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(40, 40, 40));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(230, 199, 159));
        jPanel2.setOpaque(false);

        penggunaCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        penggunaCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        penggunaCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        penggunaCheckBox.setText("Pengguna");
        penggunaCheckBox.setBorderPaintedFlat(true);
        penggunaCheckBox.setOpaque(false);

        hakAksesCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        hakAksesCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hakAksesCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        hakAksesCheckBox.setText("Hak Akses");
        hakAksesCheckBox.setBorderPaintedFlat(true);
        hakAksesCheckBox.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hakAksesCheckBox)
                    .addComponent(penggunaCheckBox))
                .addContainerGap(577, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(penggunaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hakAksesCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sistem", jPanel2);

        jPanel3.setBackground(new java.awt.Color(230, 199, 159));
        jPanel3.setToolTipText("");
        jPanel3.setOpaque(false);

        gudangCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        gudangCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gudangCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        gudangCheckBox.setText("Gudang");
        gudangCheckBox.setToolTipText("");
        gudangCheckBox.setBorderPaintedFlat(true);
        gudangCheckBox.setOpaque(false);

        itemCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        itemCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        itemCheckBox.setText("Item");
        itemCheckBox.setToolTipText("");
        itemCheckBox.setBorderPaintedFlat(true);
        itemCheckBox.setOpaque(false);

        hargaCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        hargaCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hargaCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        hargaCheckBox.setText("Harga");
        hargaCheckBox.setToolTipText("");
        hargaCheckBox.setBorderPaintedFlat(true);
        hargaCheckBox.setOpaque(false);

        kategoriCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        kategoriCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kategoriCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        kategoriCheckBox.setText("Kategori");
        kategoriCheckBox.setToolTipText("");
        kategoriCheckBox.setBorderPaintedFlat(true);
        kategoriCheckBox.setOpaque(false);

        supplierCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        supplierCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        supplierCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        supplierCheckBox.setText("Supplier");
        supplierCheckBox.setToolTipText("");
        supplierCheckBox.setBorderPaintedFlat(true);
        supplierCheckBox.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplierCheckBox)
                    .addComponent(kategoriCheckBox)
                    .addComponent(hargaCheckBox)
                    .addComponent(itemCheckBox)
                    .addComponent(gudangCheckBox))
                .addContainerGap(547, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(gudangCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hargaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kategoriCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supplierCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Master Data", jPanel3);

        jPanel4.setBackground(new java.awt.Color(230, 199, 159));
        jPanel4.setToolTipText("");
        jPanel4.setOpaque(false);

        pembelianCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        pembelianCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pembelianCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        pembelianCheckBox.setText("Pembelian");
        pembelianCheckBox.setToolTipText("");
        pembelianCheckBox.setBorderPaintedFlat(true);
        pembelianCheckBox.setOpaque(false);

        penjualanCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        penjualanCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        penjualanCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        penjualanCheckBox.setText("Penjualan");
        penjualanCheckBox.setToolTipText("");
        penjualanCheckBox.setBorderPaintedFlat(true);
        penjualanCheckBox.setOpaque(false);

        transaksiGudangCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        transaksiGudangCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        transaksiGudangCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        transaksiGudangCheckBox.setText("Transaksi Gudang");
        transaksiGudangCheckBox.setToolTipText("");
        transaksiGudangCheckBox.setBorderPaintedFlat(true);
        transaksiGudangCheckBox.setOpaque(false);

        transaksiCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        transaksiCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        transaksiCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        transaksiCheckBox.setText("Transaksi");
        transaksiCheckBox.setToolTipText("");
        transaksiCheckBox.setBorderPaintedFlat(true);
        transaksiCheckBox.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transaksiGudangCheckBox)
                    .addComponent(transaksiCheckBox)
                    .addComponent(penjualanCheckBox)
                    .addComponent(pembelianCheckBox))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pembelianCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penjualanCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(transaksiGudangCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transaksiCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transaksi", jPanel4);

        jPanel5.setBackground(new java.awt.Color(230, 199, 159));
        jPanel5.setToolTipText("");
        jPanel5.setOpaque(false);

        laporanGudangCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        laporanGudangCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        laporanGudangCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        laporanGudangCheckBox.setText("Gudang");
        laporanGudangCheckBox.setToolTipText("");
        laporanGudangCheckBox.setBorderPaintedFlat(true);
        laporanGudangCheckBox.setOpaque(false);

        laporanPembelianCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        laporanPembelianCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        laporanPembelianCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        laporanPembelianCheckBox.setText("Pembelian");
        laporanPembelianCheckBox.setToolTipText("");
        laporanPembelianCheckBox.setBorderPaintedFlat(true);
        laporanPembelianCheckBox.setOpaque(false);

        laporanPenjualanCheckBox.setBackground(new java.awt.Color(230, 199, 159));
        laporanPenjualanCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        laporanPenjualanCheckBox.setForeground(new java.awt.Color(40, 40, 40));
        laporanPenjualanCheckBox.setText("Penjualan");
        laporanPenjualanCheckBox.setToolTipText("");
        laporanPenjualanCheckBox.setBorderPaintedFlat(true);
        laporanPenjualanCheckBox.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laporanPenjualanCheckBox)
                    .addComponent(laporanPembelianCheckBox)
                    .addComponent(laporanGudangCheckBox))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(laporanGudangCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(laporanPembelianCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(laporanPenjualanCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Laporan", jPanel5);

        tambahButton.setBackground(new java.awt.Color(255, 255, 255));
        tambahButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tambahButton.setForeground(new java.awt.Color(40, 40, 40));
        tambahButton.setText("Tambah Level");
        tambahButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tambahButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tambahButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tambahButton.setIconTextGap(23);
        tambahButton.setPreferredSize(new java.awt.Dimension(95, 29));
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        batalButton.setBackground(new java.awt.Color(255, 255, 255));
        batalButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        batalButton.setForeground(new java.awt.Color(40, 40, 40));
        batalButton.setText("Batal");
        batalButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        batalButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batalButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        batalButton.setIconTextGap(23);
        batalButton.setPreferredSize(new java.awt.Dimension(49, 29));
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(levelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(baruKey1))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(levelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(baruKey1))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(batalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel9, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel8);
    }// </editor-fold>//GEN-END:initComponents

    private void baruKey1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruKey1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baruKey1ActionPerformed

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        // TODO add your handling code here:
        hakAksesControl.clear(this);
    }//GEN-LAST:event_batalButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baruKey1;
    private javax.swing.JButton batalButton;
    private javax.swing.JCheckBox gudangCheckBox;
    private javax.swing.JCheckBox hakAksesCheckBox;
    private javax.swing.JCheckBox hargaCheckBox;
    private javax.swing.JCheckBox itemCheckBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox kategoriCheckBox;
    private javax.swing.JCheckBox laporanGudangCheckBox;
    private javax.swing.JCheckBox laporanPembelianCheckBox;
    private javax.swing.JCheckBox laporanPenjualanCheckBox;
    private javax.swing.JComboBox levelComboBox;
    private javax.swing.JCheckBox pembelianCheckBox;
    private javax.swing.JCheckBox penggunaCheckBox;
    private javax.swing.JCheckBox penjualanCheckBox;
    private javax.swing.JCheckBox supplierCheckBox;
    private javax.swing.JButton tambahButton;
    private javax.swing.JCheckBox transaksiCheckBox;
    private javax.swing.JCheckBox transaksiGudangCheckBox;
    // End of variables declaration//GEN-END:variables
}

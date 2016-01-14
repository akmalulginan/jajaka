package view;

import control.ItemControl;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sipit
 */
public class ItemPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormBarang
     */
    Boolean dapatDibeli = false;
    Boolean dapatDijual = false;
    Boolean dapatDiproduksi = false;
    Boolean dipakaiUntukProduksi = false;
    Boolean dapatDibongkar = false;
    Boolean statusBarang = false;
    byte[] gambar = null;

    public ItemPanel() {
        initComponents();
        kategoriCombo.addItem("Stok");
        kategoriCombo.addItem("Non Stok");
        loadCombo();
    }

    public void itemStateChanged(ItemEvent e, JCheckBox check, Boolean status) {
        Object source = e.getItemSelectable();
        if (source == dapatDibeliCheck) {
            status = true;
        }
        if (e.getStateChange() == ItemEvent.DESELECTED) {
            status = false;
        }

    }

    public void loadCombo() {
        this.satuanCombo.removeAllItems();
        ItemControl bC = new ItemControl();
        bC.loadSatuan(this.satuanCombo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kodeBarangText = new javax.swing.JTextField();
        barcodeText = new javax.swing.JTextField();
        namaBarangText = new javax.swing.JTextField();
        satuanCombo = new javax.swing.JComboBox();
        kategoriCombo = new javax.swing.JComboBox();
        tambahSatuanButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        statusBarangCheck = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        keteranganText = new javax.swing.JTextPane();
        gambarLabel = new javax.swing.JLabel();
        openButton = new javax.swing.JButton();
        pathText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        dapatDibeliCheck = new javax.swing.JCheckBox();
        dapatDijualCheck = new javax.swing.JCheckBox();
        dipakaiUntukProduksiCheck = new javax.swing.JCheckBox();
        dapatDiproduksiCheck = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        stokMinText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        stokMaxText = new javax.swing.JTextField();
        dapatDibongkarCheck = new javax.swing.JCheckBox();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        simpanButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(231, 231, 231));
        setName("Item"); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        jPanel4.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("Kode Item");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 40, 40));
        jLabel2.setText("Barcode");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 40, 40));
        jLabel3.setText("Nama Item");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(40, 40, 40));
        jLabel4.setText("Satuan");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(40, 40, 40));
        jLabel5.setText("Kategori");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(40, 40, 40));
        jLabel6.setText(":");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(40, 40, 40));
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(40, 40, 40));
        jLabel8.setText(":");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(40, 40, 40));
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(40, 40, 40));
        jLabel10.setText(":");

        kodeBarangText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kodeBarangText.setForeground(new java.awt.Color(40, 40, 40));

        barcodeText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        barcodeText.setForeground(new java.awt.Color(40, 40, 40));

        namaBarangText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        namaBarangText.setForeground(new java.awt.Color(40, 40, 40));

        satuanCombo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        satuanCombo.setForeground(new java.awt.Color(40, 40, 40));
        satuanCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                satuanComboMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                satuanComboMousePressed(evt);
            }
        });

        kategoriCombo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kategoriCombo.setForeground(new java.awt.Color(40, 40, 40));

        tambahSatuanButton.setText("+");
        tambahSatuanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahSatuanButtonActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(40, 40, 40));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        statusBarangCheck.setBackground(new java.awt.Color(230, 199, 159));
        statusBarangCheck.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        statusBarangCheck.setForeground(new java.awt.Color(40, 40, 40));
        statusBarangCheck.setText("Aktif");
        statusBarangCheck.setBorderPaintedFlat(true);
        statusBarangCheck.setOpaque(false);
        statusBarangCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusBarangCheckActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(40, 40, 40));
        jLabel12.setText("Keterangan  :");

        keteranganText.setBorder(null);
        keteranganText.setForeground(new java.awt.Color(40, 40, 40));
        keteranganText.setFocusCycleRoot(false);
        keteranganText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                keteranganTextMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(keteranganText);

        gambarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gift.png"))); // NOI18N

        openButton.setText("Open Image");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        pathText.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pathText)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(openButton)
                        .addGap(148, 148, 148))
                    .addComponent(gambarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusBarangCheck)
                            .addComponent(jLabel12))
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gambarLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusBarangCheck)
                    .addComponent(openButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Info Item", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        dapatDibeliCheck.setBackground(new java.awt.Color(230, 199, 159));
        dapatDibeliCheck.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dapatDibeliCheck.setForeground(new java.awt.Color(40, 40, 40));
        dapatDibeliCheck.setText("Dapat Dibeli");
        dapatDibeliCheck.setOpaque(false);
        dapatDibeliCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dapatDibeliCheckActionPerformed(evt);
            }
        });

        dapatDijualCheck.setBackground(new java.awt.Color(230, 199, 159));
        dapatDijualCheck.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dapatDijualCheck.setForeground(new java.awt.Color(40, 40, 40));
        dapatDijualCheck.setText("Dapat Dijual");
        dapatDijualCheck.setOpaque(false);
        dapatDijualCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dapatDijualCheckActionPerformed(evt);
            }
        });

        dipakaiUntukProduksiCheck.setBackground(new java.awt.Color(230, 199, 159));
        dipakaiUntukProduksiCheck.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dipakaiUntukProduksiCheck.setForeground(new java.awt.Color(40, 40, 40));
        dipakaiUntukProduksiCheck.setText("Dipakai Untuk Produksi");
        dipakaiUntukProduksiCheck.setOpaque(false);
        dipakaiUntukProduksiCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dipakaiUntukProduksiCheckActionPerformed(evt);
            }
        });

        dapatDiproduksiCheck.setBackground(new java.awt.Color(230, 199, 159));
        dapatDiproduksiCheck.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dapatDiproduksiCheck.setForeground(new java.awt.Color(40, 40, 40));
        dapatDiproduksiCheck.setText("Dapat Diproduksi");
        dapatDiproduksiCheck.setOpaque(false);
        dapatDiproduksiCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dapatDiproduksiCheckActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(40, 40, 40));
        jLabel13.setText("Stok Minimum");
        jLabel13.setEnabled(false);

        stokMinText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        stokMinText.setForeground(new java.awt.Color(40, 40, 40));
        stokMinText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40)));
        stokMinText.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(40, 40, 40));
        jLabel14.setText(":");
        jLabel14.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(40, 40, 40));
        jLabel15.setText("Stok Maximum");
        jLabel15.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(40, 40, 40));
        jLabel16.setText(":");
        jLabel16.setEnabled(false);

        stokMaxText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        stokMaxText.setForeground(new java.awt.Color(40, 40, 40));
        stokMaxText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40)));
        stokMaxText.setEnabled(false);

        dapatDibongkarCheck.setBackground(new java.awt.Color(230, 199, 159));
        dapatDibongkarCheck.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dapatDibongkarCheck.setForeground(new java.awt.Color(40, 40, 40));
        dapatDibongkarCheck.setText("Dapat Dibongkar");
        dapatDibongkarCheck.setOpaque(false);
        dapatDibongkarCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dapatDibongkarCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stokMaxText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stokMinText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dapatDiproduksiCheck)
                            .addComponent(dipakaiUntukProduksiCheck)
                            .addComponent(dapatDijualCheck)
                            .addComponent(dapatDibeliCheck)
                            .addComponent(dapatDibongkarCheck))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dapatDibeliCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dapatDijualCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dipakaiUntukProduksiCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dapatDibongkarCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dapatDiproduksiCheck)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(stokMinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(stokMaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sifat Item", jPanel2);

        simpanButton.setBackground(new java.awt.Color(36, 198, 237));
        simpanButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        simpanButton.setForeground(new java.awt.Color(40, 40, 40));
        simpanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        simpanButton.setText("Simpan");
        simpanButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        simpanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpanButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        simpanButton.setIconTextGap(18);
        simpanButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodeBarangText, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barcodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaBarangText, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(satuanCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(tambahSatuanButton))
                            .addComponent(kategoriCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(simpanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(kodeBarangText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(barcodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(namaBarangText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(satuanCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(tambahSatuanButton)))
                        .addGap(11, 11, 11)
                        .addComponent(kategoriCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(simpanButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(jPanel4, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void statusBarangCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusBarangCheckActionPerformed
        // TODO add your handling code here:
        statusBarang = statusBarangCheck.isSelected();
    }//GEN-LAST:event_statusBarangCheckActionPerformed

    private void dapatDibeliCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dapatDibeliCheckActionPerformed
        // TODO add your handling code here:
        dapatDibeli = dapatDibeliCheck.isSelected();
    }//GEN-LAST:event_dapatDibeliCheckActionPerformed

    private void dapatDijualCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dapatDijualCheckActionPerformed
        // TODO add your handling code here:
        dapatDijual = dapatDijualCheck.isSelected();
    }//GEN-LAST:event_dapatDijualCheckActionPerformed

    private void dipakaiUntukProduksiCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dipakaiUntukProduksiCheckActionPerformed
        // TODO add your handling code here:
        dipakaiUntukProduksi = dipakaiUntukProduksiCheck.isSelected();
    }//GEN-LAST:event_dipakaiUntukProduksiCheckActionPerformed

    private void dapatDiproduksiCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dapatDiproduksiCheckActionPerformed
        // TODO add your handling code here:
        dapatDiproduksi = dapatDiproduksiCheck.isSelected();
    }//GEN-LAST:event_dapatDiproduksiCheckActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        if (!kodeBarangText.getText().isEmpty()) {
            ItemControl bC = new ItemControl();
            bC.set(
                    kodeBarangText.getText(),
                    barcodeText.getText(),
                    namaBarangText.getText(),
                    kategoriCombo.getSelectedItem().toString(),
                    dapatDibeli,
                    dapatDijual,
                    dapatDiproduksi,
                    dipakaiUntukProduksi,
                    dapatDibongkar,
                    statusBarang,
                    gambar,
                    keteranganText.getText(),
                    satuanCombo.getSelectedItem().toString()
            );
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void dapatDibongkarCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dapatDibongkarCheckActionPerformed
        // TODO add your handling code here:
        dapatDibongkar = dapatDibongkarCheck.isSelected();
    }//GEN-LAST:event_dapatDibongkarCheckActionPerformed

    private void satuanComboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_satuanComboMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_satuanComboMouseEntered

    private void satuanComboMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_satuanComboMousePressed
        // TODO add your handling code here:
//        satuanDrop.removeAllItems();
//        BarangControl bC = new BarangControl();
//        bC.loadSatuan(satuanDrop);
    }//GEN-LAST:event_satuanComboMousePressed

    private void keteranganTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keteranganTextMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_keteranganTextMouseEntered

    private void tambahSatuanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahSatuanButtonActionPerformed
        // TODO add your handling code here:
//        new TambahSatuanDialog(new MainMenu(), true).show();
        SatuanDialog n = new SatuanDialog(null, true);
        n.show();
        if (n.getReturnStatus() == 1) {
            loadCombo();
        }
        System.out.println(n.getReturnStatus());

//        System.out.println(result);
    }//GEN-LAST:event_tambahSatuanButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        // TODO add your handling code here:
        gambar = new ItemControl().setImage(new ItemControl().openImage(pathText), gambarLabel);
    }//GEN-LAST:event_openButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barcodeText;
    private javax.swing.JCheckBox dapatDibeliCheck;
    private javax.swing.JCheckBox dapatDibongkarCheck;
    private javax.swing.JCheckBox dapatDijualCheck;
    private javax.swing.JCheckBox dapatDiproduksiCheck;
    private javax.swing.JCheckBox dipakaiUntukProduksiCheck;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel gambarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox kategoriCombo;
    private javax.swing.JTextPane keteranganText;
    private javax.swing.JTextField kodeBarangText;
    private javax.swing.JTextField namaBarangText;
    private javax.swing.JButton openButton;
    private javax.swing.JTextField pathText;
    private javax.swing.JComboBox satuanCombo;
    private javax.swing.JButton simpanButton;
    private javax.swing.JCheckBox statusBarangCheck;
    private javax.swing.JTextField stokMaxText;
    private javax.swing.JTextField stokMinText;
    private javax.swing.JButton tambahSatuanButton;
    // End of variables declaration//GEN-END:variables
}

package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sipit
 */
public class Pengguna1Panel extends javax.swing.JPanel {

    /**
     * Creates new form FormPengguna1
     */
    public Pengguna1Panel() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tglUsulan1 = new javax.swing.JTextField();
        tglUsulan2 = new javax.swing.JTextField();
        satuan = new javax.swing.JComboBox();
        tglUsulan3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        inputCepatKey6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputCepatKey5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(231, 231, 231));
        setName("User"); // NOI18N
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 40, 40));
        jLabel3.setText("Kode Karyawan");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(40, 40, 40));
        jLabel4.setText("Nama Lengkap");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(40, 40, 40));
        jLabel5.setText("Jabatan");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(40, 40, 40));
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(40, 40, 40));
        jLabel7.setText("Deskripsi");

        tglUsulan1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tglUsulan1.setForeground(new java.awt.Color(40, 40, 40));
        tglUsulan1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40)));

        tglUsulan2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tglUsulan2.setForeground(new java.awt.Color(40, 40, 40));
        tglUsulan2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40)));

        satuan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        satuan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "      ", "Item 1", "Item 2", "Item 3", "Item 4" }));
        satuan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40)));

        tglUsulan3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tglUsulan3.setForeground(new java.awt.Color(40, 40, 40));
        tglUsulan3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40)));

        jTextPane1.setForeground(new java.awt.Color(40, 40, 40));
        jScrollPane2.setViewportView(jTextPane1);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(40, 40, 40));
        jLabel8.setText("Add Picture (4x6)");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(40, 40, 40));
        jLabel9.setText("Attachment");

        jTextPane2.setForeground(new java.awt.Color(40, 40, 40));
        jScrollPane3.setViewportView(jTextPane2);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(40, 40, 40));
        jLabel10.setText("+ / - Attachments");

        inputCepatKey6.setBackground(new java.awt.Color(228, 237, 244));
        inputCepatKey6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inputCepatKey6.setForeground(new java.awt.Color(255, 255, 255));
        inputCepatKey6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.png"))); // NOI18N
        inputCepatKey6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputCepatKey6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inputCepatKey6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputCepatKey6.setIconTextGap(0);
        inputCepatKey6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepatKey6ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user male.png"))); // NOI18N

        inputCepatKey5.setBackground(new java.awt.Color(36, 198, 237));
        inputCepatKey5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inputCepatKey5.setForeground(new java.awt.Color(40, 40, 40));
        inputCepatKey5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        inputCepatKey5.setText("Simpan");
        inputCepatKey5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputCepatKey5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inputCepatKey5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputCepatKey5.setIconTextGap(18);
        inputCepatKey5.setMargin(new java.awt.Insets(2, 2, 2, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(42, 42, 42)
                            .addComponent(tglUsulan1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(inputCepatKey6))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addGap(46, 46, 46)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tglUsulan2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tglUsulan3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(inputCepatKey5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 58, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel3))
                        .addComponent(tglUsulan1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputCepatKey6))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel4)
                            .addGap(23, 23, 23)
                            .addComponent(jLabel5)
                            .addGap(23, 23, 23)
                            .addComponent(jLabel6)
                            .addGap(17, 17, 17)
                            .addComponent(jLabel7)
                            .addGap(79, 79, 79)
                            .addComponent(jLabel9)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tglUsulan2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(tglUsulan3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1)
                            .addGap(27, 27, 27)
                            .addComponent(inputCepatKey5)))
                    .addGap(0, 58, Short.MAX_VALUE)))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void inputCepatKey6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCepatKey6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCepatKey6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inputCepatKey5;
    private javax.swing.JButton inputCepatKey6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JComboBox satuan;
    private javax.swing.JTextField tglUsulan1;
    private javax.swing.JTextField tglUsulan2;
    private javax.swing.JTextField tglUsulan3;
    // End of variables declaration//GEN-END:variables
}

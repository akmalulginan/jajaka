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
public class DataItemPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormDataItem
     */
    public DataItemPanel() {
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

        jLabel3 = new javax.swing.JLabel();
        kodeUsulan2 = new javax.swing.JTextField();
        inputCepatKey5 = new javax.swing.JButton();
        inputCepatKey6 = new javax.swing.JButton();
        inputCepatKey7 = new javax.swing.JButton();
        table = new javax.swing.JPanel();
        inputCepatKey8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(231, 231, 231));
        setName("Data Item"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 40, 40));
        jLabel3.setText("Search");

        kodeUsulan2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kodeUsulan2.setForeground(new java.awt.Color(40, 40, 40));
        kodeUsulan2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        inputCepatKey5.setBackground(new java.awt.Color(36, 198, 237));
        inputCepatKey5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inputCepatKey5.setForeground(new java.awt.Color(40, 40, 40));
        inputCepatKey5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/import.png"))); // NOI18N
        inputCepatKey5.setText("Import");
        inputCepatKey5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputCepatKey5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inputCepatKey5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputCepatKey5.setIconTextGap(20);
        inputCepatKey5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepatKey5ActionPerformed(evt);
            }
        });

        inputCepatKey6.setBackground(new java.awt.Color(36, 198, 237));
        inputCepatKey6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inputCepatKey6.setForeground(new java.awt.Color(40, 40, 40));
        inputCepatKey6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/export.png"))); // NOI18N
        inputCepatKey6.setText("Export");
        inputCepatKey6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputCepatKey6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inputCepatKey6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputCepatKey6.setIconTextGap(20);
        inputCepatKey6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepatKey6ActionPerformed(evt);
            }
        });

        inputCepatKey7.setBackground(new java.awt.Color(36, 198, 237));
        inputCepatKey7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inputCepatKey7.setForeground(new java.awt.Color(40, 40, 40));
        inputCepatKey7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        inputCepatKey7.setText("Print");
        inputCepatKey7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputCepatKey7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inputCepatKey7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputCepatKey7.setIconTextGap(23);
        inputCepatKey7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepatKey7ActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40)));

        javax.swing.GroupLayout tableLayout = new javax.swing.GroupLayout(table);
        table.setLayout(tableLayout);
        tableLayout.setHorizontalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );
        tableLayout.setVerticalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        inputCepatKey8.setBackground(new java.awt.Color(36, 198, 237));
        inputCepatKey8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inputCepatKey8.setForeground(new java.awt.Color(40, 40, 40));
        inputCepatKey8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find.png"))); // NOI18N
        inputCepatKey8.setText("Find");
        inputCepatKey8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputCepatKey8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inputCepatKey8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputCepatKey8.setIconTextGap(8);
        inputCepatKey8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepatKey8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputCepatKey5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputCepatKey6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputCepatKey7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kodeUsulan2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCepatKey8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kodeUsulan2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCepatKey8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCepatKey6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCepatKey5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCepatKey7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputCepatKey5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCepatKey5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCepatKey5ActionPerformed

    private void inputCepatKey6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCepatKey6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCepatKey6ActionPerformed

    private void inputCepatKey7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCepatKey7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCepatKey7ActionPerformed

    private void inputCepatKey8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCepatKey8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCepatKey8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inputCepatKey5;
    private javax.swing.JButton inputCepatKey6;
    private javax.swing.JButton inputCepatKey7;
    private javax.swing.JButton inputCepatKey8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField kodeUsulan2;
    private javax.swing.JPanel table;
    // End of variables declaration//GEN-END:variables
}

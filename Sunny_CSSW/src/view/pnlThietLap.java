package view;

import javax.swing.JOptionPane;

/**
 *
 * @author hai95
 */
public class pnlThietLap extends javax.swing.JPanel {

    /**
     * Creates new form ThietLap
     */
    public pnlThietLap() {
        initComponents();
        setSize(840, 450);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDoiMk = new javax.swing.JButton();
        btnThongTin = new javax.swing.JButton();
        btnTroGiup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnDoiMk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDoiMk.setText("Đổi mật Khẩu");
        btnDoiMk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMkActionPerformed(evt);
            }
        });

        btnThongTin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThongTin.setText("Thông tin phần mềm");
        btnThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinActionPerformed(evt);
            }
        });

        btnTroGiup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTroGiup.setText("Trợ giúp");
        btnTroGiup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroGiupActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logothietlap.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTroGiup, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDoiMk, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDoiMk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThongTin)
                        .addGap(13, 13, 13)
                        .addComponent(btnTroGiup)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoiMkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMkActionPerformed
        // TODO add your handling code here:
        doimk();
    }//GEN-LAST:event_btnDoiMkActionPerformed

    private void btnThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinActionPerformed
        // TODO add your handling code here:
        About();
    }//GEN-LAST:event_btnThongTinActionPerformed

    private void btnTroGiupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroGiupActionPerformed
        // TODO add your handling code here:
        TroGiup();
    }//GEN-LAST:event_btnTroGiupActionPerformed

    public void doimk() {
        dg_DoiMK dgDoiMK = new dg_DoiMK(Run.trangChu, true);
        dgDoiMK.setVisible(true);

    }

    public void About() {
        String about = "Nhóm phát triển:\n - Lê Văn Hai - Leader + Coder + Designer\n- Đào Hữu Nghĩa - Database + Coder\n- Vũ Minh Quang - Coder +\n Chu Văn Đài - Coder";
        JOptionPane.showMessageDialog(this, about, "About Us", JOptionPane.OK_OPTION);
    }
    public void TroGiup(){
        JOptionPane.showMessageDialog(this, "Tính năng đang được phát triển");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMk;
    private javax.swing.JButton btnThongTin;
    private javax.swing.JButton btnTroGiup;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

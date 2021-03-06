package view;

import javax.swing.JOptionPane;
import sunnycssw.DAO.DangNhapDAO;

/**
 *
 * @author hai95
 */
public class dg_DoiMK extends java.awt.Dialog {

    /**
     * Creates new form dg_DoiMK
     */
    DangNhapDAO dnModel = new DangNhapDAO();

    public dg_DoiMK(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(400, 360);
        setLocationRelativeTo(null);
        setForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        pwCu = new javax.swing.JPasswordField();
        pwMoi = new javax.swing.JPasswordField();
        pwConffirm = new javax.swing.JPasswordField();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Đổi mật khẩu");
        add(lblTitle);
        lblTitle.setBounds(50, 50, 300, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tài Khoản");
        add(jLabel2);
        jLabel2.setBounds(10, 110, 90, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Mật Khẩu Cũ");
        add(jLabel9);
        jLabel9.setBounds(10, 150, 90, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mật Khẩu Mới");
        add(jLabel3);
        jLabel3.setBounds(10, 190, 90, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Xác Nhận MK");
        add(jLabel4);
        jLabel4.setBounds(10, 230, 90, 25);

        txtTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtTaiKhoan);
        txtTaiKhoan.setBounds(110, 110, 270, 25);

        pwCu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(pwCu);
        pwCu.setBounds(110, 150, 270, 25);

        pwMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(pwMoi);
        pwMoi.setBounds(110, 190, 270, 25);

        pwConffirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(pwConffirm);
        pwConffirm.setBounds(110, 230, 270, 25);

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save as.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        add(btnLuu);
        btnLuu.setBounds(60, 300, 100, 25);

        btnHuy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        add(btnHuy);
        btnHuy.setBounds(230, 300, 90, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        doimk();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnHuyActionPerformed
    public void setForm() {
    }

    public boolean checkForm() {
        try {
            // "^$" bắt đầu và kết thúc
            //.* = bất kỳ ký tự nào và xuất hiện ít nhất 0 lần
            // .*[a-z] trước a-z có thể có hoặc không có ký tự nào
            //?=.*[a-z] chuỗi phải bắt đầu bằng a-z hoặc ký tự bất kỳ theo sau bởi a-z vd: abc || 2abc
            String patern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}$";
            if (pwCu.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập mật khẩu cũ");
                pwCu.requestFocus();
                return false;
            }
            if (!pwCu.getText().equals(Run.nVien.getPass())) {
                JOptionPane.showMessageDialog(this, "Mật khẩu không đúng");
                pwCu.requestFocus();
                return false;
            }
            if (!pwMoi.getText().trim().matches(patern)) {
                JOptionPane.showMessageDialog(this, "Mật khẩu phải chứa chữ hoa, chữ thường, số");
                pwMoi.requestFocus();
                return false;
            }
            if (!pwMoi.getText().trim().equals(pwConffirm.getText().trim())) {
                JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không đúng");
                pwConffirm.requestFocus();
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi thao tác đổi mật khẩu");
            return false;
        }
        return true;
    }

    public void doimk() {
        if (!checkForm()) {
            return;
        }
        Run.nVien.setPass(pwMoi.getText().trim());
        dnModel.doimk(Run.nVien);
        
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPasswordField pwConffirm;
    private javax.swing.JPasswordField pwCu;
    private javax.swing.JPasswordField pwMoi;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}

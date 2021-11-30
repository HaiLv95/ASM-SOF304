package view;

import java.util.List;
import javax.swing.JOptionPane;
import sunnycss.MODEL.LoaiSP;
import sunnycss.MODEL.SanPham;
import sunnycssw.DAO.BanHangDAO;
import sunnycssw.DAO.QuanLyDAO;

/**
 *
 * @author hai95
 */
public class dg_ThemSP extends java.awt.Dialog {

    /**
     * Creates new form dg_ThemSP
     */
    public int index;
    public SanPham sp = new SanPham();
    public BanHangDAO bhmodel = new BanHangDAO();
    List<LoaiSP> listLsp = bhmodel.loadListLSP();
    public QuanLyDAO qlmodel = new QuanLyDAO();

    public dg_ThemSP(java.awt.Frame parent, boolean modal, int index, SanPham sp) {
        super(parent, modal);
        initComponents();
        setSize(420, 490);
        setLocationRelativeTo(null);
        this.sp = sp;
        this.index = index;
        loadLSPtoCBO();
        txtIDSP.setEnabled(false);
        if (this.index == 1) {
            clearForm();
            lblTitle.setText("Thêm Sản Phẩm");
        } else if (this.index == 2) {
            setForm();
            lblTitle.setText("Cập Nhật Sản Phẩm");
        }
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
        txtTenSP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtXuatXu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHangSX = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboLoai = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtATTKhac = new javax.swing.JTextArea();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIDSP = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Thêm Sản Phẩm");
        add(lblTitle);
        lblTitle.setBounds(50, 40, 300, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tên SP");
        add(jLabel2);
        jLabel2.setBounds(10, 140, 90, 25);

        txtTenSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtTenSP);
        txtTenSP.setBounds(110, 140, 280, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Xuất Xứ");
        add(jLabel9);
        jLabel9.setBounds(10, 180, 90, 25);

        txtXuatXu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtXuatXu);
        txtXuatXu.setBounds(110, 180, 280, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Hãng SX");
        add(jLabel3);
        jLabel3.setBounds(10, 220, 90, 25);

        txtHangSX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtHangSX);
        txtHangSX.setBounds(110, 220, 280, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Đơn Giá");
        add(jLabel10);
        jLabel10.setBounds(10, 260, 90, 25);

        txtDonGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtDonGia);
        txtDonGia.setBounds(110, 260, 280, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("TT Khác");
        add(jLabel4);
        jLabel4.setBounds(10, 340, 90, 25);

        add(cboLoai);
        cboLoai.setBounds(110, 300, 280, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Loại");
        add(jLabel5);
        jLabel5.setBounds(10, 300, 90, 25);

        txtATTKhac.setColumns(20);
        txtATTKhac.setRows(5);
        jScrollPane1.setViewportView(txtATTKhac);

        add(jScrollPane1);
        jScrollPane1.setBounds(110, 340, 280, 80);

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Accept.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        add(btnLuu);
        btnLuu.setBounds(80, 440, 100, 25);

        btnHuy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        add(btnHuy);
        btnHuy.setBounds(250, 440, 90, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ID Sản Phẩm");
        add(jLabel6);
        jLabel6.setBounds(10, 100, 90, 25);

        txtIDSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtIDSP);
        txtIDSP.setBounds(110, 100, 280, 25);

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
        Luu();
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnHuyActionPerformed
    public boolean check() {
        try {
            if (txtTenSP.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên sản phẩm không được để trống");
                txtTenSP.requestFocus();
                return false;
            }
            if (txtXuatXu.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Xuất xứ không được để trống");
                txtXuatXu.requestFocus();
                return false;
            }
            if (txtHangSX.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hãng sản xuất không được để trống");
                txtHangSX.requestFocus();
                return false;
            }
            int dongia = Integer.parseInt(txtDonGia.getText());
            if (dongia < 0) {
                JOptionPane.showMessageDialog(this, "Đơn giá phải lơn hơn hoặc bằng 0");
                txtDonGia.requestFocus();
                return false;
            }
            if (cboLoai.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn loại sản phẩm");
                return false;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Đơn giá phải là số");
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi lưu thông tin");
            return false;
        }
        return true;
    }
    public void loadLSPtoCBO(){
        
        cboLoai.removeAll();
        cboLoai.addItem("<Chọn loại>");
        for (LoaiSP loaiSP : listLsp) {
            cboLoai.addItem(loaiSP.getTenLoai());
        }
    }
    public void setForm(){
        txtIDSP.setText(sp.getIdSP() + "");
        txtTenSP.setText(sp.getTenSP());
        txtXuatXu.setText(sp.getXuatXu());
        txtHangSX.setText(sp.getHangSX());
        txtDonGia.setText(sp.getDonGia()+ "");
        txtATTKhac.setText(sp.getTtKhac());
        for (int i = 0; i < listLsp.size(); i++) {
            if (sp.getIdLoai() == listLsp.get(i).getIdLoai()) {
                cboLoai.setSelectedIndex(i+1);
                break;
            }
        }
        
    }
    public void clearForm(){
        txtIDSP.setText("");
        txtTenSP.setText("");
        txtXuatXu.setText("");
        txtHangSX.setText("");
        txtDonGia.setText("");
        txtATTKhac.setText("");
        cboLoai.setSelectedIndex(0);
    }
    public SanPham getForm(){
        sp.setTenSP(txtTenSP.getText().trim());
        sp.setXuatXu(txtXuatXu.getText().trim());
        sp.setHangSX(txtHangSX.getText().trim());
        sp.setDonGia(Integer.parseInt(txtDonGia.getText().trim()));
        sp.setTtKhac(txtATTKhac.getText().trim());
        int indexCBO = cboLoai.getSelectedIndex();
        sp.setIdLoai(listLsp.get(indexCBO - 1).getIdLoai());
        return sp;
    }
    public void Luu() {
        if (!check()) {
            return;
        }
        if (index == 1) {
            qlmodel.addSP(getForm());
        } else if (index == 2) {
            qlmodel.updateSP(getForm());
        }
        setVisible(false);
        dispose();
        pnlQuanLy.pnQlLy.updateUI();
    }
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtATTKhac;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtHangSX;
    private javax.swing.JTextField txtIDSP;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtXuatXu;
    // End of variables declaration//GEN-END:variables
}
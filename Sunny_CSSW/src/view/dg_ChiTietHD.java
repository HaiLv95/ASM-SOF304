package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import sunnycss.MODEL.HoaDonCT;

/**
 *
 * @author hai95
 */
public class dg_ChiTietHD extends java.awt.Dialog {

    /**
     * Creates new form dg_ChiTietHD
     */
    List<HoaDonCT> chiTietHD = new ArrayList<>();
    DefaultTableModel model;
    public dg_ChiTietHD(java.awt.Frame parent, boolean modal, List<HoaDonCT> chiTietHD) {
        super(parent, modal);
        initComponents();
        setSize(600, 330);
        setLocationRelativeTo(null);
        this.chiTietHD = chiTietHD;
        model = (DefaultTableModel) tblChiTietHD.getModel();
        fillToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietHD = new javax.swing.JTable();
        btnXong = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chi tiết hóa đơn");
        add(jLabel1);
        jLabel1.setBounds(140, 40, 310, 30);

        tblChiTietHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Đơn Giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblChiTietHD);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 580, 210);

        btnXong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Accept.png"))); // NOI18N
        btnXong.setText("Xong");
        btnXong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXongActionPerformed(evt);
            }
        });
        add(btnXong);
        btnXong.setBounds(500, 290, 90, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnXongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXongActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnXongActionPerformed
    
    public void fillToTable(){
        model.setRowCount(0);
        for (HoaDonCT hdct : chiTietHD) {
            model.addRow(new Object[]{hdct.getIdSP(), hdct.getTenSP(), hdct.getSoLuong(), hdct.getDonGia(), (hdct.getSoLuong() * hdct.getDonGia())});
        }
    }
    /**
     * @param args the command line arguments
     */



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChiTietHD;
    // End of variables declaration//GEN-END:variables
}

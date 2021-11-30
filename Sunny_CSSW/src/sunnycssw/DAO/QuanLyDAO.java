package sunnycssw.DAO;

import java.util.List;
import sunnycss.MODEL.NhanVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sunnycss.MODEL.LoaiSP;
import sunnycss.MODEL.SanPham;

/**
 *
 * @author hai95
 */
public class QuanLyDAO {

    ConnectSQL con = new ConnectSQL();

    public List<NhanVien> loadlstNV() {
        List<NhanVien> lstNV = new ArrayList<>();
        try {
            String sql = "select * from nhanvien where working = 1";
            ResultSet rs = con.createStatement(sql);
            while (rs.next()) {
                lstNV.add(loadNV(rs));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi load nhân viên");
        }
        return lstNV;
    }

    public NhanVien loadNV(ResultSet rs) throws SQLException {
        return new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
    }

    public SanPham loadSP(ResultSet rs) throws SQLException {
        return new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
    }

    public List<SanPham> loadlstSP() {
        List<SanPham> lstSP = new ArrayList<>();
        try {
            String sql = "select * from sanpham where trangthai = 1";
            ResultSet rs = con.createStatement(sql);
            while (rs.next()) {
                lstSP.add(loadSP(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi load Sản Phẩm");
        }
        return lstSP;
    }

    public NhanVien findNVByID(String ID) throws SQLException {
        String sql = "select * from nhanvien where IDNV=? and working = 1";
        NhanVien nv = null;
        ResultSet rs = con.prepareExcuteQuery(sql, ID);

        while (rs.next()) {
            nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
        }

        return nv;
    }

    public SanPham findSPbyID(int ID) throws SQLException {
        String sql = "select * from SanPham where IDSp=? and trangthai = 1";
        SanPham sp = null;
        ResultSet rs = con.prepareExcuteQuery(sql, ID);
        while (rs.next()) {
            sp = new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
        }
        return sp;
    }

    public LoaiSP fingLSPbyID(int ID) throws SQLException {
        String sql = "select * from loaisanpham where idloai=? and trangthai = 1";
        LoaiSP lsp = null;
        ResultSet rs = con.prepareExcuteQuery(sql, ID);
        while (rs.next()) {
            lsp = new LoaiSP(rs.getInt(1), rs.getString(2), rs.getString(3));
        }
        return lsp;
    }

    public void addNV(NhanVien nv) {
        String sql = "insert into nhanvien(IDNV,HOTEN,PASS,NGAYSINH,DIACHI,GIOITINH,SDT,ROLES, working)values(?,?,?,?,?,?,?,?,?)";
        int row = con.prepareUpdate(sql, nv.getIdNV(), nv.getHoTen(), nv.getPass(), nv.getNgaySinh(), nv.getDiaChi(), nv.isGioiTinh(), nv.getSdt(), nv.getRoles(), 1);
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Thêm nhân viên thất bại");
        }
    }

    public void updateNV(NhanVien nv) {
        String sql = "update nhanvien set hoten=?,ngaysinh=?,diachi=?,gioitinh=?,roles=?,sdt=? where idnv=?";
        int row = con.prepareUpdate(sql, nv.getHoTen(), nv.getNgaySinh(), nv.getDiaChi(), nv.isGioiTinh(), nv.getRoles(), nv.getSdt(), nv.getIdNV());
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhân viên thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhân viên thất bại");
        }
    }

    public void deleteNV(String idNV) {
        String sql = "update nhanvien set working = 0 where idnv=?";
        int row = con.prepareUpdate(sql, idNV);
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Xóa nhân viên thất bại");
        }
    }

    public void addSP(SanPham sp) {
        String sql = "insert into sanpham(TENSP,XUATXU,HANGSX,TTKHAC, DONGIA,IDLOAI, trangthai)values(?,?,?,?,?,?,?)";
        int row = con.prepareUpdate(sql, sp.getTenSP(), sp.getXuatXu(), sp.getHangSX(), sp.getTtKhac(), sp.getDonGia(), sp.getIdLoai(), 1);
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Thêm sản phẩm thất bại");
        }
    }

    public void updateSP(SanPham sp) {
        String sql = "update sanpham set TENSP=?,XUATXU=?,HANGSX=?,TTKHAC=?, DONGIA=?,IDLOAI=? where idsp=?";
        int row = con.prepareUpdate(sql, sp.getTenSP(), sp.getXuatXu(), sp.getHangSX(), sp.getTtKhac(), sp.getDonGia(), sp.getIdLoai(), sp.getIdSP());
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin sản phẩm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin sản phẩm thất bại");
        }
    }

    public void deleteSP(int idSP) {
        String sql = "update sanpham set trangthai = 0 where idsp=?";
        int row = con.prepareUpdate(sql, idSP);
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Xóa sản phẩm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Xóa sản phẩm thất bại");
        }
    }

    public void addLSP(LoaiSP lsp) {
        String sql = "insert into loaisanpham(TENLOAI,MOTA,trangthai) values(?,?,?)";
        int row = con.prepareUpdate(sql, lsp.getTenLoai(), lsp.getMoTa(), 1);
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Thêm loại sản phẩm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Thêm loại sản phẩm thất bại");
        }
    }

    public void updateLSP(LoaiSP lsp) {
        String sql = "update loaisanpham set tenloai=?,mota=?, trangthai = 1 where idloai=?";
        int row = con.prepareUpdate(sql, lsp.getTenLoai(), lsp.getMoTa(), lsp.getIdLoai());
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin loại sản phẩm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin loại sản phẩm thất bại");
        }
    }

    public void deleteLSP(int IDLoai) throws SQLException {
        String sql = "update loaisanpham set trangthai = 0 where idloai=?";
        int index = checkSPinLSP(IDLoai);
        if (index > 0) {
            JOptionPane.showMessageDialog(null, "Có sản phẩm thuộc loại sản phẩm này nên không thể xóa");
            return;
        }
        int row = con.prepareUpdate(sql, IDLoai); 
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Xóa loại sản phẩm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Xóa loại sản phẩm thất bại");
        }
    }

    public int checkSPinLSP(int IDloai) throws SQLException {
        String sql = "select count(idsp) from sanpham where idloai=?";
        int index = 0;
        ResultSet rs = con.prepareExcuteQuery(sql, IDloai);

        while (rs.next()) {
            index = rs.getInt(1);
        }

        return index;
    }
}

package sunnycssw.DAO;

import java.util.List;
import sunnycss.MODEL.LoaiSP;
import java.sql.*;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sunnycss.MODEL.HoaDon;
import sunnycss.MODEL.SanPham;
import view.Run;

/**
 *
 * @author hai95
 */
public class BanHangDAO {

    ConnectSQL con = new ConnectSQL();
    public HoaDon hd = null;
    DangNhapDAO dnDAO = new DangNhapDAO();

    public List<LoaiSP> loadListLSP() {
        String sql = "select * from loaisanpham where trangthai=1";
        List<LoaiSP> lstLSP = new ArrayList<>();
        try {
            ResultSet rs = con.createStatement(sql);
            while (rs.next()) {
                lstLSP.add(loadLoaiSP(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed : Lỗi load loại sản phẩm " + e.getMessage());
        }
        return lstLSP;
    }

    public LoaiSP loadLoaiSP(ResultSet rs) throws SQLException {
        LoaiSP loai = new LoaiSP();
        loai.setIdLoai(rs.getInt(1));
        loai.setTenLoai(rs.getString(2));
        loai.setMoTa(rs.getString(3));
        return loai;
    }

    public List<SanPham> loadListSPtheoLoai(int IDLoai) {
        String sql = "select * from sanpham where trangthai = 1 and  idloai=" + IDLoai;
        List<SanPham> listSP = new ArrayList<>();
        try {
            ResultSet rs = con.createStatement(sql);
            while (rs.next()) {
                listSP.add(loadSP(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed: Lỗi load Sản Phẩm: " + e);
        }
        return listSP;
    }

    public SanPham loadSP(ResultSet rs) throws SQLException {
        SanPham sp = new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
        return sp;
    }

    public void createHD() {
        hd = null;
        try {
            hd = getHD();
            if (hd == null) {
                Calendar cal = Calendar.getInstance();
                String sql = "insert into hoadon(NGAYLAPHD,IDNV,TRANGTHAI) values(?,?,0)";
                con.prepareUpdate(sql, cal.getTime(), Run.nVien.getIdNV());
                hd = getHD();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Có lỗi khi khởi tạo hóa đơn");
        }
    }

    public HoaDon getHD() throws SQLException {
        ResultSet rs = null;
        Calendar cal = Calendar.getInstance();
        String sql = "select * from hoadon where trangthai=0";
        rs = con.createStatement(sql);
        while (rs.next()) {
            hd = new HoaDon(rs.getInt(1), rs.getDate(2), rs.getString(3), 0, 0);
        }
        return hd;
    }

    public int insertToHD(int IDSP, int soLuong) throws SQLException {
        String sql = "insert into hoadonct(IDhoadon, IDSP, Soluong) values(?,?,?)";
        int row = con.prepareUpdate(sql, getHD().getIdHD(), IDSP, soLuong);
        return row;
    }
    public void confirmHD() throws SQLException{
        hd = getHD();
        String sql = "update hoadon set trangthai=1 where idhoadon=?";
        con.prepareUpdate(sql, hd.getIdHD());   
    }
}

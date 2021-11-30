package sunnycssw.DAO;

import java.util.List;
import sunnycss.MODEL.HoaDon;
import java.sql.*;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sunnycss.MODEL.HoaDonCT;

/**
 *
 * @author hai95
 */
public class ThongKeDAO {

    ConnectSQL con = new ConnectSQL();

    public List<HoaDon> loadListHD() {
        String sql = "  select HOADON.IDHOADON,ngaylaphd, idnv, sum(hoadonct.SOLUONG), sum(soluong * dongia)\n"
                + " from HOADON inner join HOADONCT on HOADON.IDHOADON = HOADONCT.IDHOADON\n"
                + " inner join sanpham on HOADONCT.IDSP = SANPHAM.IDSP\n"
                + "group by HOADON.IDHOADON,ngaylaphd, idnv";
        List<HoaDon> listHD = new ArrayList<>();
        try {
            ResultSet rs = con.createStatement(sql);
            while (rs.next()) {
                listHD.add(getHD(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi load hóa đơn");
        }
        return listHD;
    }

    public HoaDon getHD(ResultSet rs) throws SQLException {
        return new HoaDon(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
    }

    public List<HoaDonCT> getHoaDonCT(int idHD) {
        String sql = "select hoadonct.idhoadon, HOADONCT.IDSP,SANPHAM.TENSP, SOLUONG, DONGIA, (SOLUONG*DONGIA)\n"
                + " from HOADONCT inner join SANPHAM on HOADONCT.IDSP = SANPHAM.IDSP\n"
                + " where IDHOADON = ?";
        List<HoaDonCT> listHDCT = new ArrayList<>();
        try {
            ResultSet rs = con.prepareExcuteQuery(sql, idHD);
            while (rs.next()) {
                listHDCT.add(getHoaDonCT(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi load chi tiết hóa đơn" + e);
        }
        return listHDCT;
    }

    public HoaDonCT getHoaDonCT(ResultSet rs) throws SQLException {
        return new HoaDonCT(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
    }

    public List<HoaDon> loadListHDbyDate(String ngayBD, String ngayKT) {
        String sql = "select HOADON.IDHOADON,ngaylaphd, idnv, sum(hoadonct.SOLUONG), sum(soluong * dongia)\n"
                + "  from HOADON inner join HOADONCT on HOADON.IDHOADON = HOADONCT.IDHOADON\n"
                + "inner join sanpham on HOADONCT.IDSP = SANPHAM.IDSP\n"
                + "where NGAYLAPHD between '" + ngayBD +  "' and '" + ngayKT + "'"
                + "group by HOADON.IDHOADON,ngaylaphd, idnv";
        List<HoaDon> listHD = new ArrayList<>();
        try {
            ResultSet rs = con.createStatement(sql);
            while (rs.next()) {
                listHD.add(getHD(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi load hóa đơn" + e);
        }
        return listHD;
    }
}

package sunnycssw.DAO;

/**
 *
 * @author hai95
 */
import java.util.List;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;
import sunnycss.MODEL.NhanVien;
import view.Run;
public class DangNhapDAO {
    ConnectSQL con = new ConnectSQL();
    public NhanVien getNVbyID(String taiKhoan) throws SQLException{
        String sql = "select * from nhanvien where idnv=? and working=1";
        ResultSet rs = con.prepareExcuteQuery(sql, taiKhoan);
        NhanVien nv = null;
        while (rs.next()) {            
           nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
        }
        return nv;
    }
    public void clearHD(){
        String sql = "delete from hoadon where trangthai=0";
        int row = con.prepareUpdate(sql);
    }
    public void doimk(NhanVien nv){
        String sql = "update nhanvien set pass=? where idnv=?";
        try {
            int row = con.prepareUpdate(sql, nv.getPass(), nv.getIdNV());
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi đổi mật khẩu");
        }
    }

}

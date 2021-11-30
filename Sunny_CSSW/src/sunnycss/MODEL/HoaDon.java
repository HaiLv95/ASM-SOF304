package sunnycss.MODEL;

import java.util.Date;

/**
 *
 * @author hai95
 */
public class HoaDon {
    private int idHD, thanhTien, soLuong;
    private Date ngayLapHD;
    private String idNV;

    public HoaDon() {
    }

    public HoaDon(int idHD, Date ngayLapHD, String idNV, int soLuong, int thanhTien) {
        this.idHD = idHD;
        this.ngayLapHD = ngayLapHD;
        this.idNV = idNV;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    public Date getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(Date ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}

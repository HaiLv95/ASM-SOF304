package sunnycss.MODEL;

/**
 *
 * @author hai95
 */
public class HoaDonCT {
    private int idHD, idSP, soLuong, donGia, thanhTien;
    private String tenSP;
    public HoaDonCT() {
    }

    public HoaDonCT(int idHD, int idSP, String tenSP, int soLuong, int donGia, int thanhTien) {
        this.idHD = idHD;
        this.idSP = idSP;
        this.soLuong = soLuong;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    

    @Override
    public String toString() {
        return "HoaDonCT{" + "idHD=" + idHD + ", idSP=" + idSP + ", soLuong=" + soLuong + ", donGia=" + donGia + ", tenSP=" + tenSP + '}';
    }
    
    
}

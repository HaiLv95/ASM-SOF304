package sunnycss.MODEL;

/**
 *
 * @author hai95
 */
public class SanPham {
    private int idSP, idLoai, donGia;
    private String tenSP, xuatXu, hangSX, ttKhac;

    public SanPham() {
    }

    public SanPham(int idSP, String tenSP, String xuatXu, String hangSX, String ttKhac, int donGia,int idLoai) {
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.xuatXu = xuatXu;
        this.hangSX = hangSX;
        this.ttKhac = ttKhac;
        this.donGia = donGia;
        this.idLoai = idLoai;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public int getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(int idLoai) {
        this.idLoai = idLoai;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getTtKhac() {
        return ttKhac;
    }

    public void setTtKhac(String ttKhac) {
        this.ttKhac = ttKhac;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    
}

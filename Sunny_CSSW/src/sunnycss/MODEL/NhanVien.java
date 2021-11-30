package sunnycss.MODEL;

import java.util.Date;

/**
 *
 * @author hai95
 */
public class NhanVien {

    private String idNV, hoTen, pass, diaChi, roles, sdt;
    private Date ngaySinh;
    private boolean gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String idNV, String hoTen, String pass, Date ngaySinh, String diaChi, boolean gioiTinh, String roles, String sdt) {
        this.idNV = idNV;
        this.hoTen = hoTen;
        this.pass = pass;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.roles = roles;
        this.sdt = sdt;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}

package sunnycss.MODEL;

/**
 *
 * @author hai95
 */
public class LoaiSP {
    private int idLoai;
    private String tenLoai, moTa;

    public LoaiSP() {
    }

    public LoaiSP(int idLoai, String tenLoai, String moTa) {
        this.idLoai = idLoai;
        this.tenLoai = tenLoai;
        this.moTa = moTa;
    }

    public int getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(int idLoai) {
        this.idLoai = idLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
}

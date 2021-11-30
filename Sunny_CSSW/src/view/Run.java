package view;

import sunnycss.MODEL.NhanVien;

/**
 *
 * @author hai95
 */
public class Run {
    public static frDangNhap dangNhap;
    public static frTrangChu trangChu;
    public static NhanVien nVien;
    public static dg_CuaSoChao dgCuaSoChao;
    public static void main(String[] args) {
        dgCuaSoChao = new dg_CuaSoChao(null, true);
        dgCuaSoChao.setVisible(true);
        frDangNhap();
    }
    public static void frDangNhap(){
        dangNhap = new frDangNhap();
        dangNhap.setVisible(true);
    }
    public static void frTrangChu(){
        trangChu = new frTrangChu();
        trangChu.setVisible(true);
    }
}

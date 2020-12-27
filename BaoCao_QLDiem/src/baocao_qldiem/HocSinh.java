/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baocao_qldiem;

/**
 *
 * @author thien
 */
public class HocSinh {
    private String MaHS;
    private String TenHS;
    private String DiaChi;
    private int SDT;
    private String MaLop;
    
    public HocSinh(){
        super();
    }

    public HocSinh(String MaHS, String TenHS, String DiaChi, String sdt, String MaLop) {
        this.MaHS = MaHS;
        this.TenHS = TenHS;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.MaLop = MaLop;
    }

    public String getMaHS() {
        return MaHS;
    }

    public void setMaHS(String MaHS) {
        this.MaHS = MaHS;
    }

    public String getTenHS() {
        return TenHS;
    }

    public void setTenHS(String TenHS) {
        this.TenHS = TenHS;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }
    
}

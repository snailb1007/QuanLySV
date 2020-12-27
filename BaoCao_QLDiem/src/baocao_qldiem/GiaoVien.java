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
public class GiaoVien {
    private String MaGV;
    private String TenGV;
    private String MaMH;
    
    public GiaoVien(){
        super();
    }

    public GiaoVien(String MaGV, String TenGV, String MaMH) {
        this.MaGV = MaGV;
        this.TenGV = TenGV;
        this.MaMH = MaMH;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String TenGV) {
        this.TenGV = TenGV;
    }

    public String getMonHoc() {
        return MaMH;
    }

    public void setMonHoc(String MonHoc) {
        this.MaMH = MonHoc;
    }
    
}

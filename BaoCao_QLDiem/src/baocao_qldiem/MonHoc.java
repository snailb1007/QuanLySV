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
public class MonHoc {
    private String MaMH;
    private String TenMH;
    
    public MonHoc(){
        super();
    }

    public MonHoc(String MaMH, String TenMH) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }
    
    
}

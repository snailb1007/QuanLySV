/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.View;
import static GUI.View.rs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thien
 */
public class showCSDL {

    Connection conn = null;
    public PreparedStatement pst = null;
    public static ResultSet rs = null;
    public Statement st = null;
    //
    public void showDSHocSinh(JTable a) throws SQLException {
        MyConnect knoi = new MyConnect();
        conn = knoi.connect();
        try {
            st = conn.createStatement();
            StringBuilder sql = new StringBuilder("select HocSinh.MaHS, HocSinh.TenHS, Lop.TenLop, HocSinh.DiaChi, HocSinh.SDT ");
            sql.append("from HocSinh inner join Lop on HocSinh.MaLop=Lop.MaLop");
            rs = st.executeQuery(sql.toString());
            a.removeAll();
            String[] Arr = {"Mã học sinh", "Họ Tên", "Tên Lớp", "Địa chỉ", "Liên hệ"};
            DefaultTableModel modelHS = new DefaultTableModel(Arr, 0);
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString(1));
                vector.add(rs.getString(2));
                vector.add(rs.getString(3));
                vector.add(rs.getString(4));
                vector.add(rs.getString(5));
                modelHS.addRow(vector);
            }
            a.setModel(modelHS);
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

    public void showDSGV(JTable a) throws SQLException {
        MyConnect knoi2 = new MyConnect();
        conn = knoi2.connect();
        try {
            st = conn.createStatement();
            StringBuilder sql = new StringBuilder("select GV.MaGV, GV.TenGV, MonHoc.TenMH, Lop.TenLop ");
            sql.append("from GV,MonHoc,Lop ");
            sql.append("where GV.MaMH=MonHoc.MaMH and Lop.MaLop=GV.MaLop");
            rs = st.executeQuery(sql.toString());
            a.removeAll();
            String[] Arr = {"Mã giáo viên", "Tên giáo viên", "Môn dạy", "Lớp dạy"};
            DefaultTableModel modelGV = new DefaultTableModel(Arr, 0);
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("MaGV"));
                vector.add(rs.getString("TenGV"));
                vector.add(rs.getString(3));
                vector.add(rs.getString(4));
                modelGV.addRow(vector);
            }
            a.setModel(modelGV);
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void showDSLop(JTable a) throws SQLException {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            StringBuilder sql = new StringBuilder("select Lop.MaLop, Lop.TenLop ,count(HocSinh.MaHS) ");
            sql.append("from HocSinh,Lop ");
            sql.append("where HocSinh.MaLop=Lop.MaLop ");
            sql.append("group by Lop.MaLop, Lop.TenLop");
            rs = st.executeQuery(sql.toString());
            a.removeAll();
            String[] arr = {"Ma lop", "Ten Lop", "Si so"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(rs.getString(1));
                vt.add(rs.getString(2));
                vt.add(rs.getString(3));
                model.addRow(vt);
            }
            a.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void showXetDuyet(JTable a) throws SQLException {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select Diem.MaHS, HocSinh.TenHS, AVG(Diem) as\"Diem TB\"\n"
                    + "from Diem,HocSinh,Lop where Diem.MaHS=HocSinh.MaHS\n"
                    + "group by Diem.MaHS, TenHS";
            rs = st.executeQuery(sql);
            a.removeAll();
            String[] arr = {"Mã học sinh", "Tên học sinh", "Điểm trung bình", "Học Lực", "Xét Duyệt"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(rs.getString(1));
                vt.add(rs.getString(2));
                vt.add(rs.getFloat(3));
                if (rs.getFloat(3) >= 8) {
                    vt.add("Gioi");
                } else if (rs.getFloat(3) >= 6.5 && rs.getFloat(3) < 8) {
                    vt.add("Kha");
                } else if (rs.getFloat(3) >= 5.2 && rs.getFloat(3) < 6.5) {
                    vt.add("Trung Binh");
                } else if (rs.getFloat(3) >= 4 && rs.getFloat(3) < 5.2) {
                    vt.add("Yeu");
                } else {
                    vt.add("Kem");
                }
                if (rs.getFloat(3) >= 8) {
                    vt.add("Lên Lớp");
                } else if (rs.getFloat(3) >= 6.5 && rs.getFloat(3) < 8) {
                    vt.add("Lên Lớp");
                } else if (rs.getFloat(3) >= 5 && rs.getFloat(3) < 6.5) {
                    vt.add("Lên Lớp");
                } else {
                    vt.add("Học Lại");
                }
                model.addRow(vt);
            }
            a.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void showDSDiem(JTable a) throws SQLException {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop";
            rs = st.executeQuery(sql);
            a.removeAll();
            String[] Arr = {"Ma HS", "Ten HS", "Diem", "Mon", "Lop"};
            DefaultTableModel model = new DefaultTableModel(Arr, 0);
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString(1));
                vector.add(rs.getString(2));
                vector.add(rs.getFloat(3));
                vector.add(rs.getString(4));
                vector.add(rs.getString(5));
                model.addRow(vector);
            }
            a.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void showMH(JTable a) {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select * from MonHoc";
            rs = st.executeQuery(sql);
            a.removeAll();
            String[] Arr = {"Ma MH", "Ten Mh"};
            DefaultTableModel modelHS = new DefaultTableModel(Arr, 0);
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString(1));
                vector.add(rs.getString(2));
                modelHS.addRow(vector);
            }
            a.setModel(modelHS);
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

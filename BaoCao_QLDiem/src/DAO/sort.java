/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import GUI.View;
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
public class sort {

    Connection conn = null;
    public PreparedStatement pst = null;
    public static ResultSet rs = null;
    public Statement st = null;

    //A001
    public void sort_diem_Van_A001(JTable a) {
        MyConnect knoi = new MyConnect();

        try {
            conn = knoi.connect();
            //ResultSet rs = null;
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Van'\n"
                    + "and Lop.MaLop='A001'";
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

    public void sort_diem_Toan_A001(JTable a) {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Toán'\n"
                    + "and Lop.MaLop='A001'";
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

    public void sort_diem_Anh_A001(JTable a) {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Anh'\n"
                    + "and Lop.MaLop='A001'";
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    // A002
    public void sort_diem_Van_A002(JTable a) {
        MyConnect knoi = new MyConnect();

        try {
            conn = knoi.connect();
            //ResultSet rs = null;
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Van'\n"
                    + "and Lop.MaLop='A002'";
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

    public void sort_diem_Toan_A002(JTable a) {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Toán'\n"
                    + "and Lop.MaLop='A002'";
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void sort_diem_Anh_A002(JTable a) {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Anh'\n"
                    + "and Lop.MaLop='A002'";
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    // A003

    public void sort_diem_Van_A003(JTable a) {
        MyConnect knoi = new MyConnect();

        try {
            conn = knoi.connect();
            //ResultSet rs = null;
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Van'\n"
                    + "and Lop.MaLop='A003'";
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void sort_diem_Toan_A003(JTable a) {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Toán'\n"
                    + "and Lop.MaLop='A003'";
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void sort_diem_Anh_A003(JTable a) {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Anh'\n"
                    + "and Lop.MaLop='A003'";
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

    // A004
    public void sort_diem_Van_A004(JTable a) {
        MyConnect knoi = new MyConnect();

        try {
            conn = knoi.connect();
            //ResultSet rs = null;
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Van'\n"
                    + "and Lop.MaLop='A004'";
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void sort_diem_Toan_A004(JTable a) {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Toán'\n"
                    + "and Lop.MaLop='A004'";
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void sort_diem_Anh_A004(JTable a) {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Diem, MonHoc.TenMH, Lop.TenLop\n"
                    + "from HocSinh inner join Diem on HocSinh.MaHS=Diem.MaHS\n"
                    + "inner join MonHoc on Diem.MaMH=MonHoc.MaMH\n"
                    + "inner join Lop on Lop.MaLop=HocSinh.MaLop\n"
                    + "where MonHoc.TenMH='Anh'\n"
                    + "and Lop.MaLop='A004'";
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    //sort hoc sinh
    public void sort_HS_A001(JTable a)
    {
         MyConnect knoi = new MyConnect();        
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Lop.TenLop, HocSinh.DiaChi, HocSinh.SDT \n"
                    + "from HocSinh inner join Lop on HocSinh.MaLop=Lop.MaLop\n"
                    +"where Lop.MaLop='A001'";
            rs = st.executeQuery(sql);
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
    //A002
    public void sort_HS_A002(JTable a)
    {
         MyConnect knoi = new MyConnect();        
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Lop.TenLop, HocSinh.DiaChi, HocSinh.SDT \n"
                    + "from HocSinh inner join Lop on HocSinh.MaLop=Lop.MaLop\n"
                    +"where Lop.MaLop='A002'";
            rs = st.executeQuery(sql);
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
    //A003
    public void sort_HS_A003(JTable a)
    {
         MyConnect knoi = new MyConnect();        
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Lop.TenLop, HocSinh.DiaChi, HocSinh.SDT \n"
                    + "from HocSinh inner join Lop on HocSinh.MaLop=Lop.MaLop\n"
                    +"where Lop.MaLop='A003'";
            rs = st.executeQuery(sql);
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
    // A004
    public void sort_HS_A004(JTable a)
    {
         MyConnect knoi = new MyConnect();        
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select HocSinh.MaHS, HocSinh.TenHS, Lop.TenLop, HocSinh.DiaChi, HocSinh.SDT \n"
                    + "from HocSinh inner join Lop on HocSinh.MaLop=Lop.MaLop\n"
                    +"where Lop.MaLop='A004'";
            rs = st.executeQuery(sql);
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
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void sort_XD_A001(JTable a)
    {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select Diem.MaHS, HocSinh.TenHS, AVG(Diem) as\"Diem TB\"\n"
                    + "from Diem,HocSinh,Lop\n"
                    + "where Diem.MaHS=HocSinh.MaHS and HocSinh.MaLop=Lop.MaLop and Lop.MaLop='A001'\n"
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
                    vt.add("Lên lớp");
                } else if (rs.getFloat(3) >= 6.5 && rs.getFloat(3) < 8) {
                    vt.add("Lên Lớp");
                } else if (rs.getFloat(3) >= 5 && rs.getFloat(3) < 6.5) {
                    vt.add("Lên Lớp");
                } else {
                    vt.add("Học lại");
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public void sort_XD_A002(JTable a)
    {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select Diem.MaHS, HocSinh.TenHS, AVG(Diem) as\"Diem TB\"\n"
                    + "from Diem,HocSinh,Lop\n"
                    + "where Diem.MaHS=HocSinh.MaHS and HocSinh.MaLop=Lop.MaLop and Lop.MaLop='A002'\n"
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
                    vt.add("Lên lớp");
                } else if (rs.getFloat(3) >= 6.5 && rs.getFloat(3) < 8) {
                    vt.add("Lên Lớp");
                } else if (rs.getFloat(3) >= 5 && rs.getFloat(3) < 6.5) {
                    vt.add("Lên Lớp");
                } else {
                    vt.add("Học lại");
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public void sort_XD_A003(JTable a)
    {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select Diem.MaHS, HocSinh.TenHS, AVG(Diem) as\"Diem TB\"\n"
                    + "from Diem,HocSinh,Lop\n"
                    + "where Diem.MaHS=HocSinh.MaHS and HocSinh.MaLop=Lop.MaLop and Lop.MaLop='A003'\n"
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
                    vt.add("Lên lớp");
                } else if (rs.getFloat(3) >= 6.5 && rs.getFloat(3) < 8) {
                    vt.add("Lên Lớp");
                } else if (rs.getFloat(3) >= 5 && rs.getFloat(3) < 6.5) {
                    vt.add("Lên Lớp");
                } else {
                    vt.add("Học lại");
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public void sort_XD_A004(JTable a)
    {
        MyConnect knoi = new MyConnect();
        try {
            conn = knoi.connect();
            st = conn.createStatement();
            String sql = "select Diem.MaHS, HocSinh.TenHS, AVG(Diem) as\"Diem TB\"\n"
                    + "from Diem,HocSinh,Lop\n"
                    + "where Diem.MaHS=HocSinh.MaHS and HocSinh.MaLop=Lop.MaLop and Lop.MaLop='A004'\n"
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
                    vt.add("Lên lớp");
                } else if (rs.getFloat(3) >= 6.5 && rs.getFloat(3) < 8) {
                    vt.add("Lên Lớp");
                } else if (rs.getFloat(3) >= 5 && rs.getFloat(3) < 6.5) {
                    vt.add("Lên Lớp");
                } else {
                    vt.add("Học lại");
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

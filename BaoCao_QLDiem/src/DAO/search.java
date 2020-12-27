/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author thien
 */
public class search {
    public void search(JTable a, JTextField b){
        DefaultTableModel m = (DefaultTableModel) a.getModel();
            m.fireTableDataChanged();
            TableRowSorter sorter = new TableRowSorter(m);
            a.setRowSorter(sorter);
            sorter.setRowFilter(RowFilter.regexFilter(b.getText()));
    }    
}

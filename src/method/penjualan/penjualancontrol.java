/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.penjualan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author maghfirlyah
 */
public class penjualancontrol {
    Connection con = null;
Statement st = null;
ResultSet rs = null;
String sql = null;

public penjualancontrol(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_taufikjuice","root","");
        st=con.createStatement();
    }catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Koneksi Database Gagal, Terjadi Kesalahan Pada : \n"+ e);
    }
}
}



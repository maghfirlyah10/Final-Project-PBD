/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.datajuice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class JuiceControl {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;
    
    public JuiceControl(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_taufikjuice","root","");
            st = con.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi database gagal, Terjadi kesalahan pada : \n" +e);
        }
    }
    
    public List tampil() {
        List LogJuice = new ArrayList();
        sql = "select kode_juice, nama_juice, satuan, harga from tb_datajuice order by idjuice asc";
        try{
            rs = st.executeQuery(sql);
            while(rs.next()){
                DataJuice DJ = new DataJuice();
                DJ.setKdjuice(rs.getString("kode_juice"));
                DJ.setNmjuice(rs.getString("nama_juice"));
                DJ.setSatuan(rs.getString("satuan"));
                DJ.setHarga(rs.getInt("harga"));
                LogJuice.add(DJ);
            } 
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada : \n" + e);
        }
        return LogJuice;
    }
    
    public int tambahjuice(DataJuice e){
        sql="insert into tb_datajuice (kode_juice, nama_juice, satuan, harga)values('"+e.getKdjuice()+"','"+e.getNmjuice()+"','"+e.getSatuan()+"','"+e.getHarga()+"')";
        int hasil = 0;
        try{
            hasil=st.executeUpdate(sql);
        } catch (Exception a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada : \n" +a);
        }
        return hasil;
    }
    
    public int editJuice(DataJuice e){
        sql="update tb_datajuice set nama_juice='"+e.getNmjuice()+"',satuan='"+e.getSatuan()+
                "',harga='"+e.getHarga()+"'where kode_juice='"+e.getKdjuice()+"'";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch (Exception a){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada :\n" +a);
        }
        return hasil;
    }
    
    public List cariJuice(String cari){
        List logJuice = new ArrayList();
        sql="select kode_juice, nama_juice, satuan, harga from tb_datajuice where satuan "+
                "like '%"+cari+"%' or nama_juice like '%"+cari+"%'";
        try{
            rs=st.executeQuery(sql);
            while (rs.next()){
                DataJuice DJ = new DataJuice();
                DJ.setKdjuice(rs.getString("kode_juice"));
                DJ.setNmjuice(rs.getString("nama_juice"));
                DJ.setSatuan(rs.getString("satuan"));
                DJ.setHarga(rs.getInt("harga"));
                logJuice.add(DJ);
            }
        }catch (Exception a){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada :\n" +a);
    }
        return logJuice;
}
    
    public int deleteJuice(DataJuice e){
        sql = "delete from tb_datajuice where kode_juice='"+e.getKdjuice()+"'";
        int hasil = 0;
        try{
            hasil = st.executeUpdate(sql);
        } catch (Exception a){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada :\n" +a);
        }
        return hasil;
    }
    
    public int getJumlahjuice() throws SQLException{
        sql = "select count(*) as jumlah_juice "+ "from tb_datajuice";
        rs=st.executeQuery(sql);
        int jumlah;
        while(rs.next()){
            jumlah = rs.getInt("jumlah_juice");
            return jumlah;
        }
        return 0;
    }
}






















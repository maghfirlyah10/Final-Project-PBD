/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.penjualan;

/**
 *
 * @author maghfirlyah
 */
public class DataPenjualan {
    public String no_nota, kode_juice, nama_juice;
    
    public String getNonota(){
       return no_nota;
    }
    public void setNonota(String no_nota){
        this.no_nota = no_nota;
    }
    
    public String getKdjuice(){
       return kode_juice;
    }
    public void setKdjuice(String kode_juice){
        this.kode_juice = kode_juice;
    }
    
    public String getNmjuice(){
       return nama_juice;
    }
    public void setNmjuice(String nama_juice){
        this.nama_juice = nama_juice;
    }
    
    int harga_jual, jumlah_beli, total_bayar;
    
    public int getHrgjual(){
        return harga_jual;
    }
    public void setHrgjual(int harga_jual){
        this.harga_jual = harga_jual;
    }
    
    public int getJmlbeli(){
        return jumlah_beli;
    }
    public void setJmlbeli(int jumlah_beli){
        this.jumlah_beli = jumlah_beli;
    }
    
    public int getTbayar(){
        return total_bayar;
    }
    public void setTbayar(int total_bayar){
        this.total_bayar = total_bayar;
    }
}




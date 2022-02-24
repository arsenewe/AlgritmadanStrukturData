/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author septianenggars
 */
public class barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    barang(){
        
    }
    
    barang(String nm, String jn, int st, int hg){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hg;
    }
    
    barang(String nm, int hg){
        namaBarang = nm;
        hargaSatuan = hg;
    }
    
    void tampilBarang(){
        System.out.println("Nama Barang: "+namaBarang);
        System.out.println("Jenis Barang: "+ jenisBarang);
        System.out.println("Stok: " + stok);
        System.out.println("Harga Satuan: " + hargaSatuan);
    }
    
    void tambahStok(int n){
        stok = stok + n;
    }
    
    void kurangiStok(int n){
        stok = stok - n;
    }
    
    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }
}

class BarangMain{
    barang b2 = new barang("Aipun", "Smartphone", 2600000, 5);
    
}

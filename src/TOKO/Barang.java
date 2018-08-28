/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOKO;

/**
 *
 * @author SYSTEM
 */
public class Barang {
    private int id_barang;
    private String nama_barang;
    private int harga_barang;
    private String Merk_barang;

    public Barang(int id_barang, String nama_barang, int harga_barang, String Merk_barang) {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.harga_barang = harga_barang;
        this.Merk_barang = Merk_barang;
    }

    public Barang() {
        //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }

    public void setMerk_barang(String Merk_barang) {
        this.Merk_barang = Merk_barang;
    }

    public int getId_barang() {
        return id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public int getHarga_barang() {
        return harga_barang;
    }

    public String getMerk_barang() {
        return Merk_barang;
    }
    public void brg(){
        
    }
    public void cetakb(){
    System.out.println("| Id |   Nama Barang      |    Merk   |  Harga  |");
    System.out.println("-------------------------------------------------");

}
}

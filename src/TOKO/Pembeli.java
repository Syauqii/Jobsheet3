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
public class Pembeli extends Barang{
    int Id_pembeli;
    String Nama_pembeli;
    String Alamat_pembeli;
    String Notelp_pembeli;

    public Pembeli(int Id_pembeli, String Nama_pembeli, String Alamat_pembeli, String Notelp_pembeli, int id_barang, String nama_barang, int harga_barang, String Merk_barang) {
        super(id_barang, nama_barang, harga_barang, Merk_barang);
        this.Id_pembeli = Id_pembeli;
        this.Nama_pembeli = Nama_pembeli;
        this.Alamat_pembeli = Alamat_pembeli;
        this.Notelp_pembeli = Notelp_pembeli;
    }

    public Pembeli() {
        //To change body of generated methods, choose Tools | Templates.
    }
    

    public void setId_pembeli(int Id_pembeli) {
        this.Id_pembeli = Id_pembeli;
    }

    public void setNama_pembeli(String Nama_pembeli) {
        this.Nama_pembeli = Nama_pembeli;
    }

    public void setAlamat_pembeli(String Alamat_pembeli) {
        this.Alamat_pembeli = Alamat_pembeli;
    }

    public void setNotelp_pembeli(String Notelp_pembeli) {
        this.Notelp_pembeli = Notelp_pembeli;
    }

    public int getId_pembeli() {
        return Id_pembeli;
    }

    public String getNama_pembeli() {
        return Nama_pembeli;
    }

    public String getAlamat_pembeli() {
        return Alamat_pembeli;
    }

    public String getNotelp_pembeli() {
        return Notelp_pembeli;
    }

    public void cetakp() {
        System.out.println("=================================================");
        System.out.println(" +++Pembeli+++");
        System.out.println(" Id         :"+Id_pembeli);
        System.out.println(" Nama       :"+Nama_pembeli);
        System.out.println(" Alamat     :"+Alamat_pembeli);
        System.out.println(" No Telpon  :"+Notelp_pembeli);
        System.out.println("-------------------------------------------------");
    }
    
}

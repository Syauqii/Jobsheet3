/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOKO;

import java.util.Scanner;

/**
 *
 * @author SYSTEM
 */
public class Kasir extends Pembeli{    

    public Kasir(int Id_pembeli, String Nama_pembeli, String Alamat_pembeli, String Notelp_pembeli, int id_barang, String nama_barang, int harga_barang, String Merk_barang) {
        super(Id_pembeli, Nama_pembeli, Alamat_pembeli, Notelp_pembeli, id_barang, nama_barang, harga_barang, Merk_barang);
    }
    public void harga(){
        
    }
    
    
    public static void main(String[] args){  
        Pembeli p = new Pembeli();
        Barang b = new Barang();
        
        int Id_pembeli; 
        String Nama_pembeli; 
        String Alamat_pembeli;
        String Notelp_pembeli; 
        int id_barang;
        String nama_barang;
        int harga_barang; 
        String Merk_barang;
        Scanner pembeli = new Scanner(System.in);
        System.out.print("Masukkan id pembeli : ");
        p.Id_pembeli = pembeli.nextInt();
        System.out.print("Masu1kkan nama pembeli : ");
        p.Nama_pembeli = pembeli.next();
        System.out.print("Masukkan alamat pembeli : ");
        p.Alamat_pembeli = pembeli.next();
        System.out.print("Masukkan no telp pembeli : ");
        p.Notelp_pembeli = pembeli.next();


        System.out.println("\n\n\n\n\n------------------------------------------");
        System.out.println("|             DAFTAR BARANG              |");
        System.out.println("|1.Pensil 3B                     : 2000  |");
        System.out.println("|2.BSE Bahasa Arab               : 30000 |");
        System.out.println("|3.Bolpoin Hai-tech              : 20000 |");
        System.out.println("|4.Rautan Pensil Warna           : 500   |");
        System.out.println("|5.Programming book              : 100000|");
        System.out.println("------------------------------------------");
        
        Scanner pil = new Scanner(System.in);
        System.out.print("Silahkan pilih barang = ");
        int c = pil.nextInt();
        switch(c){
            case 1 :p.cetakp();
                    b.cetakb();
                    System.out.println("| 01 | Pensil 3b          |   Lary    |  2000   |");
                    System.out.println("=================================================");
            break;
            case 2 : p.cetakp();
                    b.cetakb();
                    System.out.println("| 02 | BSE Bahasa Arab    | Apilangga |  30000   |");
                    System.out.println("==================================================");
            break;
            case 3 : p.cetakp();
                    b.cetakb();
                    System.out.println("| 03 | Bolpoin Hai-tech   |  Sopir    |  20000   |");
                    System.out.println("==================================================");
            break;
            case 4 : p.cetakp();
                    b.cetakb();
                    System.out.println("| 04 | Rautan Pensil Warna|  Fiber    |  500   |");
                    System.out.println("==================================================");
            break;
            case 5 :p.cetakp();
                    b.cetakb();
                    System.out.println("| 05 | Programming Book   |  SiDo    | 100000  |");
                    System.out.println("=================================================");
            break;
        }
    }
}

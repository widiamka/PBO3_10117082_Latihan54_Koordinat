/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan54_koordinat;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan koordinat
* berdasarkan warna dengan konsep inheritance
 */
public class PBO3_10117082_Latihan54_Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       WarnaKoordinat wk = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wk.getX()+", y : "+wk.getY());
    }
    
}

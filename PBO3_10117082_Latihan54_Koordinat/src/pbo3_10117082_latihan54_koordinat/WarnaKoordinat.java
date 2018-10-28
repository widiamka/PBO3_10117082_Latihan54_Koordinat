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
public class WarnaKoordinat extends Koordinat {
   public String namaWarna;
   
   public WarnaKoordinat(int x, int y, String namaWarna){
       super(x,y);
       setNamaWarna(namaWarna);
   }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
  
}

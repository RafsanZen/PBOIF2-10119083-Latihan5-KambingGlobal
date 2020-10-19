/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan5.kambingglobal;

/**
 *
 * @author 
 * Nama : Rafsan Zen Mustaofa
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Menamplkan Jumlah Kambing
 */
public class PBOIF210119083Latihan5KambingGlobal {
    int jumlahKambing = 88;
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         PBOIF210119083Latihan5KambingGlobal kambingSusu = new PBOIF210119083Latihan5KambingGlobal();

        kambingSusu.getJumlahKambing();

        kambingSusu.tambahKambing();

        kambingSusu.getJumlahKambing();
    }
    
}

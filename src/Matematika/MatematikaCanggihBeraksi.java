/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author SALSABILA
 */
public class MatematikaCanggihBeraksi {
     // Class MatematikaCanggihBeraksi
    public static void main(String[] args) {
        // Membuat objek dari MatematikaCanggih
        MatematikaCanggih mc = new MatematikaCanggih();

        // Contoh operasi pertambahan
        int hasilTambah = mc.pertambahan(10, 5);
        System.out.println("Hasil Pertambahan: " + hasilTambah);

        // Contoh operasi perkalian
        int hasilKali = mc.perkalian(10, 5);
        System.out.println("Hasil Perkalian: " + hasilKali);

        // Contoh operasi modulus
        int hasilModulus = mc.modulus(10, 3);
        System.out.println("Hasil Modulus: " + hasilModulus);
    }
}

}

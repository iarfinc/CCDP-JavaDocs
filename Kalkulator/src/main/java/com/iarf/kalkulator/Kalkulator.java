package com.iarf.kalkulator;

/**
 * Kelas Kalkulator untuk melakukan operasi aritmatika dasar.
 * 
 * @author cyber
 */
public class Kalkulator {

    /**
     * Metode utama untuk menjalankan aplikasi kalkulator.
     *
     * @param args argumen command line yang tidak digunakan.
     */
    public static void main(String[] args) {
        double bilangan1 = 10; // Bilangan pertama
        double bilangan2 = 5;  // Bilangan kedua
        
        double hasilPenjumlahan = tambah(bilangan1, bilangan2);
        double hasilPengurangan = kurang(bilangan1, bilangan2);
        double hasilPerkalian = kali(bilangan1, bilangan2);
        double hasilPembagian = bagi(bilangan1, bilangan2);
        
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian: " + hasilPembagian);
    }

    /**
     * Metode untuk menambahkan dua bilangan.
     *
     * @param a bilangan pertama.
     * @param b bilangan kedua.
     * @return hasil penjumlahan dari a dan b.
     */
    public static double tambah(double a, double b) {
        return a + b;
    }

    /**
     * Metode untuk mengurangi dua bilangan.
     *
     * @param a bilangan pertama.
     * @param b bilangan kedua.
     * @return hasil pengurangan dari a dan b.
     */
    public static double kurang(double a, double b) {
        return a - b;
    }

    /**
     * Metode untuk mengalikan dua bilangan.
     *
     * @param a bilangan pertama.
     * @param b bilangan kedua.
     * @return hasil perkalian dari a dan b.
     */
    public static double kali(double a, double b) {
        return a * b;
    }

    /**
     * Metode untuk membagi dua bilangan.
     *
     * @param a bilangan pertama.
     * @param b bilangan kedua.
     * @return hasil pembagian dari a dan b.
     * @throws ArithmeticException jika b sama dengan nol.
     */
    public static double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian oleh nol tidak diperbolehkan");
        }
        return a / b;
    }
}

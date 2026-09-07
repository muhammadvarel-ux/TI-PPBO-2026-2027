/*
 Program ini berfungsi untuk menghitung luas dan keliling persegi panjang serta
 lingkaran menggunakan input Scanner, Math.PI, dan pengecekan kondisi luas.
 */

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- PERSEGI PANJANG ---
        // Meminta input panjang dan lebar dari pengguna
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        // Menampilkan hasil perhitungan persegi panjang
        System.out.println("\n--- Hasil Persegi Panjang ---");
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);

        // Mengecek apakah luas > 100 dan menyimpannya dalam variabel boolean
        boolean luasBesar = luasPersegiPanjang > 100;
        System.out.println("Apakah Luas Persegi Panjang > 100? " + luasBesar);


        // --- LINGKARAN ---
        // Meminta input jari-jari lingkaran dari pengguna
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        // Menghitung luas dan keliling lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * r * r;
        double kelilingLingkaran = 2 * Math.PI * r;

        // Menampilkan hasil perhitungan lingkaran
        System.out.println("\n--- Hasil Lingkaran ---");
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        input.close();
    }
}
public class OperatorDemo {
    public static void main(String[] args){
        int a = 17, b = 5; // deklarasi

     /* baris dibawah ini adalah
     proses aritmatika sederhana */

        System.out.println("Jumlah: " + (a + b));
        System.out.println("Selisih: " + (a - b));
        System.out.println("kali: " + (a * b));
        System.out.println("Bagi: " + (a / b));
        System.out.println("Sisa Bagi: " + (a % b));
        System.out.println(" ");

        /* baris dibawah ini adalah contoh
        Operator Relasional dan Logika */

        int nilaiUjian = 80;
        boolean hadir = true;
        System.out.println("Lulus (>=75): " + (nilaiUjian >= 75));
        System.out.println("Lulus DAN hadir: " + (nilaiUjian >= 75 && hadir));
    }
}

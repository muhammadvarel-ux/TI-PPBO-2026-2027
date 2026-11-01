public class TampilkanBuku {
    public static void main (String[] args){
        Buku b1 = new Buku("Mudah Menguasai Framework Laravel", "Yudho Yudhanto & Helmi Adi Prasetyo", 2019);
        Buku b2 = new Buku ("Tuntunan Praktis Belajar Database Menggunakan MySQL", "Abdul Kadir", 2020);

        System.out.println("Judul Buku : " + b1.judul);
        System.out.println("Pengarang : " + b1.pengarang);
        System.out.println("Tahun Terbit : " + b1.tahunterbit);
        System.out.println();
        System.out.println("Judul Buku : " + b2.judul);
        System.out.println("Pengarang : " + b2.pengarang);
        System.out.println("Tahun Terbit : " + b2.tahunterbit);
    }
}

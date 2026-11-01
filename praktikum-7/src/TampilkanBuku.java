public class TampilkanBuku {
    public static void main(String[] args) {
        Buku b1 = new Buku("Mudah Menguasai Framework Laravel", "Yudho Yudhanto & Helmi Adi Prasetyo", 2019);
        Buku b2 = new Buku("Tuntunan Praktis Belajar Database Menggunakan MySQL", "Abdul Kadir", 2020);

        System.out.println("Judul Buku 1 : " + b1.getJudul());
        System.out.println("Pengarang   : " + b1.getPengarang());
        System.out.println("Tahun Terbit: " + b1.getTahunTerbit());

        System.out.println();

        b2.setJudul("Tuntunan Praktis Belajar Database Menggunakan MySQL (Edisi Revisi)");
        System.out.println("Judul Buku 2 (Updated) : " + b2.getJudul());
        System.out.println("Pengarang              : " + b2.getPengarang());
        System.out.println("Tahun Terbit           : " + b2.getTahunTerbit());
    }
}
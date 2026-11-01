public class TampilkanSiswa {
    public static void main(String[] args) {
        Siswa s1 = new Siswa(88.5);
        Siswa s2 = new Siswa(105); // Validasi nilai di luar rentang

        System.out.println("--- Data Siswa 1 ---");
        System.out.println("Nilai Angka : " + s1.getNilai());
        System.out.println("Nilai Huruf : " + s1.getNilaiHuruf());

        System.out.println("\n--- Mengubah Nilai Siswa 1 ---");
        s1.setNilai(62.0);
        System.out.println("Nilai Angka Baru : " + s1.getNilai());
        System.out.println("Nilai Huruf Baru : " + s1.getNilaiHuruf());
    }
}
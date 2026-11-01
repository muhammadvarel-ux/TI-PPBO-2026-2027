public class TampilkanWaktu {
    public static void main(String[] args) {
        Waktu w1 = new Waktu(10, 30, 45);
        Waktu w2 = new Waktu(25, 60, -5); // Menguji validasi jam, menit, detik tidak valid

        System.out.println("--- Data Waktu 1 ---");
        System.out.println("Jam   : " + w1.getJam());
        System.out.println("Menit : " + w1.getMenit());
        System.out.println("Detik : " + w1.getDetik());

        System.out.println("\n--- Mengubah Waktu 1 ---");
        w1.setJam(14);
        w1.setMenit(15);
        System.out.println("Format Waktu : " + w1.getJam() + ":" + w1.getMenit() + ":" + w1.getDetik());
    }
}
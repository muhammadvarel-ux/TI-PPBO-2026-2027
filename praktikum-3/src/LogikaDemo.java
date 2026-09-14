public class LogikaDemo {
    public static void main(String[] args){

        // OPERATOR &&

        int nilaiUjian = 80;
        int kehadiran = 90;

        if (nilaiUjian >= 75 && kehadiran >= 80){
            System.out.println("Lulus mata kuliah ");
        } else {
            System.out.println("Tidak lulus mata kuliah");
        }

        // OPERATOR OR & NOT

        boolean punyaKTP = false;
        boolean punyaSIM = true;

        if (punyaKTP || punyaSIM) {
            System.out.println("Boleh menyewa kendaraan");
        }

        if (!punyaKTP) {
            System.out.println("KTP belum tersedia");
        }
    }
}

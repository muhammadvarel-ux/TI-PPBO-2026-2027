public class VariabelDemo {
    public static void main(String[] args){
        String nama = "Siti";
        int umur = 20;
        double tinggi = 165.5;
        char golDarah = '0';
        boolean mahasiswaaktif = true;
        int nilaibulat = 9;
        double nilaiduoble = nilaibulat; // widening otomatis
        double pecahan = 9.8;
        int hasilcasting = (int) pecahan; // narrowing eksplisit

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Golongan Darah: " + golDarah);
        System.out.println("Aktif : " + mahasiswaaktif);
        System.out.println("Widening: " + nilaiduoble);
        System.out.println("Narrowing: " + hasilcasting);

    }
}

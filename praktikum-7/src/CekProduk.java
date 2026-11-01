public class CekProduk {
    public static void main(String[] args) {
        Produkm6 p1 = new Produkm6("Mouse", 150000);
        Produkm6 p2 = new Produkm6("Keyboard", 350000);
        Produkm6 p3 = new Produkm6("Monitor", 2000000);

        // Menentukan batas harga
        double batasHarga = 500000;
        System.out.println("Batas Harga : " + batasHarga);
        System.out.println();

        System.out.println("Nama Produk : " + p1.namaProduk);
        System.out.println("Harga       : Rp." + p1.harga);
        System.out.println("Mahal       : " + p1.isMahal(batasHarga));
        System.out.println();

        System.out.println("Nama Produk : " + p2.namaProduk);
        System.out.println("Harga       : Rp." + p2.harga);
        System.out.println("Mahal       : " + p2.isMahal(batasHarga));
        System.out.println();
        System.out.println("Nama Produk : " + p3.namaProduk);
        System.out.println("Harga       : Rp." + p3.harga);
        System.out.println("Mahal       : " + p3.isMahal(batasHarga));
    }
}

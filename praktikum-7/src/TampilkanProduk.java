public class TampilkanProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("PRD01", "Mouse Wireless", 150000, 10);

        System.out.println("Kode Produk : " + p1.getKodeProduk());
        System.out.println("Nama Produk : " + p1.getNamaProduk());
        System.out.println("Harga       : Rp" + p1.getHarga());
        System.out.println("Stok        : " + p1.getStok());

        System.out.println("\n--- Uji Pengurangan & Penambahan Stok ---");
        p1.tambahStok(5);
        p1.kurangiStok(20); // Pengurangan melampaui stok yang ada
        p1.kurangiStok(8);

        System.out.println("\nStok Akhir : " + p1.getStok());
    }
}
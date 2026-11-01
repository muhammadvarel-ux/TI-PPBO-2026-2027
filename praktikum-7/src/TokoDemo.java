public class TokoDemo {
    public static void main(String[] args) {
        Produkm6[] daftarProdukm6 = {
                new Produkm6("P001", "Mouse", 150000.0, 10),
                new Produkm6("P002", "Keyboard", 300000.0, 8),
                new Produkm6("P003", "Monitor", 2000000.0, 5),
                new Produkm6("P004", "Headset", 350000.0, 9),
                new Produkm6("P005", "WebCam", 1000000.0, 7)
        };

        //  Menampilkan seluruh daftar produk
        System.out.println("Daftar Produk");
        for (Produkm6 p : daftarProdukm6) {
            p.tampilkanData();
            System.out.println();
        }

        //  Simulasi Pembelian Pertama (Mouse)
        System.out.println("Simulasi Pembelian Pertama");
        Produkm6 produkm61 = daftarProdukm6[0]; // Mouse
        int jumlahBeli1 = 2;
        System.out.println("Nama Produk : " + produkm61.namaProduk);
        System.out.println("Jumlah Beli : " + jumlahBeli1);
        System.out.println("Total Harga : Rp." + produkm61.hitungTotalBeli(jumlahBeli1));
        produkm61.kurangiStok(jumlahBeli1);
        System.out.println();

        //  Simulasi Pembelian Kedua (Keyboard)
        System.out.println("Simulasi Pembelian Kedua");
        Produkm6 produkm62 = daftarProdukm6[1]; // Keyboard
        int jumlahBeli2 = 10;
        System.out.println("Nama Produk : " + produkm62.namaProduk);
        System.out.println("Jumlah Beli : " + jumlahBeli2);
        System.out.println("Total Harga : Rp." + produkm62.hitungTotalBeli(jumlahBeli2));
        produkm62.kurangiStok(jumlahBeli2);
        System.out.println();

        //  Mencari dan Menampilkan Produk Termahal
        System.out.println("Produk dengan Harga Termahal");
        Produkm6 produkm6Termahal = daftarProdukm6[0];
        for (int i = 1; i < daftarProdukm6.length; i++) {
            if (daftarProdukm6[i].harga > produkm6Termahal.harga) {
                produkm6Termahal = daftarProdukm6[i];
            }
        }
        produkm6Termahal.tampilkanData();
    }
}
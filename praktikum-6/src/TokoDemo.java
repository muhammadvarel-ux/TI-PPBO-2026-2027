public class TokoDemo {
    public static void main(String[] args) {
        Produk[] daftarProduk = {
                new Produk("P001", "Mouse", 150000.0, 10),
                new Produk("P002", "Keyboard", 300000.0, 8),
                new Produk("P003", "Monitor", 2000000.0, 5),
                new Produk("P004", "Headset", 350000.0, 9),
                new Produk("P005", "WebCam", 1000000.0, 7)
        };

        //  Menampilkan seluruh daftar produk
        System.out.println("Daftar Produk");
        for (Produk p : daftarProduk) {
            p.tampilkanData();
            System.out.println();
        }

        //  Simulasi Pembelian Pertama (Mouse)
        System.out.println("Simulasi Pembelian Pertama");
        Produk produk1 = daftarProduk[0]; // Mouse
        int jumlahBeli1 = 2;
        System.out.println("Nama Produk : " + produk1.namaProduk);
        System.out.println("Jumlah Beli : " + jumlahBeli1);
        System.out.println("Total Harga : Rp." + produk1.hitungTotalBeli(jumlahBeli1));
        produk1.kurangiStok(jumlahBeli1);
        System.out.println();

        //  Simulasi Pembelian Kedua (Keyboard)
        System.out.println("Simulasi Pembelian Kedua");
        Produk produk2 = daftarProduk[1]; // Keyboard
        int jumlahBeli2 = 10;
        System.out.println("Nama Produk : " + produk2.namaProduk);
        System.out.println("Jumlah Beli : " + jumlahBeli2);
        System.out.println("Total Harga : Rp." + produk2.hitungTotalBeli(jumlahBeli2));
        produk2.kurangiStok(jumlahBeli2);
        System.out.println();

        //  Mencari dan Menampilkan Produk Termahal
        System.out.println("Produk dengan Harga Termahal");
        Produk produkTermahal = daftarProduk[0];
        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > produkTermahal.harga) {
                produkTermahal = daftarProduk[i];
            }
        }
        produkTermahal.tampilkanData();
    }
}
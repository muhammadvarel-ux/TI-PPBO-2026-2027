public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga);
        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
            System.out.println("[ERROR] Stok awal tidak boleh negatif!");
        }
    }

    public String getKodeProduk() { return kodeProduk; }
    public String getNamaProduk() { return namaProduk; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    public void setKodeProduk(String kodeProduk) { this.kodeProduk = kodeProduk; }
    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("[ERROR] Harga tidak boleh negatif!");
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            System.out.println("Berhasil menambah stok sebanyak " + jumlah + " unit.");
        } else {
            System.out.println("[ERROR] Jumlah penambahan stok harus bernilai positif!");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("[ERROR] Jumlah pengurangan stok harus bernilai positif!");
        } else if (jumlah > this.stok) {
            System.out.println("[ERROR] Stok tidak mencukupi! Stok saat ini: " + this.stok);
        } else {
            this.stok -= jumlah;
            System.out.println("Berhasil mengurangi stok sebanyak " + jumlah + " unit.");
        }
    }
}
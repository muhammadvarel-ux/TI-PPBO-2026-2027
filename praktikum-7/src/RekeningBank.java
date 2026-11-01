public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private String jenisRekening; // Read-only (Ketentuan 1)
    private double saldo;

    // Constructor (Ketentuan 1: mengisi jenisRekening lewat constructor)
    public RekeningBank(String nomor, String pemilik, String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }

    // Getter
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method Setor dari kode dasar
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Setor GAGAL: Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil sebesar Rp" + jumlah + ". Saldo saat ini: Rp" + saldo);
    }

    // Method Tarik dari kode dasar
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Tarik GAGAL: Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Tarik GAGAL: Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil sebesar Rp" + jumlah + ". Saldo saat ini: Rp" + saldo);
        }
    }

    // Method Tambahan (Ketentuan 2: transferKe)
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Transfer GAGAL: Jumlah transfer harus bernilai positif (> 0)");
        } else if (this.saldo < jumlah) {
            System.out.println("Transfer GAGAL: Saldo pengirim (" + this.pemilik + ") tidak mencukupi! (Saldo: Rp" + this.saldo + ")");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer BERHASIL sebesar Rp" + jumlah + " dari " + this.pemilik + " ke " + tujuan.getPemilik());
        }
    }

    // Method Tambahan (Ketentuan 3: cetakMutasi)
    public void cetakMutasi() {
        System.out.println("==========================================");
        System.out.println("           LAPORAN MUTASI REKENING        ");
        System.out.println("==========================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik   : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo Saat Ini : Rp" + saldo);
        System.out.println("==========================================");
    }
}
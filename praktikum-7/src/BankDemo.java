public class BankDemo {
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank("001", "Budi", "Tabungan", 100000);
        RekeningBank rek2 = new RekeningBank("002", "Siti", "Giro", 200000);

        System.out.println("=== KONDISI AWAL REKENING ===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();

        System.out.println("\n=== 1. UJI SETOR & TARIK (KODE MODUL & PENGEMBANGAN) ===");
        rek1.setor(50000);        // Setor berhasil
        rek1.tarik(30000);        // Tarik berhasil
        rek1.tarik(500000);       // Ditolak: saldo tidak cukup
        rek1.setor(-1000);        // Ditolak: jumlah tidak valid

        rek2.setor(100000);
        rek2.tarik(50000);

        System.out.println("\n=== 2. UJI TRANSFER BERHASIL ===");
        rek1.transferKe(rek2, 50000); // Saldo Budi sisa 70.000, Siti jadi 300.000

        System.out.println("\n=== 3. UJI TRANSFER GAGAL (SALDO TIDAK CUKUP) ===");
        rek1.transferKe(rek2, 200000); // Ditolak: saldo Budi hanya 70.000

        System.out.println("\n=== 4. UJI TRANSFER GAGAL (JUMLAH TIDAK VALID) ===");
        rek2.transferKe(rek1, -25000); // Ditolak: jumlah tidak valid

        System.out.println("\n=== LAPORAN MUTASI AKHIR KEDUA REKENING ===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}
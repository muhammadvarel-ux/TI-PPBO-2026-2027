import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double tarif = 0;
        double total = 0;
        double gol1 = 450;
        double gol2 = 1400;
        double gol3 = 2500;
        double gol4 = 3000;
        double gol5 = 4500;
        String golongan;

        //Proses menentukan golongan berdasarkan VA menggunakan switch case

        System.out.println("Golongan Daya : ");
        System.out.println("1. 450 VA ");
        System.out.println("2. 900 VA ");
        System.out.println("3. 1300 VA ");
        System.out.println("4. 2200 VA ");
        System.out.println("5. Lebih dari 2200 VA ");
        System.out.print("Masukkan Golongan Daya (1-5): ");
        int va = sc.nextInt();

        switch (va) {
            case 1:
                tarif = gol1;
                golongan = "450";
                break;
            case 2:
                tarif = gol2;
                golongan = "900";
                break;
            case 3:
                tarif = gol3;
                golongan = "1300";
                break;
            case 4:
                tarif = gol4;
                golongan = "2200";
                break;
            default:
                tarif = gol5;
                golongan = "lebih dari 2200";
        }

        //Proses perhitungan total tagihan berdasarkan golongan

        System.out.print("Masukkan total pemakaian (Kwh): ");
        int tagihan = sc.nextInt();

                if (tagihan > 0){
                    total = tarif * tagihan;
                } else {
                    System.out.println("Tarif tidak boleh bernilai 0 atau negatif!!");
                    return;
                }

                //Proses output untuk menampilkan tagihan

                System.out.println("Berikut adalah tagihan anda : ");
                System.out.println("Golongan Daya : " + golongan + " VA");
                System.out.println("Total penggunaan kWh : " + tagihan + " kWh");
                System.out.println("Jumlah Tarif Per-kWh : Rp." + tarif);
                System.out.println("Total Tagihan : Rp." + total );

    }
}

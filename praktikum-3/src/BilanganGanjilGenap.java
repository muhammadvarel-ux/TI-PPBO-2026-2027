import java.util.Scanner;
public class BilanganGanjilGenap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Untuk Mengisi Inputan
        System.out.print("Masukkan Bilangan : ");
        int bilangan = sc.nextInt();

        //Menggunakan % untuk menentukan ganjil genap
        int hasil = bilangan % 2;

        //Proses output
        if (hasil == 0){
            System.out.println("Bilangan adalah genap");
        } else {
            System.out.println("Bilangan adalah ganjil");
        }

    }
}

import java.util.Scanner;

public class MembacaUmurdanStatus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan umur : ");
        int umur = sc.nextInt();

        System.out.print("Apakah Status Penonton mahasiswa? (y/n) :  ");
        char status = scanner.next().charAt(0);

        boolean mahasiswa = (status == 'y' || status == 'Y');

        if(mahasiswa && umur<25){
            System.out.println("mendapat harga khusus/diskon");

        }else{
            System.out.println("harga normal");
        }
    }
}
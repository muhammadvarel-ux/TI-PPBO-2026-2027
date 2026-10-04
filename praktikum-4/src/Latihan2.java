import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan ukuran:");
        int angka = sc.nextInt();
        //pola segitiga terbalik
        System.out.println("\nsegitiga terbalik");
        for (int i=angka;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //pola persegi
        System.out.println("\npola persegi");
        for (int i =1;i<=angka;i++){
            for (int j=1;j<=angka;j++){
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}
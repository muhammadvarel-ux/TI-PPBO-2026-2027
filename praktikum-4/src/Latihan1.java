import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan : ");
        int bilangan = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int hasilkali = bilangan * i;
            System.out.println(bilangan +" x " + i + " = " + hasilkali);
        }

    }
}

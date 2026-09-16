import java.util.Scanner;

public class BilanganBesarKecil{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Proses input bilangan

        System.out.print("Masukkan Bilangan Pertama : ");
        int bilangan1 = sc.nextInt();
        System.out.print("Masukkan Bilangan Kedua : ");
        int bilangan2 = sc.nextInt();
        System.out.print("Masukkan Bilangan Ketiga: ");
        int bilangan3 = sc.nextInt();

        // Mebandingankan bilangan dan menghasilkan output

        if (bilangan1 > bilangan2 && bilangan1 > bilangan3){
            System.out.println("Bilangan terbesar adalah : " + bilangan1);
        } else if (bilangan2 > bilangan1 && bilangan2 > bilangan3) {
            System.out.println("Bilangan Terbesar adalah : " + bilangan2);
        } else if (bilangan3 > bilangan1 && bilangan3 > bilangan2) {
            System.out.println("Bilangan terbesar adalah : " + bilangan3);
        } else {
            System.out.println("Bilangan tidak terdeteksi");
        }
    }
}

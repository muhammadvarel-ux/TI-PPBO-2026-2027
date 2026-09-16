import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("===menu makanan===");
        System.out.println("Tempe Mendoan");
        System.out.println("Tahu Gejrot");
        System.out.println("Bakso Mercon");
        System.out.println("Mie Ayam");

        System.out.println("pilih menu makanan(1-4):");
        int pilihan = sc.nextInt();

        switch(pilihan){
            case 1:
                System.out.println("anda memilih tempe mendoam");
                break;
            case 2:
                System.out.println("anda memilih tahu gejrot");
                break;
            case 3:
                System.out.println("anda memilih bakso mercon");
                break;
            case 4:
                System.out.println("anda memilih mie ayam");
                break;
            default:
                System.out.println("menu tidak tersedia");
        }
    }
}
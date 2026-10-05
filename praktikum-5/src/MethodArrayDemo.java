public class MethodArrayDemo {
    static double hitungRataRata(int[] data){
        int total = 0;
        for (int nilai : data){
            total += nilai;
        }
        return (double) total / data.length;
    }

    static int cariMaksimum(int[] data){
        int max = data[0];
        for (int nilai : data){
            if (nilai > max){
                max = nilai;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] nilaiujian = {80, 75, 90, 60, 88};

        System.out.println("Rata-rata: " + hitungRataRata(nilaiujian));
        System.out.println("Maksimum: " + cariMaksimum(nilaiujian));
    }
}

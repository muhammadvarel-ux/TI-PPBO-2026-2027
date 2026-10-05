public class MethodDemo {
    static void TampilkanBiodata (String nama, int umur, String kota) {
        System.out.println(nama + " (" + umur + " tahun) - " + kota);
    }

    // Panggil pada method main :
    public static void main(String[] args){
        TampilkanBiodata("Budi", 20, "Bandung");
    }
}

public class PengunjungCafe18 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }

    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung : ");
        for (String daftar : namaPengunjung) {
            System.out.println(daftar);
        }
    }
}

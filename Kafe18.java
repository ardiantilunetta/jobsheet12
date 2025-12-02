import java.util.Scanner;

public class Kafe18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihanMenu, banyakItem;
        double totalHarga = 0;
        String tambah;
        Menu("Netta", true, "DISKON50");
        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan : ");
            pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan : ");
            banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Tambah pesanan (y/t) : ");
            tambah = sc.nextLine();

            totalHarga += hitungHargaMenu(pilihanMenu, banyakItem);

        } while (tambah.equalsIgnoreCase("y"));
        
        System.out.print("Masukkan kode promo : ");
        String kodePromo = sc.nextLine();

        double Bayar = hitungTotalHarga18(pilihanMenu, banyakItem, totalHarga, kodePromo);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, "+namaPelanggan+"!");

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static double hitungHargaMenu (int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        double hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        return hargaTotal;
    }

    public static double hitungTotalHarga18 (int pilihanMenu, int banyakItem, double totalHarga, String kodePromo) {
        double totalDiskon = 0;

        if (kodePromo.equals("DISKON30")) {
            totalDiskon += totalHarga*0.3;
        } else if (kodePromo.equals("DISKON50")) {
            totalDiskon += totalHarga*0.5;
        } else {
            System.out.println("Kode invalid");
        }

        System.out.println("Diskon = Rp. "+totalDiskon);
        totalHarga = totalHarga-totalDiskon;

        System.out.println("Total harga untuk pesanan Anda : Rp. "+totalHarga);
        return totalHarga;
    }
}
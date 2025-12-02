import java.util.Scanner;

public class Kafe18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Netta", true, "DISKON50");
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan : ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan : ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Kode Promo : ");
        String kodePromo = sc.nextLine();

        double totalHarga = hitungTotalHarga18(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda : Rp. "+totalHarga);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, "+namaPelanggan+"!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo == "DISKON30") {
            System.out.println("Mendapatkan diskon 30%");
        } else if (kodePromo == "DISKON50") {
            System.out.println("Mendapatkan diskon 50%");
        } else {
            System.out.println("Kode invalid!");
        }

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

    public static double hitungTotalHarga18 (int pilihanMenu, int banyakItem, String kodePromo) {
        double totalDiskon = 0;
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        double hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;

        if (kodePromo.equals("DISKON30")) {
            totalDiskon += hargaTotal*0.3;
        } else if (kodePromo.equals("DISKON50")) {
            totalDiskon += hargaTotal*0.5;
        } else {
            System.out.println("Kode invalid");
        }

        System.out.println("Diskon = Rp. "+totalDiskon);
        hargaTotal = hargaTotal-totalDiskon;
        return hargaTotal;
    }
}
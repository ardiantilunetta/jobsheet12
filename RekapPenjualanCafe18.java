import java.util.Scanner;

public class RekapPenjualanCafe18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu : ");
        int jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari : ");
        int jumlahHari = sc.nextInt();
        String[] menu = new String[jumlahMenu];
        int[][] rekap = new int[jumlahMenu][jumlahHari];
        isiArray(rekap, menu);
        tampilArray(rekap, menu, jumlahHari);
        tertinggi(rekap, menu, jumlahHari);
        rata(rekap, menu);
    }

    public static void isiArray(int rekap[][], String[] menu) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < rekap.length ; i++) {
            System.out.println();
            System.out.print("Menu "+(i+1)+" : ");
            menu[i] = sc.nextLine();
            for (int j = 0 ; j < rekap[i].length ; j++) {
                System.out.print("Hari ke-"+(j+1)+" : ");
                rekap[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        System.out.println();
    }

    public static void tampilArray (int rekap[][], String menu[], int hari) {
        System.out.println("----- REKAP PENJUALAN -----");
        System.out.print("Menu\t\t");
        for (int i = 0 ; i < hari ; i++) {
            System.out.print("H"+(i+1)+"\t");
        }
        System.out.println();
        // System.out.println("Menu\t\tH1\tH2\tH3\tH4\tH5\tH6\tH7");
        for (int i = 0 ; i < rekap.length ; i++) {
            System.out.print(menu[i]+"\t");
            for (int j = 0 ; j < rekap[i].length ; j++) {
                System.out.print(rekap[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void tertinggi (int rekap[][], String menu[], int hari) {
        int tertinggi = 0;
        String nama = null;
        
        for (int i = 0 ; i < rekap.length ; i++) {
            int total = 0;
            for (int j = 0 ; j < rekap[i].length ; j++) {
                total += rekap[i][j];
            }
            if (total > tertinggi) {
                tertinggi = total;
                nama = menu[i];
            }
        }

        System.out.println("----- PENJUALAN TERTINGGI -----");
        System.out.println(nama+"\t"+tertinggi);
        System.out.println();
    }

    public static void rata (int rekap[][], String menu[]) {
        System.out.println("----- RATA RATA PENJUALAN -----");
        for (int i = 0 ; i < rekap.length ; i++) {
            int rata = 0;
            System.out.print(menu[i]+"\t");
            for (int j = 0 ; j < rekap[i].length ; j++) {
                rata += rekap[i][j];
            }
            System.out.println(rata/rekap[i].length);
        }
    }
    
}

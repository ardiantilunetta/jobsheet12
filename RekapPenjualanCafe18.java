import java.util.Scanner;

public class RekapPenjualanCafe18 {

    public static void main(String[] args) {
        String[] menu = {"Kopi\t", "Teh\t", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        int[][] rekap = new int[5][7];
        isiArray(rekap, menu);
        tampilArray(rekap, menu);
    }

    public static void isiArray(int rekap[][], String menu[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < rekap.length ; i++) {
            System.out.println("Masukkan Penjualan "+menu[i]);
            for (int j = 0 ; j < rekap[i].length ; j++) {
                System.out.print("Hari ke-"+(j+1)+" : ");
                rekap[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilArray (int rekap[][], String menu[]) {
        System.out.println("Rekap Penjualan");
        System.out.println("Menu\t\tH1\tH2\tH3\tH4\tH5\tH6\tH7");
        for (int i = 0 ; i < rekap.length ; i++) {
            System.out.print(menu[i]+"\t");
            for (int j = 0 ; j < rekap[i].length ; j++) {
                System.out.print(rekap[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}

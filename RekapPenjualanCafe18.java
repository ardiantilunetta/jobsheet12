import java.util.Scanner;

public class RekapPenjualanCafe18 {

    public static void main(String[] args) {
        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        int[][] rekap = new int[5][7];
        isiArray(rekap, menu);
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
    
}
